
package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {  
        LocalDate date = LocalDate.of(1950, 6, 24);
        Person somebody = new Person("Blas", date);
        System.out.println(somebody.getName() + " tiene " + somebody.getAge() + 
                " años");
    }
    
}
