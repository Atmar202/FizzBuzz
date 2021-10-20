package ee.tthk.tarpe19.peeduli;

import static org.junit.Assert.*;

import org.junit.*;

public class GameOfLifeTester {
	
	GameOfLife tester;
	
	@Before
	public void setUp() throws Exception {
		tester = new GameOfLife();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void createLivingCell() {
		Cell c = tester.createCell(CellState.LIVING);
		assertEquals(CellState.LIVING, c.getState());
	}

}
