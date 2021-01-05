package com.mygdx.game;








public class player {
    shape_guy guy;
    
    
    private int temp;

    private int xpos;
    private int ypos;
    private int cur_dir;


    public player(int a){
       guy= new shape_guy();
       xpos= a/2;
       ypos = a/2;
       cur_dir = 0;
      

    }
    public void moveup(){
        cur_dir = 1;
    }
    public void movedown(){
        cur_dir = 2;

    }
    public void moveleft(){
        cur_dir = 3;

   }
   public void moveright(){
    cur_dir = 4;

}
    public void move(){
        switch (cur_dir) {
        case 0:
                
                break;
        case 1://UP
                xpos++;  
                break;
        case 2://DOWN
                xpos--;    
                break;
        case 3://LEFT
                ypos--;   
                break;
        case 4://RIGHT
                ypos++;
                break;
        
           
        }
    }


    public node[][] updatenodes(node[][]a){
        a[xpos][ypos].set_type(1);
        return a;
    }
    public int getx(){return xpos;}
    public int gety(){return ypos;}










    
}
