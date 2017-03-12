import javafx.application.Application;
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
		scene = new Scene(board);
		createGrid();
		
		Stage stage = primaryStage;
		stage.setScene(scene);
		stage.show();
		
		setUpKeyPresses();
		game = new BlokusGame(board);
		game.play();
	}
	
	/**
	 * Creates a base layer of blank tiles for the board
	 */
	public void createGrid(){
		for (int i = 0; i < BlokusBoard.NUM_SQUARES_X; i++){
			for (int j = 0; j < BlokusBoard.NUM_SQUARES_Y; j++){
				BlokusSquare square = new BlokusSquare(board);
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
			default:
				break;
			}
		});
	}
	public static void main(String [] args){
		Application.launch(args);
	}

}
