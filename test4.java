import java.util.Scanner;



public class test4 {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     
    System.out.println("Hello, it is a simple calculator that you can use. ");
    boolean isRunning = true;
    while (isRunning) {
    System.out.println("Please enter a number: ");
    double x = sc.nextDouble();
    System.out.println("Enter another number: ");
    double y = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("Which operation do you want to choose?");
    System.out.println("For Addition please insert 1");
    System.out.println("For Subtracion please insert 2");
    System.out.println("For Multiplication please insert 3");
    System.out.println("For Division please insert 4");
    
    String input = sc.nextLine();

    
    if (input.equals("1")) {
      
      System.out.println("The answer is " + addition(x, y)+"\n" );
      isRunning = true;
    }
      if (input.equals("2")) {
        
        System.out.println("The answer is " + subtraction(x, y)+"\n" );
        isRunning = true;
         } 
           if (input.equals("3")) {
          
          System.out.println("The answer is " + multiplication(x, y)+"\n");
          isRunning = true;
            }
            if (input.equals("4")) {
            
            System.out.println("The answer is " +""+ division(x, y)+"\n" ); 
            isRunning = true;
            }
            else {
                System.out.println("Please enter an optation!");
            isRunning = false;        
                
            }
        

            System.out.println("Do you want to continue?Yes/No");
         String answer = sc.nextLine();

          if (answer.equals("Yes")) {
            System.out.println("" );
            isRunning = true;
          }
          if (answer.equals("No")) {
            System.out.print("EXIT");
            isRunning = false;
          }
            else {
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
   
   
    



    
  

    