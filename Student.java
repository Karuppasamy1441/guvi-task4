import java.util.*;
class AgeNotValid extends Exception{
    public AgeNotValid(String message){
        super(message);
    }
}
class NameNotValid extends Exception{
    public NameNotValid(String message){
        super(message);
    }
}
public class Student {
    String name;
    int age;
    public Student(String name,int age) throws AgeNotValid ,NameNotValid
    {
        if(age<15 || age>21){
            throw new AgeNotValid("Age must be  between 15-21");
        }
        if(!name.matches("[a-zA-Z\\s]")){
            throw new NameNotValid("Name cannot contain number and special character");
        }


        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){
        try{
            Student student=new Student("ram",15);}
        catch(AgeNotValid e){
            System.out.println(e.getMessage());
        }
        catch (NameNotValid e){
            System.out.println(e);
        }


    }
}

