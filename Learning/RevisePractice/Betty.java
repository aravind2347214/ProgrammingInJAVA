package Learning.RevisePractice;
public class Betty {
//  Write a Java program to split a sentence in to array with the space delimiter.
// “Betty bought some butter”
    public static void main(String[] args) {
        String str = "Betty bought some butter";
        String[] arr = str.split(" ");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
            }
    }
    
}
