import java.util.InputMismatchException;
import java.util.Scanner;


public class Calc {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = 0;
    double y = 0;
    String operator;
    // This code will welcome the user.
    System.out.println("Hello, this is a simple calculator that you can use. ");
    // This code will allow the user to start the program from the beginning.
    boolean isRunning = true;
    while (isRunning) {
    // The user have to enter a number, otherwise the loop will run again.
    boolean  firstNumber = true;
    while (firstNumber) {
    try
    {
    
    System.out.println("Please enter first number: ");
    
    x = sc.nextDouble();
    firstNumber = false;
    }
     catch(InputMismatchException e)
     {
      sc.nextLine();
      firstNumber = true;
      
     }
     
    } 
  
        
   
    
     
      
      
     // The user have to select an operator, otherwise the loop will run again.
    do {
    System.out.println("choose an operator ( + , - , x , / ): ");
    operator = sc.next();
    
    }
    while  (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("x") && !operator.equals("/"));






     // The user have to enter a number, otherwise the loop will run again.  
    boolean  secondNumber = true;
    while (secondNumber) {
    try
    {
    
    System.out.println("Please enter second number: ");
    
    y = sc.nextDouble();
    secondNumber = false;
    }
     catch(InputMismatchException e)
     {
      sc.nextLine();
      secondNumber= true;
      
     }
     
    } 
    
    sc.nextLine();
     



    // The system will print the calculation result, depends on which operator is selected by the user.
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
            // Ask the user if they wants to calculate again.
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
   
   
    



    
  

    