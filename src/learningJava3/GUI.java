package learningJava3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI /*implements ActionListener*/ {

    JPanel panel;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JButton button;
    JFrame frame;
    JTextField textField;
    JPasswordField passwordField;
    JLabel successLabel;

    int count = 0;

    public GUI() {
        frame = new JFrame();
        button = new JButton("Log in");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        panel = new JPanel();
        textField = new JTextField(20);
        passwordField = new JPasswordField(20);
        successLabel = new JLabel("");

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Window");
        frame.setVisible(true);
        frame.setSize(400,250);

        //button.addActionListener(new GUI());

        //ADD PANELS
        panel.setLayout(null);
        panel.add(usernameLabel);
        panel.add(textField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(button);
        panel.add(successLabel);

        //SETTING BOUNDS
        usernameLabel.setBounds(10, 20, 80, 25);
        passwordLabel.setBounds(10, 50, 80, 25);
        textField.setBounds(100, 20, 165, 25);
        passwordField.setBounds(100, 50, 165, 25);
        button.setBounds(10, 80, 80, 25);
        successLabel.setBounds(10,110,300, 25);



    }

    public static void main (String[] args) {
    new GUI();
    }



    //public void actionPerformed(ActionEvent actionEvent) {}

}
