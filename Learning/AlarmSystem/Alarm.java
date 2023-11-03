package Learning.AlarmSystem;

import java.util.ArrayList;

public class Alarm{
    protected String message;
    private boolean active;
    private ArrayList<String> phone ;

    Alarm(){
        this.message = "";
        this.active=false;
        this.phone=new ArrayList<String>();
    }

    Alarm( String message,boolean active){
        this.message = message;
        this.active=active;
    }

    Alarm(Alarm temp){
         this.message=temp.message;
         this.active= temp.active;
         this.phone=temp.phone;
    }



    public void visualize(){

        System.out.println(" Normal Alarm: "+message);
    }

    public void register(String phone,int temp){
        // this.phone=phone;
        this.phone.add(phone);
        System.out.println("\nYour Phone number is registered");
        
    }

    public void activateAlarm(){
        this.active=true;
    }
    public void deActivateAlarm(){
        this.active=false;
    }

    public void  displayAlarmDetails(){
        System.out.println("Message :"+this.message+"\nActive :"+this.active);
        for (int i = 0; i < this.phone.size(); i++) {
            System.out.println(this.phone.get(i));
            
        }
    }
      
}

