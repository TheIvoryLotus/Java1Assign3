import java.util.Scanner;
// Christopher H
// This program calculates the monetary total value of books sold per day
 public class AssignmentThree {
    public static void main(String[] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      // Assign values 
      int bookId = 1;
      int quantitySold = 1;
      double totalPrice = 0;
      
   
      // Create a loop 
      while(bookId != 0) {
         System.out.print("Enter bookId from 1-5 or 0 to stop: ");
         bookId = input.nextInt();
         
      // Create a switch statement
      switch(bookId) {
         
         // Calculate and display results when the loop is ended
         case 0:
            System.out.printf("\nTotal for all books sold for the day is: $" + "%.2f", totalPrice); break;

         // BookId 1
         case 1: 
            System.out.print("Enter book quantity sold: ");
            quantitySold = input.nextInt(); 
            totalPrice += 20.85 * quantitySold; break;

         // BookId 2
         case 2: 
            System.out.print("Enter book quantity sold: "); 
            quantitySold = input.nextInt();
            totalPrice += 14.50 * quantitySold; break;

         // BookId 3
         case 3: 
            System.out.print("Enter book quantity sold: ");
            quantitySold = input.nextInt();
            totalPrice += 19.30 * quantitySold; break;

         // BookId 4
         case 4: 
            System.out.print("Enter book quantity sold: "); 
            quantitySold = input.nextInt();
            totalPrice += 41.25 * quantitySold; break;

         // BookId 5
         case 5: 
            System.out.print("Enter book quantity sold: "); 
            quantitySold = input.nextInt();
            totalPrice += 61.65 * quantitySold; break;
         
         // Reiterate the main 
         default:
            System.out.println("Book number must be between 1 and 5 or 0 to stop "); break;
            
         
         } // End of switch
      } // End of loop
   }   
}


       

        
   