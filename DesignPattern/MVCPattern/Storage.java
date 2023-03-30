package DesignPattern.MVCPattern;

import java.util.ArrayList;

public class Storage {
    
    private ArrayList<EmployeeModel> employeeModels;   

    private Storage storageInstance;
    private Storage(){
        
    }
    public Storage getInstance(){
        if(storageInstance != null){
            return this.storageInstance;
        }
        return new Storage();
    }

    public void addEmployee(){
        
    }

    public void display(){

    }

}
