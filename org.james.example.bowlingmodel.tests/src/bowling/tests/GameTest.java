/**
 */
package bowling.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bowling.BowlingFactory;
import bowling.BowlingPackage;
import bowling.Game;
import bowling.League;
import bowling.Matchup;
import bowling.Player;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameTest extends TestCase {

	/**
	 * The fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Game fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameTest.class);
	}

	/**
	 * Constructs a new Game test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Game fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Game getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BowlingFactory.eINSTANCE.createGame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	public void testMatchupGameRef() {
	   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
	   Game game = BowlingFactory.eINSTANCE.createGame();
	   matchup.getGames().add(game);
	   assertEquals(game.getMatchup(), matchup);
	}
	
	public void testMatchupGameRef2() {
	   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
	   Game game = BowlingFactory.eINSTANCE.createGame();
	   matchup.getGames().add(game);
	   assertEquals(game.eContainer(), matchup);
	}
	
	public void testReflection() {
		EObject eObject = BowlingFactory.eINSTANCE.createPlayer();
		eObject.eSet(BowlingPackage.eINSTANCE.getPlayer_Name(), "Jonas");
		Player player = (Player) eObject;
		assertEquals("Jonas", player.getName());
	}
	
	public void testReflectiveInformation() {
		League league = BowlingFactory.eINSTANCE.createLeague();
		assertTrue(league.eClass().getEAllReferences().get(0).isMany());
		assertTrue(BowlingPackage.eINSTANCE.getLeague_Players().isMany());
	}
	
	public void testValidation() {
		Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		//each Matchup should include max 2 games
		matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
		matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
		matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
		
		Diagnostic validate = Diagnostician.INSTANCE.validate(matchup);
		assertEquals(Diagnostic.ERROR, validate.getSeverity());
	}
	
	public void testCopy() {
		Player player = BowlingFactory.eINSTANCE.createPlayer();
		player.setName("Jonas");
		Player copy = EcoreUtil.copy(player);
		assertNotSame(player, copy);
		assertEquals(player.getName(), copy.getName());
		
	}

} //GameTest
