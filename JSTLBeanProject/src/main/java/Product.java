
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String category;

	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}