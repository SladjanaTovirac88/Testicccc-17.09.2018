package Zadatak1;

public class Book {
	 private String name;
	  private Author Author;
	  private double price;
	  private int qtuInStock;

	  public Book(){
		
	}
	  public Book(String name,Author author,double price,int qtuInStock){
		this.name=name;
		this.Author=author;
		this.price=price;
		this.qtuInStock=qtuInStock;
	}
	  public String getName() {
		return name;
	}
	 
	  public Author getAuthor() {
		return Author;

	}
	  public double getPrice() {
		return price;
	}
	  public void setPrice(double price) {
		  this.price = price;
	}
	 public int getQtuInStock() {
		return qtuInStock;
	}
	 public void setQtuInStock(int qtuInStock) {
		this.qtuInStock = qtuInStock;
	}

	 @Override
	public String toString() {
		return "Book [name=" + name + ", Author=" + Author + ", price=" + price + ", qtuInStock=" + qtuInStock + "]";
	}
























	}


