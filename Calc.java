import java.util.InputMismatchException;
import java.util.Scanner;


public class Calc {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = 0;
    double y = 0;
    String operator;
     
    System.out.println("Hello, this is a simple calculator that you can use. ");
    
    boolean isRunning = true;
    while (isRunning) {
    try
    {
    System.out.println("Please enter first number: ");
    x = sc.nextDouble();
    
    }
     catch(InputMismatchException e)
     {
      System.out.print("This is not a number! Try again."+"\n");
      System.out.println("Please enter first number: ");
      sc.nextLine();
      x = sc.nextDouble();
      
     }
     
        
      
        
   
    
     
      
      
     
    

    System.out.println("choose an operator ( + , - , x , / ): ");
    operator = sc.next();
    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("x") && !operator.equals("/")) {
      System.out.println(" Type a valid operator! ( + , - , x , / ) ");

      operator = sc.next();
    }
    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("x") && !operator.equals("/")) {
      
    }
     
       
    try
    {
     System.out.println("Enter another number: ");
     y = sc.nextDouble();
    }
    catch(InputMismatchException exception)
    {
     System.out.print("This is not a number! Try again."+"\n");
     System.out.println("Enter another number: ");
     sc.nextLine();
     y = sc.nextDouble();
     
    }
    
    sc.nextLine();
     



    
    switch(operator) {
      case "+":
      System.out.printf(x +" "+ operator +" " + y + " = " + "%.2f", addition(x,y) );
      break;
    
    case "-":
      System.out.printf(x + " " + operator + " " + y + " = " + "%.2f", subtraction(x,y) );
      break;

    case "x": 
    case "*":
      System.out.printf(x + " " + operator + " " + y + " = " + "%.2f", multiplication(x,y) );
      
      break;
      
    case "/":
      System.out.printf(x + " " + operator + " " + y + " = " + "%.2f", division(x,y) );
      break;
      
    }
            
            System.out.println("");
            System.out.println("Do you want to calculate more?Y/N");
            String answer = sc.nextLine();

          if (answer.equalsIgnoreCase("Y")) {
            System.out.println( "" );
            
          }
          if (answer.equalsIgnoreCase("N")) {
            System.out.println("EXIT");
            isRunning = false;
          }
          
            
            }
           
            
            sc.close(); 
            

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
   
   
    



    
  

    