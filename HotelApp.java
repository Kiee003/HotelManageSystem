import java.util.*;

public class HotelApp
{
 public static void main(String[]args)
 {
  
   System.out.println("\n\t\t\t\t\t**********************************************");
   System.out.println("\n\t\t\t\t\t              WELCOME TO OUR HOTEL            ");
   System.out.println("\n\t\t\t\t\t**********************************************");
 
   System.out.println("\n\n\t\t\t\t\t       This is the package for our hotel    ");
   System.out.println("\n\t\t\t\t\t\t\t              Hotel Package               ");
   System.out.println("\t\t\t\t\t________________________________________________");
   System.out.println("\t\t\t\t\t|     Package A      |       Package B         |"); 
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   System.out.println("\t\t\t\t\t|    (3D 2N)         |       (5D 4N)           |"); 
   System.out.println("\t\t\t\t\t|___________________ |_________________________|");
   System.out.println("\t\t\t\t\t|    Free Spa        |    Free Spa & Gym       |"); 
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   System.out.println("\t\t\t\t\t|   Free Breakfast   | Free Breakfast & Dinner |");
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   System.out.println("\t\t\t\t\t|   Unlimited Wifi   |   Unlimited Wifi        |");
   System.out.println("\t\t\t\t\t|____________________|_________________________|"); 
   System.out.println("\t\t\t\t\t|   Price RM 500     |     Price RM 700        |");
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   
   System.out.println("\n\t\t\t\t\t\t\t            Hotel Type                    ");
   System.out.println("\t\t\t\t\t________________________________________________");
   System.out.println("\t\t\t\t\t|         VIP        |        BASIC            |");
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   System.out.println("\t\t\t\t\t|       RM 100       |        RM 50            |"); 
   System.out.println("\t\t\t\t\t|____________________|_________________________|");
   System.out.println("\t\t\t\t\t\t\t      *******THANK YOU********             ");
    
  hotelCust allCust[] = new hotelCust[50];
  
  allCust[0] = new hotelCust("Anita Sofea", "020405100322", "0112345788", "Vip", "friday", 'A', 600);
  allCust[1] = new hotelCust("Syafiq Aqil", "970806013455", "0111356890", "Vip", "friday", 'B', 800);
  allCust[2] = new hotelCust("Marina Putri", "990704054432", "0187654332", "Basic", "friday", 'A', 550);
  allCust[3] = new hotelCust("Susan Wong", "001005068444", "0134567281", "Basic", "friday", 'B', 750);
  allCust[4] = new hotelCust("Michael Kim", "761208010311", "0115467990", "Vip", "monday", 'A', 600);
  allCust[5] = new hotelCust("Ahmad Amin", "960503105037", "0178654329", "Basic", "thursday", 'B', 550);

  
  for(int i = 0; i < 6; i++)
  {
   double dis = allCust[i].calcDisc();
   
   double totalDisc = dis * allCust[i].getPrice();
   
   System.out.println("\nName of the Customer: " +allCust[i].getName());
   System.out.println("IC: " +allCust[i].getIc());
   System.out.println("Phone Number: " +allCust[i].getPhoneNo());
   System.out.println("Hotel Type: " +allCust[i].getHotelType());
   System.out.println("Day of the Customer Booking: " +allCust[i].getDay());
   System.out.println("Package Customer Booking: " +allCust[i].getPack());
   System.out.println("Price before Discount: RM" +allCust[i].getPrice());
   System.out.println("Discount of the Customer: " +dis);
   System.out.println("Price After Discount: RM" +totalDisc);
  }
 }
}

