package ee.tthk.tarpe19.peeduli;

import java.util.Random;

public class GameOfLife  {
	
	Cell actual = new Cell();

	public Cell createCell(CellState state) {
		actual.state(state);
		return actual;
	}

	public Cell createCell() {
		actual.state(CellState.values()[new Random().nextInt(CellState.values().length)]);
		return actual;
	}

}
