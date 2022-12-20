package application;

import java.util.List;

import javax.persistence.*;

@Entity
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int G_ymId;
	private String G_name;
	private int G_fee;
	
	
	@ManyToMany
	private List<Person> P_list;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Trainer gymTrainer;

	public Gym(int g_ymId, String g_name, int g_fee, List<Person> p_list, Trainer gymTrainer) {
		super();
		G_ymId = g_ymId;
		G_name = g_name;
		G_fee = g_fee;
		P_list = p_list;
		this.gymTrainer = gymTrainer;
	}

	public Gym(String g_name, int g_fee, List<Person> p_list, Trainer gymTrainer) {
		super();
		G_name = g_name;
		G_fee = g_fee;
		P_list = p_list;
		this.gymTrainer = gymTrainer;
	}

	public Gym(String g_name, int g_fee, List<Person> p_list) {
		super();
		G_name = g_name;
		G_fee = g_fee;
		P_list = p_list;
	}

	public Gym() {
		super();
	}

	public int getG_ymId() {
		return G_ymId;
	}

	public void setG_ymId(int g_ymId) {
		G_ymId = g_ymId;
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

	public List<Person> getP_list() {
		return P_list;
	}

	public void setP_list(List<Person> p_list) {
		P_list = p_list;
	}

	public Trainer getGymTrainer() {
		return gymTrainer;
	}

	public void setGymTrainer(Trainer gymTrainer) {
		this.gymTrainer = gymTrainer;
	}

	@Override
	public String toString() {
		return "Gym [G_ymId=" + G_ymId + ", G_name=" + G_name + ", G_fee=" + G_fee + ", P_list=" + P_list
				+ ", gymTrainer=" + gymTrainer + "]";
	}
}
