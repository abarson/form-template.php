import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlokusApplication extends Application{

	private BlokusBoard board = new BlokusBoard();
	private Scene scene;
	private BlokusGame game;
	@Override
	public void start(Stage primaryStage) throws Exception {
		int[]verticalDock = {BlokusBoard.SQUARE_SIZE * BlokusBoard.NUM_SQUARES_X,
				Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE};
		int[]horizontalDock = {Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE,
				BlokusBoard.SQUARE_SIZE * BlokusBoard.NUM_SQUARES_Y};
		Inventory inv1 = new Inventory(
				verticalDock[0],
				verticalDock[1],
				Color.GREEN
				);
		Inventory inv2 = new Inventory(
				horizontalDock[0],
				horizontalDock[1],
				Color.BLUE
				);
		inv2.setX(Inventory.INVENTORY_SIZE * BlokusBoard.SQUARE_SIZE);
		inv2.setY(BlokusBoard.SQUARE_SIZE * BlokusBoard.NUM_SQUARES_Y);
		
		createGrid();
	
		ScoreBox score = new ScoreBox(2);
		Group group = new Group(inv1, board, inv2, score);
		scene = new Scene(group);
		
		
		Stage stage = primaryStage;
		stage.setScene(scene);
		stage.show();
		
		setUpKeyPresses();
		game = new BlokusGame(board, new Inventory[]{inv1, inv2});
		game.play();
	}
	
	/**
	 * Creates a base layer of blank tiles for the board
	 */
	public void createGrid(){
		for (int i = 0; i < BlokusBoard.NUM_SQUARES_X; i++){
			for (int j = 0; j < BlokusBoard.NUM_SQUARES_Y; j++){
				BlokusSquare square = new BlokusSquare(board);
				square.addToBoard();
				square.setLocation(i, j);
			}
		}
	}
	
	public void setUpKeyPresses(){
		scene.setOnKeyPressed(e -> {
			switch(e.getCode()){
			case LEFT:
				game.left();
				break;
			case RIGHT:
				game.right();
				break;
			case UP:
				game.up();
				break;
			case DOWN:
				game.down();
				break;
			case W:
				game.w();
				break;
			case E:
				game.e();
				break;
			case ENTER:
				game.enter();
				break;
			case M:
				game.m();
				break;
			case S:
				game.next();
				break;
			case A:
				game.previous();
				break;
			default:
				break;
			}
		});
	}
	public static void main(String [] args){
		Application.launch(args);
	}

}
