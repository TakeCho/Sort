import java.awt.Color;
import java.util.Comparator;


public class MapObjectTest {
	
	private String name;
	private int age;
	private Color col;

	MapObjectTest(String n, int a, Color c){
		name = n;
		age = a;
		col = c;
	}
	
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
	
	int getColorRGB(){
		return col.getBlue();
	}
	//書き換えたよ
	//ssssssss
	
	public String toString(){
		return "<" + getName() + " " + getAge() + ">";
	}
}


