import java.util.Scanner; 

class word_count {
	
      public static void main(String[] args) {
    	  
	  int count = 0;
	  int s = 0;
	  
      Scanner kl = new Scanner(System.in);  
      System.out.print("Enter any text :");

      String l = kl.nextLine(); 
      System.out.println("Text is: " + l); 
    
       String[] N = l.split("\\s+");

      for (int i = 0; i < N.length; i++) {
    	   System.out.println(N[i]);
          count++;
        }
      
     System.out.println("Total number of words in a given text is :"+count);
    }
   }
  
