import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pecahan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pecahan extends Actor
{
    /**
     * Act - do whatever the pecahan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int vx=0,vy=0;
    public pecahan(GreenfootImage img)
    {
        GreenfootImage image=new GreenfootImage(10,10);
        image.drawImage(img,-Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
        setImage(image);
    }
    
    public void addedToWorld(World MyWorld)
    {
        vx=-5+Greenfoot.getRandomNumber(10);
        vy=-5+Greenfoot.getRandomNumber(10);
        if(vx==0)vx=1;
        if(vy==0)vy=1;
    }
}