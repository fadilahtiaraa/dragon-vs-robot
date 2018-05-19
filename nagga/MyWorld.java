import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int jeda=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new robot(),getWidth()+200,py);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        robot robot = new robot();
        addObject(robot,544,206);
        naga naga = new naga();
        addObject(naga,65,233);
        api api = new api();
        addObject(api,168,240);
        robot.setLocation(547,188);
    }
}
