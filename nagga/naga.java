import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class naga extends Actor
{
    private int jeda=0;
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
        if (checkHit()){
            MyWorld MyWorld = (MyWorld) getWorld();
        }
        else{
        }
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
        if(jeda>0)jeda--;
        if(jeda==0)getWorld().addObject(new api(),getX()+100,getY());
        if(jeda==1)jeda=10;
    }
    
    private boolean checkHit(){
        if (isTouching(robot.class)){
            return true;
        }
        if (getY() == getWorld().getHeight() - 1){
            return true;
        }
        return false;
    }
}
