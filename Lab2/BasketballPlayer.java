package Lab2;
public class BasketballPlayer extends Player {
        public BasketballPlayer(String name, int jerseyNumber) {
            super(name, jerseyNumber);
        }
        public void playGame() {
            minutesPlayed += 48;
        }
}