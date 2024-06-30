//TASK 10
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ammount of money");
        int n =sc.nextInt();
        int c500=0;
        int c100=0;
        int c50=0;
        int c10=0;
        int c5=0;
        int c1=0;
        if(n>=500) {
            while (n >= 500) {
                n -= 500;
                c500++;
            }
            System.out.println(c500 + " 500's note");
        }
        if(n>=100) {
            while (n >= 100) {
                n -= 100;
                c100++;
            }
            System.out.println(c100 + " 100's note");
        }
        if(n>=50) {
            while (n >= 50) {
                n -= 50;
                c50++;
            }
            System.out.println(c500 + " 50's note");
        }
        if(n>=10) {
            while (n >= 10) {
                n -= 10;
                c10++;
            }
            System.out.println(c10 + " 10's note");
        }
        if(n>=5) {
            while (n >= 5) {
                n -= 5;
                c5++;
            }
            System.out.println(c5 + " 5's note");
        }
        if(n>=1) {
            while (n >= 1) {
                n -= 1;
                c1++;
            }
            System.out.println(c1 + " 1's note");
        }
    }
}
