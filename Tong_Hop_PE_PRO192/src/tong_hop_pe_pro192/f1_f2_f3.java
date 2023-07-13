//1.  đếm các cala có price chẵn
//2. xóa phần tử nhỏ nhất thứ 2
//3. sắp xếp theo owner
//4. đếm các đối tượng có kí tự thứ 2 là số
//5. xóa phần tử max price thứ 2
//6. f1: Return the whole part of average rate of all cars (e.g. the whole part of 3.7 is 3).
//7. hoán đổi vị trí của đối tượng có rate min và max đầu tiên cho nhau
//8. Sort the list by maker alphabetically, 
//in case makers are the same, sort them descendingly by rate.
//9. Stream lý thuyết cách dùng
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
    /*Collect method: Dùng để trả về kết quả của stream dưới dạng List hoặc Set.

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        List<String> filter = strings.stream().collect(Collectors.toList());
        System.out.println(filter);
    }*/
    
    /*forEach method: Dùng để duyệt qua mọi phần tử trong stream.

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        strings.stream().forEach(s -> System.out.println(s));
    }*/

    /*Reduce method: Reduce() method với 1 trong 2 tham số truyền vào là method reference, dùng dể kết hợp các phần tử thành một giá trị đơn cùng kiểu với dữ liệu ban đầu.

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        String result = strings.stream().reduce("-", String::concat);
        System.out.println(result);
    }*/
    
    /*Max, Min method: Trả về giá trị lớn nhất hoặc bé nhất trong các phần tử.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer maxx = list.stream().max(Integer::compare).get();
        Integer minn = list.stream().min(Integer::compare).get();
        System.out.println("Max: "+maxx+"\nMin: "+minn);
    }*/
    
    /*Distinct method: Được dùng để loại bỏ các phần tử trùng lặp.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
        list.stream().distinct().forEach(System.out::println);
    }*/
    
    /*Map method: Map method được sử dụng để trả về một stream mà ở đó các phần tử đã  được thay đổi theo cách người dùng tự định nghĩa.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
        list.stream().distinct().map(i -> i*i).forEach(System.out::println);
    }*/
    
    /*Filter method: Dùng để lọc và xóa bỏ các phần tử với điều kiện do người dùng định nghĩa.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
        list.stream().distinct().map(i->i*i).forEach(System.out::println);
    }*/
    
    /*Sorted method: Dùng cho việc sắp xếp các phần tử.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,2,1,0,3,4,5);
        list.stream().sorted().forEach(System.out::println);
    }*/
    
    /*Limit method: limit(n) với tham số đầu vào là số nguyên không âm n nó sẽ trả về một stream chứa n phần tử đầu tiên.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,2,1,0,3,4,5);
        list.stream().limit(3).forEach(System.out::println);
    }*/
    
    /*Skip method: skip(n) với tham số truyền vào là số nguyên không âm n nó sẽ trả về các phần tử còn lại đằng sau n phần tử đầu tiên.

        List<Integer> list = Arrays.asList(4,3,2,1,0,3,4,5);
        list.stream().skip(3).forEach(System.out::println);
  }*/
    
    /*ParallelStream là một sự thay thế của stream để phục vụ cho việc xử lý song song các phần tử. Kết quả của đoạn code sau thể hiện sự khác nhau giữa Stream và Parallel Stream.

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("code", "learn", "...");
        String streamString = strings.stream().reduce(" I'm-", String::concat);
        String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
        System.out.println("Stream: "+streamString +"\nParallelStream: "+parallelString);
    }*/
    
    //===================================================================   
}
