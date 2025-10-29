package in.kgcoding.enums;

public enum daysOfWeek {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    daysOfWeek(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}
