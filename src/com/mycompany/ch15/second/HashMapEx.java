package com.mycompany.ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("장원영", 100);
		map.put("전지현", 100);
		map.put("장동건", 100);
		map.put("고소영", 100);
//		map.put("장원영", "asdfasdff");
		
		map.forEach((key, value)->{
			System.out.println(key + ":" + value);
		});
		
		System.out.println("-------------------------------------");
		
		for(String strKey: map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + ":" + strValue);
		}
		
	}

}
