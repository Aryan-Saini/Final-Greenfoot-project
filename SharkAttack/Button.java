import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int buttonType;
    /**
     * Button is the constructor for Button type objects
     * 
     * @param type is a int data type (thats referenced) to what type the button is
     * @return nothing is returned
     */
    public Button(int type){
        buttonType = type;
        buttonUse(buttonType);
        if( type == 1){
            setImage("Start.png");
        }
        else if ( type == 2){
            setImage("TutorialButton.png");
        }
    }

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
        buttonUse(buttonType);
    }

    /**
     * buttonUse iniatlize what type button it is and the use of the button
     * 
     * @param type is a int data type (thats referenced) to what type the button is
     * @return nothing is returned
     */
    private void buttonUse(int type){

        if (type == 1){
            if (Greenfoot.mousePressed(this))
            {
                Greenfoot.setWorld(new AquariumWorld()); 
            }
        }
        else{
            if (Greenfoot.mousePressed(this))
            {

                getWorldOfType(StartMenu.class).initalizeTutorialItems();
            }
        }
    }

}
