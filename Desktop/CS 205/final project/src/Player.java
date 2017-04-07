import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Player {
	protected BlokusBoard board;
	protected Inventory inventory1;
	protected Inventory inventory2;
	protected Color color1;
	protected Color color2;
	protected ArrayList<BlokusPiece>collection1 = new ArrayList<BlokusPiece>();
	protected ArrayList<BlokusPiece>collection2 = new ArrayList<BlokusPiece>();
	private int index1 = 0;
	private int index2 = 0;
	private BlokusPiece activePiece;
	private BlokusGame game;
	public Player(BlokusGame game, BlokusBoard board, Inventory inventory1, Inventory inventory2){
		this.game = game;
		this.board = board;
		this.inventory1 = inventory1;
		this.inventory2 = inventory2;
		this.color1 = inventory1.getColor();
		this.color2 = inventory2.getColor();
		initCollections();
		activePiece = collection1.get(0);
	}
	public void initCollections(){
		collection1.add(new OneSquare(board, color1));
		collection1.add(new FourSquare(board, color1));
		collection1.add(new FiveFunky(board, color1));
		collection1.add(new FiveCross(board, color1));
		collection1.add(new FiveSnake(board, color1));
	}
	
	public BlokusPiece getActivePiece(){
		return activePiece;
	}
	
	/*
	 * Place the piece on the board, and fetch the next piece to be placed from
	 * the Player's collection. This is going to look very different after we 
	 * introduce multiple players, but for now we can use it for testing.
	 */
	public void placePiece(){
		if (activePiece != null && activePiece.place()){
			collection1.remove(activePiece);
			if (collection1.size() > 0){
				if (index1 == collection1.size()){
					index1 = 0;
				}
				activePiece = collection1.get(index1);
				activePiece.show();
				game.setCurrentPiece(activePiece);
				activePiece.moveToLocation(BlokusBoard.START_X, BlokusBoard.START_Y);
			}
			else{
				System.exit(0);
				activePiece = null;
				game.setCurrentPiece(null);
			}
		}
		else if(collection1.size() == 0){
			System.out.println("No more pieces.");
		}
	}
	
	/**
	 * Gets the next piece from the player's collection.
	 */
	public void nextPiece(){
		index1++;
		if (index1 > collection1.size() - 1){
			index1 = 0;
		}
		int x = activePiece.getOriginX();
		int y = activePiece.getOriginY();
		activePiece.hide();
		activePiece = collection1.get(index1);
		game.setCurrentPiece(activePiece);
		activePiece.moveToLocation(x, y);
		activePiece.show();
	}
	
	/**
	 * Gets the previous piece from the player's collection.
	 */
	public void previousPiece(){
		index1--;
		if (index1 < 0){
			index1 = collection1.size() - 1;
		}
		int x = activePiece.getOriginX();
		int y = activePiece.getOriginY();
		activePiece.hide();
		activePiece = collection1.get(index1);
		game.setCurrentPiece(activePiece);
		activePiece.moveToLocation(x, y);
		activePiece.show();
	}
}
