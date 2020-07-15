package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



public class Arrays {
	
	
	public void declareArray() {
		
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c", "d", "e"};
		String[] cArray = new String[]{"a","b","c","d","e"};
	
	}
	
	
	public void printArraysInJava() {
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString();
		 
		// print directly will print reference value
		System.out.println(intArray);
		// [I@7150bd4d
		 
		System.out.println(intArrayString);
		
	}
		
		public void createArrayList() {
			
			
			String[] stringArray = { "a", "b", "c", "d", "e" };
			ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
			System.out.println(arrayList);
		}
		
		
		public void concateToArray() {
			
			int[] intArray = { 1, 2, 3, 4, 5 };
			int[] intArray2 = { 6, 7, 8, 9, 10 };
			// Apache Commons Bang library
			int[] combinedIntArray = Arrays.addAll(intArray, intArray2);
			
			
		}
		
		
		
		public void DeclareAnArrayInline() {
			
			method(new String[]{"a", "b", "c", "d", "e"});
			
		}
		
		public void jonArrayIntoSingl() {
			
			
			// containing the provided list of elements
			// Apache common lang
			String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
			System.out.println(j);
			// a, b, c
		}
		
		
		public void convertArrays() {
			
			String[] stringArray = { "a", "b", "c", "d", "e" };
			ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
			String[] stringArr = new String[arrayList.size()];
			arrayList.toArray(stringArr);
			for (String s : stringArr)
				System.out.println(s);
		}
		
		
		public void ArrayToSet() {
			
			
			Object stringArray;
			Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
			System.out.println(set);
			//[d, e, b, c, a]
		}
		
	

	public static void main(String[] args) {
		
		Arrays a = new Arrays();
		 
		
	}

}
