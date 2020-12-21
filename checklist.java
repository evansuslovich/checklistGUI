import java.util.LinkedList;
import java.util.Scanner; 

public class checklist{

    private LinkedList<task> tasks = new LinkedList<task>();
    private int counter = 0;
    
   public checklist(){
        makeNewTask(); 
        printTasks(); 
    }

    public void printTasks(){
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i));
        }
    }

    public void makeNewTask(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a task");
        String taskString = scan.nextLine();  
        counter++; 

        tasks.add(new task(taskString,counter));
        scan.close(); 
    }






    public static void main(String[] args){
        // I am going to make an arraylist called tasks 
        // The arraylist is going to hold a class called "task" 
        //"task" is going to have a paramter with the assignment in a string 
        new checklist(); 
        }





}


    
