package DesignPattern.MVCPattern;

import java.util.ArrayList;

public class Controller {
    EmployeeModel employeemodel;
    EmployeeView employeeview;



    public void createEmployee(int id, String name){
            var newEmpployee = new EmployeeModel(0, name);
            //?: vậy nhân viên mới sẽ được lưu ở đâu 
            Storage.employeeModels.add(newEmpployee);
    }
    public void display(){
        //TODO: Hiển thị danh sách nhân viên
        employeeview.printEmployeeInformation(Storage.employeeModels, Storage.employeeModels.size());
    }
}
