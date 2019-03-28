package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy extends GameObject {
	
	private Handler handler;
	private GameObject player;
	private int target;
	
	public SmartEnemy(float x, float y, ID id, Handler handler, int target) {
		super(x, y, id);
		this.handler = handler;
		this.target = target;
		
		for(int i = 0; i < handler.object.size(); i++) {
			if(target == 1) {
				if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
			}else if(target == 2) {			
				if(handler.object.get(i).getId() == ID.Player2) player = handler.object.get(i);
			}else if(target == 3) {			
				if(handler.object.get(i).getId() == ID.Player3) player = handler.object.get(i);
			}else if(target == 4) {			
				if(handler.object.get(i).getId() == ID.Player4) player = handler.object.get(i);
			}
		}
	}
		
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 16, 16);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(x>player.getX())velX=-1;
		else if(x<player.getX())velX=1;
		else if(x==player.getX())velX=0;
		if(y>player.getY())velY=-1;
		else if(y<player.getY())velY=1;
		else if(y==player.getY())velY=0;
//		
//		float diffX = x - player.getX() - 16;
//		float diffY = x - player.getY() - 16;
////		float distance = (float) Math.hypot(x - player.getX(), y - player.getY());
//		float distance = (float) Math.sqrt((diffX*diffX) + (diffY*diffY));
//		
//		velX = ((-1/distance)*diffX);
//		velY = ((-1/distance)*diffY);
//		
//		if(y <= 0 || y >= Game.HEIGHT - 42) velY *= -1;
//		if(x <= 0 || x >= Game.WIDTH - 22) velX *= -1;
//		
//		handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 16, 16, 0.05f, handler))?;
	}

	public void render(Graphics g) {
		
		
		if(target == 1) {
			g.setColor(Color.cyan);
		}
		if(target == 2) {
			Color lightgreen = new Color(0,255, 100);	
			g.setColor(lightgreen);
		}
		if(target == 3) {
			g.setColor(Color.pink);
		}
		if(target == 4) {
			g.setColor(Color.orange);
		}
		g.fillRect((int)x, (int)y, 16, 16);
	}
	
}