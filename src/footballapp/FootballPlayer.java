/*
 * FootballPlayer Class
 * Creates a football player and returns request info about the player
 */
package footballapp;
import java.lang.Math;

/**
 *
 * @author Brian Kirby
 */
public class FootballPlayer{

    private String firstName, position;
    private int jerseyNumber;
    private int heightInches;
    private int weightLbs;
    private int rushingYards;
    private double r = Math.random();

FootballPlayer(){
    firstName = " ";
    jerseyNumber = 0;
    position = " ";
    heightInches = 0;
    weightLbs = 0;
}
FootballPlayer( String firstName, int jerseyNumber, String position, int heightInches, int weightLbs){
    this.firstName = firstName;
    this.jerseyNumber = jerseyNumber;
    this.position = position;
    this.heightInches = heightInches;
    this.weightLbs = weightLbs;
}
//showInfo() returns a string with formatted player names
    public String showInfo(){
        String playerInfo = "\nFirst name: " + getfirstName() +
                "\nJersey Number: "+ getjerseyNumber()+
                "\nPosition: " + getposition() + 
                "\nHeight (in inches): " + getheightInches()+
                "\nWeight (in punds): " + getweightLbs();
        return playerInfo;
    }

    /**
     * @return the firstName
     */
    public String getfirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the position
     */
    public String getposition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setposition(String position) {
        this.position = position;
    }

    /**
     * @return the jerseyNumber
     */
    public int getjerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setjerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the heightInches
     */
    public int getheightInches() {
        return heightInches;
    }

    /**
     * @param heightInches the heightInches to set
     */
    public void setheightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    /**
     * @return the weightLbs
     */
    public int getweightLbs() {
        return weightLbs;
    }

    /**
     * @param weightLbs the weightLbs to set
     */
    public void setweightLbs(int weightLbs) {
        this.weightLbs = weightLbs;
    }

    /**
     * @return the rushingYards
     */
    public int getRushingYards() {
        rushingYards = (int)(r*101);
        return rushingYards;
    }

    /**
     * @param rushingYards the rushingYards to set
     */
    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }
}

   