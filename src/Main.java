import java.time.*;

public class Main {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println("Current Time : " + dt.dispCurrentTime());
        System.out.println("Formatted Time : " + dt.dispFormattedTime());
        System.out.println("Today's Date : " + dt.dispTodayDate());
        System.out.println("Formatted Date : " + dt.dispFormattedDate());
        System.out.println("Date and Time : " + dt.dispDateTime());
        System.out.println("India's Time Zone : " + dt.dispTimeZone());
        System.out.println("London's Time Zone : " + dt.dispLondonTimeZone());
        System.out.println("Current Time in London : " + dt.dispLondonCurrentTime());
        ZonedDateTime indTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), Clock.systemDefaultZone().getZone());
        System.out.println("New York Time : " + dt.convertNycTime(indTime));
    }
}