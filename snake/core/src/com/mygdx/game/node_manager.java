package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.TimeUtils;


public class node_manager {
   
   private node[][] arr;
   private int temp;
   private shape_guy guy;
   private int length;
   private player snakie;
   
    public node_manager(int size){
        guy = new shape_guy();
        arr = new node[size][size];
        length = size;
        init_array(arr);
        snakie = new player(length);
        snakie.updatenodes(arr);
        

    }

    public void showgraph(OrthographicCamera cam){
        guy.Graph(arr, cam);
    }
    public node[][] get_nodes(){ return arr;}
 

    public long playermove(){
        arr[snakie.getx()][snakie.gety()].set_type(0);
        arr = snakie.updatenodes(arr);
        return TimeUtils.nanoTime();
    }

    public void player_move(int a){
        switch (a) {
            case 0://up
                if(snakie.getx()!=15){
                //arr[snakie.getx()][snakie.gety()].set_type(0);
                snakie.moveup();
               // arr = snakie.updatenodes(arr);
                }
                break;
            case 1://down
                if(snakie.getx()!=0){
                //arr[snakie.getx()][snakie.gety()].set_type(0);
                snakie.movedown();
               // arr = snakie.updatenodes(arr);
                }
                break;    
            case 2://left
                if(snakie.gety()!=0){
              //  arr[snakie.getx()][snakie.gety()].set_type(0);
                snakie.moveleft();
               // arr = snakie.updatenodes(arr);
                }
                break;
            case 3://right
                if(snakie.gety()!=15){
               // arr[snakie.getx()][snakie.gety()].set_type(0);
                snakie.moveright();
               // arr = snakie.updatenodes(arr);
                }
                break;
           

        
            
        }
    }

 
    private void init_array(node[][] a){
        temp = 40;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                arr[j][i]= new node(temp*i,temp*j);

                
            }
            
        }
        
        

    }
    
}
