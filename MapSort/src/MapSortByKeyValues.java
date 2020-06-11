import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortByKeyValues {

	public static void main(String[] args) {
	 
		Map<String,Integer> map = new HashMap<>();
		map.put("Elmo", 5);
		map.put("Legos", 10);
		map.put("Drone", 6);
		map.put("Bricks", 4);
		map.put("Dolls", 15);
		
		map = sortByValues(map);
		
		System.out.println("Sorted by Values...");
	    for(Map.Entry<String,Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + "   " + entry.getValue());
	    
	    map = sortByKeys(map);
	    System.out.println("Sorted by Keys...");
	    for(Map.Entry<String,Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + "   " + entry.getValue());
	    
	}
	
	public static Map<String,Integer> sortByKeys(Map<String,Integer> map)
	{
		List<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list);
		
		Map<String,Integer> sorted = new LinkedHashMap<>();
		
		
		for(String str : list)
			sorted.put(str,map.get(str));
		
		return sorted;
		
	} 
	
	
	public static Map<String,Integer> sortByValues(Map<String,Integer> map)
	{
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		
		/*Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
			
			@Override
			public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});*/
        
        Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
		
		Map<String,Integer> sorted = new LinkedHashMap<>();
		
		for(Map.Entry<String,Integer> entry : list)
			sorted.put(entry.getKey(), entry.getValue());
		
		return sorted;
	
	}

}
