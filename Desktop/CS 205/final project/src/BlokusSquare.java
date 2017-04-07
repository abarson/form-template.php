import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BlokusSquare{
	
	private IntegerProperty x_comp = new SimpleIntegerProperty();
	private IntegerProperty y_comp = new SimpleIntegerProperty();
	private Rectangle shape = new Rectangle(0, 0, BlokusBoard.SQUARE_SIZE, BlokusBoard.SQUARE_SIZE);
	private BlokusBoard board;
	public BlokusSquare(BlokusBoard board){
		this.board = board;
		shape.setFill(Color.WHITE);
		shape.setStroke(Color.BLACK);
		shape.xProperty().bind((x_comp.add(Inventory.INVENTORY_SIZE).multiply(BlokusBoard.SQUARE_SIZE)));
		shape.yProperty().bind(y_comp.multiply(BlokusBoard.SQUARE_SIZE));
		//this.board.getChildren().add(shape);
	}
	
	public void addToBoard(){
		board.getChildren().add(shape);
	}
	
	public void removeFromBoard(){
		board.getChildren().remove(shape);
	}
	
	public int getX(){
		return x_comp.get();
	}
	public int getY(){
		return y_comp.get();
	}
	
	public void setColor(Color color){
		shape.setFill(color);
	}
	
	public void setStroke(Color color){
		shape.setStroke(color);
		//shape.setStrokeWidth(5);
		
	}
	
	public void blurSquare(){
		shape.setStroke(Color.BEIGE);
		shape.setOpacity(0.6);
		shape.setEffect(new GaussianBlur(3.5));
	}
	
	public void unBlurSquare(){
		shape.setStroke(Color.BLACK);
		shape.setOpacity(1);
		shape.setEffect(null);
	}
	
	public void setLocation(int x, int y){
		x_comp.set(x);
		y_comp.set(y);
	}
	
}
