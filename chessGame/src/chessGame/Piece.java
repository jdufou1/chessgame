package chessGame;

import java.util.ArrayList;

public abstract class Piece {

	public abstract ArrayList<State> getSuccessors(State state,Player player,int i, int j);
	
	public abstract String getName();
	
	public abstract Role getRole();
	
	public abstract boolean reachable(State state,int i,int j,int i_target, int j_target);
}