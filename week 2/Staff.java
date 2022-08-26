import java.util.ArrayList;



public class Staff {

    public String name;
    public double age;
    public double Salaray;
    public ArrayList<String> skills;

    public Staff( String name, double age, double Salaray, ArrayList<String> skills  ){
        this.name = name;
        this.age = age;
        this.Salaray = Salaray;
        this.skills = skills;


    }
    public void display(){
        System.out.println("the name of the staff is" + name);
        System.out.println("the age of the staff is" + age);
        System.out.println("the Salaray of the staff is" + Salaray);
        for (String skill : skills){
            System.out.println("the skill of the staff is" + skill);
        }


        }

    }


