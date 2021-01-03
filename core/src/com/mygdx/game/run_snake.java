package com.mygdx.game;

import com.badlogic.gdx.Game;

public class run_snake extends Game {
	snake snake;
	
	@Override
	public void create () {
		snake = new snake();
		this.setScreen(snake);
	
		
		
	}

}
