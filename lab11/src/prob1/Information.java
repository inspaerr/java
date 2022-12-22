package prob1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Information {
    public static void main(String[] args) {
        String developers = "Kanchura Sofia, Kubantseva Darya";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy dd MMMM HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH,10);
        cal.set(Calendar.HOUR, 11);
        cal.set(Calendar.MINUTE, 45);
        cal.set(Calendar.SECOND, 0);

        Date now = new Date();
        System.out.println("Разработчики: " + developers + "\nДата и время получения задания: " + sdf.format(cal.getTime())
        + "\nДата и время сдачи задания: " + sdf.format(now));
    }
}
