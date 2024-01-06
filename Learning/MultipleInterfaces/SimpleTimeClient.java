package Learning.MultipleInterfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeClient {
    private LocalDateTime dateAndTime;
    public SimpleTimeClient(){
        dateAndTime= LocalDateTime.now();
    }

    public void setTime(int hour,int min,int second){
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour,min,second);
        dateAndTime = LocalDateTime.of(currentDate,timeToSet);
    }

    public void setDate(int day,int month,int year){
        LocalDate dateToSet = LocalDate.of(day,month,year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet,currentTime);
    }

    public void setDateAndTime(int day,int month,int year,int hour ,int min,int second){

    }

    @Override
    public LocalDateTime getLocalDateTime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLocalDateTime'");
    }
    
}
