import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int seconds = 520000;


         int numHours = seconds/3600;
         seconds = seconds % 3600;
         int numMinutes = seconds/60;
         seconds = seconds % 60;
         int numSeconds = seconds;

        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " + numMinutes);
        System.out.println("Seconds " + numSeconds);

    }
}
