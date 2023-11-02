import java.util.Scanner;
public class op{
    public static void main (String args[]){
        Scanner myScanner=new Scanner (System.in);
       System.out.println("please enter your choice");
       System.out.println(" +");
       System.out.println(" -");
       System.out.println(" /");
       System.out.println("*");
       System.out.println("5.exit");

       char operator=myScanner.next().charAt(0);
       System.out.println("Enter your first number");
       int num1=myScanner.nextInt();
       System.out.println("Enter your second number");
       int num2=myScanner.nextInt();
       int results;

       switch(operator){
           case '+':
               results=num1+num2;
               break;
           case '-':
               results=num1-num2;
               break;
           case '/':
               results=num1/num2;
               break;
           case '*':
               results=num1*num2;
               break;
           default:
               System.out.println("No choice chosen ");
               return;
       }
       System.out.println("Your results are " + num1 +" " + operator + " " +num2 +" " +" = "+ " " + results);

    }
}