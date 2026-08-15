import java.util.Scanner;

public class MenuDrivenCalculator {
    Scanner scan = new Scanner(System.in);
    public void Calc() {
        int choice;
        do 
        {
            System.out.println("Calculator Menu");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("0.Exit");


            System.out.print("Enter your choice: ");
            choice = scan.nextInt();


            if(choice ==0)
                break;
            System.out.print("Enter num1: ");
            int num1 =scan.nextInt();


            System.out.print("Enter num2: ");
            int num2 =scan.nextInt();


            switch(choice)
            {
                case 1:
                    System.out.println("Result:"+ (num1 +num2));
                    break;
                case 2:
                    System.out.println("Result:" +(num1- num2));
                    break;
                case 3:
                    System.out.println("Result:" +(num1*num2));
                    break;
                case 4:
                    if(num2==0)
                        System.out.println(" enter a valid number");
                    else
                        System.out.println("Result:"+ ((double)num1/ num2));
                    break;
            }
        }
        

        while(choice != 0);


    }
}