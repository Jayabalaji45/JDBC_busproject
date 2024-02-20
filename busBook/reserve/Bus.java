package busBook.reserve;

public class Bus {
	private int b_no;
	private boolean b_ac;
	private int b_capacity;

	public Bus(int no, boolean ac, int cap) {
		this.b_no = no;
		this.b_ac = ac;
		this.b_capacity = cap;
	}

	public int getcapacity() {
		return b_capacity;
	}

	public void setcapacity(int cap) {
		b_capacity = cap;
	}

	public int getb_no() {
		return b_no;
	}

	public boolean getb_ac() {
		return b_ac;

	}

	public void setb_ac(boolean val) {
		b_ac = val;
	}

}
