package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	
	public static int HEALTH = 100, HEALTH2 = 100, HEALTH3 = 100, HEALTH4 = 100;
	
	private int score = 0;
	private int level = 1;
	
	public void tick() {
		HEALTH = (int) Game.clamp(HEALTH, 0, 100);
		HEALTH2 = (int) Game.clamp(HEALTH2, 0, 100);
		HEALTH3 = (int) Game.clamp(HEALTH3, 0, 100);
		HEALTH4 = (int) Game.clamp(HEALTH4, 0, 100);
		
		score++;
	}
	
	public void render(Graphics g) {
		g = drawPlayer( g, Color.BLUE, HEALTH, 15, 15 );
		g = drawPlayer( g, Color.GREEN, HEALTH2, 855, 15 );	
		g = drawPlayer( g, Color.RED, HEALTH3, 15, 730 );
		g = drawPlayer( g, Color.YELLOW, HEALTH4, 855, 730 );
		
		g.drawString("score " + score, 520, 28);
		g.drawString("level " + level,520, 48);
	}
	
	public void score(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Graphics drawPlayer( Graphics g, Color color, int HP, int X, int Y ) {
		Graphics a = g;
		g.setColor(Color.gray);
		g.fillRect(X, Y, 200, 32);
		g.setColor(color);
		g.fillRect(X, Y, HP * 2, 32);
		g.setColor(Color.white);
		g.drawRect(X, Y, 200, 32);
		g.drawString(HP + "%", X + 85, Y + 20);
		return a;
		
	}
	
}
