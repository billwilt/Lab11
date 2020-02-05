

public class Movie {

	private String title;
	private String category;
	

	public Movie() {
		}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
		}
	public String toString() {
		return "title: " + title + " category " + category;
	}
	
}
