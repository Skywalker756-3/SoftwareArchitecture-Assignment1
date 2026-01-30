package Question3;

public class TokyoCreator extends DateTimeCreator {

    private static TokyoCreator instance;

    private TokyoCreator() {
    }

    public static TokyoCreator getInstance() {
        if (instance == null) {
            instance = new TokyoCreator();
        }
        return instance;
    }

    @Override
    public DateObject createDate() {
        return new TokyoDateObj();
    }

    @Override
    public TimeObject createTime() {
        return new TokyoTimeObj();
    }
}