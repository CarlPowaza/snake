package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.badlogic.gdx.utils.TimeUtils;

public class snake implements Screen {
    float speed=50000000;
    OrthographicCamera cam;
    ShapeRenderer shapes;
    private final int screenWidth = 640, screenHeight = 700 ;
    private long curT=0;
    public int length= 16;
    node_manager n_man;
    public snake(){
        shapes = new ShapeRenderer();
        n_man = new node_manager(length);

        initcam();
        curT=TimeUtils.nanoTime();
       
        

    }

    private void initcam(){
        cam = new OrthographicCamera();
        cam.setToOrtho(false,screenWidth,screenHeight);
        cam.update();
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //Graph(n_man.get_nodes());
        n_man.showgraph(cam);
        if(ticktick()==true)
            curT =n_man.playermove();
        
        n_man.playermove();
        if (Gdx.input.isKeyPressed(Keys.W)||Gdx.input.isKeyPressed(Keys.UP)) {
           // if(ticktick() == true){
            n_man.player_move(0);
           // curT = TimeUtils.nanoTime();
           // }
        }
          if (Gdx.input.isKeyPressed(Keys.S)||Gdx.input.isKeyPressed(Keys.DOWN)) {
          //  if(ticktick() == true){
            n_man.player_move(1);
           // curT = TimeUtils.nanoTime();
           //  }  
        }
        if (Gdx.input.isKeyPressed(Keys.A)||Gdx.input.isKeyPressed(Keys.LEFT)) {
           // if(ticktick() == true){
            n_man.player_move(2);
          //  curT = TimeUtils.nanoTime();
             //  }  
      }
      if (Gdx.input.isKeyPressed(Keys.D)||Gdx.input.isKeyPressed(Keys.RIGHT)) {
       // if(ticktick() == true){
        n_man.player_move(3);
        //curT = TimeUtils.nanoTime();
      //  }
    }     

    }
    private boolean ticktick(){
        if(TimeUtils.nanoTime()-curT > speed){
           // curT = TimeUtils.nanoTime();
            return true;}
        else   
          //  curT = TimeUtils.nanoTime(); 
            return false;
        

    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        shapes.dispose();
        




    }



}
