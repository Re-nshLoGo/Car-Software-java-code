package pre_place_assigns;
import java.util.*;

public class Carsoftwithoops {
    public static void main(String[] args) {
        System.out.println("Enter type of car (Hatchback,Sedan,SUV) ");
        Scanner sc = new Scanner(System.in);
        String cartype = sc.nextLine();
        System.out.println("Enter Service codes eg : BS01,EF01,CF01,BF01,GF01");
        String servicecodes = sc.nextLine();
        if(cartype.equals("Hatchback")){
           String arr[] = servicecodes.split(",", 6);
           Hatchback h = new Hatchback(2000, 5000, 2000, 1000, 3000);
           for(String val : arr){
             h.findbill(val);
           }
           HashMap<String,Integer> hm = h.getDetails();
           PrintBill pb = new PrintBill(hm);
           pb.printb();
        }else if(cartype.equals("Sedan")){
            String arr[] = servicecodes.split(",", 6);
            Sedan s = new Sedan(4000, 8000, 4000, 1500, 6000);
            for(String val : arr){
             s.findbill(val);
            }
            HashMap<String,Integer> hm = s.getDetails();
            PrintBill pb = new PrintBill(hm);
            pb.printb();
        }
        else if(cartype.equals("SUV")){
            String arr[] = servicecodes.split(",");
            SUV suv = new SUV(5000, 10000, 6000, 2500, 8000);
            for(String val : arr){
              suv.findbill(val);
            }
            HashMap<String,Integer> hm = suv.getDetails();
            PrintBill pb = new PrintBill(hm);
            pb.printb();
        }
    }
}
