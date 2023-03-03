package pre_place_assigns;

import java.util.HashMap;
import java.util.Map;

class PrintBill{
    HashMap<String,Integer> hm = new HashMap<>();
    PrintBill(HashMap<String,Integer> hm){
        this.hm = hm;
    }
    public void printb(){
        int sum = 0;
       
        for(Map.Entry<String,Integer> val : this.hm.entrySet()){
         System.out.println(val.getKey()+val.getValue());
         sum = sum + val.getValue();
        }
     System.out.println("Total Bill-"+sum);
     if(sum > 10000){
         System.out.println("You have fot the free cleaning service!! ");
     }
    }

}
