package learningJava3;

import javax.swing.*;
import java.awt.*;

public class Welcome {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    JPanel panel = new JPanel();

    Welcome() {

        welcomeLabel.setBounds(160,160,200,35);
        welcomeLabel.setFont(new Font(null,Font.ITALIC,30));
        welcomeLabel.setForeground(Color.green);

        frame.setForeground(Color.BLUE);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
