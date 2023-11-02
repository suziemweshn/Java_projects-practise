import java.util.Scanner;


public class calc{

    public static void main (String args[]){
        Scanner myScanner=new Scanner (System.in);

        System.out.println("This is a basic operator");
        System.out.println("Enter the operators..available options are + ,-, * and /");
        System.out.println("Enter an operator");

        char operator=myScanner.next().charAt(0);
        System.out.println("Enter your first number");
        int num1=myScanner.nextInt();

        System.out.println("Enter your second number");
        int num2=myScanner.nextInt();
        int result;

       switch (operator){
           case '+':

             result =num1+num2
               ;
               break;
           case '-':
                result =num1-num2;
               break;
           case'/':
              result= num1/num2;
               break;
           case '*':
              result = num1 * num2;
               break;
            default:
                System.out.println("No operator chosen");
                return;

       }

System.out.println("your results are " + num1 + " " + operator + " " + num2 +" = " + result);

    }
}




