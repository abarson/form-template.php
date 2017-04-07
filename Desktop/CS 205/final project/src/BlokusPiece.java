import javafx.scene.paint.Color;
/**
 * Example for how pieces can be made efficiently.
 * Each piece sets its own relatives, whether it can rotate,
 * and the amount of squares it has. Let the origin always be the
 * first BlokusSquare in pieces (indicated by relative values being 0).
 * @author adambarson
 *
 */
class OneSquare extends BlokusPiece{

	public OneSquare(BlokusBoard board, Color color) {
		 super(board, 1, color);
         rotatePiece = false;
      }
      
	public void setRelatives(){
         relativeX[0] = 0;
         relativeY[0] = 0;
      }
   }

class TwoLine extends BlokusPiece{
	
	public TwoLine(BlokusBoard board, Color color) {
		super(board, 2, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
	}
	
}

class ThreeLine extends BlokusPiece{
	
	public ThreeLine(BlokusBoard board, Color color) {
		super(board, 3, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = 0;
		relativeY[2] = 1;
	}
	
}

class ThreeCorner extends BlokusPiece{
	
	public ThreeCorner(BlokusBoard board, Color color) {
		super(board, 3, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = 1;
		relativeY[2] = 0;
	}
	
}
class FourLine extends BlokusPiece{
	
	public FourLine(BlokusBoard board, Color color) {
		super(board, 4, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = 1;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = -2;
	}
	
}

class FourL extends BlokusPiece{
	
	public FourL(BlokusBoard board, Color color) {
		super(board, 4, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = -2;
	}
	
}

class FourSquare extends BlokusPiece{
	
	public FourSquare(BlokusBoard board, Color color) {
		super(board, 4, color);
		rotatePiece = false;
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

class FourT extends BlokusPiece{
	
	public FourT(BlokusBoard board, Color color) {
		super(board, 4, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
	}
	
}

class FourZ extends BlokusPiece{
	
	public FourZ(BlokusBoard board, Color color) {
		super(board, 4, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = -1;
		relativeY[3] = -1;
	}
	
}

class FiveLine extends BlokusPiece{
	
	public FiveLine(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = 0;
		relativeY[2] = -2;
		relativeX[3] = 0;
		relativeY[3] = 1;
		relativeX[4] = 0;
		relativeY[4] = 2;
	}
	
}

class FiveC extends BlokusPiece{
	
	public FiveC(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = 1;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = 1;
		relativeX[4] = 1;
		relativeY[4] = 1;
	}
	
}

class FiveL extends BlokusPiece{
	
	public FiveL(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = -2;
		relativeX[4] = 0;
		relativeY[4] = -3;
	}
	
}


class FiveZ extends BlokusPiece{
	
	public FiveZ(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = -1;
		relativeY[2] = 1;
		relativeX[3] = 0;
		relativeY[3] = -1;
		relativeX[4] = 0;
		relativeY[4] = -2;
	}
	
}

class FiveTailedSquare extends BlokusPiece{
	
	public FiveTailedSquare(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = -1;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = -1;
		relativeX[4] = 0;
		relativeY[4] = -2;
	}
	
}

class FiveY extends BlokusPiece{
	
	public FiveY(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 2;
		relativeY[4] = 0;
	}
	
}

class FiveT extends BlokusPiece{
	
	public FiveT(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 0;
		relativeY[3] = -2;
		relativeX[4] = 1;
		relativeY[4] = 0;
	}
	
}

class FiveCorner extends BlokusPiece{
	
	public FiveCorner(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = 0;
		relativeY[2] = -2;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 2;
		relativeY[4] = 0;
	}
	
}

class FiveZigzag extends BlokusPiece{
	
	public FiveZigzag(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = 0;
		relativeY[1] = -1;
		relativeX[2] = -1;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 1;
		relativeY[4] = 1;
	}
	
}

class FiveSnake extends BlokusPiece{
	
	public FiveSnake(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = -1;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 1;
		relativeY[4] = 1;
	}
	
}

class FiveCross extends BlokusPiece{
	
	public FiveCross(BlokusBoard board, Color color) {
		super(board, 5, color);
		
		//was true, switched by ramy. a cross is the same when rotated
		rotatePiece = false;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = 0;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 0;
		relativeY[4] = 1;
	}
	
}

class FiveFunky extends BlokusPiece{
	
	public FiveFunky(BlokusBoard board, Color color) {
		super(board, 5, color);
		rotatePiece = true;
	}
	
	public void setRelatives(){
		relativeX[0] = 0;
		relativeY[0] = 0;
		relativeX[1] = -1;
		relativeY[1] = 0;
		relativeX[2] = -1;
		relativeY[2] = -1;
		relativeX[3] = 1;
		relativeY[3] = 0;
		relativeX[4] = 0;
		relativeY[4] = 1;
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
	private Color color;
	public static int ORIGIN = 0;
	
	/**
	 * Constructor for BlokusPiece takes a BlokusBoard argument
	 * @param board
	 */
	public BlokusPiece(BlokusBoard board, int numSquares, Color color){
		this.board = board;
		this.color = color;
		pieces = new BlokusSquare[numSquares];
		for (int i = 0; i < numSquares; i++){
			pieces[i] = new BlokusSquare(board);
			pieces[i].setColor(color); //for testing
			pieces[i].setStroke(Color.BLACK);
		}
		relativeX = new int[numSquares];
		relativeY = new int[numSquares];
		setRelatives();
		moveToLocation(BlokusBoard.START_X, BlokusBoard.START_Y);
		pieces[ORIGIN].setColor(Color.BLACK); //for testing. This is origin point
	}
	
	/**
	 * Set the relative values (and the shape) of the squares of the piece.
	 */
	public abstract void setRelatives();
	
	/**
	 * Move all squares of the piece in terms of the origin and relative coordinates.
	 * @param x The desired x-coordinate of origin
	 * @param y The desired y-coordinate of origin
	 * @return If the move was successful
	 */
	public boolean moveToLocation(int x, int y){
		
		/* If moving to this location would land any square out of bounds, 
		 * immediately return false out of the method.
		 */
		for (int i = 0; i < pieces.length; i++){
			if (!board.checkBounds(x + relativeX[i], y + relativeY[i])){
				return false;
			}
		}
		
		/* If we reach this point, the move is valid. */
		for (int i = 0; i < pieces.length; i++) {
			pieces[i].setLocation(x + relativeX[i], y + relativeY[i]);
		}
		return true;
	}
	
	/**
	 * Get the x-coordinate of the origin.
	 * @return x-coordinate of origin.
	 */
	public int getOriginX(){
		return pieces[ORIGIN].getX();
	}
	
	/**
	 * Get the y-coordinate of the origin.
	 * @return y-coordinate of origin
	 */
	public int getOriginY(){
		return pieces[ORIGIN].getY();
	}
	
	/**
	 * Removes the piece from the board.
	 */
	public void hide(){
		for (int i = 0; i < pieces.length; i++){
			pieces[i].removeFromBoard();
		}
	}
	
	/**
	 * Reveals the piece on the board.
	 */
	public void show(){
		for (int i = 0; i < pieces.length; i++){
			pieces[i].addToBoard();
		} 
	}
	
	/**
	 * If the piece can be rotated (i.e., is not a square)
	 * @return Whether or not the piece is one that can be rotated.
	 */
	public boolean isRotatePiece(){
		return rotatePiece;
	}
	
	/**
	 * Swap the relative coordinates of the piece for left rotation.
	 */
	public void swapRelativesLeft(){
		for (int i = 0; i < pieces.length; i++){
			int temp = relativeX[i];
			relativeX[i] = relativeY[i];
			relativeY[i] = -temp;
		}
	}
	
	/**
	 * Swap the relative coordinates of the piece for right rotation.
	 */
	public void swapRelativesRight(){
		for (int i = 0; i < pieces.length; i++){
			int temp = relativeX[i];
			relativeX[i] = -relativeY[i];
			relativeY[i] = temp;
		}
	}
	
	/**
	 * Attempts rotate the piece left. If the rotation would land the piece out of bounds,
	 * reset relative coordinates.
	 */
	public void rotateLeft(){
		if (rotatePiece){
			swapRelativesLeft();
			
			/* If the piece would land out of bounds using the new relative coordinates,
			 * reset the relative coordinates.
			 */
			if (!moveToLocation(pieces[ORIGIN].getX(), pieces[ORIGIN].getY())){
				swapRelativesRight();
			}
		}
	}
	
	/**
	 * Attempts rotate the piece right. If the rotation would land the piece out of bounds,
	 * reset relative coordinates.
	 */
	public void rotateRight(){
		if (rotatePiece){
			swapRelativesRight();
			
			/* If the piece would land out of bounds using the new relative coordinates,
			 * reset the relative coordinates.
			 */
			if (!moveToLocation(pieces[ORIGIN].getX(), pieces[ORIGIN].getY())){
				swapRelativesLeft();
			}
		}
	}
	
	/**
	 * Checks to see if of for any of the squares of the piece, there is exists
	 * a different piece of the same color located diagonally to this one.
	 * Used to check if piece can be placed.
	 * @return Whether or not there is a different piece of same color diagonal to this one.
	 */
	public boolean hasDiagonal(){
		return true;
	}
	
	/**
	 * Checks to see if of for any of the squares of the piece, there is exists
	 * a different piece of the same color located adjacent to this one.
	 * Used to check if piece can be placed.
	 * @return Whether or not there is a different piece of same color adjacent to this one.
	 */
	public boolean hasAdjacent(){
		return false;
	}
	
	/**
	 * Attempts to place the piece.
	 * @return Whether the piece was successfully placed.
	 */
	public boolean place(){
		for (int i = 0; i < pieces.length; i++){
			int x = pieces[i].getX();
			int y = pieces[i].getY();
			if (!board.checkLocation(x, y) || !hasDiagonal()  || hasAdjacent()){
				System.out.println("Can't place!");
				return false;
				
			}
			
		}
		for (int i = 0; i < pieces.length; i++){
			board.addSquare(pieces[i]);
		}
		return true;
	}
	
	/**
	 * Blurs the piece.
	 */
	public void blur(){
		for (int i = 0; i < pieces.length; i++){
			pieces[i].blurSquare();
		}
	}
	
	/**
	 * Makes the piece clear.
	 */
	public void unBlur(){
		for (int i = 0; i < pieces.length; i++){
			pieces[i].unBlurSquare();
		}
	}
	
	/**
	 * Move the piece right.
	 */
	public void moveRight(){
		moveToLocation(pieces[ORIGIN].getX() + 1, pieces[ORIGIN].getY());
	}
	
	/**
	 * Move the piece up.
	 */
	public void moveUp(){
		moveToLocation(pieces[ORIGIN].getX(), pieces[ORIGIN].getY() - 1);
	}
	
	/**
	 * Move the piece left.
	 */
	public void moveLeft(){
		moveToLocation(pieces[ORIGIN].getX() - 1, pieces[ORIGIN].getY());
	}
	
	/**
	 * Move the piece down.
	 */
	public void moveDown(){
		moveToLocation(pieces[ORIGIN].getX(), pieces[ORIGIN].getY() + 1);
	}
	
}
