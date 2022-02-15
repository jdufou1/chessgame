package chessGame;

import java.util.ArrayList;

public class King extends Piece {

	Role role;
	
	public King(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			if(i < State.SIZE - 1) {
				// Mouvement vers le bas
				if(state.getBoard()[i+1][j].isEmpty() || state.getBoard()[i+1][j].getPiece().getRole() == State.BOTTOM) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.TOP)), i+1, j);
					nextStates.add(s);
				}
				// Mouvement vers le bas a droite
				if(j < State.SIZE - 1) {
					if(state.getBoard()[i+1][j+1].isEmpty() || state.getBoard()[i+1][j+1].getPiece().getRole() == State.BOTTOM) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.TOP)), i+1, j+1);
						nextStates.add(s);
					}
				}
				// Mouvement vers le bas a gauche
				if(j > 0) {
					if(state.getBoard()[i+1][j-1].isEmpty() || state.getBoard()[i+1][j-1].getPiece().getRole() == State.BOTTOM) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.TOP)), i+1, j-1);
						nextStates.add(s);
					}
				}
			}
			if(j < State.SIZE - 1) {
				// Mouvement vers la droite
				if(state.getBoard()[i][j+1].isEmpty() || state.getBoard()[i][j+1].getPiece().getRole() == State.BOTTOM) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.TOP)), i, j+1);
					nextStates.add(s);
				}
			}
			if(j > 0) {
				// Mouvement vers la droite
				if(state.getBoard()[i][j-1].isEmpty() || state.getBoard()[i][j-1].getPiece().getRole() == State.BOTTOM) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.TOP)), i, j-1);
					nextStates.add(s);
				}
			}
			if(i > 0) {
				// Mouvement vers le haut
				if(state.getBoard()[i-1][j].isEmpty() || state.getBoard()[i-1][j].getPiece().getRole() == State.BOTTOM) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.TOP)), i-1, j);
					nextStates.add(s);
				}
				// Mouvement vers le haut a droite
				if(j < State.SIZE - 1) {
					if(state.getBoard()[i-1][j+1].isEmpty() || state.getBoard()[i-1][j+1].getPiece().getRole() == State.BOTTOM) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.TOP)), i-1, j+1);
						nextStates.add(s);
					}
				}
				// Mouvement vers le haut a gauche
				if(j > 0) {
					if(state.getBoard()[i-1][j-1].isEmpty() || state.getBoard()[i-1][j-1].getPiece().getRole() == State.BOTTOM) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.TOP)), i-1, j-1);
						nextStates.add(s);
					}
				}
			}
		}
		else {
			if(i < State.SIZE - 1) {
				// Mouvement vers le bas
				if(state.getBoard()[i+1][j].isEmpty() || state.getBoard()[i+1][j].getPiece().getRole() == State.TOP) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.BOTTOM)), i+1, j);
					nextStates.add(s);
				}
				// Mouvement vers le bas a droite
				if(j < State.SIZE - 1) {
					if(state.getBoard()[i+1][j+1].isEmpty() || state.getBoard()[i+1][j+1].getPiece().getRole() == State.TOP) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.BOTTOM)), i+1, j+1);
						nextStates.add(s);
					}
				}
				// Mouvement vers le bas a gauche
				if(j > 0) {
					if(state.getBoard()[i+1][j-1].isEmpty() || state.getBoard()[i+1][j-1].getPiece().getRole() == State.TOP) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.BOTTOM)), i+1, j-1);
						nextStates.add(s);
					}
				}
			}
			if(j < State.SIZE - 1) {
				// Mouvement vers la droite
				if(state.getBoard()[i][j+1].isEmpty() || state.getBoard()[i][j+1].getPiece().getRole() == State.TOP) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.BOTTOM)), i, j+1);
					nextStates.add(s);
				}
			}
			if(j > 0) {
				// Mouvement vers la droite
				if(state.getBoard()[i][j-1].isEmpty() || state.getBoard()[i][j-1].getPiece().getRole() == State.TOP) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.BOTTOM)), i, j-1);
					nextStates.add(s);
				}
			}
			if(i > 0) {
				// Mouvement vers le haut
				if(state.getBoard()[i-1][j].isEmpty() || state.getBoard()[i-1][j].getPiece().getRole() == State.TOP) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new King(State.BOTTOM)), i-1, j);
					nextStates.add(s);
				}
				// Mouvement vers le haut a droite
				if(j < State.SIZE - 1) {
					if(state.getBoard()[i-1][j+1].isEmpty() || state.getBoard()[i-1][j+1].getPiece().getRole() == State.TOP) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Pawn(State.BOTTOM)), i-1, j+1);
						nextStates.add(s);
					}
				}
				// Mouvement vers le haut a gauche
				if(j > 0) {
					if(state.getBoard()[i-1][j-1].isEmpty() || state.getBoard()[i-1][j-1].getPiece().getRole() == State.TOP) {
						// déplacer le pion de 1 case
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new King(State.BOTTOM)), i-1, j-1);
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
			return "KB";
		else
			return "KW";
	}
	
	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "KB";
		else
			return "KW";
	}

	@Override
	public boolean reachable(State state,int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

}