package test;

public class Painting extends Art {
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	@Override
	public void ViewArt() {
		System.out.println("the title is :" + title + "the author" + author + "the description:  " + description
				+ "the paintType :" + paintType);

	}

}
