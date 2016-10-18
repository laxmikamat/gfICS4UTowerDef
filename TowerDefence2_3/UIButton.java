import greenfoot.*;

/**
 * Write a description of class UIButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIButton extends UIMenuBackground
{
    /**
     * Act - do whatever the UIButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        
    boolean active = false;
    MouseInfo mouse;
    
     
    public void act() 
    {
        mouse = Greenfoot.getMouseInfo();
       
        if (mouse != null && mouse.getActor() == this){
         active = true;
        }
        else {
            active = false;
        }
        if (active){
         getImage().setTransparency(255);
        }
        else{
            active = false;
            getImage().setTransparency(100);
        }
        // Add your action code here.
    }    
}
