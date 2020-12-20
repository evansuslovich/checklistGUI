import java.util.LinkedList;
import java.util.Scanner; 

public class checklist{

    private int counter = 0;
    private LinkedList<task> tasks; 
    

    public checklist(){
        //makeNewTask(); 
    }

    public void makeNewTask(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a task");
        String taskString = scan.nextLine();  
        
        counter++;
        task t1 = new task(taskString, counter);
        addTask(t1); 
    }
    public void addTask(task t){
        tasks.add(t); 
    }





    
    public static void main(String[] args){
        // I am going to make an arraylist called tasks 
        // The arraylist is going to hold a class called "task" 
        //"task" is going to have a paramter with the assignment in a string 
        new checklist(); 
    }


    
}