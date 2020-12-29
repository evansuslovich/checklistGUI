import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

import java.util.LinkedList;

public class task extends JPanel{
    private static final long serialVersionUID = 1L;

    private String task; 
    private int number; 


    JButton checkMark = new JButton();

    public task(String task, int number, LinkedList<task> tasks){
        this.task = task;
        this.number = number;

        setBackground(new Color(47, 41, 88)); 
        setLayout(new FlowLayout());
        
        

        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        setBorder(border);

        JLabel label = new JLabel("Task " + number + ": " + task); 
        label.setFont(new Font("Serif",Font.BOLD, 24));
        ImageIcon icon = new ImageIcon("check.png");
        JButton button = new JButton(icon); 

        add(label); 
        add(button); 

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                setVisible(false); 
                setVisible(false); 
                tasks.remove(number-1);
            }
        });
    }

    public String toString(){
        return "Task " + number + ": " + task; 
    }

   

   



    
}
