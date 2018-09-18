package model;
import java.io.Serializable;

public class Health implements Serializable{
	private double height, weight, bmi;
	private String bodyType;

	public Health() {}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}


//  private int height;
//  private int weight;
//  private int bmi;
//  private String[] figure = {"痩せ型", "普通", "肥満"};
//  public Health() {}
//  public Health(int height, int weight) {
//	  this.height = height;
//	  this.weight = weight;
//	  int bmi = weight / (height * height);
//	  this.bmi = bmi;
//
//  }
}
