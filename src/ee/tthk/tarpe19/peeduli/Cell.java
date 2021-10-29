package ee.tthk.tarpe19.peeduli;

public class Cell {
	
	private CellState state;
	private int num;
	
	public void setState(CellState state) {
		this.state = state;
	}
	
	public void addNeighbours(int num) {
		this.num = num;
	}

	public CellState getState() {
		// TODO Auto-generated method stub
		return state;
	}
	
	public int getNeighbours() {
		return num;
	}

}
