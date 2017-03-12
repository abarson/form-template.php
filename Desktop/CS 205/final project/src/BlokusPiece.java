import javafx.scene.paint.Color;


/**
 * Example for how pieces can be made efficiently.
 * Each piece sets its own relatives, whether it can rotate,
 * and the amount of squares it has. Let the origin always be the
 * first BlokusSquare in pieces (indicated by relative values being 0).
 * @author adambarson
 *
 */
class Square extends BlokusPiece{
	
		public Square(BlokusBoard board) {
			super(board, 4);
			rotatePiece = false;
			relativeX = new int[4];
			relativeY = new int[4];
			setRelatives();
		}
		
		public void setRelatives(){
			relativeX[0] = 0;
			relativeY[0] = 0;
			relativeX[1] = 1;
			relativeY[1] = 0;
			relativeX[2] = 1;
			relativeY[2] = -1;
			relativeX[3] = 0;
			relativeY[3] = -1;
		}
		
	}
/**
 * BlokusPiece, an abstract class for pieces. Contains functionality
 * for moving and rotating pieces.
 * @author adambarson
 *
 */
public abstract class BlokusPiece {
	protected BlokusSquare[] pieces; //The BlokusSquare's that comprise a piece
	protected int[] relativeX;
	protected int[] relativeY;
	protected BlokusBoard board;
	protected boolean rotatePiece; //If the piece can be rotated
	
	/**
	 * Constructor for BlokusPiece takes a BlokusBoard argument
	 * @param board
	 */
	public BlokusPiece(BlokusBoard board, int numSquares){
		this.board = board;
		pieces = new BlokusSquare[numSquares];
		for (int i = 0; i < numSquares; i++){
			pieces[i] = new BlokusSquare(board);
			pieces[i].setColor(Color.RED); //for testing
		}
		pieces[0].setColor(Color.BLACK); //for testing. This is origin point
	}
	
	/**
	 * Every subclass must override this.
	 */
	public abstract void setRelatives();
	
	/**
	 * Move all squares of the piece in terms of the relative locations.
	 * @param x The desired x-coordinate of origin
	 * @param y The desired y-coordinate of origin
	 */
	public void moveToLocation(int x, int y){
		for (int i = 0; i < pieces.length; i++){
			pieces[i].setLocation(x + relativeX[i], y + relativeY[i]);
		}
	}
	
	/**
	 * If the piece can be rotated (i.e., is not a square)
	 * @return Whether or not the piece is one that can be rotated.
	 */
	public boolean isRotatePiece(){
		return rotatePiece;
	}
	
	/*
	 * We need all move methods, as well as rotateLeft and rotateRight (w, e)
	 */
	public void moveRight(){
		
	}
	
	//continue...
	
	
}
