import javax.swing.*; 
import java.awt.*; 
import java.util.LinkedList; 

public class MiddlePanel extends JPanel{
    private static final long serialVersionUID = 1L; 
    
    private LinkedList <task> tasks; 

    public MiddlePanel(LinkedList<task> tasks){
        setBackground(new Color(255,69,0)); 
        setLayout(new SpringLayout()); 
        
        for(int i = 0; i < tasks.size(); i++){
            add(tasks.get(i));
        }

        
        
    }

	public MiddlePanel(){
        setBackground(new Color(255,69,0)); 
        setLayout(new SpringLayout());

        for(int i = 0; i < tasks.size(); i++){
            add(tasks.get(i));
        }
	}
}