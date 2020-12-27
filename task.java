import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class task extends JPanel{
    private static final long serialVersionUID = 1L; 
    private String task; 
    private int number; 

   
    JButton checkMark = new JButton(); 
    
    public task(String task, int number){
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Task " + number + ": " + task); 
        label.setFont(new Font("Serif",Font.BOLD, 12));
        
        ImageIcon icon = new ImageIcon("check.png");
        JButton button = new JButton(icon); 

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });

    }

    public int getLength(){
        String len =  "Task " + number + ": " + task;
        return len.length(); 
    }

   



    
}
