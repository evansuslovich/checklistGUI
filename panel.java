import javax.swing.*;
//import javax.swing.text.FlowView;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class Panel extends JPanel{
    private static final long serialVersionUID = 1L;

        // TopPanel 
    JPanel topPanel = new JPanel(); 
    JTextField textField = new JTextField("Enter Task"); 
    JButton button = new JButton("Add Task"); 
    private int counter = 0; 


        //MiddlePanel
    JPanel middlePanel = new JPanel(); 

 
    static LinkedList<task> tasks = new LinkedList<task>();

    public Panel(){
        setLayout(new BorderLayout()); 
        
        ////////////////////// Top Panel 
        topPanel.setBackground(new Color(255,165,0)); 
        topPanel.setLayout(new FlowLayout());
        topPanel.add(textField); 
        topPanel.add(button); 

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // When the button is clicked I want it to add to the main panel
                counter++; 
                tasks.add(new task(textField.getText(),counter,tasks));
                addNewTask((counter - 1)); 

                //printTasks(); 
            }
        });
        ////////////////////// Top Panel 

        ////////////////////// Middle Panel 

        middlePanel.setBackground(new Color(255,69,0)); 
        //middlePanel.setLayout(new SpringLayout()); 
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.LINE_AXIS));
        for(int i = 0; i < tasks.size(); i++){
            add(tasks.get(i));
        }

        ////////////////////// Middle Panel 



        // this 
        add(topPanel, BorderLayout.NORTH); 
        add(middlePanel, BorderLayout.CENTER); 
    }

    public void printTasks()
    {
        System.out.println(); 
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i).toString());
        }
    }

    // middlePanel add new task 
    public void addNewTask(int taskNumber){
        for(int i = 0; i < tasks.size(); i++){
            middlePanel.add(tasks.get(i)); 
        }
        //middlePanel.add(tasks.get(taskNumber)); 
        //System.out.println(tasks.get(tasks.size()-1).toString());

    }
}