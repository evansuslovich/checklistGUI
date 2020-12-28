import javax.swing.*; 
import java.awt.*; 
import java.util.LinkedList;


public class MiddlePanel extends JPanel{
    private static final long serialVersionUID = 1L; 

    static LinkedList<task> tasks = new LinkedList<task>();

    public MiddlePanel(){
        setBackground(new Color(255,69,0)); 
        setLayout(new SpringLayout()); 

        
    }
}