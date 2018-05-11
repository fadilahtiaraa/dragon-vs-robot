import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class naga extends Actor
{
    /**
     * Act - do whatever the naga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act() 
    {
        w = getWorld();
        checkKeyPress();
        shooter();
    }

    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }

    }
  
    public void shooter()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new api(), getX()+85, getY());
        }
    }
}
