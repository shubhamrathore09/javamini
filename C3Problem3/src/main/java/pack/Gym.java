package pack;

import javax.persistence.*;


public class Gym {

	private int G_Id;
	private String G_name;
	private int G_fee;
	public Gym(int g_Id, String g_name, int g_fee) {
		super();
		G_Id = g_Id;
		G_name = g_name;
		G_fee = g_fee;
	}
	public Gym() {
		super();
	}
	public int getG_Id() {
		return G_Id;
	}
	public void setG_Id(int g_Id) {
		G_Id = g_Id;
	}
	public String getG_name() {
		return G_name;
	}
	public void setG_name(String g_name) {
		G_name = g_name;
	}
	public int getG_fee() {
		return G_fee;
	}
	public void setG_fee(int g_fee) {
		G_fee = g_fee;
	}
	@Override
	public String toString() {
		return "Gym [G_Id=" + G_Id + ", G_name=" + G_name + ", G_fee=" + G_fee + "]";
	}	
}
