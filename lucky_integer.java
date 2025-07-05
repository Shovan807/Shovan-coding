import java.util.HashMap;
import java.util.Map;
/*first lucky integer */
public class lucky_integer {
    public static void main(String[] args) {
        int []arr={2,3,5,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getKey()==e.getValue()) System.out.println(e.getKey());
            break;
        }
        
    }
}
