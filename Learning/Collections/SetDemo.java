package Learning.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> data = new LinkedHashSet<String>();
        //add elements to the set
        data.add("one");
        data.add("two");
        data.add("Three");
        Iterator<String> i = data.iterator();
        for(i.hasNext();;){
            System.out.println(i.next());  
        }
    }
    
    
}
