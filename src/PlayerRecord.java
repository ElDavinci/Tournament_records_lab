

public class PlayerRecord extends Player {
    private int totalGame;
    private int totalManOfMatch;
    public PlayerRecord(int totalGame, int totalManOfMatch, String name, int age){
        super(name, age);
        //cant you have a super and a this 
        this.totalGame  = totalGame;
        this.totalManOfMatch = totalManOfMatch;
    }
    public int getTotalManOfMatch() {
        return totalManOfMatch;
    }
    @Override
    public int totalGamesPlayed() {
        if (this.totalGame > 0){
            return this.totalGame;
        }
        else{
            return -1;
        }
    }
    @Override
    public String toString() {

        return String.format("Player{name= %s, age= %d}\nGame Record{total Games Played = %d, total man of Match = %d}", this.getName(),this.getAge(),this.totalGame,this.totalManOfMatch);
    }
}
