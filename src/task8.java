//TASK 8
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 integers");
        int a =sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            int temp= a;
            a=b;
            b=temp;
        }
        int count = 0;
        for (int i =a; i <=b ; i++) {
            boolean flag = true;
            for (int j = 2; j <i ; j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println("There are "+ count + " prime numbers between "+ a +" and " +b);

    }
}
