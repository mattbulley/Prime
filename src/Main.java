import java.util.Scanner;

public class Main{

   public static Scanner scanner = new Scanner(System.in);
   public static String input;
   public static String start = "start";
   public static String quit = "quit";
   public static String test = "test";
   public static Long iterations = 2000000000L;

    public static void main(String[] args) {
	// write your code here
        print(Float.toString(25 % 5));
        boolean playing = true;

        do{
            input = userInput();
            print(input);

            if(input.equalsIgnoreCase(start)){
            	print("Calculating");
                primesL();
            }
            
            if(input.equalsIgnoreCase(test)){
            	print("test");
                print(Boolean.toString(checkPrime(20000003)));
            }
            if(input.equalsIgnoreCase(quit)){
                System.exit(0);
            }

        } while (playing);



        scanner.close();
    }

    public static String userInput(){
        boolean incorrectInput = true;
        String input = "";
        scanner.reset();
        do {
            try {
                input = scanner.nextLine();
                incorrectInput = false;
            } catch (Exception wrongInput) {

                System.out.println("");
                System.out.println("Incorrect input! Please enter a valid input");
            }

            if(incorrectInput) {
                System.out.println("");
                System.out.println("Incorrect input! Please enter a valid input");
            }
        } while (incorrectInput);


        return input;
    }

    public static void print(String string){
        System.out.println(string);
    }

    public static void primes(){
        int counter = 0;

        int[] integers = new int[20000];
        for(int i = 0; i < integers.length; i++){
            integers[i] = i;
           

            if(checkPrime(integers[i])) {
                counter++;
                System.out.print(counter + ") - ");
                print(Float.toString(integers[i]));
            }

        }
    }
    
    public static void primesL(){
        int counter = 0;
        int arraySize = 1000000;
        Long[] integers = new Long[arraySize];
        int millions = 100;
        long count = 0;
        long countPlus = 0;
   
        for(int j = 0; j < millions ; j++) {
        	
	        for(int i = 0; i < integers.length; i++){
	        	Long L = (long) (i + (integers.length * j));
	        	
	        	integers[i] = L;
	        	 count++;
	        	
	        	 System.out.print(L + " ");
	        	 print("");
	        	
	            if(checkPrime(integers[i])) {
	                counter++;
	                
	                System.out.print(L + " ");  print(Float.toString(integers[i]));
	                
	            }
	
	        }
	        
	       
        }
        
        print(Integer.toString(counter)  + " primes");
   
    }

    public static boolean checkPrime(long number)
    {
        if(number <= 1){
            return false;
        } else if(number <= 3) {
            return true;
        } else if (number % 2 == 0L || number % 3 == 0L){

            return false;
        }


        for(int i = 5; (i * i) <= number; i++){

            if(number % i == 0L || number % (i+2) == 0L){

                return false;
            }
        }
        return true;
    }
}
