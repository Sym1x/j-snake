package Snake;

import javax.swing.*;

public class ProSna {
    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main=new MainWindow();
                main.show();
            }
        });

}


}