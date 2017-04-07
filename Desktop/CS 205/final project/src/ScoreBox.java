import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ScoreBox extends Pane{
	private Rectangle bg;
	private Text[] texts;
	public ScoreBox(int numPlayers){
		init(numPlayers);
		this.setPrefHeight(Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE);
		this.setPrefWidth(Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE);
		this.setTranslateY(BlokusBoard.NUM_SQUARES_Y * BlokusBoard.SQUARE_SIZE);
		bg = new Rectangle(Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE, 
				Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE);
		bg.setFill(Color.ORANGE);
		VBox box = new VBox(5);
		box.getChildren().addAll(texts);
		this.getChildren().addAll(bg, box);
	}
	public void init(int numPlayers){
		texts = new Text[numPlayers];
		for (int i = 0; i < numPlayers; i++){
			texts[i] = new Text("0");
		}
	}
	
	public void setScore(int index, int score){
		texts[index].setText(""+score);
	}
	
}
