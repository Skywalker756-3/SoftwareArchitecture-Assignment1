package Question3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TokyoDateObj implements DateObject {
    @Override
    public void displayDate() {
        LocalDateTime tokyo = LocalDateTime.now().plusHours(14);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Tokyo date: " + tokyo.format(f));
    }
}