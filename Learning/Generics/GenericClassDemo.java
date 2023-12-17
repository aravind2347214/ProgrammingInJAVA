package Learning.Generics;
public class GenericClassDemo {
    public static void main(String[] args) {

        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Returns : "+intObj.getData());  

        GenericClass<String> stringObj = new GenericClass<>("Hello World");
        System.out.println("Returns : "+stringObj.getData());  
    }
    
}
class GenericClass<T> {
        private T data;

        public GenericClass(T data){
            this.data=data;
        }

        public T getData(){
            return this.data;
        }

}


