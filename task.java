import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.LinkedList; 

public class task extends JPanel{
    private static final long serialVersionUID = 1L;

    private String task; 
    private int number; 

    JButton checkMark = new JButton();

    public task(String task, int number, LinkedList<task> tasks) {
        this.task = task;
        this.number = number;

        setLayout(new FlowLayout());

        JLabel label = new JLabel("Task " + number + ": " + task); 
        label.setFont(new Font("Serif",Font.BOLD, 24));
        ImageIcon icon = new ImageIcon("check.png");
        JButton button = new JButton(icon); 

        add(label); 
        add(button); 

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tasks.remove(number-1); 
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
