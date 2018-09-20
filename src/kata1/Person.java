package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (365.25*24*60*60*1000 );
    
    public Person(String name, Calendar birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public String getName(){
        return name;
    }
    
    public Calendar getBirthDate(){
        return birthDate;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)(milliSecondsToYear(today.getTimeInMillis() - birthDate.getTimeInMillis()));
    }
    
    public long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
    
}