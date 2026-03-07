
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int as = (int)ch;
        if(ch >= 'A' && ch <= 'Z'){
        System.out.println("My ASCII value of this Character is : " + as);
        }
        else{
            System.out.println("My ASCII value of this Character is Invalid");
        }
    }
}