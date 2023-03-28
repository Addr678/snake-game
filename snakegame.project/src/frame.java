import javax.swing.*;
public class frame extends JFrame {
        frame(){
            //adding the panel to the frme
            this.add(new Panel());
            //naming the frame window
            this.setTitle("Snake Game");
            //to make sure uniform game window size
            this.setResizable(false);
            this.setVisible(true);
            this.pack();
        }

    }


