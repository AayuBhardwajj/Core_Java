package com.telusko;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s= new Scanner(System.in);
        Calculator c= new Calculator();

        System.out.println("Enter your input, a: ");
        int a=s.nextInt();
        System.out.println("Enter your input, b: ");
        int b=s.nextInt();
        System.out.println("Choose the operation: ");
        System.out.println("1. + (Addition)");
        System.out.println("2. - (Difference)");
        System.out.println("3. * (Multiplication)");
        System.out.println("4. / (Division)");
        System.out.println("5. exit");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                
            System.out.println("Your result is: "+ (c.add(a, b)));
                break;
            case 2:
                System.out.println("Your result is: "+ (c.sub(a, b)));
                break;

            case 3:
                System.out.println("Your result is: "+ (c.mul(a, b)));
                break;
                
            case 4:
                if(b!=0){
                System.out.println("Your result is: "+ (double) c.div(a, b));
                }else{
                    System.out.println("invalid output, can't be divided by zero");
                }
                break;
            
            case 5:
            System.out.println("Exited successfully");
            break;
                
            default:
                System.out.println("Invlaid inputs or choices");
                break;
        }

    }
}
