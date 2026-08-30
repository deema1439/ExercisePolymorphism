import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main1 {
  public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      List <Vehicle> rentedVehicles=new ArrayList<>();
      List<String>car=new ArrayList<>();
      car.add("Toyota");
      car.add("Volkswagen");
      car.add("ford");
      car.add("honda");
      car.add("Bmw");
      car.add("Benz");
      car.add("Tesla");
      List<String>type=new ArrayList<>();
      type.add("Ford");
      type.add("Ram");
      type.add("GMC");
      type.add("Toyota");
      List<String>brands=new ArrayList<>();
      brands.add("Specialized");
      brands.add("Trek");
      brands.add("Giant");
      brands.add("Cannondale");
      brands.add("Scott");

      int choose;
     boolean stop=true;
     while (stop){
         System.out.println("====== Welcome To (Our Vehicles Is Your Vehicles Store)====");
         System.out.println("                                                               ");
         System.out.println(" Choose What Do You Want to Rent : ");
         System.out.println("                                                               ");
          System.out.println("1-Rent a car ");
          System.out.println("2-Rent a bike ");
          System.out.println("3-Rent a Truck ");
          System.out.println("4-view Rented Vehicles ");
          System.out.println("5-Exit ");
          choose=s.nextInt();

          switch (choose){
              case 1:
                  System.out.println("here is our car Models: ");
                  System.out.println(car);
                  System.out.println("Enter the car model: ");
                  s.nextLine();
                  String model=s.nextLine();
                  System.out.println("Enter the rentel days: ");
                  int days=s.nextInt();
                  System.out.println("                                                               ");
                  Car c=new Car(model,days);
                  c.displayDetails();
                  rentedVehicles.add(c);
                  System.out.println("                                                               ");
                  break;
              case 2:
                  System.out.println("here is our bick Brands ");
                  System.out.println(brands);
                  System.out.println("Enter your Brand: ");
                  s.nextLine();
                  String brand=s.nextLine();
                  System.out.println("Enter your rental houre: ");
                  int houre=s.nextInt();
                  System.out.println("                                                               ");
                  Bike b=new Bike(brand,houre);
                  b.displayDetails();
                  System.out.println("                                                               ");
                  rentedVehicles.add(b);
                  break;
              case 3:
                  System.out.println("here is our Truck type: ");
                  System.out.println(type);
                  System.out.println("Enter the type: ");
                  s.nextLine();
                  String typee=s.nextLine();
                  System.out.println("Enter the weeks: ");
                  int weeks=s.nextInt();
                  System.out.println("                                                               ");
                  Truck t=new Truck(typee,weeks);
                  t.displayDetails();
                  System.out.println("                                                               ");
                  rentedVehicles.add(t);
                  break;
              case 4:
                  System.out.println("the Rented Vhichels: ");
                  for(Vehicle r:rentedVehicles){
                      System.out.println("                                                               ");
                      r.displayDetails();
                  }
                  break;
                  case 5:
                      System.out.println("Thank you for using the Vehicle rental System ");
                  stop=false;
                  break;
              default:
                  System.out.println("Not A choice ");

          }











      }
























































  }
}
