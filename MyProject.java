package Project;

import javax.swing.*;

/**
 * Created by ASUS on 31.10.2016.
 */
public class MyProject extends JFrame {
    public MyProject() {
        super("Coffee Machine by Mark Parfeniuk");

        setBounds(400, 400, 600, 600);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame app = new MyProject();
        app.setVisible(true);
    }
}

