package application;

public class Servicebean {
	private DaoBean dao;

	public Servicebean(DaoBean dao) {
		super();
		this.dao = dao;
	}

	public Servicebean() {
		super();
	}

	public DaoBean getDao() {
		return dao;
	}

	public void setDao(DaoBean dao) {
		this.dao = dao;
	}
	
	public void calculatInterest() {
		dao.findAccount();
		System.out.println("interset calculat in service layer inside serviceLayer");
	}
}
