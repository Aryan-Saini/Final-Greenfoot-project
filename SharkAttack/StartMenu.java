import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    /**
     * StartMenu is the constructor for StartMenu type objects
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        iniatlizeObjects();
    }

    /**
     * inializeObjects iniatlize objects in the world at the start of the game
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    private void iniatlizeObjects(){
        GreenfootImage logo = new GreenfootImage ("Shark logo.png");
        logo.scale(getWidth(),getHeight());

        Button startButton = new Button(1);
        Button tutorialButton = new Button(2);
        addObject(startButton, getWidth()/2, 350);
        addObject(tutorialButton, getWidth()/2, 450);
        getBackground().drawImage(logo, 0, 0);

    }

    /**
     * initalizeTutorialItems() iniatlize objects in the world when the tutorial button is clicked
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    public void initalizeTutorialItems(){
        GreenfootImage wasdKeys = new GreenfootImage ("Wasd.png");
        GreenfootImage sharkArrow = new GreenfootImage ("SharkArrow.png");
        GreenfootImage fishArrow = new GreenfootImage ("FishArrow.png");
        GreenfootImage lifeArrow = new GreenfootImage ("LifeArrow.png");
        getBackground().drawImage(wasdKeys, 600, 400);
        getBackground().setColor(Color.BLACK);
        getBackground().drawString("w = forward \n a = left turn \n s = backword \n d = left turn", 650, 510);
        getBackground().drawImage(sharkArrow, 200, 50);
        getBackground().drawString("Your enemy shark Make sure to run away",200,20);
        getBackground().drawImage(fishArrow, 60, 230);
        getBackground().drawString("The little fish is you \n make sure to run away fast",10,210);
        addObject(new Life(),770,30);
        getBackground().drawImage(lifeArrow, 725,80);
        getBackground().drawString("Your Life \n watch your life \n or you might die",700,200);
    }
}
