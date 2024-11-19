import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ladybug extends Actor {

    public void act() {
        // Handle movement with arrow keys
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2); // Move up
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2); // Move down
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY()); // Move left
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY()); // Move right
        }

        checkCollision();  // Check for collision with FinishLocation
    }

    private void checkCollision() {
        // Check if the Ladybug is intersecting with a FinishLocation
        FinishLocation finishLocation = (FinishLocation) getOneIntersectingObject(FinishLocation.class);

        // If there's a collision with the FinishLocation
        if (finishLocation != null) {
            // Remove the FinishLocation from the world
            getWorld().removeObject(finishLocation);
            
            // You can add additional code here if something else should happen
            // when the FinishLocation is reached (e.g., victory message)
        }
    }
}

