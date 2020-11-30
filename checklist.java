import java.util.ArrayList; // arraylist library
import java.util.Scanner; 

public class checklist{

    private int counter = 0;
    private ArrayList<task> tasks; 
    public static void main(String[] args){
        // I am going to make an arraylist called tasks 
        // The arraylist is going to hold a class called "task" 
        //"task" is going to have a paramter with the assignment in a string 
        new checklist(); 
    }

    public checklist(){
        makeNewTask(); 
        printCheckList();
    }

    public void makeNewTask(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a task");
        String taskString = scan.nextLine();  
        
        counter++;
        task t1 = new task(taskString, counter);
        tasks.add(t1);
    }

    
    public void printCheckList(){
        System.out.println("CHECKLIST:");
        System.out.println("Number of assingments: " + counter);

        for(int i = 0; i < tasks.size(); i++){
            System.out.println("Assingment number: " + tasks.get(i).getNumber()); 
            System.out.println("Assingment task: " + tasks.get(i).getTask()); 

            System.out.println(); 
        }
    }
    
}