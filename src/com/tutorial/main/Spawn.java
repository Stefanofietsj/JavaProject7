package com.tutorial.main;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	
	public Spawn (Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 500) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			if(hud.getLevel() == 2) {
				//basic
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 3) {
				//basic
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				//smart
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 1));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 2));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 3));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 4));
			}else if(hud.getLevel() == 4) {
				//basic
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 5) {
				//fast
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 6) {
				//large
				handler.addObject(new LargeEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.LargeEnemy, handler));
			}else if(hud.getLevel() == 10) {
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();//yoo
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2 - 50), -140, ID.EnemyBoss, handler));
				
			}else if(hud.getLevel() == 11) {
				handler.clearEnemys();
				//basic
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				//smart
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 1));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 2));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 3));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, 4));
			}else if(hud.getLevel() == 12) {
				//fast
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 13) {
				//basic
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				//large
				handler.addObject(new LargeEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.LargeEnemy, handler));
			}else if(hud.getLevel() == 14) {
				//fast
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 15) {
				//large
				handler.addObject(new LargeEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.LargeEnemy, handler));
			}else if(hud.getLevel() == 20) {
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.clearEnemys();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2 - 50), -140, ID.EnemyBoss, handler));
				handler.addObject(new EnemyBoss((Game.WIDTH / 2 - 50), -140, ID.EnemyBoss, handler));
				
			}
			
		}
	}

}
