package chessGame;

import java.util.ArrayList;

public class Rook extends Piece {

	Role role;
	
	public Rook(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			boolean ko = false;
			for(int line = i + 1; line < State.SIZE ; line++) {
				if(((state.getBoard()[line][j].isEmpty() ||  state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM)) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.TOP)), line, j);
						nextStates.add(s);
					//}
					
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int line = i - 1 ; line >= 0 ; line--) {
				if(((state.getBoard()[line][j].isEmpty() || state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM)) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.TOP)), line, j);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int column = j + 1 ; column < State.SIZE ; column++) {
				if((state.getBoard()[i][column].isEmpty() || state.getBoard()[i][column].getPiece().getRole() == State.BOTTOM) && !ko) {
					if(!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.BOTTOM) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.TOP)), i, column);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int column = i - 1 ; column >= 0 ; column--) {
				if(((state.getBoard()[i][column].isEmpty() || state.getBoard()[i][column].getPiece().getRole() == State.BOTTOM)) && !ko) {
					if(!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.BOTTOM) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.TOP)), i, column);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			
		}
		else {
			boolean ko = false;
			for(int line = i + 1; line < State.SIZE ; line++) {
				if(state.getBoard()[line][j].isEmpty() || (!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.BOTTOM)), line, j);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int line = i - 1 ; line >= 0 ; line--) {
				if(state.getBoard()[line][j].isEmpty() || (!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.BOTTOM)), line, j);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int column  = j + 1; column < State.SIZE ; column++) {
				if(state.getBoard()[i][column].isEmpty() || (!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.TOP) && !ko) {
					if(!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.TOP) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.BOTTOM)), i, column);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
			ko = false;
			for(int column = i - 1 ; column >= 0 ; column--) {
				if(state.getBoard()[i][column].isEmpty() || (!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.TOP) && !ko) {
					if(!state.getBoard()[i][column].isEmpty() && state.getBoard()[i][column].getPiece().getRole() == State.TOP) {
						ko = true;
					}
					//else {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Rook(State.BOTTOM)), i, column);
						nextStates.add(s);
					//}
				}
				else {
					ko = true;
				}
			}
		}
		return nextStates;
	}
	
	@Override
	public String toString() {
		if(role == Role.BLACK)
			return "RB";
		else
			return "RW";
	}
	
	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "RB";
		else
			return "RW";
	}

	@Override
	public boolean reachable(State state,int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

}