package Learning.NestedClassExample;

public class OuterClass {

    String OuterField;
    static String staticOuterField = "Static Outer field";

    public class InnerClass {
        String InnerField;
    }

    public static class InnerStaticClass {
        private String InnerStaticField;
        static String staticInnerField = "Static Inner field";
    }
        
    public static void main(String[] args) {
        
    }
    
}
