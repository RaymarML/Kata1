
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {


    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person somebody = new Person("Blas", date);
        System.out.println(somebody.getName() + " tiene " + somebody.getAge() + 
                " años");
    }
    
}
