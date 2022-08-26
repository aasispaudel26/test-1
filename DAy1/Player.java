
import java.util.ArrayList;

public class Player {
    
    public String name;
    public int age;
    public double height;
    public ArrayList<String> skills;
    public double wages;


    public Player( String name, int age, double height, ArrayList<String> skills, double wages){
             this.name = name;
             this.age = age;
             this.height = height;
             this.skills = skills;
             this.wages = wages;



    }
        public void display() {
         System.out.println("The name of a player is "+ name);
         System.out.println("The age of the player is "+ age);
         System.out.println("The height of the player is "+ height);
         
        for(String skill : skills)  {
            System.out.println("the skills of the player is"+ skill );
         }
         System.out.println("The wages of the players is "+ wages);
        }

}
