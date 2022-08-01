package input;

import javax.swing.*;

public class InputData {
    public static void main(String[] args) {

//        String input = JOptionPane.showInputDialog("Enter your name:");
//        JOptionPane.showMessageDialog(
//                null,
//                "Welcome Back: " + input,
//                "Hi, " + input,
//                1);

        String nama = JOptionPane.showInputDialog("Input nama:");
        String institusi = JOptionPane.showInputDialog("Input institusi:");
        String[] dataAngkatan = {"2017", "2018", "2019", "2020"};
        String angkatan = (String) JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                dataAngkatan,
                dataAngkatan[0]);
        int ubahAngkatan = Integer.parseInt(angkatan);

        JOptionPane.showMessageDialog(null, "si "+ nama + " berasal dari " + institusi + " angkatan " + ubahAngkatan);

    }
}
