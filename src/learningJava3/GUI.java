package learningJava3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GUI implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel usernameLabel;
    private static JLabel passwordLabel;
    private static JButton loginButton;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JLabel successLabel;
    private static JButton resetButton;
    private static JLabel failedLabel;

    public static void main (String[] args) {

        frame = new JFrame();
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        panel = new JPanel();
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        successLabel = new JLabel();
        failedLabel = new JLabel();

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login window");
        frame.setVisible(true);
        frame.setSize(400,250);

        loginButton.addActionListener(new GUI());
        resetButton.addActionListener(new GUI());
        loginButton.setFocusable(false);
        resetButton.setFocusable(false);

        //SETTING BOUNDS
        usernameLabel.setBounds(10, 20, 80, 25);
        passwordLabel.setBounds(10, 50, 80, 25);
        usernameField.setBounds(100, 20, 165, 25);
        passwordField.setBounds(100, 50, 165, 25);
        loginButton.setBounds(10, 80, 80, 25);
        resetButton.setBounds(90, 80, 80, 25);
        successLabel.setBounds(10, 110, 300, 25);
        successLabel.setForeground(Color.green);
        failedLabel.setBounds(10,110,300,25);
        failedLabel.setForeground(Color.red);

        //ADD PANELS
        panel.setLayout(null);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(resetButton);
        panel.add(successLabel);
        panel.add(failedLabel);

        int[] d = {1, 2, 3, 5};

        System.out.println(Arrays.stream(d).min());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        long start = System.currentTimeMillis();
        String user = usernameField.getText();
        String password = passwordField.getText();

        if(user.equals("hassan") && password.equals("2511118")) {
            successLabel.setText("Welcome!");


            frame.dispose();
            Welcome welcomeFrame = new Welcome();
        }
        else failedLabel.setText("Wrong password or username");
        if(e.getSource()==resetButton) {
            passwordField.setText("");
            usernameField.setText("");
        }
    }
}
