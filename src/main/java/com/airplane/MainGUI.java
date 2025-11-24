package CSCC20Project;
//Miau
import javax.swing.*;

public class MainGUI extends JFrame {

    public MainGUI() {
        setTitle("M.A.M.A Airlines - Flight Booking System");
        setSize(500, 400);
        setLayout(null); // Your request: null layout
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Flight Booking System");
        title.setBounds(150, 20, 300, 30);
        add(title);

        JButton adminBtn = new JButton("Admin Login");
        adminBtn.setBounds(150, 100, 200, 40);
        add(adminBtn);

        JButton passengerBtn = new JButton("Passenger Login");
        passengerBtn.setBounds(150, 160, 200, 40);
        add(passengerBtn);
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); }
        catch (Exception e) { e.printStackTrace(); }
        //Para chuy tanawon ang buttons n shit
        new MainGUI().setVisible(true);
    }
}
