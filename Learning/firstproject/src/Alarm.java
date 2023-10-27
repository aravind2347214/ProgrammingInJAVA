public class Alarm{
    protected String message;
    private boolean active;
    private String phone ;

    Alarm(){
        this.message = "";
        this.active=false;
        this.phone="";
    }

    Alarm( String message,boolean active,String phone){
        this.message = message;
        this.active=active;
        this.phone= phone;
    }

    public void visualize(){
        System.out.println(" Normal Alarm: "+message);
    }

    public void register(String phone,int temp){
        if (temp>30) {
            this.active = true;
        }
    }

    public void  displayAlarmDetails(){
        System.out.println("Message :"+this.message+"\nActive :"+this.active+"\nPhone Number:"+this.phone);
    }
      
}

