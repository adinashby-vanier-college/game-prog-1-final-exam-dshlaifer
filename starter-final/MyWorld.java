import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWorld extends World {
    
    public GameWorld() {
        // Set the world size and prepare the background
        super(600, 400, 1);
        
        // Create a few cannons with different firing intervals and speeds
        Cannon cannon1 = new Cannon(30, 5); // Fires every 30 frames, cannonball speed = 5
        Cannon cannon2 = new Cannon(60, 3); // Fires every 60 frames, cannonball speed = 3
        
        // Place the cannons in different positions
        addObject(cannon1, 100, 200);
        addObject(cannon2, 500, 200);
    }
}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cannon cannon =  new Cannon(30, 5);
        addObject(cannon, 95, 92);
        Cannon cannon2 =  new Cannon(30, 5);
        addObject(cannon2, 321, 277);
        Cannon cannon3 =  new Cannon(30, 5);
        addObject(cannon3, 692, 107);
        Cannon cannon4 =  new Cannon(30, 5);
        addObject(cannon4, 708, 478);
        Cannon canon5 =  new Cannon(30, 5);
        addObject(canon5, 497, 52);
        cannon3.setLocation(730, 171);
        cannon2.setLocation(289, 316);
        CannonBall cannonBall =  new  CannonBall();
        addObject(cannonBall, 262, 101);
        CannonBall cannonBall2 =  new  CannonBall();
        addObject(cannonBall2, 361, 103);
        CannonBall cannonBall3 =  new  CannonBall();
        addObject(cannonBall3, 487, 134);
        cannonBall3.setLocation(494, 136);
        CannonBall cannonBall4 =  new  CannonBall();
        addObject(cannonBall4, 496, 195);
        CannonBall cannonBall5 =  new  CannonBall();
        addObject(cannonBall5, 448, 296);
        CannonBall cannonBall6 =  new  CannonBall();
        addObject(cannonBall6, 616, 170);
        CannonBall cannonBall7 =  new  CannonBall();
        addObject(cannonBall7, 603, 480);
        CannonBall cannonBall8 =  new  CannonBall();
        addObject(cannonBall8, 423, 479);
        CannonBall cannonBall9 =  new  CannonBall();
        addObject(cannonBall9, 191, 473);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 75, 324);
        Ladybug hero =  new  Ladybug();
        addObject(hero, 720, 286);
        hero.setLocation(731, 298);
        hero.setLocation(709, 282);
        removeObject(hero);
        addObject(hero, 711, 302);
        hero.setLocation(722, 39);
        cannon3.setRotation(180);
        cannon4.setLocation(737, 479);
        cannon4.setRotation(180);
        cannon5.setRotation(90);
        cannonBall5.setLocation(415, 318);
        hero.setRotation(180);
        hero.setLocation(742, 58);
        hero.setLocation(734, 54);
        cannonBall4.setLocation(496, 211);
        cannonBall5.setLocation(404, 303);
        CannonBall cannonBall10 =  new  CannonBall();
        addObject(cannonBall10, 643, 315);
        cannonBall10.setLocation(627, 314);
        cannonBall5.setLocation(391, 316);
        cannonBall10.setLocation(628, 318);
        cannonBall6.setLocation(616, 177);
        cannonBall.setLocation(220, 103);
        cannonBall2.setLocation(338, 94);
        
    }
    
}
