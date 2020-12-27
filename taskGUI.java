import javax.swing.*; 
import java.awt.*; 


public class taskGUI{
    static MiddlePanel middlePanel = new MiddlePanel();
    static TopPanel topPanel = new TopPanel(); 

    public taskGUI(){
        JFrame frame = new JFrame(); 
        frame.setSize(200,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); 
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.WHITE)); 

        

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
    public static void main(String[] args){
        // GUI 
        new taskGUI(); 
    }
}




