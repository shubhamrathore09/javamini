package dao;

import java.util.List;

import application.Gym;
import application.Person;
import application.Trainer;
import exceptionPackage.GymException;
import exceptionPackage.TrainerException;

public interface Dao {
	public void AddGym(Gym gym);
	public void RagistorPerson(Person person, int gym_id) throws GymException;
	public void ragistorTrainer(Trainer trainer);
	public void AssignTrainerWithGym(int T_id, int gym_id) throws TrainerException;
	public List<Person>  getAllPersonByGymName(String gym_name) throws GymException;
	

}
