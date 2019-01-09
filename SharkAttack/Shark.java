import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * act is the method that is
     * run during every act cycle
     * of the scenario
     *
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        checkForFish();  
        move();
        checkIfAtEdge();
    }

    /**
     * chechForFish checks if the shark is touching a fish
     * if so remove the touching fish
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForFish(){
        if (isTouching(Fish.class) == true){
            removeTouching(Fish.class);
        }
    }

    /**
     * move moves the fish straight but with little random turns at time
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void move(){
        int randomTurn = Greenfoot.getRandomNumber(5)+1;
        if(Greenfoot.getRandomNumber(100) > 99){
            move(-2);
        }
        else{
            if(Greenfoot.getRandomNumber(100) < 50){
                turn(randomTurn);
                move(-2);
            }
            else{
                turn(- randomTurn);
                move(-2);
            }
        }
    }

    /**
     * checkIfAtEdge checks if the shark is at edge and it puts the shark on the opposite side 
     * 
     * @param none There are no parameters 
     * @return nothing is returned
     */
    private void checkIfAtEdge(){
        if(getX() <= 1){
            setLocation(getWorld().getWidth(),getY());
        }
        else if(getX() >= 799){
            setLocation((getWorld().getWidth()) - (getWorld().getWidth()),getY());
        }
        else if(getY() <= 1){
            setLocation(getX(),getWorld().getHeight());
        }
        else if(getY() >= 599){
            setLocation(getX(),(getWorld().getHeight()) - (getWorld().getHeight()));
        }
    }
}

