package tempConversion;

import org.springframework.stereotype.Component;
/**
 * Created by vanchondo on 2/28/17.
 */
@Component
public class TempConversion {

    public void receiveMessage(String message) {
        Double celsius = new Double(message);
        Double fahrenheit = (celsius * 9/5) + 32;
        Double kelvin = celsius + 273.15;
        System.out.println("Received: " + celsius + " celsius");
        System.out.println(fahrenheit + " Fahrenheit");
        System.out.println(kelvin + " Kelvin");
    }
}
