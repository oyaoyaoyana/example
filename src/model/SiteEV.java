package model;
import java.io.Serializable;

public class SiteEV implements Serializable{
	private int good;
	private int bad;

	public SiteEV() {}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}
}
