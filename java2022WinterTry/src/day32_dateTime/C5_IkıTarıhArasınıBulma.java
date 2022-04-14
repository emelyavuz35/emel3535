package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C5_IkıTarıhArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1982,06,17);
        System.out.println(Period.between(dogumGunu,bugun));//P39Y9M14D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//39

    }
}
