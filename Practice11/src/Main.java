import practice11.Developer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date recievedDate = new Date(2025 - 1900, Calendar.OCTOBER, 15, 10, 30);
        Developer dev = new Developer("Jacobs", recievedDate);
        System.out.println(dev);
    }
}

