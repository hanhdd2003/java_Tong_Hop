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
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price,int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+", "+type;
    }
    public void setData(){
       this.setMaker("XZ"+this.getMaker());
       this.setPrice(this.getPrice()+20);
    }
    public int getValue(){
        int inc = 0;
        if(this.type<7){
            inc = 10;
        }else{
            inc = 15;
        }
        return this.getPrice()+inc;
    }
    
    
}
