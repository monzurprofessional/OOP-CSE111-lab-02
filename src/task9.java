//TASK 9
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count+" digits ");
        //b
        System.out.println("enter a number");
        int x = sc.nextInt();
        int temp =x;
        int count2 = 0;
        while(x>0){
            x/=10;
            count2++;
        }
        for (int i = count2-1; i >=0 ; i--) {
            int get = temp/(int)Math.pow(10,i);
            temp%=(int)Math.pow(10,i);
            System.out.print(7*get + " ");
        }

    }
}
