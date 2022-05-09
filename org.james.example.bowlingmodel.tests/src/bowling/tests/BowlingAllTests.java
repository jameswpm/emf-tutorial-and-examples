/**
 */
package bowling.tests;

import static org.junit.Assert.assertEquals;

import bowling.BowlingFactory;
import bowling.Game;
import bowling.Matchup;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Bowling</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class BowlingAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BowlingAllTests("Bowling Tests");
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BowlingAllTests(String name) {
		super(name);
	}
	
	public void testMatchupGameRef() {
	   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
	   Game game = BowlingFactory.eINSTANCE.createGame();
	   matchup.getGames().add(game);
	   assertEquals(game.getMatchup(), matchup);
	}

} //BowlingAllTests
