/*
* This program is designed to do the following things:
* + Creates 11 players using the FootballPlayer Class
* + Creates a football team using the FootballTeam Class
* + Uses methods from the football team to to display information about the 
*   team and its players.
* 
* Written by: Brian Kirby
* 
 */
package footballapp;
import java.util.Scanner;

public class FootballApp {

    
    public static void main(String[] args) {
        FootballTeam BaltimoreRavens;
        FootballPlayer team[] = new FootballPlayer [11]; //A team has 11 fotball playsers
        //Create new playsers and add the playsers to the team
        team[0] = new FootballPlayer("Joe", 5, "QB", 78, 245);
        team[1] = new FootballPlayer("Javorius", 37, "RB", 72, 220);
        team[2] = new FootballPlayer("Crockett", 80, "TE", 78, 270);
        team[3] = new FootballPlayer("Steve", 89, "WR", 69, 195);
        team[4] = new FootballPlayer("Breshad", 18, "WR", 74, 218);
        team[5] = new FootballPlayer("Kyle", 44, "FB", 73, 248);
        team[6] = new FootballPlayer("John", 64, "G", 75, 305);
        team[7] = new FootballPlayer("Jeremy", 53, "C", 76, 300);
        team[8] = new FootballPlayer("Marshal", 73, "G", 75, 305);
        team[9] = new FootballPlayer("Rick", 71, "T", 78, 310);
        team[10] = new FootballPlayer("James", 74, "T", 77, 312);
        
        BaltimoreRavens = new FootballTeam("Ravens", "Raven", "Baltimore", team); //creates a new football team
        
        BaltimoreRavens.showTeamInfo(); //Displays the team info and all of the players
        
        System.out.println("\nThe team has " + BaltimoreRavens.teamRushingTotal() + " total rushing yards."); //Shows total number of rushing yards
        
        //Begin procedure to prompt user if they want to search for a player by their jersey number
        Scanner in = new Scanner (System.in);
        System.out.println("Would you like to search for a plyer by their jersy number? (Y/N) ");
        System.out.flush(); //added line to ensure stream buffer was clear before taking input
        String searchQuestion = in.nextLine();
        if (searchQuestion.contains("Y")) { 
            System.out.println("What is the jersey number you wish to search for? ");
            int searchTerm = in.nextInt();
            if (BaltimoreRavens.checkPlayerJerseyNumber(searchTerm)) {//Checks to see if the number is found on the team
                System.out.println(BaltimoreRavens.findPlayerJerseyNumber(searchTerm).showInfo());//Displays the info for the player who is returned by the team
            }
            else{//Display a message if the number is not found
                System.out.println("No player with that number was found. Please try again later. ");
            }
        }
        System.out.println("\nThanks for using my Football App");
    }
}

    
