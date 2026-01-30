package Question3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HawaiiTimeObj implements TimeObject {
    @Override
    public void displayTime() {
        LocalDateTime hawaii = LocalDateTime.now().minusHours(5);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hawaii time: " + hawaii.format(f));
    }
}