package HARRY_2021;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_java_time_package {
    public static void main(String[] args) {

        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t= LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
