import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TopPanel extends JPanel{

    private static final long serialVersionUID = 1L; 
    private int counter = 0; 

    JTextField textField = new JTextField("Enter Task"); 
    JButton button = new JButton("Add Task"); 

   
    public TopPanel(){
        this.setBackground(new Color(255,165,0)); 
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // When the button is clicked I want it to add to the main panel
                counter++; 
                middlePanel.add(new task(textField.getText(), counter)); 
                
            }
        });
    }

    

}
