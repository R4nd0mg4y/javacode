// package Planet;

public class Planet {
    private String name;
    private double khoiluong;
    private double bankinh;
    private constant double G = 6.67300e-11;
    public Planet(String name, double khoiluong, double bankinh){
        this.name = name;
        this.khoiluong = khoiluong;
        this.bankinh = bankinh;
    }
    public String getName(){
        return name;
    }
    public double trongLucBeMat(){
        return khoiluong*G/(bankinh*bankinh);
    }
    // public double khoiLuongBeMat(double trongluong){
    //         trongluong = trongLucBeMat();
    //         return 
    // }
    
}
