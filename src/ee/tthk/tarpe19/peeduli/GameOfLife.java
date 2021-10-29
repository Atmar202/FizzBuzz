package ee.tthk.tarpe19.peeduli;

import java.util.Random;

public class GameOfLife  {
	
	Cell actual = new Cell();

	public Cell createCell(CellState state) {
		actual.setState(state);
		return actual;
	}

	public Cell createCell() {
		actual.setState(CellState.values()[new Random().nextInt(CellState.values().length)]);
		return actual;
	}

}
