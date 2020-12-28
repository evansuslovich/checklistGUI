import javax.swing.*; 
import java.awt.*; 


public class SpringLayoutPractice{
    static JLabel label = new JLabel("Hello World"); 

    public SpringLayoutPractice(){
        JFrame frame = new JFrame(); 
        frame.setSize(200,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(); 
        label.setFont(new Font("Serif",Font.BOLD, 12));

        panel.add(label); 
        frame.add(panel); 


    
        frame.setVisible(true); 
    }
    public int getPixels(Graphics g){
        int width = g.getFontMetrics().stringWidth(label.getText());
        return width; 
    }

    public static void main(String[] args){
        new SpringLayoutPractice(); 
    }
}
