package OOPS.L_32_Abstraction;

public class WagonR extends Car{

    @Override
    public void accelerate(){
        System.out.println("WagonR is accelerating");
    }
    @Override
    public void breaking(){
        System.out.println("WagonR is braking");
    }
}
