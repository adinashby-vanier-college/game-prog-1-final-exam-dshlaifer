// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public MyWorld()
    {
        super(800, 400, 1);
        /* Create a new world with 600x400 cells, with a cell size of 1x1 pixels Prepare the world by adding initial objects*/
        prepare();
    }

    /**
     * 
     */
    private void prepare()
    {
        Cannon cannon1 =  new  Cannon(100, 1);
        addObject(cannon1, 126, 115);
        Cannon cannon2 =  new  Cannon(150, 1);
        addObject(cannon2, 413, 25);
        cannon2.setRotation(90);
        Cannon cannon3 =  new  Cannon(100, 1);
        addObject(cannon3, 556, 175);
        cannon3.setRotation(180);
        Cannon cannon4 =  new  Cannon(200, 1);
        addObject(cannon4, 208, 240);
        Cannon cannon5 =  new  Cannon(120, 1);
        addObject(cannon5, 544, 337);
        cannon5.setRotation(180);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 71, 239);
        Ladybug ladybug =  new  Ladybug();
        addObject(ladybug, 487, 61);
        ladybug.setLocation(659, 83);
        cannon3.setLocation(739, 169);
        cannon5.setLocation(597, 329);
        cannon2.setLocation(220, 97);
        cannon2.setLocation(581, 17);
        cannon2.setLocation(557, 46);
    }
}
