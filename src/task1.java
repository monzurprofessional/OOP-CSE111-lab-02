//TASK 1
public class task1 {
    public static void main(String[] args) {
        //a
        int i = 2;
        while (i<=50){
            if(i<50) {
                System.out.print(i+",");
            }
            else{
                System.out.println(i);
            }
            i+=4;
        }

        //b
        int j = 1;
        int increment=2;
        while (j<=120){
            if(j<120) {
                System.out.print(j + ",");
            }
            else {
                System.out.println(j);
            }
            j+=increment;
            increment++;
        }

    }
}
