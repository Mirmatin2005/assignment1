import java.util.Scanner;

public class  perfect-number{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your number: ");
        int number = scanner.nextInt();
        int sum = 0;
        
        scanner.close();

        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("number "+number+" is perfect");
        }
        else{
            System.out.println("number "+number+" is not perfect");
        }
    } 
}
