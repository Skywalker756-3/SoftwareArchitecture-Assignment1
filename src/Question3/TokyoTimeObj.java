package Question3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TokyoTimeObj implements TimeObject {
    @Override
    public void displayTime() {
        LocalDateTime tokyo = LocalDateTime.now().plusHours(14);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Tokyo time: " + tokyo.format(f));
    }
}