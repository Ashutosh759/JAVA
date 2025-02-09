//Types of variables in java 

// Local Variable 

/*
public class VariableTypes{
    public void localvariable(){
        String name = "Ashutosh";
        int age =19;
        System.out.println("My Name is "+name+" and My age is "+age);
    }
    public static void main(String []args){
        VariableTypes v = new VariableTypes();
        v.localvariable();
    }
} 
*/

// Instance Variable 

/*
public class VariableTypes{
    String name = "Ashutosh";
    int age =19;
    public void localvariable(){
        System.out.println("My Name is "+name+" and My age is "+age);
    }
    public static void main(String []args){
        VariableTypes v = new VariableTypes();
        v.localvariable();
    }
} 
*/

// Class or Static Variable

public class VariableTypes{
    public static String name;
    public static int age;

    public static void main(String[]args){
        name = "Ashutosh";
        age = 19;
        System.out.println("My Name is "+name+" and My age is "+age);
    }
}