package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;

public class node {
    private int x_pos;
    private int y_pos;
    Color color;


    public node(int a,int b){
        x_pos = a;
        y_pos = b;
        set_type(0);


    }

    public void set_type(int a){
        switch (a) {
            case 0:
                color = Color.BLACK;
                break;
            case 1:
                color = Color.RED;
                break;    
            case 2:
                color =Color.RED;
                break;    
            case 3:
                color = Color.GREEN;
                break;    
        }
        
    }
    
}
