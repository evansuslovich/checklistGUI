import javax.swing.*; 
import java.awt.*;
public class taskGUI{
    

    public taskGUI(){
        JFrame frame = new JFrame(); 
        Panel panel = new Panel(); 

        frame.setSize(600,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW)); 

        frame.add(panel); 

        frame.setVisible(true);
    }
    public static void main(String[] args){
        // GUI 
        new taskGUI(); 
    }
}




