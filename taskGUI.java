import javax.swing.*; 
import java.awt.*; 


public class taskGUI{

    public taskGUI(){
        JFrame frame = new JFrame(); 
        frame.setSize(200,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); 
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.WHITE)); 


        JPanel middlePanel = new JPanel(); 
        middlePanel.setBackground(new Color(255,165,0)); 

        frame.add(middlePanel, BorderLayout.CENTER); 




        frame.setVisible(true);
    }
    public static void main(String[] args){
        // GUI 
        new taskGUI(); 
    }
}