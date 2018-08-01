/*
 * FootballTeam class
 * Creates a Football and returns requested info about the team and the players on the team
 */
package footballapp;

/**
 *
 * @author brian.kirby
 */
public class FootballTeam {

    private String Name;
    private String Mascot;
    private String Location;
    private FootballPlayer[] Players;

    //Default Constructor
    public FootballTeam() {
    Name = " ";
    Mascot = " ";
    Location = " ";
    }
    
    FootballTeam(String Name, String Mascot, String Location, FootballPlayer[] Players){
        this.Name = Name; 
        this.Mascot = Mascot;
        this.Location = Location;
        this.Players = Players;
    }

    //Displays the team info and displays each player's information using the FootballPlayers class
    public void showTeamInfo(){
        System.out.println("Team Name: "+Name);
        System.out.println("Team Mascot: "+Mascot);
        System.out.println("Location: "+Location);
        System.out.println("Players: \n");     
        for (int i = 0; i < Players.length; i++){
            System.out.println(Players[i].showInfo()); 
        }
    }
    
    //Adds each player's rushing yards to the team's total rushing yards
    public int teamRushingTotal(){
        int totalRushingYards = 0;
        for (int i = 0; i < Players.length; i++){
             totalRushingYards += Players[i].getRushingYards();
         } 
        return totalRushingYards;
    }
    
    /* 
     * Receives an integer and searches the player jersey numbers for the integer.
     * If there is a match then it returns True
     */
    public boolean checkPlayerJerseyNumber(int searchTerm) { //Searches players and prints the players who match
        /*
        Get the search term
        Look at each player on the team for a matching string
        If there is a match then print the player's info
        Search until we run out of players
        */
        int pos1 = 0; //Set first counter to 0
        boolean found = false; //Default is that string has not been found
        while (pos1 < Players.length){ //Loop until we've searched all or found is true
            if (Players[pos1].getjerseyNumber() == searchTerm) {
                return true;
            }
            pos1++;
        }
        return false;
    }
    
    
    /*
     * Takes an integer and returns the player object from the array when the 
     * integer matches the jersey number.
     */
    public FootballPlayer findPlayerJerseyNumber(int searchTerm) {
        int i = 0;
        boolean found = false;
        while (i < Players.length && !found){ //Loop while there has not been a match
            if (Players[i].getjerseyNumber() == searchTerm) {
                found = true;
            }
            else{
            i++;
            }
        }
        return Players[i];
    }
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @return the Mascot
     */
    public String getMascot() {
        return Mascot;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @return the Players
     */
    public FootballPlayer[] getPlayers() {
        return Players;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @param Mascot the Mascot to set
     */
    public void setMascot(String Mascot) {
        this.Mascot = Mascot;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @param Players the Players to set
     */
    public void setPlayers(FootballPlayer[] Players) {
        this.Players = Players;
    }
}
