package tong_hop_pe_pro192;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanh
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color) {
        this.color = color;
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
       // return ""+super.toString()+" # "+this.getColor();
       return String.format("%s # %d", super.toString(), this.getColor());
    }
    
    public void setData(){
        String a = super.getOwner();
        if(a==null || a.isEmpty()){
            return;
        }
        String[] subString = a.split(" ");
        for(String word : subString){
            if(!word.isEmpty()){
                String firstLetter = word.substring(0, 1).toUpperCase(); 
                String restLetter = word.substring(1).toLowerCase(); 
                System.out.print(firstLetter+restLetter+" ");
            }
        }
    }
    public int getValue(){
        if(this.color%2==0){
            return super.getPrice()+1;
        }else{
            return super.getPrice()*2;
        }
    }
    
    
    
}
