package chessGame;

import java.util.ArrayList;

public class Bishop extends Piece{

	
	Role role;
	
	public Bishop(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			int incr = 1;
			boolean ko1 = false, ko2 = false;
			for(int line = i + 1 ; line < State.SIZE; line++) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.TOP)), line, j + incr);
					nextStates.add(s);
				}
				else {
					ko1 = true;
				}
				if(j - incr >= 0 && (state.getBoard()[line][j - incr].isEmpty() || state.getBoard()[line][j - incr].getPiece().getRole() == State.BOTTOM) && !ko2) {
					if(!state.getBoard()[line][j - incr].isEmpty() && state.getBoard()[line][j - incr].getPiece().getRole() == State.BOTTOM) {
						ko2 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.TOP)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
				incr++;
			}
			incr = 1;
			ko1 = false; 
			ko2 = false;
			for(int line = i - 1 ; line >= 0; line--) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.TOP)), line, j + incr);
					nextStates.add(s);
					
				}
				else {
					ko1 = true;
				}
				if(j - incr >= 0 && (state.getBoard()[line][j - incr].isEmpty() || state.getBoard()[line][j - incr].getPiece().getRole() == State.BOTTOM) && !ko2) {
					if(!state.getBoard()[line][j - incr].isEmpty() && state.getBoard()[line][j - incr].getPiece().getRole() == State.BOTTOM) {
						ko2 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.TOP)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
				incr++;
			}
		}
		else {
			int incr = 1;
			boolean ko1 = false, ko2 = false;
			for(int line = i + 1 ; line < State.SIZE; line++) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.BOTTOM)), line, j + incr);
					nextStates.add(s);
				}
				else {
					ko1 = true;
				}
				if(j - incr >= 0 && (state.getBoard()[line][j - incr].isEmpty() || state.getBoard()[line][j - incr].getPiece().getRole() == State.TOP) && !ko2) {
					if(!state.getBoard()[line][j - incr].isEmpty() && state.getBoard()[line][j - incr].getPiece().getRole() == State.TOP) {
						ko2 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.BOTTOM)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
				incr++;
			}
			incr = 1;
			ko1 = false; 
			ko2 = false;
			for(int line = i - 1 ; line >= 0; line--) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.BOTTOM)), line, j + incr);
					nextStates.add(s);
				}
				else {
					ko1 = true;
				}
				if(j - incr >= 0 && (state.getBoard()[line][j - incr].isEmpty() || state.getBoard()[line][j - incr].getPiece().getRole() == State.TOP) && !ko2) {
					if(!state.getBoard()[line][j - incr].isEmpty() && state.getBoard()[line][j - incr].getPiece().getRole() == State.TOP) {
						ko2 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Bishop(State.BOTTOM)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
			}
		}
		return nextStates;
	}
	
	@Override
	public String toString() {
		if(role == Role.BLACK)
			return "BB";
		else
			return "BW";
	}

	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "BB";
		else
			return "BW";
	}
	
	@Override
	public boolean reachable(State state,int i, int j) {
		
		
		
		return false;
	}

	

}