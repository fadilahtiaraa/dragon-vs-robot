import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poin extends Actor
{
    int speed;
    /**
     * Act - do whatever the poin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public poin()
    {
        speed = Greenfoot.getRandomNumber(3)+1;
    }
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()-4, getY());
        turn(1);
        
        if(getX() == 0)
        {
            MyWorld MyWorld = (MyWorld)getWorld();
            MyWorld.addScore(-15);
            getWorld().removeObject(this);
        }
    }    
}
