import java.util.*;
public class PrintCharacterPattern{
    public static void main(String[] args){
        int n = 5;
        char ch = 'A';

        //Outer loop
        for(int line=1; line<=n; line++){
            //Inner loop
            for(int character=1; character<=line; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}