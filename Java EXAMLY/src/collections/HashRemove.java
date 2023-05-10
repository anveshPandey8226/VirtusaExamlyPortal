package collections;

//You are using Java
import java.util.*;

public class HashRemove{
	 public static void main(String[] args){
	     Scanner s = new Scanner(System.in);
	     int num = s.nextInt();
	     
	     Map<String,Integer> nameMap = new HashMap<>();
	     for(int i = 0 ; i <num; i++){
	         String name = s.next();
	         s.nextLine();
	         int roll = s.nextInt();
	         
	         nameMap.put(name,roll);
	     }
	     
	     System.out.println(nameMap);
	     
	     String rmv = s.next();
	     if(nameMap.containsKey(rmv)){
	         nameMap.remove(rmv);
	     }
	     
	     System.out.println(nameMap);
	 }
}
