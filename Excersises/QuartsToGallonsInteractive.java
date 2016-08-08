import javax.swing.*;

/**
 * Created by Adroso360 on 8/08/2016.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QGALLON = 4;
        int quarts = Integer.parseInt(JOptionPane.showInputDialog(null, " Quart Job Me"));

        int convert = quarts/QGALLON;
        int rem = quarts%QGALLON;
        System.out.println(quarts + "quart job needs " + convert +" Gallons " + rem + " quarts");
    }
}
