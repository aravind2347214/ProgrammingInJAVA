package Learning.AlarmSystem;

public class Industry {
public static void main(String[] args) {
    Alarm a0=new Alarm();
    Alarm a1= new Alarm("This is the first alarm", false);
    // Alarm copyOfA1 = new Alarm(a1);
    a0.displayAlarmDetails();
    a1.displayAlarmDetails();
    a1.register(null, 0);
    SnoozableAlarm s1 =new SnoozableAlarm("First Snoozable message", 2000);
    SnoozableAlarm s2 =new SnoozableAlarm("Second Snoozable message", 5000);
}
    
}
