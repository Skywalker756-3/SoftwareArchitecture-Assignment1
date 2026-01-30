package Question3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HawaiiDateObj implements DateObject {
    @Override
    public void displayDate() {
        LocalDateTime hawaii = LocalDateTime.now().minusHours(5);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Hawaii date: " + hawaii.format(f));
    }
}
