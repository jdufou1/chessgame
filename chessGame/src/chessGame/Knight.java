package chessGame;

import java.util.ArrayList;

public class Knight extends Piece {

	Role role;
	
	public Knight(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			if(j - 2 > 0) {
				if(i - 1 > 0) {
					if(state.getBoard()[i-1][j-2].isEmpty() || (!state.getBoard()[i-1][j-2].isEmpty() && state.getBoard()[i-1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i-1, j-2);
						nextStates.add(s);
					}
				}
				if(i + 1 < State.SIZE - 1) {
					if(state.getBoard()[i+1][j-2].isEmpty() || (!state.getBoard()[i+1][j-2].isEmpty() && state.getBoard()[i+1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i+1, j-2);
						nextStates.add(s);
					}
				}
			}
			if(j - 1 > 0) {
				if(i - 2 > 0) {
					if(state.getBoard()[i-2][j-1].isEmpty() || (!state.getBoard()[i-2][j-1].isEmpty() && state.getBoard()[i-2][j-1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i-2, j-1);
						nextStates.add(s);
					}
				}
				if(i + 2 < State.SIZE - 1) {
					if(state.getBoard()[i+2][j-1].isEmpty() || (!state.getBoard()[i+2][j-1].isEmpty() && state.getBoard()[i+2][j-1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i+2, j-1);
						nextStates.add(s);
					}
				}
			}
			if(j + 1 < State.SIZE - 1) {
				if(i - 2 > 0) {
					if(state.getBoard()[i-2][j+1].isEmpty() || (!state.getBoard()[i-2][j+1].isEmpty() && state.getBoard()[i-2][j+1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i-2, j+1);
						nextStates.add(s);
					}
				}
				if(i + 2 < State.SIZE - 1) {
					if(state.getBoard()[i+2][j+1].isEmpty() || (!state.getBoard()[i+2][j+1].isEmpty() && state.getBoard()[i+2][j+1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i+2, j+1);
						nextStates.add(s);
					}
				}
			}
			if(j + 2 < State.SIZE - 1) {
				if(i - 1 > 0) {
					if(state.getBoard()[i-1][j+2].isEmpty() || (!state.getBoard()[i-1][j-2].isEmpty() && state.getBoard()[i-1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i-1, j-2);
						nextStates.add(s);
					}
				}
				if(i + 1 < State.SIZE - 1) {
					if(state.getBoard()[i+1][j+2].isEmpty() || (!state.getBoard()[i+1][j+2].isEmpty() && state.getBoard()[i+1][j+2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.TOP)), i+1, j+2);
						nextStates.add(s);
					}
				}
			}
		}
		else {
			if(j - 2 > 0) {
				if(i - 1 > 0) {
					if(state.getBoard()[i-1][j-2].isEmpty() || (!state.getBoard()[i-1][j-2].isEmpty() && state.getBoard()[i-1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i-1, j-2);
						nextStates.add(s);
					}
				}
				if(i + 1 < State.SIZE - 1) {
					if(state.getBoard()[i+1][j-2].isEmpty() || (!state.getBoard()[i+1][j-2].isEmpty() && state.getBoard()[i+1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i+1, j-2);
						nextStates.add(s);
					}
				}
			}
			if(j - 1 > 0) {
				if(i - 2 > 0) {
					if(state.getBoard()[i-2][j-1].isEmpty() || (!state.getBoard()[i-2][j-1].isEmpty() && state.getBoard()[i-2][j-1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i-2, j-1);
						nextStates.add(s);
					}
				}
				if(i + 2 < State.SIZE - 1) {
					if(state.getBoard()[i+2][j-1].isEmpty() || (!state.getBoard()[i+2][j-1].isEmpty() && state.getBoard()[i+2][j-1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i+2, j-1);
						nextStates.add(s);
					}
				}
			}
			if(j + 1 < State.SIZE - 1) {
				if(i - 2 > 0) {
					if(state.getBoard()[i-2][j+1].isEmpty() || (!state.getBoard()[i-2][j+1].isEmpty() && state.getBoard()[i-2][j+1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i-2, j+1);
						nextStates.add(s);
					}
				}
				if(i + 2 < State.SIZE - 1) {
					if(state.getBoard()[i+2][j+1].isEmpty() || (!state.getBoard()[i+2][j+1].isEmpty() && state.getBoard()[i+2][j+1].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i+2, j+1);
						nextStates.add(s);
					}
				}
			}
			if(j + 2 < State.SIZE - 1) {
				if(i - 1 > 0) {
					if(state.getBoard()[i-1][j+2].isEmpty() || (!state.getBoard()[i-1][j-2].isEmpty() && state.getBoard()[i-1][j-2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i-1, j-2);
						nextStates.add(s);
					}
				}
				if(i + 1 < State.SIZE - 1) {
					if(state.getBoard()[i+1][j+2].isEmpty() || (!state.getBoard()[i+1][j+2].isEmpty() && state.getBoard()[i+1][j+2].getPiece().getRole() == State.BOTTOM)) {
						// deplacer le cavalier
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Knight(State.BOTTOM)), i+1, j+2);
						nextStates.add(s);
					}
				}
			}
		}
		
		return nextStates;
	}
	
	@Override
	public String toString() {
		if(role == Role.BLACK)
			return "kB";
		else
			return "kW";
	}
	
	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "kB";
		else
			return "kW";
	}

	@Override
	public boolean reachable(State state,int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

}