package eArray;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public SetExam() {
		
		//중복제거 순서 보장 안됨.
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("자바1");
		hashSet.add("자바2");
		hashSet.add("자바3");
		hashSet.add("자바4");
		hashSet.add("자바3"); //중복시 추가 되지 않음
		hashSet.add("자바5");
		hashSet.add("자바6");
		System.out.println();
		System.out.println("HashSet 은 정렬 안됨."+hashSet);
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(50);
		treeSet.add(30);
		System.out.println("TreeSet 은 정렬 됨."+treeSet);
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(50);
		linkedHashSet.add(30); //중복 추가되지 않음
		System.out.println("LinkedHashSet 은 순서유지 됨."+linkedHashSet);
		
		
	}
}
