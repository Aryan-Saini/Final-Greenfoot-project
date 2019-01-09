import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueWorld extends World
{
    private boolean startGame = false;
    private boolean resetGame = false;
    private AquariumWorld mainWorld;
    private int life;
    /**
     * ContinueWorld is the constructor for ContinueWorld type objects
     * 
     * @param mainWorld is a AquariumWorld data type (thats referenced) to the old aquarium world
     * @param life is a int data type (thats referenced) to how much life the shark has  
     * @return nothing is returned
     */
    public ContinueWorld(AquariumWorld mainWorld, int life )
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.mainWorld = mainWorld;
        this.life = life;
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
        checkGame();
        checkForLife();
    }
    private void checkGame(){
        if (startGame == false){
            checkKeyPress();
        }
        else{
            checkKeyPress();
        }
    }
    /**
     * checkKeyPress checks if the space key has been clicked  
     * if clicked it will start the game and get rid of the ball
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void checkKeyPress(){
        if( Greenfoot.isKeyDown("space") == true && life > 0){
            startGame = true;
            showText("",200,550);
            Greenfoot.setWorld(mainWorld); 
        }
        else if (Greenfoot.isKeyDown("space") == true && life == 0) {
            startGame = true;
            showText("",200,550);
            Greenfoot.setWorld(new StartMenu());
        }
    }

    /**
     * checkForLife checks how much life you have and the prints that in text for the player to see
     * also stops the game if life is at 0
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void checkForLife(){
        if(life == 2){
            getBackground().drawString("You Have Two Life Left \n Click Space to Continue", getWidth()/2, getHeight()/2);
        }
        else if(life == 1){
            getBackground().drawString("You Have One Life Left \n Click Space to Continue", getWidth()/2, getHeight()/2);
        }
        else{
            getBackground().drawString("Game Over \n Click Space to Restart", getWidth()/2, getHeight()/2);
            
        }
    }
}
