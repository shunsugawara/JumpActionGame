package jp.techacademy.shun.sugawara.jumpactiongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject {
    public static final float ENEMY_WIDTH = 0.5f;
    public static final float ENEMY_HEIGHT = 0.5f;
    public static final float ENEMY_VELOCITY_X = 4.0f;
    public static final float ENEMY_VELOCITY_Y = 2.0f;

    public Enemy(Texture texture,int srcX,int srcY,int srcWidth,int srcHeight){
        super(texture,srcX,srcY,srcWidth,srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);

        velocity.x = ENEMY_VELOCITY_X;
        velocity.y = -ENEMY_VELOCITY_Y;

    }

    public void update(float delta){
        setPosition(getX() + velocity.x * delta,getY() + velocity.y * delta);

        if(getX() < ENEMY_WIDTH){
            velocity.x = -velocity.x;
        }
        if(getX() > GameScreen.WORLD_WIDTH){
            velocity.x = -velocity.x;
        }
        if(getY() < 0){
            setY(GameScreen.WORLD_HEIGHT);
        }

    }

}
