package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class LargeEnemy extends GameObject {
	
	private Handler handler;
	
	public LargeEnemy(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 2;
		velY = 2;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 64, 64);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 92) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 72) velX *= -1;
		
		handler.addObject(new Trail(x, y, ID.Trail, Color.lightGray, 64, 64, 0.05f, handler));
	}

	public void render(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect((int)x, (int)y, 64, 64);
	}
	
}
