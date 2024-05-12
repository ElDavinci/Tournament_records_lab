import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class App {
    
    static Scanner sc = new Scanner(System.in);
    static File outputFile = new File("output.txt");
    static PrintWriter pw;
    public static void main(String[] args) throws Exception {
        try {
            pw =  new PrintWriter(outputFile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Tournament> tournaments = new ArrayList<>();
        while (true) {
            System.out.println("do you want to add a tournament (y,n): ");
            char tournamentAnswer = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            if(tournamentAnswer =='y'){
                System.out.println("What is the tournament's name: ");
                String tournamentName = sc.nextLine();
                Tournament tournament = new Tournament(tournamentName);
                tournaments.add(tournament);
                ArrayList<PlayerRecord> playerRecords = new ArrayList<>();
                while (true) {
                    

                    System.out.println("do you want to add players (y,n): ");
                    char playersAnswer = sc.next().toLowerCase().charAt(0);
                    sc.nextLine();
                    if(playersAnswer == 'y'){
                        try{
                            
                        
                        System.out.println("(name),(age),(games_played),(total_man_of_the_match)");
                        String[] list = cleanArray(sc.nextLine().split(","));
                        String name = list[0];
                        int age = Integer.parseInt(list[1]);
                        int games_played = Integer.parseInt(list[2]);
                        int total_man_of_the_match = Integer.parseInt(list[3]);
                        PlayerRecord playerRecord = new PlayerRecord(games_played, total_man_of_the_match, name, age);
                        playerRecords.add(playerRecord);
                        }
                        catch (Exception e) {
                            System.out.println("Wrong input try again");
                            continue;
                        }
                    }
                    else{
                        tournament.setPlayers(playerRecords);
                        break;
                    }
                }
            }
            else{
                break;
            }
            


        }
        for (int index = 0; index < tournaments.size(); index++) {
            Tournament tournament = tournaments.get(index);
            pw.println(tournament.tournamentInfo());
            pw.println(tournament.playerWithGift());
            pw.println("\n\n\n");
        } 
        pw.flush();
        pw.close();
        sc.close();   
    }
    public static String[] cleanArray(String[] line){
        String[] cleanArray = new String[line.length];
        for (int i = 0; i < line.length; i++) {
            cleanArray[i] = line[i].trim();
        }
        return cleanArray.clone();
    }


}
