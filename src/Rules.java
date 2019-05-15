import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JFrame ;
public class Rules extends Canvas {
	public void paint(Graphics g) {
		g.setColor(Color.black);
		
		g.drawRect(10, 10, 500, 50);
		
		g.drawRect(10, 70 , 500, 50);
		
		g.drawRect(10, 130 , 500, 50);
		
		g.drawRect(10, 190 , 500, 50);
		
		g.drawRect(10, 250 , 500, 50);
		
		g.drawRect(10,310, 500, 50);
		
		g.drawString("1",55 , 25);
		g.drawString("Narrators clues can only contain one word and one number.", 15, 35) ;
		
		g.drawString("2",55 , 85);
		g.drawString("Narrators can't say part of a compound  word on the table.", 15, 105) ;
		
		
		g.drawString("3",55 , 145);
		g.drawString("Narrators can't say any form  of a visible word on the table.", 15, 165) ;
	
		g.drawString("4",55 , 205);
		g.drawString("If your team run out of time, you have to change the timer to other team.", 15, 225) ;
		
		g.drawString("5",55 , 265);
		g.drawString("Only narrators can put the cards on the table.", 15, 285) ;
		
		g.drawString("6",55 , 325);
		g.drawString("Narrators can only put the card on a table if listeners write a word with \"-\" (-horse).", 15 , 345);
		
		
	}
}

