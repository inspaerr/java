import javax.swing.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainFrame extends JFrame implements OrderListener {
    private final JPanel mainPanel = new JPanel();
    private final JPanel ordersPanel = new JPanel();

    private final TableOrdersManager manager = new TableOrdersManager(10);

    public MainFrame() {
        super("Ресторан");
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        ordersPanel.setLayout(new BoxLayout(ordersPanel, BoxLayout.X_AXIS));

        JPanel buttonsPanel = new JPanel();
        JButton addOrderButton = new JButton("Добавить заказ");
        buttonsPanel.add(addOrderButton);
        mainPanel.add(buttonsPanel);
        mainPanel.add(ordersPanel);

        addOrderButton.addActionListener((e) -> {
            addNewOrder();
            setVisible(false);
            setVisible(true);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(mainPanel);
        setVisible(true);
    }
    //ЛАБА 32 ДОБАВЛЕНИЕ ФАЙЛОВ
    private void addNewOrder() {
        String[] array = new String[4];
        try {
            File file = new File("order");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                array[i] = line;
                i++;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Customer customer = new Customer(array[0], array[1], Integer.parseInt(array[2]), Address.EMPTY_ADDRESS);
        var tableNumber = Integer.parseInt(array[3]);
        TableOrder order = new TableOrder(10, customer);

        /*Customer customer = new Customer(JOptionPane.showInputDialog("Введите имя клиента"),
                JOptionPane.showInputDialog("Введите фамилию клиента"),
                Integer.parseInt(JOptionPane.showInputDialog("Введите возраст клиента")),
                Address.EMPTY_ADDRESS);
        TableOrder order = new TableOrder(10, customer);
        var tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите номер столика"));
        if (tableNumber > 10) {
            JOptionPane.showMessageDialog(null, "Номер столика не может быть больше 10");
            return;
        }


         */
        for (var number: manager.freeTableNumbers()) {
            if (number == tableNumber) {
                manager.add(order, tableNumber);
                var orderPanel = new OrderPanel(order, number);
                ordersPanel.add(orderPanel);
                orderPanel.addRemoveListener(this);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Столик уже занят!");
    }

    @Override
    public void onOrderRemoved(OrderPanel panel) {
        ordersPanel.remove(panel);
        manager.remove(panel.getOrder());
        setVisible(false);
        setVisible(true);
    }
}
