import javax.swing.*; 
import java.awt.*; 


public class task extends JPanel{
    private static final long serialVersionUID = 1L; 

    private String task;
    private int number; 
    JButton checkMark = new JButton(); 
    
    public task(String task, int number){
        this.task = task; 
        this.number = number;
        setLayout(new FlowLayout());


        JLabel label = new JLabel("Task " + number + ": " + task); 
        label.setFont(new Font("Serif",Font.BOLD, 12));

    }

    public void setTask(String task){
        this.task = task;
    }
    public String getTask(){
        return task; 
    }
    public int getNumber(){
        return number; 
    }



    
}
