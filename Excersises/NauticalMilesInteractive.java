import javax.swing.*;

/**
 * Created by Adroso360 on 8/08/2016.
 */
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double KILOMETERS = 1.852;
        final double MILES = 1.150779;

        double nauticalMiles = Double.parseDouble(JOptionPane.showInputDialog(null, " Enter NM:"));
        double convetKilo = nauticalMiles * KILOMETERS;
        double convetMiles = nauticalMiles * MILES;



        System.out.println("In Kilometers " + convetKilo + "  IN Miles" + convetMiles);

    }
}
