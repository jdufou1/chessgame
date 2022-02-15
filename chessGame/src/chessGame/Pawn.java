package chessGame;


import java.util.ArrayList;

public class Pawn extends Piece{

	Role role;
	
	public Pawn(Role role) {
		this.role = role;
	}
	
	@Override
	public ArrayList<State> getSuccessors(State state, Player player, int i, int j) {
		ArrayList<State> nextStates = new ArrayList<>();
		if(role == State.TOP) {
			if(i < State.SIZE - 1) {
				if(state.getBoard()[i+1][j].isEmpty()) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Pawn(State.TOP)), i+1, j);
					nextStates.add(s);
				}
				if(i == 1 && state.getBoard()[i+2][j].isEmpty() && state.getBoard()[i+1][j].isEmpty()) {
					// déplacer le pion de 2 cases
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Pawn(State.TOP)), i+2, j);
					nextStates.add(s);
				}
				// On cherche a savoir si le pion peut eliminer une piece de l'adversaire
				if(j > 0) {
					if(!state.getBoard()[i+1][j-1].isEmpty() && state.getBoard()[i+1][j-1].getPiece().getRole() == State.BOTTOM) {
						// On elimine l'adversaire
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Pawn(State.TOP)), i+1, j-1);
						nextStates.add(s);
					}
				}
				if(j < State.SIZE-1) {
					if(!state.getBoard()[i+1][j+1].isEmpty() && state.getBoard()[i+1][j+1].getPiece().getRole() == State.BOTTOM) {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Pawn(State.TOP)), i+1, j+1);
						nextStates.add(s);
					}
				}
				if(i == State.SIZE - 2 && state.getBoard()[State.SIZE-1][j].isEmpty()) {
					// Si le pion arrive sur la derniere case du camp enemi :
					// Transformation en Reine possible
					State s1 = new State(state.copyBoard());
					s1.setCase(new Case(), i, j);
					s1.setCase(new Case(new Queen(State.TOP)), i+1, j);
					nextStates.add(s1);
					// Transformation en Fou possible
					State s2 = new State(state.copyBoard());
					s2.setCase(new Case(), i, j);
					s2.setCase(new Case(new Bishop(State.TOP)), i+1, j);
					nextStates.add(s2);
					// Transformation en Tour possible
					State s3 = new State(state.copyBoard());
					s3.setCase(new Case(), i, j);
					s3.setCase(new Case(new Rook(State.TOP)), i+1, j);
					nextStates.add(s3);
					// Transformation en Cavalier possible
					State s4 = new State(state.copyBoard());
					s4.setCase(new Case(), i, j);
					s4.setCase(new Case(new Knight(State.TOP)), i+1, j);
					nextStates.add(s4);
				}
			}
		}
		else {
			if(i > 0) {
				if(state.getBoard()[i-1][j].isEmpty()) {
					// déplacer le pion de 1 case
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Pawn(State.BOTTOM)), i+1, j);
					nextStates.add(s);
				}
				if(i == State.SIZE-2 && state.getBoard()[i-2][j].isEmpty() && state.getBoard()[i-1][j].isEmpty()) {
					// déplacer le pion de 2 cases
					State s = new State(state.copyBoard());
					s.setCase(new Case(), i, j);
					s.setCase(new Case(new Pawn(State.BOTTOM)), i-2, j);
					nextStates.add(s);
				}
				// On cherche a savoir si le pion peut eliminer une piece de l'adversaire
				if(j > 0) {
					if(!state.getBoard()[i-1][j-1].isEmpty() && state.getBoard()[i-1][j-1].getPiece().getRole() == State.TOP) {
						// On elimine l'adversaire
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Pawn(State.BOTTOM)), i-1, j-1);
						nextStates.add(s);
					}
				}
				if(j < State.SIZE-1) {
					if(!state.getBoard()[i-1][j+1].isEmpty() && state.getBoard()[i-1][j+1].getPiece().getRole() == State.TOP) {
						State s = new State(state.copyBoard());
						s.setCase(new Case(), i, j);
						s.setCase(new Case(new Pawn(State.BOTTOM)), i-1, j+1);
						nextStates.add(s);
					}
				}
				if(i == 1 && state.getBoard()[i-1][j].isEmpty()) {
					// Si le pion arrive sur la derniere case du camp enemi :
					// Transformation en Reine possible
					State s1 = new State(state.copyBoard());
					s1.setCase(new Case(), i, j);
					s1.setCase(new Case(new Queen(State.BOTTOM)), i-1, j);
					nextStates.add(s1);
					// Transformation en Fou possible
					State s2 = new State(state.copyBoard());
					s2.setCase(new Case(), i, j);
					s2.setCase(new Case(new Bishop(State.BOTTOM)), i-1, j);
					nextStates.add(s2);
					// Transformation en Tour possible
					State s3 = new State(state.copyBoard());
					s3.setCase(new Case(), i, j);
					s3.setCase(new Case(new Rook(State.BOTTOM)), i-1, j);
					nextStates.add(s3);
					// Transformation en Cavalier possible
					State s4 = new State(state.copyBoard());
					s4.setCase(new Case(), i, j);
					s4.setCase(new Case(new Knight(State.BOTTOM)), i-1, j);
					nextStates.add(s4);
				}
			}
		}
		return nextStates;
	}
	
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		if(role == Role.BLACK)
			return "PB";
		else
			return "PW";
	}
	
	@Override
	public String getName() {
		if(role == Role.BLACK)
			return "PB";
		else
			return "PW";
	}

	@Override
	public boolean reachable(State state,int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}
}