package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class shape_guy {// this uses shaperenderer to draw the graph based off 
                        //an array of nodes
                       
    private ShapeRenderer shapes;

    public shape_guy(){
        shapes = new ShapeRenderer();
        
    }
    public void Graph(node[][]a,OrthographicCamera cam){
        
        shapes.setProjectionMatrix(cam.combined);
        shapes.begin(ShapeType.Filled);

            for (int i = 0; i < a.length; i++) {  
               
                for (int j = 0; j < a.length; j++) {
                    shapes.setColor(a[i][j].get_color());                                                
                    shapes.rect(a[i][j].getx(),a[i][j].gety(),40,40);
            }        
                 
        }  
      
        shapes.end();

        shapes.setProjectionMatrix(cam.combined);
        shapes.begin(ShapeType.Line);
        
        for (int i = 0; i < a.length; i++) {  
               
            for (int j = 0; j < a.length; j++) {
                shapes.setColor(Color.BLACK);                                                 
                shapes.rect(a[i][j].getx(),a[i][j].gety(),40,40);
        }        
             
    }  
    shapes.end();



    }

    
                    
    
}
