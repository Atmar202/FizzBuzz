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
	
	@Test
	public void createDeadCell() {
		Cell c = tester.createCell(CellState.DEAD);
		assertEquals(CellState.DEAD, c.getState());
	}
	
	@Test
	public void createRandomCell() {
		boolean living = false;
		boolean dead = false;
		for(int i = 0; i < 10; i++) {
			Cell actual = tester.createCell();
			if(actual.getState()==CellState.LIVING) living = true;
			if(actual.getState()==CellState.DEAD) dead = true;
		}
		assertTrue(living && dead);
	}
	
	@Test
	public void LivingCellWithLessThanTwoNeighboursDies() {
		Cell c = tester.createCell(CellState.LIVING);
		c.addNeighbours(1);
		if(c.getNeighbours() < 2) c.state(CellState.DEAD);
		assertEquals(CellState.DEAD, c.getState());
	}

}
