
import java.util.Scanner;

public class shape-with-star{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your number : ");
        int number=scanner.nextInt();

        for(int i=1;i<=number;i++){     
          for(int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=1;i<=(number*2)/3;i++){     
            for(int j=1;j<number;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
 
    }
}
