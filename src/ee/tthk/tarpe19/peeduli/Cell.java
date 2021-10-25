package ee.tthk.tarpe19.peeduli;

public class Cell {
	
	private CellState state;
	
	public void state(CellState state) {
		this.state = state;
	}

	public CellState getState() {
		// TODO Auto-generated method stub
		return state;
	}
	
	public int getNeighbours() {
		return 0;
	}

}
