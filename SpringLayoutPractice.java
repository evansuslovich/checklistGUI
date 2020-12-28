import javax.swing.*; 
import java.awt.*; 
import java.awt.font.FontRenderContext; 
import java.awt.geom.AffineTransform;



public class SpringLayoutPractice{
    static JLabel l1 = new JLabel("Hello World"); 
    static JLabel l2 = new JLabel("Hello World"); 
    static JLabel l3 = new JLabel("Hello World"); 
    static JLabel l4 = new JLabel("Hello World"); 
    static JLabel l5 = new JLabel("Hello World"); 

    public SpringLayoutPractice(){
        JFrame frame = new JFrame(); 
        frame.setSize(200,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(); 
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); 
        l1.setFont(new Font("Serif",Font.BOLD, 12));
        l2.setFont(new Font("Serif",Font.BOLD, 14));
        l3.setFont(new Font("Serif",Font.BOLD, 16));
        l4.setFont(new Font("Serif",Font.BOLD, 18));
        l5.setFont(new Font("Serif",Font.BOLD, 20));


        panel.add(l1); 
        panel.add(l2); 
        panel.add(l3); 
        panel.add(l4); 
        panel.add(l5); 

        
        frame.add(panel); 
    
        getPixels();
        frame.setVisible(true); 
    }
    public void getPixels(){
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, true);
        int w1 = (int)(l1.getFont().getStringBounds(l1.getText(), frc).getHeight());
        int w2 = (int)(l1.getFont().getStringBounds(l2.getText(), frc).getHeight());
        int w3 = (int)(l1.getFont().getStringBounds(l3.getText(), frc).getHeight());
        int w4 = (int)(l1.getFont().getStringBounds(l4.getText(), frc).getHeight());
        int w5 = (int)(l1.getFont().getStringBounds(l5.getText(), frc).getHeight());


        System.out.println(w1); 
        System.out.println(w2); 
        System.out.println(w3); 
        System.out.println(w4); 
        System.out.println(w5); 
        
    }

    public static void main(String[] args){
        new SpringLayoutPractice(); 
    }
}
