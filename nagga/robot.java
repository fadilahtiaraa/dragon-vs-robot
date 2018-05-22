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
            //w.removeObject(this);
            setLocation(590,getY());
            
            MyWorld MyWorld = (MyWorld)getWorld();
            MyWorld.addScore(-5);
            getWorld().removeObject(this);
        
        }
   }
    
   public void hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new pecahan(getImage()),px,py);
        }
    }
}
