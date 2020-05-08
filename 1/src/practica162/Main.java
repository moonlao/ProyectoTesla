package practica162;
import processing.core.PApplet;

public class Main extends PApplet{

	
	
	
	public static void main(String[] args) {
		PApplet.main("practica162.Main");
		// TODO Auto-generated method stub
		}
		
	
	public void settings() {
		size(600,400);
		
		
	}
	
	
	
	public void draw() {
		
		int row;
		int col;
		int x,y;
		
		for (row=0; row <30; row++) {
			for (col=0; col <30; col++) {
				x = col *20;
				y = row *20;
				if ((row%2)==(col%2))
					fill(0);
				else
					fill(155);
				rect(x,y,20,20);
				}
			}

		}	
	}


