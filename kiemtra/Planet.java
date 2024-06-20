import java.util.*;
class Planet {
    private double khoiluong;
    private double bankinh;
    static final double G = 6.67300e-11;
    public Planet(double khoiluong, double bankinh){
        this.khoiluong = khoiluong;
        this.bankinh = bankinh;
    }
    public double trongLucBeMat(){
        return (G * khoiluong) / (bankinh * bankinh);
    }
   
}