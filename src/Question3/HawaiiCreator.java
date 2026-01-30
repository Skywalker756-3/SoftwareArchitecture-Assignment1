package Question3;

public class HawaiiCreator extends DateTimeCreator {

    private static HawaiiCreator instance;

    private HawaiiCreator() {
    }

    public static HawaiiCreator getInstance() {
        if (instance == null) {
            instance = new HawaiiCreator();
        }
        return instance;
    }

    @Override
    public DateObject createDate() {
        return new HawaiiDateObj();
    }

    @Override
    public TimeObject createTime() {
        return new HawaiiTimeObj();
    }
}