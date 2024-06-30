//TASK 6
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        double total =0;
        for (int i = 0; i <5 ; i++) {
            double num =sc.nextDouble();
            double weight = sc.nextDouble();
            total+=weight;
            sum +=num*weight;

        }
        double avg = sum/(double)total;
        System.out.println("weighted Average:"+avg);
    }
}
