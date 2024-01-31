import java.util.*;
public class DisplayNumber {
    public static void main(String[] args){
        do{
            System.out.print("Enter your number: ");
            int n = new Scanner(System.in).nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        } while(true);
    }
}