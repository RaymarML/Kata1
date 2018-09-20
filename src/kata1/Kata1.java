
package kata1;

import java.util.Date;


public class Kata1 {


    public static void main(String[] args) {
        Person somebody = new Person("Albert", new Date(9, 06, 1));
        System.out.println(somebody.getName() + " tiene " + somebody.getAge());
    }
    
}
