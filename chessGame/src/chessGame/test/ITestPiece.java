package chessGame.test;

import org.junit.Test;

public interface ITestPiece {

	@Test public void test() throws Exception;
	
	/*
	 * Cette méthode doit tester tous les cas possibles de deplacement de la piece
	 * */
	public void testMoving() throws Exception;
	
	/*
	 * Cette methode doit tester tous les cas de capture d'une autre piece
	 * */
	public void testCapture() throws Exception;
	
	/*
	 * Cette methode doit tester tous les cas particuliers de certaine piece
	 * */
	public void testSpecialCase() throws Exception;
	
	/*
	 * Cette methode doit tester les actions impossibles de la piece
	 * */
	public void testUnpossibleMove() throws Exception;
}
