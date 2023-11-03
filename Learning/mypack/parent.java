package Learning.mypack;

public abstract class parent {
    private void fun1(){
        // this is not inhertitable
        System.out.println("Parent Private Function");
    }

    protected void fun2(){
        System.out.println("Parent Protected Function");
    }

    public void fun3(){
        System.out.println("Parent Public Function");
    }

    public abstract void something();
    
}
