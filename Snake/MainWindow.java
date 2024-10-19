package Snake;

import javax.swing.*;

public class MainWindow {
    private JFrame window;
    public MainWindow(){
        window=new JFrame();
        window.setTitle("Snake Game");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(900,600);
        window.setLocationRelativeTo(null);

    }
    public void show(){
        window.setVisible(true);

    }
}
