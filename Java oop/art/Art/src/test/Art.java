package test;

public abstract class Art {
	protected  String title;
	protected String author;
	protected String description;
	protected Art(String title, String author, String description) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	public abstract void ViewArt() ;
		
	

}
