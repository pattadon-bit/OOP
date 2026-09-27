package Lab2;
public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

        public Player(String name, int jerseyNumber) {
            this.name = name;
            this.jerseyNumber = jerseyNumber;
            this.minutesPlayed = 0;
        }
        public void print() {
            System.out.println(name + ":" + jerseyNumber);
        }
        public int getMinutesPlayed() {
            return minutesPlayed;
        }
        public void changeJerseyNumber(int newNumber) {
            this.jerseyNumber = newNumber;
            System.out.println(name + " changes number to " + jerseyNumber);
        }
}