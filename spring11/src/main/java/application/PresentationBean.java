package application;

public class PresentationBean {
	private Servicebean sb;

	public PresentationBean(Servicebean sb) {
		super();
		this.sb = sb;
	}

	public PresentationBean() {
		super();
	}

	public Servicebean getSb() {
		return sb;
	}

	public void setSb(Servicebean sb) {
		this.sb = sb;
	}
	public void present() {
		sb.calculatInterest();
		System.out.println("inside presentationlayer");
	}
}
