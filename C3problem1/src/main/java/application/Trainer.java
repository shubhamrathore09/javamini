package application;

import java.util.List;

import javax.persistence.*;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int T_id;
	private String T_name;
	private int T_YearOfExper;
	private String T_email;

	@OneToMany(cascade =  CascadeType.ALL)
	private List<Gym> g_list_for_trainer;

	public Trainer(int t_id, String t_name, int t_YearOfExper, String t_email, List<Gym> g_list_for_trainer) {
		super();
		T_id = t_id;
		T_name = t_name;
		T_YearOfExper = t_YearOfExper;
		T_email = t_email;
		this.g_list_for_trainer = g_list_for_trainer;
	}
	
	
	public Trainer(String t_name, int t_YearOfExper, String t_email) {
		super();
		T_name = t_name;
		T_YearOfExper = t_YearOfExper;
		T_email = t_email;
	}


	public Trainer(String t_name, int t_YearOfExper, String t_email, List<Gym> g_list_for_trainer) {
		super();
		T_name = t_name;
		T_YearOfExper = t_YearOfExper;
		T_email = t_email;
		this.g_list_for_trainer = g_list_for_trainer;
	}

	public Trainer() {
		super();
	}

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public int getT_YearOfExper() {
		return T_YearOfExper;
	}

	public void setT_YearOfExper(int t_YearOfExper) {
		T_YearOfExper = t_YearOfExper;
	}

	public String getT_email() {
		return T_email;
	}

	public void setT_email(String t_email) {
		T_email = t_email;
	}

	public List<Gym> getG_list_for_trainer() {
		return g_list_for_trainer;
	}

	public void setG_list_for_trainer(List<Gym> g_list_for_trainer) {
		this.g_list_for_trainer = g_list_for_trainer;
	}

	@Override
	public String toString() {
		return "Trainer [T_id=" + T_id + ", T_name=" + T_name + ", T_YearOfExper=" + T_YearOfExper + ", T_email="
				+ T_email + ", g_list_for_trainer=" + g_list_for_trainer + "]";
	}
	
	
}
