package ee.tthk.tarpe19.peeduli;

import java.util.Random;

public class GameOfLife  {

	public Cell createCell(CellState state) {
		Cell actual = new Cell();
		actual.state(state);
		return actual;
	}

	public Cell createCell() {
		return CellState.values()[new Random().nextInt(CellState.values().length)];
	}

}
