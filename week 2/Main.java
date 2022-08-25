import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("computer ");
        skills.add("Guiding ");
        skills.add("kingmaker");
        Staff rajesh = new Staff("rajesh", 20, 100, skills);
        rajesh.display();



        
    }
}
