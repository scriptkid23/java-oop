package DesignPattern.MVCPattern;

public class EmployeeModel {
    private int id;
    private String name;
    EmployeeModel(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getID()
    {
        return this.id;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public String getname()
    {
        return this.name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
}
