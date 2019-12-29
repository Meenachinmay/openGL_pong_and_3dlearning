import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glPopMatrix;

public abstract class GameObject{
    protected float x;
    protected float y;
    protected float sx;
    protected float sy;

    public abstract void update();

    public void render(){
        Draw.Rect(x, y, sx, sy);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSx() {
        return sx;
    }

    public float getSy() {
        return sy;
    }

    public float getCenterY(){
        return y + sy / 2;
    }
}
