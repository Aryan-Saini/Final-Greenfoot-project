/**
 * 
 * Name: Aryan Saini
 * Course: Software Devlopment
 * Teacher: Mr.Hardman
 * Date:1/4/2019
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AquariumWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AquariumWorld extends World
{
    private int fishHealth;
    private Life life;
    Fish fish = new Fish();
    private int pastFishX = 0;
    private int pastFishY = 0;
    /**
     * AquariumWorld is the constructor for AquariumWorld type objects
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    public AquariumWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        iniatlizeObjects();
        fishHealth = 3;
    }

    /**
     * act is the method that is
     * run during every act cycle
     * of the scenario
     *
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act(){
        checkForFish();
    }

    /**
     * inializeObjects adds three sharks,three life objects and one fish at given location
     * 
     * @param There are no parameters 
     * @return Nothing is returned
     */
    private void iniatlizeObjects(){
        addObject(new Shark(),getWidth(),getHeight()/2);
        addObject(new Shark(),getWidth(),getHeight()/2);
        addObject(new Shark(),getWidth(),getHeight()/2);
        addObject(new Life(),770,30);
        addObject(new Life(),720,30);
        addObject(new Life(),670,30);
        addObject(fish,getWidth()/2,getHeight()/2);
    }

    /**
     * checkForFish checks if the fish is still alive if not
     * removes all the life bubbles and adds as much bubles as the life
     * also changes the world
     * 
     * @param There are no parameters 
     * @return Nothing is returned
     */
    private void checkForFish(){
        int addLife;
        addLife = fishHealth;
        int[] lifeXOffset = new int[]{770,720,670};
        int lifeYOffset = 30;
        int fishYOffset = 0;
        int fishXOffset = 0;
        
        if(getObjects(Fish.class).size() == 1)
        {
            fishXOffset = fish.getX();
            fishYOffset = fish.getY();
        }
        if(getObjects(Fish.class).size() == 0){

            if(fishHealth > 0 ){
                removeObjects(getObjects(Life.class));
                addObject(fish,pastFishX - Greenfoot.getRandomNumber(300),pastFishY - Greenfoot.getRandomNumber(300));
                fishHealth = fishHealth - 1;
                addLife = fishHealth;
                Greenfoot.setWorld(new ContinueWorld(this, fishHealth)); 
            }
            for(int i = 0; i < addLife; i++){
                addObject(new Life(),lifeXOffset[i],lifeYOffset);
            }
        }
        pastFishX = fishXOffset;
        pastFishY = fishYOffset;
    }
    
}
