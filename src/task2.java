//TASK 2
public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <=20 ; i+=2) {
            if(i<=20){
                System.out.print(i+",");
            }
            if(i==20){
                for (int j = 18; j >=2 ; j-=2) {
                    System.out.print(j+",");
                }
            }
        }
    }
}
