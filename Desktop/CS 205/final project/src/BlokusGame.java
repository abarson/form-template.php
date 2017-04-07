import javafx.scene.paint.Color;

public class BlokusGame {
	
	public static int NUM_PIECES = 21;
	private BlokusBoard board;
	private Player player;
	private BlokusPiece currentPiece;
	private BlokusPiece test_piece1;
	private BlokusPiece test_piece2;
	private BlokusPiece test_piece3;
	public BlokusGame(BlokusBoard board, Inventory[]inventoryList){
		this.board = board;
		player = new Player(this, board, inventoryList[0], inventoryList[1]);
		currentPiece = player.getActivePiece();
		currentPiece.show();
	}
	
	
	//currently entire function is for testing
	public void play(){
		test_piece1 = new FiveZigzag(board, Color.GREENYELLOW);
		test_piece1.moveToLocation(5, 5);
		test_piece1.show();
		test_piece1.place();
		
		test_piece2 = new FiveSnake(board, Color.GREEN);
		test_piece2.moveToLocation(10, 5);
		test_piece2.show();
		test_piece2.place();
		
		
		
		//test other pieces here
	}
	
	public void next(){
		player.nextPiece();
	}
	
	public void previous(){
		player.previousPiece();
	}
	
	public void setCurrentPiece(BlokusPiece piece){
		currentPiece = piece;
	}
	
	//place a piece here
	public void enter(){
		player.placePiece();
	}
	
	//for testing only. pieces cant really be unplaced
	public void m(){
		currentPiece.unBlur();
	}
	
	public void left(){
		currentPiece.moveLeft();
	}
	public void right(){
		currentPiece.moveRight();
	}
	public void up(){
		currentPiece.moveUp();
	}
	public void down(){
		currentPiece.moveDown();
	}
	public void w(){
		currentPiece.rotateLeft();
	}
	public void e(){
		currentPiece.rotateRight();
	}
}
