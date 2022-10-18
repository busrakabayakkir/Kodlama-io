package entities;

public class Courses extends Educator{
	private String courseName;
	private String description;
	private String imageText;
	private double price;
	
	
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		
		this.description = description;
	}

	public String getImageText() {
		return imageText;
	}
	public void setImageText(String imageText) {
		this.imageText = imageText;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
