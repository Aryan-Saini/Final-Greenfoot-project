import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
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
        String key = Greenfoot.getKey();
        checkKeyPress();
        checkIfAtEdge();
    }

    /**
     * checkKeyPress checks if the wasd key's has been clicked  
     * if clicked it will turn left,right, go forward or go back
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("d") == true){
            goLeft();
        }
        else if(Greenfoot.isKeyDown("a") == true){
            goRight();
        }
        else if(Greenfoot.isKeyDown("w") == true){
            goForward();
        }
        else if(Greenfoot.isKeyDown("s") == true){
            goBack();
        }
    }

    /**
     * goLeft turns the fish left 5 pixels
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    private void goLeft(){
        turn(5);        
    }

    /**
     * goRight turns the fish right -5 pixels
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    private void goRight(){
        turn(-5);        
    }

    /**
     * goForward moves the fish forward -5 pixels
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    private void goForward(){
        move(-5);   
    }

    /**
     * goBack moves the fish back 5 pixels
     * 
     * @param none There are no parameters
     * @return nothing is returned
     */
    private void goBack(){
        move(5);      
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