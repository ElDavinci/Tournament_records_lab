

import java.util.ArrayList;

public class Tournament  implements Gift {
    private String tournamentName;
    private ArrayList<PlayerRecord> players = new ArrayList<>();
    public Tournament(String tournamentName){
        this.tournamentName = tournamentName;
    }
    public String getTournamentName() {
        return this.tournamentName;
    }
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }
    @Override
    public boolean isEnable(PlayerRecord player) {
        if(player.getTotalManOfMatch() > 5){
            return true;
        }
        else{
            return false;
        }
    }
    public void setPlayers(ArrayList<PlayerRecord> players) {
        this.players = players;
    }
    public PlayerRecord getPlayer(int index) {
        return players.get(index);
    }
    public String playerWithGift(){
        for (int index = 0; index < players.size(); index++) {
            PlayerRecord player = players.get(index);
            if(isEnable(player)){
                return ("------------List All Players with Gift--------------\n"+player.toString() + String.format("\nGift: %.1f", gift));
            }
        }
        return "";
    }
    public String tournamentInfo() {
        String s = String.format("Tournament Name:%s\n", this.getTournamentName());
        s+= "--------------------------------------------------------\n";
        s+= "----Players Participated in the Tournament--------------\n";
        for (int index = 0; index < players.size(); index++) {
            PlayerRecord playerRecord = players.get(index);
            s+= String.format("%s\n--------------------------------------------------\n", playerRecord.toString());
        }
        return s;
        
    }
    
}
