import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Cannon extends Actor {
    private int reloadTime;  // Time between shots
    private int reloadCounter;  // Counter to track when to shoot
    private Random random;  // For generating random angles

    public Cannon(int reloadTime, int speed) {
        this.reloadTime = reloadTime;
        this.reloadCounter = reloadTime;  // Initialize counter to the reload time
        random = new Random();  // Initialize random number generator
    }

    public void act() {
        // Decrease the counter each act cycle
        reloadCounter--;

        // When counter reaches zero, shoot a cannonball
        if (reloadCounter <= 0) {
            shoot();
            reloadCounter = reloadTime;  // Reset the counter for the next shot
        }
    }

    private void shoot() {
        // Create a new CannonBall with a very slow speed
        CannonBall cannonBall = new CannonBall(1);  // Speed set to 1 for very slow movement
        
        // Add the CannonBall to the world at the Cannon's location
        getWorld().addObject(cannonBall, getX(), getY());

        // Randomly choose one of four directions: 0° (right), 90° (down), 180° (left), 270° (up)
        int[] directions = {0, 90, 180, 270};
        int randomDirection = directions[random.nextInt(directions.length)];
        
        // Set the rotation of the CannonBall to the chosen direction
        cannonBall.setRotation(randomDirection);
    }
}





