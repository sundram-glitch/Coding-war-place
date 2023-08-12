package in.com.arrays;

import java.util.HashMap;
import java.util.Map;

public class Test14 {


	    static long F(long n){
	        if(n == 0)
	            return 0l;
	        long ret = (long)(n % 2);
	        ret += F(n/2l);
	        return ret;
	    }
	    
	    static long geekPair(long Arr[], int N)
	    {
	        // code here
	        HashMap<Long, Long> map = new HashMap<>();
	        for(int i = 0; i < N; i++){
	            long x = F(Arr[i]);
	            map.putIfAbsent(x, 0l);
	            map.put(x, map.get(x) + 1l);
	        }
	        long res = 0l;
	        for(Map.Entry<Long,Long> entry : map.entrySet()){
	            long x = entry.getValue();
	            res += x * (x - 1l) / 2l;
	        }
	        return res;
	    }
}
