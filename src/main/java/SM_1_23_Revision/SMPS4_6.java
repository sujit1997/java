package SM_1_23_Revision;
import java.util.Scanner;
public class SMPS4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your domain");
        String domain = sc.next();
        if(domain.endsWith(".com")){
            System.out.println("Its an commercial domain");
        } else if (domain.endsWith(".in")) {
            System.out.println("Its an Indian domain");
        } else if (domain.endsWith(".org")) {
            System.out.println("Its an organisational domain");
        }
        else {
            System.out.println("Enter  a proper domain");
        }
    }
}