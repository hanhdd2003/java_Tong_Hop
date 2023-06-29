//1. đếm và trả về số từ có chứa ít nhát 1 số chẵn
//2. thay từ đối xứng thứ nhất của 1 chuỗi bằng "YY"
//3. đếm số nguyên tố có trong 1 chuỗi
//4. đảo ngược thứ tự các từ của chuỗi
//5. đếm tất cả các chữ số lẻ trong chuỗi
//6. xóa từ đối xứng thứ nhất trong chuỗi
//7. 
package tong_hop_pe_pro192;

public class f1_f2 {

//-----------------------------------1111-----------------------------    
    /*public int f1(String str) {
       // tách tất cả word ra
       // kiểm tra 1 chuỗi có chứa ít nhất 1 even digit: (?=.*[02468].*).+
       // kiểm tra xem 1 chuỗi có chứa ít nhất 1 digit: (?=.*\d+.*).+
       // kiểm tra 1 chuỗi có chứa ít nhất 1 chữ cái: (?=.*[a-zA-Z]+.*).+
       
        // đếm và trả về số từ có chứa ít nhát 1 số chẵn
       String[] array = str.split("\\s+");
       int count = 0;
        for (String string : array) {
            if(string.matches("(?=.*[02468].*).+")){
                count++;
            }
        }
        return count;
    }*/
//================================================================
//-----------------------------------2222------------------------------------
/*    public String f2(String str) {
        String[] words = str.split(" ");
        String palidrome = null;
        for (int i = 0; i < words.length; i++) {
            if (checkPalidrome(words[i])) {
                palidrome = words[i];
                break;
            }
        }
        if (palidrome != null) {
            return str.replaceFirst(palidrome, "YY");
        } else {
            return str;
        }
    }

    public static boolean checkPalidrome(String str) {
        String sb = new StringBuilder(str).reverse().toString();
        return sb.equals(str);
    }*/
    //=================================================================
//---------------------------------3333---------------------------------------    
    /*   public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Kiểm tra số nguyên tố từ 2 đến căn bậc hai của số đó
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int f1(String str) {
        // tách chuỗi thành các mảng kí tự
        char[] c = str.toCharArray();
        int count = 0;
        for (char d : c) {
            if(Character.isDigit(d)){
                int num = Integer.parseInt(d+"");
                if(isPrime(num)){
                    count++;
                }
            }
        }
        return count;
    }*/
//====================================================    
//------------------------------4444----------------------------------    
/*       public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }*/
//===============================================================   

//----------------------------5555----------------------------------------   
// đếm tất cả các chữ số lẻ trong chuỗi
/*    public int f1(String str) {

        int count = 0;
        char[] c = str.toCharArray();
        for (char d : c) {
            if (Character.isDigit(d)) {
                int num = Integer.parseInt(d + "");
                if (num % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }*/
//==========================================================    

//----------------------------6666--------------------------------    
 /*   public static boolean checkPalidrom(String str){
        String st = new StringBuilder(str).reverse().toString();
        return st.equals(str);
    }

        public String f2(String str) {
        String[] words = str.split(" ");
// ------------------xóa từ đối xứng thứ 2 ---------------------
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for(int i=0 ; i<words.length; i++){
//            if(checkPalidrom(words[i])){
//                count++;
//                if(count==2){
//                    sb.append("XX");
//                    sb.append(" ");
//                    continue;
//                }
//            }
//            sb.append(words[i]);
//            if(i < words.length -1){
//                sb.append(" ");
//            }
//        } 
//        return sb.toString();
// ---------------------xóa từ đối xứng đầu tiên--------------------
        String palidromFirst = null;
        for(int i=0 ; i<words.length ; i++){
            if(checkPalidrom(words[i])){
                palidromFirst = words[i];
                break;
            }
        }
        return str.replaceFirst(palidromFirst, "XX"); 
    }*/
//===========================================================        
        
        
        
        
        
        
        
        
        
        
        
}
