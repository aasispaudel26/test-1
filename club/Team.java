package club;

import java.util.ArrayList;

public class Team {
    public String name;
    public String Establisheddate;
    public ArrayList<String> players;


    public Team(String name, String Establisheddate, ArrayList<String> players ){
    this.name = name;
    this.Establisheddate = Establisheddate;
    this.players = players; 
    }
    public void display(){
        System.out.println("the name of the club is " +name);
        System.out.println("the established date of the club is " + Establisheddate);
        for (String player : players){
            System.out.println("the players of the team are" + players);
        }
    }


}
