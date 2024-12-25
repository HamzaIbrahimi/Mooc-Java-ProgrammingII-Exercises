import flightControl.ui.TextUI;
import flightControl.logic.FlightControl;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI tui = new TextUI(flightControl, scanner);
        tui.start();
    }

}
