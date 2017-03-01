package lengthConversion;

import org.springframework.stereotype.Component;

/**
 * Created by vanchondo on 2/28/17.
 */
@Component
public class LengthConversion {

    public void receiveMessage(String message) {
        Double km = new Double(message);
        Double miles = km * 1.609344;
        System.out.println("Received " + km + " km");
        System.out.println(miles + " miles");

    }
}
