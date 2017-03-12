import javafx.scene.paint.Color;

public class BlokusGame {
	
	private BlokusBoard board;
	private BlokusPiece piece;
	public BlokusGame(BlokusBoard board){
		this.board = board;
	}
	
	public void play(){
		piece = new Square(board);
		piece.moveToLocation(2, 2);
		
		//test other pieces here
	}
	
	public void left(){
		System.out.println("Left");
	}
	public void right(){
		System.out.println("Right");
	}
	public void up(){
		System.out.println("Up");
	}
	public void down(){
		System.out.println("Down");
	}
	public void w(){
		System.out.println("w");
	}
	public void e(){
		System.out.println("e");
	}
}
