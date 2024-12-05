package Assignment3;

public class DogSetGet {
	private String name;
	private String breed;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getbreed() {
		return breed;
	}

	public void setbreed(String breed) {
		this.breed = breed;
	}

	public DogSetGet(String name, String breed) {
		this.name = name;
		this.breed = breed;
		//System.out.println(name + breed);

	}

	public static void main(String[] args) {
		DogSetGet g1 = new DogSetGet("Browny", "GoldenRetriever");
		DogSetGet g2 = new DogSetGet("Sony", "GermanShepherd");
		System.out.println("Dog 1 Name: " + g1.getname());
		System.out.println("Dog 1 Breed: " + g1.getbreed());
		g1.setname("Bruno");
		g1.setbreed("Bull Dog");
		System.out.println("Updated Values: "+g1.getname()+" "+g1.getbreed());
		System.out.println("Dog 2 Name: " + g2.getname());
		System.out.println("Dog 2 Breed: " + g2.getbreed());
		g2.setname("Milo");
		g2.setbreed("French Bull Dog");
		System.out.println("Updated Values: "+g2.getname()+" "+g2.getbreed());
	}
}