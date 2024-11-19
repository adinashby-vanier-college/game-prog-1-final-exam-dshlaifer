// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("w")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            turn(-3);
        }
    }
}
