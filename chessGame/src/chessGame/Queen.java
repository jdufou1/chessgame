package chessGame;

import java.util.ArrayList;

public class Queen extends Piece {

	Role role;
	
	public Queen(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			/*
			 * Déplacement comme le fou
			 * */
			int incr = 1;
			boolean ko1 = false, ko2 = false;
			for(int line = i + 1 ; line < State.SIZE; line++) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.BOTTOM) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.TOP)), line, j + incr);
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
					s.setCase(new Case(new Queen(State.TOP)), line, j - incr);
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
					s.setCase(new Case(new Queen(State.TOP)), line, j + incr);
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
					s.setCase(new Case(new Queen(State.TOP)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
				incr++;
			}
			/*
			 * Déplacement comme la tour
			 * */
			boolean ko = false;
			for(int line = i + 1; line < State.SIZE ; line++) {
				if(((state.getBoard()[line][j].isEmpty() ||  state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM)) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.BOTTOM) {
						ko = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.TOP)), line, j);
					nextStates.add(s);
					
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.TOP)), line, j);
					nextStates.add(s);
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.TOP)), i, column);
					nextStates.add(s);
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.TOP)), i, column);
					nextStates.add(s);
					
				}
				else {
					ko = true;
				}
			}
			/*
			 * Fin déplacement comme la tour
			 * */
			
		}
		else {
			/*
			 * Déplacement comme le fou
			 * */
			int incr = 1;
			boolean ko1 = false, ko2 = false;
			for(int line = i + 1 ; line < State.SIZE; line++) {
				if(j + incr < State.SIZE && (state.getBoard()[line][j + incr].isEmpty() || state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) && !ko1) {
					if(!state.getBoard()[line][j + incr].isEmpty() && state.getBoard()[line][j + incr].getPiece().getRole() == State.TOP) {
						ko1 = true;
					}
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j + incr);
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
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j - incr);
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
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j + incr);
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
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j - incr);
					nextStates.add(s);
				}
				else {
					ko2 = true;
				}
			}
			/*
			 * Déplacement comme la tour
			 * */
			boolean ko = false;
			for(int line = i + 1; line < State.SIZE ; line++) {
				if(state.getBoard()[line][j].isEmpty() || (!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) && !ko) {
					if(!state.getBoard()[line][j].isEmpty() && state.getBoard()[line][j].getPiece().getRole() == State.TOP) {
						ko = true;
					}
					
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j);
					nextStates.add(s);
					
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.BOTTOM)), line, j);
					nextStates.add(s);
					
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.BOTTOM)), i, column);
					nextStates.add(s);
					
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
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Queen(State.BOTTOM)), i, column);
					nextStates.add(s);
				}
				else {
					ko = true;
				}
			}
			/*
			 * Fin deplacement comme la tour
			 * */
		}
		return nextStates;
	}

	
	@Override
	public String toString() {
		if(role == Role.BLACK)
			return "QB";
		else
			return "QW";
	}
	
	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "QB";
		else
			return "QW";
	}

	@Override
	public boolean reachable(State state,int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}
}