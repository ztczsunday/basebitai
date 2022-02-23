package WrittenExamination;

import java.util.LinkedList;
import java.util.List;

public class FindNumLocation {
    public static List FindNumLocation(int[] A, int n, int t){
        List<Integer> result=new LinkedList<>();
        int i=0;
        while (i<n){
            int temp=Math.abs(t-A[i]);
            if (temp==0) {
                result.add(i);
                i++;
            } else {
                i=i+temp;
            }
        }
        return result;
    }
}
