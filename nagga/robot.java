import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    private int speed;
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        move(-5);
        if(isAtEdge())
        {
<<<<<<< HEAD
            w.removeObject(this);
=======
            //w.removeObject(this);
            setLocation(590,getY());
>>>>>>> ef4183128fc469c7f45957cb59df0f7da8fbcb48
        }
    }    
}
