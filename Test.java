import java.util.*;
public class Test{

 //comment added for prod mode pro from local//

	public static void main(String[] args){
		int[] d = new int[]{1,2,20,8,8,1,2,5,8,0};
		List<Integer> elements = Arrays.asList( 1,2,20,8,8,1,2,5,8,0);
		List<Integer> queries = Arrays.asList(100,4,2);
		List<Integer> output = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		int x=8;
		for(int i=0;i<elements.size();i++){
			if(elements.get(i)== x){
				temp.add(i+1);
			}
		}
		System.out.println(elements);
		System.out.println(temp);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<queries.size();i++){
			try{				
				list.add(temp.get(queries.get(i)-1));
			} catch (Exception e){
				list.add(-1);
			}
							
		}
		System.out.println(list);
	}

}
