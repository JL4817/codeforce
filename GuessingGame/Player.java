package GuessingGame;

public class Player {

    private int lives;
    private boolean alive;

    public Player() {
        lives = 3;
        alive = true;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
