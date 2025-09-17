package eArray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {
	public MapExam() {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "사과");
		hashMap.put(4, "배");
		hashMap.put(2, "배");
		hashMap.put(5, "수박");
		hashMap.put(3, "수박");
		System.out.println("HashMap 순서보장 안됨."+hashMap);
		System.out.println("key -> value. 형식으로 매핑됨."+hashMap.get(1));
		
		for (Integer key : hashMap.keySet()) {
			System.out.print(key+", ");
		}
		
		Map<String,String> treeSet = new TreeMap<String,String>();
		treeSet.put("서울", "사과");
		treeSet.put("부산", "배");
		treeSet.put("대구", "수박");
		treeSet.put("나", "수박");
		treeSet.put("가", "수박");
		System.out.println("TreeSet 은 키 정렬 됨."+treeSet);
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		linkedHashMap.put(1, "사과");
		linkedHashMap.put(30, "바나나");
		linkedHashMap.put(2, "배");
		linkedHashMap.put(3, "수박");
		 
		System.out.println("LinkedHashSet 은 순서유지 됨."+linkedHashMap);
		
	}
}
