import java.util.Scanner;

public class palindrom-number{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your number: ");
        int number = scanner.nextInt();
        scanner.close();
        int temp1=number;
        int temp2=0;
        while(temp1!=0){
            int remain=temp1%10;
            temp2=(temp2*10)+remain;
            temp1 = temp1/10;
        }

        if(temp2==number){
            System.out.println("number "+temp2+ " is palindrom");
        }
        else{
            System.out.println("number "+number+" is\'n palindrom");
        }

    }
}
