import java.util.Scanner;
public class Displayallnumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   
        do{
            System.out.print("Enter your number: ");
            int n = scanner.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        } while(true);
    }
}