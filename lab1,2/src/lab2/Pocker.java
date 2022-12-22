package lab2;

import java.util.*;

public class Pocker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            deck.get_cards();
        }
    }
}

class Deck {
    static String[] cards = {"K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "T"};
    static String[] suits = {"♠", "♣", "♥", "♦"};

    Stack<String> cards_stack = new Stack<String>();

    public Deck(){
        List<String> _cards = new ArrayList<String>();
        for (int i = 0; i < cards.length; i ++){
            for(int j = 0; j < suits.length; j++){
                _cards.add(cards[i] + suits[j]);
            }
        }
        Collections.shuffle(_cards);
        for(int i = 0; i < _cards.size(); i++) {
            cards_stack.push(_cards.get(i));
        }
    }

    public void get_cards(){
        for(int i = 0; i < 5; i++){
            System.out.println(cards_stack.pop());
        }
        System.out.println();
    }
}
