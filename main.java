import java.util.*;
public class Main
{
	public static void main(String[] args) {
	HashMap<Integer,Integer>map=new HashMap();
	int fruits[]={1,2,1,2,3,4};
	int k=2;
	int left=0;
	int maxlen=0;
	for(int right=0;right<fruits.length;right++){
	    map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
	
	while(map.size()>k){
	    map.put(fruits[left],map.get(fruits[left])-1);
	    if(map.get(fruits[left])==0){
	        map.remove(fruits[left]);
	    }
	    left++;
	}
	maxlen=Math.max(maxlen,right-left+1);}
	System.out.print(maxlen);
	}
}
