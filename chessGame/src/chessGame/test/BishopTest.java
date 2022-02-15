package chessGame.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.Bishop;
import chessGame.Case;
import chessGame.Pawn;
import chessGame.Player;
import chessGame.Role;
import chessGame.State;

public class BishopTest implements ITestPiece{
	
	public BishopTest() {
		
	}
	
	@Test
	public void test() throws Exception {
		testMoving();
		testCapture();
		testUnpossibleMove();
		testSpecialCase();
	}
	
	public void testMoving() throws Exception{
		// Création du joueur
		Player playerBlack = new Player(Role.BLACK);
		// Création du tableau de jeu
		Case[][] boardInit = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		State base = new State(boardInit);
		// Récupération des coups du joueur
		
		ArrayList<State> coupsPossibles = base.getSuccessors(playerBlack);
		
		// Définition des mouvements possibles
		
		Case[][] boardMvt1 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt2 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt3 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt4 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP))}
		};
		Case[][] boardMvt5 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt6 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt7 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt8 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt9 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt10 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt11 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt12 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt13 = {
				{new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		Case[][][] boardsMvt = {
				boardMvt1,boardMvt2,boardMvt3,boardMvt4,boardMvt5,
				boardMvt6,boardMvt7,boardMvt8,boardMvt9,boardMvt10,
				boardMvt11,boardMvt12,boardMvt13
								};
		// TEST SUR LE NOMBRE DE COUPS POSSIBLES
		
		assertEquals("Vérification sur le nombre de coups possibles" ,boardsMvt.length,coupsPossibles.size());
		
		// TEST SUR LES POSITIONS DE LA PIECE
		for(int i = 0; i < boardsMvt.length ; i++) {
			State s = new State(boardsMvt[i]);
			assertEquals(("Vérification de la position de l'index : "+i),coupsPossibles.contains(s),true);
		}
		
	}

	@Override
	public void testCapture() throws Exception {
		// Création du joueur
		Player playerBlack = new Player(Role.BLACK);
		// Création du tableau de jeu
		Case[][] boardInit = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		State base = new State(boardInit);
		// Récupération des coups du joueur
		
		ArrayList<State> coupsPossibles = base.getSuccessors(playerBlack);
		
		// Définition des mouvements possibles
		
		Case[][] boardMvt1 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt2 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt3 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt4 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.BOTTOM)),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		Case[][][] boardsMvt = {
				boardMvt1,boardMvt2,boardMvt3,boardMvt4
								};
		// TEST SUR LE NOMBRE DE COUPS POSSIBLES
		
		assertEquals("Vérification sur le nombre de coups possibles" ,boardsMvt.length,coupsPossibles.size());
		
		// TEST SUR LES POSITIONS DE LA PIECE
		for(int i = 0; i < boardsMvt.length ; i++) {
			State s = new State(boardsMvt[i]);
			assertEquals(("Vérification de la position de l'index : "+i),coupsPossibles.contains(s),true);
		}
		
	}

	@Override
	public void testSpecialCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testUnpossibleMove() throws Exception {
		// Création du joueur
		Player playerBlack = new Player(Role.BLACK);
		// Création du tableau de jeu
		Case[][] boardInit = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		State base = new State(boardInit);
		// Récupération des coups du joueur
		
		ArrayList<State> coupsPossibles = base.getSuccessors(playerBlack);
		
		// Définition des mouvements possibles
		
		Case[][] boardMvt1 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt2 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt3 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		Case[][] boardMvt4 = {
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(new Bishop(State.TOP)),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(new Pawn(State.TOP)),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
				{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		
		
		Case[][][] boardsMvt = {
				boardMvt1,boardMvt2,boardMvt3,boardMvt4
								};
		assertEquals("testUnpossibleMove : Vérification sur le nombre de coups possibles" ,boardsMvt.length,coupsPossibles.size());
		// TEST SUR LES POSITIONS DE LA PIECE
		for(int i = 0; i < boardsMvt.length ; i++) {
			State s = new State(boardsMvt[i]);
			assertEquals(("testUnpossibleMove : Vérification de la position de l'index : "+i),coupsPossibles.contains(s),true);
		}
		
		
	}
}
