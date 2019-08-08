package co.grandcircus.restaurantrating.entity;

import javax.persistence.*;

@Entity
@Table(name="restaurants") //this is what will tell hibernate to create the mySQL table, and then it names the table restaurants
public class Restaurant {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //telling hibernate that this is the key id, and identity is the part that shows it is autoincrementing
	private Long id;
	@Column(length = 60) //telling hibernate that this is a column name and designating a length
	private String name;
	//hibernate will automatically make the fields column names in SQL if you dont designate it explicitly
	private int rating;
	
	public Restaurant() {}

	public Restaurant(Long id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
}//class
