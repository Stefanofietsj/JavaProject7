package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	private boolean[] keyDown = new boolean[16];
	
	public KeyInput(Handler handler) {
		this.handler = handler;
		
		keyDown[0] = false;
		keyDown[1] = false;
		keyDown[2] = false;
		keyDown[3] = false;
		keyDown[4] = false;
		keyDown[5] = false;
		keyDown[6] = false;
		keyDown[7] = false;
		keyDown[8] = false;
		keyDown[9] = false;
		keyDown[10] = false;
		keyDown[11] = false;
		keyDown[12] = false;
		keyDown[13] = false;
		keyDown[14] = false;
		keyDown[15] = false;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//keyevents player 1
				if(key == KeyEvent.VK_W) { tempObject.setVelY(-5); keyDown[0]=true; }
				if(key == KeyEvent.VK_S) { tempObject.setVelY(5); keyDown[1]=true; }
				if(key == KeyEvent.VK_A) { tempObject.setVelX(-5); keyDown[2]=true; }
				if(key == KeyEvent.VK_D) { tempObject.setVelX(5); keyDown[3]=true; }
			}
			if(tempObject.getId() == ID.Player2) {
				//keyevents player 2
				if(key == KeyEvent.VK_UP) { tempObject.setVelY(-5); keyDown[4]=true; }
				if(key == KeyEvent.VK_DOWN) { tempObject.setVelY(5); keyDown[5]=true; }
				if(key == KeyEvent.VK_LEFT) { tempObject.setVelX(-5); keyDown[6]=true; }
				if(key == KeyEvent.VK_RIGHT) { tempObject.setVelX(5); keyDown[7]=true; }
			}
			
			if(tempObject.getId() == ID.Player3) {
				//keyevents player 3
				if(key == KeyEvent.VK_U) { tempObject.setVelY(-5); keyDown[8]=true; }
				if(key == KeyEvent.VK_J) { tempObject.setVelY(5); keyDown[9]=true; }
				if(key == KeyEvent.VK_H) { tempObject.setVelX(-5); keyDown[10]=true; }
				if(key == KeyEvent.VK_K) { tempObject.setVelX(5); keyDown[11]=true; }
			}
			
			if(tempObject.getId() == ID.Player4) {
				//keyevents player 4
				if(key == KeyEvent.VK_NUMPAD5) { tempObject.setVelY(-5); keyDown[12]=true; }
				if(key == KeyEvent.VK_NUMPAD2) { tempObject.setVelY(5); keyDown[13]=true; }
				if(key == KeyEvent.VK_NUMPAD1) { tempObject.setVelX(-5); keyDown[14]=true; }
				if(key == KeyEvent.VK_NUMPAD3) { tempObject.setVelX(5); keyDown[15]=true; }
			}
		}
		
		if(key == KeyEvent.VK_ESCAPE) System.exit(1);
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				if(key == KeyEvent.VK_W) keyDown[0]=false;
				if(key == KeyEvent.VK_S) keyDown[1]=false;
				if(key == KeyEvent.VK_A) keyDown[2]=false;
				if(key == KeyEvent.VK_D) keyDown[3]=false;

				//vertical movement
				if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				
				//horizontal movement
				if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
			}
			if(tempObject.getId() == ID.Player2) {
				if(key == KeyEvent.VK_UP) keyDown[4]=false;
				if(key == KeyEvent.VK_DOWN) keyDown[5]=false;
				if(key == KeyEvent.VK_LEFT) keyDown[6]=false;
				if(key == KeyEvent.VK_RIGHT) keyDown[7]=false;
				
				//vertical movement
				if(!keyDown[4] && !keyDown[5]) tempObject.setVelY(0);
				
				//horizontal movement
				if(!keyDown[6] && !keyDown[7]) tempObject.setVelX(0);
			}
			if(tempObject.getId() == ID.Player3) {
				if(key == KeyEvent.VK_U) keyDown[8]=false;
				if(key == KeyEvent.VK_J) keyDown[9]=false;
				if(key == KeyEvent.VK_H) keyDown[10]=false;
				if(key == KeyEvent.VK_K) keyDown[11]=false;
				
				//vertical movement
				if(!keyDown[8] && !keyDown[9]) tempObject.setVelY(0);
				
				//horizontal movement
				if(!keyDown[10] && !keyDown[11]) tempObject.setVelX(0);
			}
			
			if(tempObject.getId() == ID.Player4) {
				if(key == KeyEvent.VK_NUMPAD5) keyDown[12]=false;
				if(key == KeyEvent.VK_NUMPAD2) keyDown[13]=false;
				if(key == KeyEvent.VK_NUMPAD1) keyDown[14]=false;
				if(key == KeyEvent.VK_NUMPAD3) keyDown[15]=false;
				
				//vertical movement
				if(!keyDown[12] && !keyDown[13]) tempObject.setVelY(0);
				
				//horizontal movement
				if(!keyDown[14] && !keyDown[15]) tempObject.setVelX(0);
			}
		}
		
	}
	
}
