package Learning.MultipleInterfaces;
import java.time.*;
public interface TimeClient {
    void setTime(int hour,int min,int seocnd);
    void setDate(int day,int month,int year);
    void setDateAndTime(int day,int month,int year,int hour,int min,int seocnd);
    LocalDateTime getLocalDateTime();
    static ZoneId getZoneId(String zoneString){
        try {
            return ZoneId.of(zoneString); 
        } catch (DateTimeException e) {
           System.out.println("Invalid time Zone : "+zoneString+";Using default TimeZone instread");
           return ZoneId.systemDefault();
        }
    }

    default ZonedDateTime getLocalDateTime(String zoneString){
        return ZonedDateTime.of(getLocalDateTime(),getZoneId(zoneString));
    }

}
