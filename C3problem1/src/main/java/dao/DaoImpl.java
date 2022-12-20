package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import application.Gym;
import application.Person;
import application.Trainer;
import exceptionPackage.GymException;
import exceptionPackage.TrainerException;

public class DaoImpl implements Dao{

	public void AddGym(Gym gym) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Gym obj=new Gym();
		obj.setG_fee(gym.getG_fee());
		obj.setG_name(gym.getG_name());
		em.persist(obj);
		em.getTransaction().commit();
		em.clear();
		
	}

	public void RagistorPerson(Person person, int gym_id) throws GymException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Gym gym=em.find(Gym.class, gym_id);
		if(gym==null) {
			throw new GymException("no gym available with data ID");
		}
		else {
			
		
		List<Gym> gList=new ArrayList<Gym>();
		gList.add(gym);
		Person person2=new Person();
		person2.setP_name(person.getP_name());
		person2.setP_email(person.getP_email());
		person2.setP_mobile(person.getP_mobile());
		person2.setGlist(gList);
		em.persist(person2);
		em.getTransaction().commit();
		em.close();
		}
	}

	public void ragistorTrainer(Trainer trainer) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(trainer);
		em.getTransaction().commit();
		em.close();
		
	}

	public void AssignTrainerWithGym(int T_id, int gym_id) throws TrainerException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Gym gym=em.find(Gym.class,gym_id);
		Trainer trainer =em.find(Trainer.class, T_id);
		gym.setGymTrainer(trainer);
		em.getTransaction().commit();
		em.clear();
		
	}

	public List<Person> getAllPersonByGymName(String gym_name) throws GymException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("select p from Person p " + "where p.name");
		
		List<Person> persons=query.getResultList();
		System.out.println(persons);
		return null;
		
	}
	public static void main(String[] args) {
		
	}
}
