package application;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public class Controller1 {
	public static final int MOVE = Main.MOVE;
	public static final int SIZE = Main.SIZE;
	public static int XMAX = Main.XMAX;
	public static int YMAX = Main.YMAX;
	
	public static Form1 displayRect() {
		int block = Controller.block();
		String name;
		Rectangle a = new Rectangle(SIZE-1, SIZE-1), b = new Rectangle(SIZE-1, SIZE-1), c = new Rectangle(SIZE-1, SIZE-1),
				d = new Rectangle(SIZE-1, SIZE-1);
		if (block < 15) { 
            a.setX(XMAX +75);
            a.setY(200);
            b.setX(XMAX +75);
            b.setY(225);
            c.setX(XMAX +75);
            c.setY(250);
            d.setX(XMAX +50);
            d.setY(250);
            name = "j";
        } else if (block < 30) { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +50);
            b.setY(225);
            c.setX(XMAX +50);
            c.setY(250);
            d.setX(XMAX +75);
            d.setY(250);
            name = "l";
        } else if (block < 45) { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +50);
            b.setY(225);
            c.setX(XMAX +75);
            c.setY(200);
            d.setX(XMAX +75);
            d.setY(225);
            name = "o";
        } else if (block < 60) { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +75);
            b.setY(200);
            c.setX(XMAX +50);
            c.setY(225);
            d.setX(XMAX +25);
            d.setY(225);
            name = "s";
        } else if (block < 75) { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +75);
            b.setY(200);
            c.setX(XMAX +25);
            c.setY(200);
            d.setX(XMAX +50);
            d.setY(175);
            name = "t";
        } else if (block < 90) { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +75);
            b.setY(225);
            c.setX(XMAX +25);
            c.setY(200);
            d.setX(XMAX +50);
            d.setY(225);
            name = "z";
        } else { 
            a.setX(XMAX +50);
            a.setY(200);
            b.setX(XMAX +50);
            b.setY(225);
            c.setX(XMAX +50);
            c.setY(250);
            d.setX(XMAX +50);
            d.setY(175);
            name = "i";
        }		return new Form1(a, b, c, d, name);
}
}
