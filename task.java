import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class task{
    //private static final long serialVersionUID = 1L; 

    private String task; 
    private int number; 

    JButton checkMark = new JButton(); 

    JPanel panel = new JPanel(); 

    public task(String task, int number){
        this.task = task; 
        this.number = number; 
        
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Task " + number + ": " + task); 
        label.setFont(new Font("Serif",Font.BOLD, 12));
        ImageIcon icon = new ImageIcon("check.png");
        JButton button = new JButton(icon); 

        panel.add(label); 
        panel.add(button); 

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }

    public String toString(){
        return "Task " + number + ": " + task; 
    }

    public int getLength(){
        String len =  "Task " + number + ": " + task;
        return len.length(); 
    }

   



    
}
