package test;

public class Sculpture extends Art {
	private String material ;
	
	protected Sculpture(String title, String author, String description,String material) {
		super(title, author, description);
		this.material=material;
		
	}

	@Override
	public void ViewArt() {
		System.out.println("the title is :"+title+"the author"+author+"the description:  "+description+"the material :"+material);
		
	}

}
