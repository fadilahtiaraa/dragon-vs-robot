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
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        score = 0;
        showScore();
    }

    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new robot(),getWidth()+200,py);
        }
        if(Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new poin(),779, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(100)<6)
        {
            addObject(new poin(),779, Greenfoot.getRandomNumber(360));
        }
    }
    
    private void showScore()
    {
        showText("Score:" + score, 80, 25);
    }
    private void showEndMessage()
    {
        showText("your final score"+ score + "point", 390, 170);
    }
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if(score < 0)
        {
            Greenfoot.stop();
            
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
