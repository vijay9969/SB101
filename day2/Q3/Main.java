package day2.Q3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> hm = new LinkedHashMap<>();
		
		hm.put("Maharashtra","Mumbai" );
		hm.put("Rajasthan","Jaipur" );
		hm.put("Punjab","Chandigarh" );
		hm.put("Goa","Panaji" );
		hm.put("Gujarat","Gandhinagar" );
		

		ArrayList<String> keyList = new ArrayList<String>(hm.keySet());
		
		ArrayList<String> valueList = new ArrayList<String>(hm.values());
		
		for(int i=0;i<keyList.size();i++) {
		System.out.println("state: "+keyList.get(i)+" > Capital: "+valueList.get(i));

	}
	}

}
