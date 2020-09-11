import java.util.InputMismatchException;
import java.util.Scanner;


public class Calc {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = 0;
    double y = 0;
    String operator;
     
    System.out.println("Hello, it is a simple calculator that you can use. ");
    
    boolean isRunning = true;
    while (isRunning) {
    try
    {
    System.out.println("Please enter a number: ");
    x = sc.nextDouble();
    }
     catch(InputMismatchException exception)
    {
        System.out.print("This is not a number! Try again."+"\n");
        
        
    }
    sc.nextLine();

    System.out.println("choose an operator.");
    operator = sc.next();
    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("x") && !operator.equals("/")) {
      System.out.println(" Type a valid operator!");
    }
     
       
    try
    {
    System.out.println("Enter another number: ");
    y = sc.nextDouble();
    }
    catch(InputMismatchException exception)
    {
    System.out.print("This is not a number! Try again."+"\n");
    
    }
    
    sc.nextLine();
     



    
    switch(operator) {
      case "+":
      System.out.println(x +" "+ operator +" " + y + " = " + addition(x,y));
      break;
    
    case "-":
      System.out.println(x + " " + operator + " " + y + " = " + subtraction(x,y));
      break;

    case "x": 
    case "*":
      System.out.println(x + " " + operator + " " + y + " = " + multiplication(x,y));
      break;
      
    case "/":
      System.out.printf(x + " " + operator + " " + y + " = " + "%.2f", division(x,y));
      break;
      
    }

            System.out.println("Do you want to continue?Y/N");
         String answer = sc.nextLine();

          if (answer.equals("Y")) {
            System.out.println( "" );
            
          }
          if (answer.equals("N")) {
            System.out.println("EXIT");
            isRunning = false;
          }
            
            

          }   
          
            
            
        } 
      
          
        

        
	

 
  

        public static double addition(double x, double y) {
        
    
            double result = (x + y);
        
    
            return result;
        
    
        }
        
    
     
        
    
        public static double subtraction(double x, double y) {
        
    
            double result = (x - y);
        
    
            return result;
        
    
        }
        
    
     
        
    
        public static double multiplication(double x, double y) {
        
    
            double result = (x * y);
        
    
            return result;
        
    
        }
        
    
     
        
    
        public static double division(double x, double y) {
        
    
            double result = (x / y);
        
    
            return result;
        
    
        }
        
    
    
        



    }
   
   
    



    
  

    