import java.util.*;

public class StudentGrades {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        HashMap<String,Integer> StudentRecord=new HashMap<>();
    boolean istrue=true;
        while(istrue){
            System.out.println("Choose option : ");
            System.out.println("1 ADD STUDENT ");
            System.out.println("2 REMOVE SUDENT");
            System.out.println("3 DISPLAY ");
            System.out.println("4 EXIT ");

            int n=in.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter NAME :");
                    String name=in.nextLine();
                    in.nextLine();
                    System.out.println("Enter GRAGES :");
                    int grade=in.nextInt();
                    StudentRecord.put(name,grade);
                    System.out.println("ADDED successfully.....");
                    break;
                case 2:
                    System.out.println("ENTER NAME TO REMONE :");
                    in.nextLine();
                    String remove=in.nextLine();
                    StudentRecord.remove(remove);
                    System.out.println(remove+" Removed Successfilly....");
                    break;
                case 3:
                    System.out.println("ENTER NAME ");
                    in.nextLine();
                    String view=in.nextLine();
                    //System.out.println(StudentRecord.containsKey(view));
                    if(StudentRecord.containsKey(view)){
                        System.out.println(view+" -> "+StudentRecord.get(view));
                    }else{
                        System.out.println(view+" NOT FOUND....");
                    }
                    break;
                case 4:
                    istrue=false;
                   break;
                default:
                    System.out.println("INVALID OPTION ");
            }
        }
    }
}
