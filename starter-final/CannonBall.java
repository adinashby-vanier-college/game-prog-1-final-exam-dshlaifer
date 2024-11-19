import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CannonBall extends Actor {

    private int speed;  // Speed of the cannonball

    public CannonBall(int speed) {
        this.speed = speed;  // Initialize the speed of the cannonball
    }

    public void act() {
        move(speed);  // Move in the direction the cannonball is facing
        checkCollision();  // Check for collisions with the Ladybug
    }

    private void checkCollision() {
        // Check if the CannonBall is intersecting with a Ladybug
        Ladybug ladybug = (Ladybug) getOneIntersectingObject(Ladybug.class);
        
        // If there's a collision with a Ladybug
        if (ladybug != null) {
            // Remove the Ladybug from the world
            getWorld().removeObject(ladybug);
            
            // Optionally, remove the CannonBall after collision
            getWorld().removeObject(this);
        }
    }
}
