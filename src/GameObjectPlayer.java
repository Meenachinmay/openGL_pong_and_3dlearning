public class GameObjectPlayer extends GameObject {

    public static final int SIZEX = 16;
    public static final int SIZEY = 16 * 7;

    public GameObjectPlayer(float x, float y) {
        this.x = x;
        this.y = y;
        this.sx = SIZEX;
        this.sy = SIZEY;
    }

    @Override
    public void update() {

    }
}
