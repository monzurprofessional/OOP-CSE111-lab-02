//TASK 7
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        //a
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int n = sc.nextInt();
        int firstvalue =1;
        int secoondValue=1;
        while (true){
            if(firstvalue<=n) {
                System.out.print(firstvalue + " ");
            }
            else {
                break;
            }
            int temp = firstvalue+secoondValue;
            firstvalue=secoondValue;
            secoondValue=temp;

        }
        System.out.println();
        System.out.println("enter an integer");
        //b
        int a = sc.nextInt();
        int value1 = 1;
        int value2 = 1;
        int sum = 0;
        while (true) {
            if(value1<=a) {
                System.out.print(value1 + " ");
                sum+=value1;
            }
            else {
                break;
            }

            int temp2 = value1+value2;
            value1=value2;
            value2=temp2;
        }
        System.out.println();
        System.out.println("sum = "+sum);

    }
}
