package club;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> players = new ArrayList<String>();
      players.add("lewy");
      players.add("pedri");
      players.add("dembele");
      Team barcaTeam = new barcaTeam("barca","1990", players);
      barcaTeam.display();
      
        
      }

      

    }

