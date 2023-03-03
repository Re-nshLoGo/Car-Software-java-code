package pre_place_assigns;

import java.util.HashMap;

class Car{
    int BS01,EF01,CF01,BF01,GF01;
    static HashMap<String,Integer> hm = new HashMap<>();
       Car(int BS01,int EF01,int CF01,int BF01,int GF01){
        this.BS01 = BS01;
        this.EF01 = EF01;
        this.CF01 = CF01;
        this.BF01 = BF01;
        this.GF01 = GF01; 
        }
       public void findbill(String carcode){
            switch (carcode) {
                case "BS01":
                 hm.put("Charges for Basic Servicing - ",this.BS01);
                    break;
                case "EF01":
                  hm.put("Charges for Engine Fixing - ", this.EF01);
                    break;
                case "CF01":
                 hm.put("Charges for Clutch Fixing - ",this.CF01);
                    break;
                case "BF01":
                 hm.put("Charges for Brake Fixing - ", this.BF01);
                    break;
                case "GF01":
                hm.put("Charges for Gear Fixing - ", this.GF01);
                    break;
                default:
                    break;
            }
        }
        public HashMap<String, Integer> getDetails() {
            return hm;
        }

}
class Hatchback extends Car{
    Hatchback(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01); 
    }

}
class Sedan extends Car{
    Sedan(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01); 
    }
}
class SUV extends Car{
    SUV(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01); 
    }
}
