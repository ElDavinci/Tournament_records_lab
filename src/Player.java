

public abstract class Player {
    private String name;
    private int age;
    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract int totalGamesPlayed();
    @Override
    public String toString() {
        //DONT FORGET TO DO
        // TODO Auto-generated method stub
        return super.toString();
    }

}
