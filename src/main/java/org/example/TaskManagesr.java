package org.example;


import java.util.ArrayList;
import java.util.List;

public class TaskManagesr
{
  private List<Task> tasks;

  public TaskManagesr(){
      this.tasks=new ArrayList<>();
  }

  public void addTask(String description) {
      tasks.add(new Task(description));
      System.out.println("new Task added Successfully");
  }

  public void listTasks(){
      if(tasks.isEmpty()){
          System.out.println("No tasks available");
          return;
      }
      System.out.println("\nTO-Do List:");

      for(int i=0 ; i< tasks.size(); i++){
          System.out.println((i+1) +"."+ tasks.get(i));
      }
  }

  public void removeTask(int index){
      if (index >=1 && index<= tasks.size()){
          tasks.remove(index-1);
          System.out.println("Task removed Successfully");
      } else {
          System.out.println("Invalid Task to remove");
      }
  }

  public void markTaskCompleted(int index){
      if(index >=1 && index <= tasks.size()){
          tasks.get(index-1).markCompleted();
          System.out.println("Task mark as completed");
      }else {
          System.out.println("Invalid task number");
      }
  }
}
