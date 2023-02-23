package day04.Lab;

public class student {
    public String name;
    public int age;
    public float height;

    public void setName(String name){
        this.name = name;
    }

    private String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;

    } 

    protected int getAge(){
        return age;
    }

    public void setHeight(float height){
        this.height = height; 
         
    }

    public float getHeight(){
        return height;
    }

    public student(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
