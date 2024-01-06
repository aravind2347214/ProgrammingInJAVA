package Learning.RandomNumber;
import java.util.*;
public class App {

    public static void main(String[] args) {
        int counter=5;
        int number= (int)Math.floor(Math.random() * (100 - 1 + 1) + 1) ; 
        System.out.println("Guess The Number between 1 and 100 you have " +counter+" Chances");
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int userNumber = sc.nextInt();
            sc.close();
            if (userNumber == number){
                System.out.println("\nCongratulation You Guessed it Right!");
                counter=0;
            }
            else{
                counter--;
                
                if (counter==0){
                    System.out.println("You Ran Out Of Chance, Better Luck Next Time!\n The Number was "+number);
                    break;
                }
                if (userNumber<number){
                    System.out.println("Your Number Is Smaller. \n"+counter+" Chances Left!!\n");
                    continue;
                }
                else{
                    System.out.println("Your Number Is Bigger. \n"+counter+" Chances Left!!\n");
                    continue;
                }
            }
            
        } while (counter>0);
         

    }
}

