import java.util.*;
class InvalidAge extends Exception{
    public InvalidAge(String message){
        super(message);
    }
}
public class Voter {
    String name;
    int age;
    public Voter(String name,int age) throws InvalidAge
    {
        if(age<18){
            throw new InvalidAge("invalid age for voter");
        }

        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){
      try{
        Voter voter=new Voter("ram",15);}
      catch(InvalidAge e){
          System.out.println(e.getMessage());
      }


    }
}
