import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortArrayList {
	
	public static void main(String args[]){
		
		ArrayList<MapObjectTest> list = new ArrayList<MapObjectTest>();
		
		list.add(new MapObjectTest("name",14,Color.BLUE));
		list.add(new MapObjectTest("tea",12,Color.RED));
		list.add(new MapObjectTest("qame",14,Color.GREEN));
		
		
		System.out.println(list);
		
		Collections.sort(list,new MapComparator());
		
		System.out.println(list);
		
	}

}

class MapComparator implements Comparator{
	
	public int compare(Object s, Object t){
	
		//System.out.println("Yah");
		
		if(((MapObjectTest) s).getColorRGB()==((MapObjectTest) t).getColorRGB()){
			return ((MapObjectTest) s).getColorRGB();
		}else if((((MapObjectTest) s).getColorRGB() == Color.RED.getBlue())){
			return -13;
		}else if((((MapObjectTest) s).getColorRGB() == Color.green.getBlue())){
			return  -11;
	}
		return 1;
	}
}
