public class GameObjectBALL extends GameObject {

    public static final int SIZE = 16;
    private static final float xVelocity_MAX = 4f;
    private static final float yVelocity_MAX = 5f;

    public float velX;
    public float velY;

    public GameObjectBALL(float x, float y) {
        this.x = x;
        this.y = y;
        this.sx = SIZE;
        this.sy = SIZE;

        velX = xVelocity_MAX;
        velY = 0;

    }

    @Override
    public void update() {
        this.x += velX;
        this.y += velY;
    }
}
