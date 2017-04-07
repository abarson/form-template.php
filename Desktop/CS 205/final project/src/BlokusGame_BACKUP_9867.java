import javafx.scene.paint.Color;

public class BlokusGame {
	
	private BlokusBoard board;
	private BlokusPiece test_piece1;
	private BlokusPiece test_piece2;
	public BlokusGame(BlokusBoard board){
		this.board = board;
	}
	
	public void play(){
<<<<<<< HEAD
		test_piece1 = new FourSquare(board);
		test_piece1.moveToLocation(2, 2);
		
		test_piece2 = new FiveCross(board);
=======
		test_piece1 = new fourSquare(board);
		test_piece1.moveToLocation(2, 2);
		
		test_piece2 = new fiveC(board);
>>>>>>> d3936c335944904ebf9ddbb2c604a1825d03fd31
		test_piece2.moveToLocation(6, 2);
		
		//test other pieces here
	}
	
	public void enter(){
		test_piece2.blur();
	}
	
	public void m(){
		test_piece2.unBlur();
	}
	
	public void left(){
		test_piece2.moveLeft();
	}
	public void right(){
		test_piece2.moveRight();
	}
	public void up(){
		System.out.println("Up");
	}
	public void down(){
		test_piece2.moveDown();
	}
	public void w(){
		test_piece2.rotateLeft();
	}
	public void e(){
		test_piece2.rotateRight();
	}
}
