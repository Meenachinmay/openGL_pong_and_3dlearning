import java.util.ArrayList;

import static org.lwjgl.glfw.GLFW.*;

public class Game {

    private ArrayList<GameObject> gameObjects;

    private int window_width;
    private int window_height;
    private GameObjectBALL ball;
    private GameObjectPlayer player;

    public Game(){}

    // get window widht and height from the main class
    public Game(int WINDOW_WIDTH, int WINDOW_HEIGHT){

        gameObjects = new ArrayList<GameObject>();
        window_width = WINDOW_WIDTH;
        window_height = WINDOW_HEIGHT;

        // creating the game object ball
        ball = new GameObjectBALL(window_width / 2 - GameObjectBALL.SIZE / 2, window_height / 2 - GameObjectBALL.SIZE / 2);
        // creating the game object player
        player = new GameObjectPlayer(0, window_height / 2 - GameObjectPlayer.SIZEY / 2);

        gameObjects.add(ball);
        gameObjects.add(player);
    }

    public void get_Input(){
        if (Input.keys[GLFW_KEY_SPACE]){

        }
    }

   // update
    public void update(){
        for(GameObject go : gameObjects){
            go.update();
        }
    }

    // render
    public void render(){
        for(GameObject go : gameObjects){
            go.render();
        }
    }
}
