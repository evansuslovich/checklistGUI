public class task{
    
    private String task;
    private int number; 
    
    public task(String task, int number){
        this.task = task; 
        this.number = number;
    }

    public void setTask(String task){
        this.task = task;
    }
    public String getTask(){
        return task; 
    }
    public int getNumber(){
        return number; 
    }

    public String toString(){
        return "Task " + getNumber() + ": " + getTask(); 
    }

    



}
