package com.aditya.cj.day17;

class TaskManager{
    private static TaskManager obj =null;
    private TaskManager(){ //when it is private you can't create object outside the class

    }

    public static TaskManager getInstance(){
        if(obj == null){
            obj = new TaskManager();
        }
        return obj;
    }
}


public class SingletonManager {
    public static void main(String[] args) {
        TaskManager obj1 = TaskManager.getInstance();
        TaskManager obj2 = TaskManager.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }

}
