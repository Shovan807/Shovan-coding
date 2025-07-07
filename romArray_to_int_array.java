import java.util.HashMap;

public class romArray_to_int_array {
    public static int rom2Int(String str){
      HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=map.get(str.charAt(str.length()-1));
        for(int i=str.length()-2;i>=0;i--){

    if (map.get(str.charAt(i))>=map.get(str.charAt(i+1))) {
        ans+=map.get(str.charAt(i));
    }
else ans-=map.get(str.charAt(i));
        }

return ans;
    }
    public static int []roman_to_int_array(String []arr){
        int length=arr.length;
        
        int []brr=new int[length];
for(int i=0;i<length;i++){
     brr[i]=rom2Int(arr[i]);
}
return brr;
    }
    public static void main(String[] args) {
        String arr[]={"VII","IXX","II","MMV"}; /*transfer rom to int array */
        int brr[]=roman_to_int_array(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(brr[i]);
}
    }
}
