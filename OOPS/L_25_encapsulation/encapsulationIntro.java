package OOPS.L_25_encapsulation;

public class encapsulationIntro {
    public static void main(String[] args) {

        Student obj=new Student();
        //obj.name="Tom";
        //obj.age=54;

        obj.setAge(45);
        System.out.println(obj.getAge());
        obj.setAge(12);
        System.out.println(obj.getAge());
    }
}
