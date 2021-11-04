import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
    Make a GUI for your RPG Character builder you made in the last Unit. The user should enter primary stats in input box and the GUI
    should display the character's battle stats. The GUI should have at least 4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */
 public class RPGCharacterGUI {
        static JFrame window;
        static JPanel panel;
        static JButton calculation;
        static JTextField strength, dexterity, speed, defense;
        static JLabel strengthLabel, dexterityLabel, speedLabel, defenseLabel;
        static JLabel powerLabel, staminaLabel, magicResistLabel, physicalResistanceLabel, teleportationLabel;


        public RPGCharacterGUI(){

            window = new JFrame("Character Builder");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(600,300);
            window.setLocationRelativeTo(null);

            panel = new JPanel();

            strengthLabel = new JLabel("Your strength (1-10): ");
            dexterityLabel = new JLabel("Your dexterity (1-10): ");
            speedLabel = new JLabel("Your speed (1-10): ");
            defenseLabel = new JLabel("Your defense (1-10): ");

            powerLabel = new JLabel("Your Power: ");
            staminaLabel = new JLabel("Your Stamina: ");
            magicResistLabel = new JLabel("Your Magic Resist: ");
            physicalResistanceLabel = new JLabel("Your Physical Resistance: ");
            teleportationLabel = new JLabel("Your Teleportation: ");


            strength = new JTextField(10);
            dexterity = new JTextField(10);
            speed = new JTextField(10);
            defense = new JTextField(10);

            calculation = new JButton("Calculate Battle Stats");

            calculation.addActionListener(new calculationsListener());

            panel.add(strengthLabel);
            panel.add(dexterityLabel);
            panel.add(speedLabel);
            panel.add(defenseLabel);



            panel.add(strength);
            panel.add(dexterity);
            panel.add(speed);
            panel.add(defense);

            panel.add(calculation);

            panel.add(powerLabel);
            panel.add(staminaLabel);
            panel.add(magicResistLabel);
            panel.add(physicalResistanceLabel);
            panel.add(teleportationLabel);

            window.add(panel);

            window.setVisible(true);
    }


    private static class calculationsListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

            int power1 = Integer.parseInt(strength.getText());
            int power2 = Integer.parseInt(dexterity.getText());
            int power3 = Integer.parseInt(speed.getText());
            int power4 = Integer.parseInt(defense.getText());


            powerLabel.setText("Your Power Level is: " + ((power1 * power2 - power3) * power4));

            int stamina1 =  Integer.parseInt(strength.getText());
            int stamina2 = Integer.parseInt(dexterity.getText());
            int stamina3 =  Integer.parseInt(speed.getText());
            int stamina4 =  Integer.parseInt(defense.getText());



            staminaLabel.setText("Your Stamina Level is: " + (stamina1 * stamina4 + stamina3 * stamina2));

            int magicResist1 =  Integer.parseInt(defense.getText());
            int magicResist2 =  Integer.parseInt(dexterity.getText());
            int magicResist3 =  Integer.parseInt(speed.getText());
            int magicResist4 =  Integer.parseInt(defense.getText());

            magicResistLabel.setText("Your Magic Resistance is: " + (magicResist4 * magicResist2 + magicResist1 - magicResist3));

            int physicalResist1 =  Integer.parseInt(strength.getText());
            int physicalResist2 =  Integer.parseInt(dexterity.getText());
            int physicalResist3 =  Integer.parseInt(speed.getText());
            int physicalResist4 =  Integer.parseInt(defense.getText());

            physicalResistanceLabel.setText("Your Physical Resistance is: " + (physicalResist4 * physicalResist1 + physicalResist2 - physicalResist3));

            int teleportation1 =  Integer.parseInt(strength.getText());
            int teleportation2 = Integer.parseInt(dexterity.getText());
            int teleportation3 = Integer.parseInt(speed.getText());
            int teleportation4 =  Integer.parseInt(defense.getText());

            teleportationLabel.setText("Your Teleportation Level is: " + ((teleportation2 * teleportation3) - teleportation1 - teleportation4));






            }
    }



































}
