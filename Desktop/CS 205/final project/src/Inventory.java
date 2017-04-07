import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Inventory extends Pane{
	public static int INVENTORY_SIZE = 5;
	
	protected ArrayList<BlokusPiece> remainingPieces = new ArrayList<BlokusPiece>();
	private Rectangle bg;
	private Color color;
	public Inventory(int height, int width, Color color){
		setHeight(height);
		setWidth(width);
		this.color = color;
		createBackground(height, width);
	}
	
	public void fillInventory(){
		
	}
	
	public Color getColor(){
		return color;
	}
	
	public void createBackground(int height, int width){
		bg = new Rectangle(width + 1, height);
		bg.setFill(color);
		this.getChildren().add(bg);
	}
	
	public void setX(int x){
		this.setTranslateX(x);
	}
	
	public void setY(int y){
		this.setTranslateY(y);
	}
	
}
