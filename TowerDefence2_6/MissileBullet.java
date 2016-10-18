import greenfoot.*;

/**
 * Write a description of class MissileBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissileBullet extends Bullet
{
    Enemy enemy;
    double bulletSpeed;
    public MissileBullet(int a, int d, int r, double s, Enemy e){
        super(a, d, r, (int)s);
        this.bulletSpeed = s;
        enemy = e;
    }
    /**
     * Act - do whatever the MissileBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        speed = (int)this.bulletSpeed;
        // Add your action code here.
        super.act();
        if (enemy!=null&&enemy.getWorld()!=null){
            int oldAngle = getRotation();
        turnTowards(enemy.getX(), enemy.getY());
        setRotation(oldAngle+(int)((getRotation()-oldAngle)/4));
        bulletSpeed*=1.1;
    }
    else{
        getWorld().addObject(new Explosion(this), getX(),getY());
        getWorld().removeObject(this);
    }
        
    }    
}