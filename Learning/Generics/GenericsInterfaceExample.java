package Learning.Generics;

import java.util.*;

/**
 * GenericsInterfaceExample
 */
interface MyInterface<T> {
    T performOperation(T value);

}

public class GenericsInterfaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int intValue= sc.nextInt();
         System.out.println("Enter an Double");
        double doubleValue= sc.nextDouble();
         System.out.println("Enter an String");
        String stringValue= sc.next();

        MyInterface<Object> myInterface = new MyInterface<Object>() {
            @Override
            public Object performOperation(Object value) {
                if (value instanceof Integer) {
                    return ((Integer)value)*2;
                }
                else if (value instanceof Double){
                    return  ((double)value/2);
            }
            else if(value instanceof String){
                return (((String)value).toUpperCase());
            }
            else{
                return null;
            }
            
        }
        
    };
    Object result1 = myInterface.performOperation(intValue);
    Object result2 = myInterface.performOperation(doubleValue);
    Object result3 = myInterface.performOperation(stringValue);

    //display all results
    System.out.println("Result for Integer: " +result1);
    System.out.println("Result for Double: "+result2);
    System.out.println("Result for String: "+result3);



}
}