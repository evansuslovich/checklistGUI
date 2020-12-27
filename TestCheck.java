import javax.swing.*; 

public class TestCheck {

    public TestCheck(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        ImageIcon icon = new ImageIcon("check.png");
        JButton button = new JButton(icon); 

        frame.add(button); 
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new TestCheck(); 

    }
    
}
