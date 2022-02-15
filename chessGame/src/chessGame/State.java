package chessGame;

import java.util.ArrayList;

public class State{

	public static final int SIZE = 8;
	
	public static final Role TOP = Role.BLACK;
	
	public static final Role BOTTOM = Role.WHITE;
	
	Case[][] board = {
			/*
			{new Case(new Rook(TOP)),new Case(new Knight(TOP)),new Case(new Bishop(TOP)),new Case(new Queen(TOP)),new Case(new King(TOP)),new Case(new Bishop(TOP)),new Case(new Knight(TOP)),new Case(new Rook(TOP))},
			{new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP)),new Case(new Pawn(TOP))},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM)),new Case(new Pawn(BOTTOM))},
			{new Case(new Rook(BOTTOM)),new Case(new Knight(BOTTOM)),new Case(new Bishop(BOTTOM)),new Case(new Queen(BOTTOM)),new Case(new King(BOTTOM)),new Case(new Bishop(BOTTOM)),new Case(new Knight(BOTTOM)),new Case(new Rook(BOTTOM))},
			*/	
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(new Pawn(BOTTOM)),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(new Queen(TOP)),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
	};

	
	public State() {
		
	}
	
	public State(Case[][] board) {
		this.board = board;
	}
	
	public ArrayList<State> getSuccessors(Player player){
		ArrayList<State> nextStates = new ArrayList<>();
		for(int i = 0 ; i < SIZE ; i++) {
			for(int j = 0; j < SIZE ; j++) {
				if(!board[i][j].isEmpty()) {
					Piece p = board[i][j].getPiece();
					if(p.getRole() == player.getRole())
						nextStates.addAll(p.getSuccessors(this, player,i,j));
				}
			}
		}
		return nextStates;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof State) {
			State s = (State) o;
			for(int i = 0 ; i < SIZE ; i++) {
				for(int j = 0 ; j < SIZE ; j++) {
					if(s.board[i][j].isEmpty())
						if(!this.board[i][j].isEmpty())
							return false;
					if(this.board[i][j].isEmpty())
						if(!s.board[i][j].isEmpty())
							return false;
					if(!this.board[i][j].isEmpty() && !s.board[i][j].isEmpty())
						if(!s.board[i][j].getPiece().getName().contains(this.board[i][j].getPiece().getName()))
							return false;
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < SIZE ; i++) {
			for(int j = 0 ; j < SIZE ; j++) {
				str.append(board[i][j]);
				if(j < SIZE - 1) {
					str.append("|");
				}
			}
			str.append("\n");
		}
		return str.toString();
	}
	
	public Case[][] getBoard(){
		return board;
	}
	
	public Case[][] copyBoard(){
		Case[][] newBoard = new Case[SIZE][SIZE];
		for(int i = 0 ; i < SIZE ; i++)
			for(int j = 0 ; j < SIZE ; j++)
				newBoard[i][j] = board[i][j];
		return newBoard;
	}
	
	public void setCase(Case c, int i, int j) {
		board[i][j] = c;
	}
	
	public static void main(String[] argv) {
		
		Player playerBlack = new Player(Role.BLACK);
		
		State base = new State();
		System.out.println(base);
		
		ArrayList<State> coupsPossibles = base.getSuccessors(playerBlack);
		
		System.out.println("Nombre de coups possibles : " + coupsPossibles.size());
		
		for(State s : coupsPossibles) {
			System.out.println(s);
		}
	
	}
}