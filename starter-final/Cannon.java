import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cannon extends Actor {
    private int fireInterval; // The time between each shot (in frames)
    private int fireSpeed;    // Speed of the cannonball
    private int lastFireTime; // Last frame when the cannon fired
    
    public Cannon(int fireInterval, int fireSpeed) {
        this.fireInterval = fireInterval;
        this.fireSpeed = fireSpeed;
        this.lastFireTime = 0;
    }

    public void act() {
        // Fire the cannon at regular intervals
        if (Greenfoot.getTime() - lastFireTime >= fireInterval) {
            fireCannonBall();
            lastFireTime = Greenfoot.getTime();
        }
    }

    private void fireCannonBall() {
        // Create a new Cannonball and set its speed
        CannonBall cannonball = new CannonBall(fireSpeed);
        getWorld().addObject(cannonball, getX(), getY());
        
        // Set the direction of the cannonball based on the cannon's rotation
        cannonball.setRotation(getRotation());
    }
}



