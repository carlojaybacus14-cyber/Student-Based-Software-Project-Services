package Austria;
import java.util.Scanner;
public class haha {
        public static void main(String[] args) {
                
                double DISCOUNT= 0.10;
                double fuelLiters = 45.5;
                double pricePerLiter = 62.50;
                String[] stations =  {"unleaded" , "Diesel", "Premium"};
                
        
                System.out.println("welcome to the Smart");
                System.out.println("Enter the index(0-2): ");
                Scanner reader = new Scanner(System.in);
                int choice = reader.nextInt();
                
                if (choice == 2 && stations[choice]== ("Premium")) {
                        System.out.println("Premium Station Selected");
                        
                }else if (choice>2 && choice<0){
                System.out.println("Invalid");
                }
                
                double total = (pricePerLiter*fuelLiters)-DISCOUNT;
                System.out.println("amount: " + total);
               
                displayClosing();
                
        }
        
        public static void displayClosing(){
                System.out.println("Thankyou");
        }
     
    
}
