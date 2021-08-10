package testFruit;

public class Fruit {
	private int weight;
	private String name;
	Fruit(){
		name="Ë®¹û";
		
	}
	Fruit(String name){
		this.name=name;
	}
	public void taste(){
		System.out.println(name+" "+"delicious!");
	}
	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		fruit1.taste();
		// TODO Auto-generated method stub
		String name1="Ïã½¶";
		Fruit fruit2=new Fruit(name1);
		fruit2.taste();
		
	}

}
