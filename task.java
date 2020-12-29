import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

import java.util.LinkedList;
import java.util.Random;

public class task extends JPanel{
    private static final long serialVersionUID = 1L;

    private String task; 
    private int number; 


    JButton checkMark = new JButton();

    public task(String task, int number, LinkedList<task> tasks){
        this.task = task;
        this.number = number;

        setBackground(new Color(255,69,0)); 
        setLayout(new FlowLayout());
        Random rand = new Random(); 
        
        int r1 = rand.nextInt(256);
        int r2 = rand.nextInt(256);
        int r3 = rand.nextInt(256);

        Border border = BorderFactory.createLineBorder(new Color(r1, r2, r3), 3);
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
