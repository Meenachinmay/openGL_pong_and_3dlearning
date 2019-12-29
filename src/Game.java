import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryStack;
import sun.applet.Main;

import java.nio.IntBuffer;
import java.util.ArrayList;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryStack.stackPush;

public class Game {

    private ArrayList<GameObject> gameObjects;
    private main mainn;
    private int window_width;
    private int window_height;

    public Game()
    {
        gameObjects = new ArrayList<GameObject>();
        mainn = new main();
        getting_window_width_and_height();

    }

    public void get_Input(){
        if (Input.keys[GLFW_KEY_SPACE]){
            System.out.println(window_width);
            System.out.println(window_height);
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

    private void getting_window_width_and_height() {
        // Get the thread stack and push a new frame
        try ( MemoryStack stack = stackPush() ) {
            IntBuffer pWidth = stack.mallocInt(1); // int*
            IntBuffer pHeight = stack.mallocInt(1); // int*
            // Get the window size passed to glfwCreateWindow
            glfwGetWindowSize(main.window, pWidth, pHeight);

            window_width = pWidth.get(0);
            window_height = pHeight.get(0);

        } // the stack frame is popped automatically
    }
}
