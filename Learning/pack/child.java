package Learning.pack;
import Learning.mypack.parent;

public class child extends parent {

    @Override
    protected void fun2(){
        System.out.println("Child Protected Function");
    }
    @Override
    public void fun3(){
        System.out.println("Child Public Function");
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static String add(char a,char b){
        return "" +a+b;
    }

    public static int[] add(int a,int b,int c){
        int [] arr = new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        return arr;  
    }

    @Override
    public void something(){
        System.out.println("Abtract Method invoked");
    }

    

    public static void main(String[] args) {
        child ob1 = new child();
        ob1.fun2();
        ob1.fun3();
        ob1.something();
    }
    
}
