import javax.swing.*; 
import java.util.LinkedList; 

public class TaskMainPractice{
    private LinkedList<task> tasks = new LinkedList<task>();
    public TaskMainPractice(){
        JFrame frame = new JFrame();
        frame.setSize(200,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        tasks.add(new task("Run", 1, tasks));  
        tasks.add(new task("Cook", 2, tasks)); 
        tasks.add(new task("Eat", 3, tasks)); 

        frame.add(tasks.get(0)); 
        frame.add(tasks.get(1)); 
        frame.add(tasks.get(2)); 

        
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new TaskMainPractice();
    }
}