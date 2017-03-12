import javafx.scene.layout.Pane;

public class BlokusBoard extends Pane{
	
	public static int NUM_SQUARES_X = 20;
	public static int NUM_SQUARES_Y = 20;
	public static int SQUARE_SIZE = 40;
	private BlokusSquare[][]squares = new BlokusSquare[NUM_SQUARES_X][NUM_SQUARES_Y];
	
	public BlokusBoard(){
		this.setPrefHeight(NUM_SQUARES_X * SQUARE_SIZE);
		this.setPrefWidth(NUM_SQUARES_Y * SQUARE_SIZE);
	}
	
	public void addSquare(BlokusSquare square, int x, int y){
		squares[x][y] = square;
	}
}
