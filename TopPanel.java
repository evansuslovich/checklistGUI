import javax.swing.*;
//import javax.swing.text.FlowView;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class TopPanel extends JPanel{

    private static final long serialVersionUID = 1L; 
    private int counter = 0; 


    JTextField textField = new JTextField("Enter Task"); 
    JButton button = new JButton("Add Task"); 

    private LinkedList<task> tasks = new LinkedList<task>();

    //static MiddlePanel middlePanel = new MiddlePanel(); 
    public TopPanel(){
        this.setBackground(new Color(255,165,0)); 
        this.setLayout(new FlowLayout()); 

        this.add(textField); 
        this.add(button); 
       
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // When the button is clicked I want it to add to the main panel
                counter++; 
                //middlePanel.add(new task(textField.getText(), counter)); 
                
                //System.out.println(counter + " " + textField.getText());


                tasks.add(new task(textField.getText(),counter));
                //System.out.println(new task(textField.getText(),counter)); 
                printTasks(); 

            }
        });
    }

    public void printTasks()
    {
        System.out.println(); 
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i).toString());
        }
    }
    

    

}
