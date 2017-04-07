import javafx.scene.layout.Pane;

public class BlokusBoard extends Pane{
	
	public static int NUM_SQUARES_X = 20;
	public static int NUM_SQUARES_Y = 20;
	public static int START_X = NUM_SQUARES_X/2;
	public static int START_Y = 17;
	public static int SQUARE_SIZE = 30;
	private BlokusSquare[][] squares = new BlokusSquare[NUM_SQUARES_X][NUM_SQUARES_Y];
	
	/**
	 * Set the size of the board to the appropriate height and width.
	 */
	public BlokusBoard(){
		this.setPrefHeight(NUM_SQUARES_X * SQUARE_SIZE);
		this.setPrefWidth(NUM_SQUARES_Y * SQUARE_SIZE);
	}
	
	/**
	 * Check whether the given coordinates are within the boundaries of the board.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return True if if in bounds.
	 */
	public boolean checkBounds(int x, int y){
		return (x >= 0 && y >= 0 && x < NUM_SQUARES_X && y < NUM_SQUARES_Y);
	}
	
	/**
	 * Check whether the given coordinates already have a BlokusSquare in them.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return True if if in no piece at this location.
	 */
	public boolean checkLocation(int x, int y){
		return (checkBounds(x, y) && squares[x][y] == null);
	}
	
	/**
	 * Permanently add a square to the board.
	 * @param square The square to be added.
	 */
	public void addSquare(BlokusSquare square){
		squares[square.getX()][square.getY()] = square;
	}
	
	//for testing only
	public void removeSquare(BlokusSquare square){
		squares[square.getX()][square.getY()] = null;
	}
}
