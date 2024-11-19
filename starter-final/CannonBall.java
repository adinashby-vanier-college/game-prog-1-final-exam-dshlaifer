// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * 
     */
    public CannonBall()
    {
        eatLadybug();
    }

    /**
     * 
     */
    public void eatLadybug()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
