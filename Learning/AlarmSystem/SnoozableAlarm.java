package Learning.AlarmSystem;
public class SnoozableAlarm extends Alarm{
    private int snoozeTime;

    public void visualize(){
        System.out.println("Snooze Alarm: "+message );
    }
    SnoozableAlarm(String message,int snoozeTime){
        this.message=message;
        this.snoozeTime=snoozeTime;
    }


}