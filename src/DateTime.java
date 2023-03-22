import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
    LocalTime time;
    LocalDate date;
    LocalDateTime dateTime;
    ZoneId zone;
    DateTimeFormatter formatDateTime;

    public LocalTime dispCurrentTime(){
        return LocalTime.now();
    }
    public String dispFormattedTime(){
        time = LocalTime.now();
        formatDateTime = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return time.format(formatDateTime);
    }
    public LocalDate dispTodayDate(){
        return LocalDate.now();
    }
    public String dispFormattedDate(){
        date = LocalDate.now();
        formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatDateTime);
    }
    public String dispDateTime(){
        dateTime = LocalDateTime.now();
        formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        return dateTime.format(formatDateTime);
    }
    public ZoneId dispTimeZone(){
        Clock c = Clock.systemDefaultZone();
        return c.getZone();
    }
    public ZoneId dispLondonTimeZone(){
        return ZoneId.of("Europe/London");
    }
    public LocalTime dispLondonCurrentTime(){
        zone = ZoneId.of("Europe/London");
        return LocalTime.now(zone);
    }
    public String convertNycTime(ZonedDateTime z){
        ZoneId zoneUs = ZoneId.of("America/New_York");
        ZonedDateTime nycTime = z.withZoneSameInstant(zoneUs);
        formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        return nycTime.format(formatDateTime);
    }
}