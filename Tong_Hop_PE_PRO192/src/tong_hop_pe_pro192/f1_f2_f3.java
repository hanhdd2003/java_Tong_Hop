//1.  đếm các cala có price chẵn
//2. xóa phần tử nhỏ nhất thứ 2
//3. sắp xếp theo owner
//4. đếm các đối tượng có kí tự thứ 2 là số
//5. xóa phần tử max price thứ 2
//6. f1: Return the whole part of average rate of all cars (e.g. the whole part of 3.7 is 3).
//7. hoán đổi vị trí của đối tượng có rate min và max đầu tiên cho nhau
//8. Sort the list by maker alphabetically, 
//in case makers are the same, sort them descendingly by rate.
//9. 
package tong_hop_pe_pro192;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class f1_f2_f3 {
//----------------------------------------------11111--------------------------------------

    /* đếm các cala có price chẵn
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            if (cala.getPrice() % 2 == 0) {
                count++;
            }
        }
        return count;
    }*/
//==================================================================================== 
//-----------------------------------------------222222------------------------------------
/*    public void f2(List<Cala> t) {
        // tìm ra đối tượng cala nhỏ nhất
        Cala minimum = t.get(0);
        for (Cala cala : t) {
            if (cala.getPrice() < minimum.getPrice()) {
                minimum = cala;
            }
        }
        // tìm ra đối tượng nhỏ thứ 2
        int count = 0;
        Cala secondMinimun = null;
        for (Cala cala : t) {
            if (cala.getPrice() == minimum.getPrice()) {
                count++;
            }
            if (count == 2) {
                secondMinimun = cala;
                break;
            }
        }
        if (secondMinimun != null) {
            t.remove(secondMinimun);
        }
    }*/
//==================================================================================
//--------------------------------333333 ---------------------------------------
    /*   public void f3(List<Cala> t) {
        Comparator<Cala> c = Comparator.comparing(Cala::getOwner).reversed();
        Collections.sort(t, c);
    }*/
//==========================================================================    
//---------------------------------44444-----------------------------------------
    /*public int f1(List<Cala> t) {
        int count = 0;
        for (Cala c : t) {
            char a;
            a = c.getOwner().charAt(1);
            if (Character.isDigit(a)) {
                count++;
            }
        }
        return count;
    }*/
//===============================================================
//-----------------------------------55555------------------------------------    
    /*   public void f2(List<Cala> t) {
        // tìm max price đầu tiên
        Cala maxPriceFirst = t.get(0);
        Cala maxPriceSecond = null;
        for(int i = 1; i < t.size(); i++){
            if(t.get(i).getPrice()>maxPriceFirst.getPrice()){
                maxPriceFirst = t.get(i);
            }
        }
        int count = 0;
        for(int i=0 ; i<t.size(); i++){
            if(t.get(i).getPrice() == maxPriceFirst.getPrice()){
                count++;
            }
            if(count == 2){
                maxPriceSecond = t.get(i);
                break;
            }
        }
        if(maxPriceSecond != null){
            t.remove(maxPriceSecond);
        } 
    }*/
//===================================================================
//--------------------------6666666---------------------------------
    /*public int f1(List<Car1> t) {
        double sum = 0.0;
        for (Car1 car : t) {
            sum += car.getRate();
        }
        int wholePart = (int) Math.floor(sum / t.size());
        return wholePart;
    }*/
//==================================================
    
//--------------------------------77777---------------------------
    // hoán đổi vị trí của đối tượng có rate min và max đầu tiên cho nhau
   /* public void f2(List<Car1> t) {
        if (t == null || t.size() < 2) {
            return;
        }
        Car1 min = t.get(0);
        Car1 max = t.get(0);
        for (Car1 car : t) {
            if (car.getRate() > max.getRate()) {
                max = car;
            }
            if (car.getRate() < min.getRate()) {
                min = car;
            }
        }
        Collections.swap(t, t.indexOf(max), t.indexOf(min));
    }*/
//=================================================================    

//---------------------------88888-------------------------------------------
    /*public void f3(List<Car1> t) {
        if (t == null || t.size() < 2) {
            return;
        }
        Comparator<Car1> c = Comparator.comparing(Car1 :: getMaker).reversed().thenComparing(Car1 :: getRate).reversed();
        
        // so sánh kí tự thứ 2 của 
        Comparator<Car1> b = Comparator.comparing((Car1 a) -> a.getMaker().charAt(1)).reversed();
        Collections.sort(t, c);
    }*/
 //=====================================================   
   
//------------------------------9999-----------------------------------------
    
    
}
