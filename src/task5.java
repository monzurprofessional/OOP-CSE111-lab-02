//TASK 5
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zcount = 0;
        int count=0;
        int sum =0;
        int min = 999999;
        int max = -999999;
        System.out.println("enter numbers");
        while(true){
            int n = sc.nextInt();
            if(n==0){
                if(zcount==2){
                    break;
                }
                zcount++;
            }
            else {
                sum+=n;
                if(n>max){
                    max=n;
                }
                if(n<min){
                    min=n;
                }
                count++;
                zcount=0;
            }
        }
        if(count==0){
            System.out.println("No numbers found");
        }
        else {
            System.out.println("sum:" + sum);
            System.out.println("Minimum:" + min);
            System.out.println("Maximum:" + max);
            System.out.println("Average:" + sum / (double) count);
        }
    }
}
