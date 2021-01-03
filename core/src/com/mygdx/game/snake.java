package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class snake implements Screen {
    OrthographicCamera cam;
    private final int screenWidth = 1280, screenHeight = 720 ;


    public snake(){
        initcam();


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
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub

    }



}
