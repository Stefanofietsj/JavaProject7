package com.tutorial.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;
	private int target;

	public Player(float x, float y, ID id, Handler handler, int target) {
		super(x, y, id);
		this.handler = handler;		
		this.target = target;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}

	public void tick() {
		x  += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 37);
		y = Game.clamp(y, 0, Game.HEIGHT - 67);
		
		collision();
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.LargeEnemy || tempObject.getId() == ID.FastEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					if(id == ID.Player) {
						HUD.HEALTH -=2;
					}
					if(id == ID.Player2) {
						HUD.HEALTH2 -=2;
					}
					if(id == ID.Player3) {
						HUD.HEALTH3 -=2;
					}
					if(id == ID.Player4) {
						HUD.HEALTH4 -=2;
					}
				}
			}
			
			if(tempObject.getId() == ID.SmartEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					if(id == ID.Player) {
						HUD.HEALTH -=2;
					}
					if(id == ID.Player2) {
						HUD.HEALTH2 -=2;
					}
					if(id == ID.Player3) {
						HUD.HEALTH3 -=2;
					}
					if(id == ID.Player4) {
						HUD.HEALTH4 -=2;
					}
				}
			}
		}
	}

	public void render(Graphics g) {
		if(id == ID.Player) g.setColor(Color.blue);
		if(id == ID.Player2) g.setColor(Color.green);
		if(id == ID.Player3) g.setColor(Color.red);
		else if(id == ID.Player4) g.setColor(Color.yellow);
		g.fillRect((int)x, (int)y, 32, 32);
	}
	

}
