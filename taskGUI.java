import javax.swing.*; 
public class taskGUI{
    
    static Panel panel = new Panel(); 

    public taskGUI(){
        JFrame frame = new JFrame(); 
        frame.setSize(200,600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.WHITE)); 

        frame.add(panel); 
        frame.setVisible(true);
    }
    public static void main(String[] args){
        // GUI 
        new taskGUI(); 
    }
}




