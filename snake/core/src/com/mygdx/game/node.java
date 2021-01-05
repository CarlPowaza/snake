package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;

public class node {
    private int x_pos;
    private int y_pos;
    private Color color;
    private int type;


    public node(int a,int b){
        x_pos = a;
        y_pos = b;
        type= 0;
        set_type(0);
       

    }
    public node(int a,int b,int c){
        x_pos = a;
        y_pos = b;
        type= c;
        if(type == 1)
        set_type(1);

        if (type == 3)
        set_type(3);
       

    }






    public int getx(){ return x_pos;}
    public int gety(){return y_pos;}
    public int get_type(){return type;}
    public Color get_color(){return color;}
    

    public void set_type(int a){
        switch (a) {
            case 0:
                color = Color.WHITE;
                type =0;
                break;
            case 1:
                color = Color.RED;
                type=1;
                break;    
            case 2:
                color =Color.RED;
                type =2;
                break;    
            case 3:
                color = Color.GREEN;
                type = 3;
                break;    
      

        }
    
    }
    public void update_loc(int a){
        x_pos = a;
        y_pos = a;

    }
    
}
