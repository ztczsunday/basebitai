package WrittenExamination;


public class FindMinStr {
    public static String findMinStr(String str1, String str2) {
        if (str2 == null || str2.length() == 0){
            return str1;
        }
        int[] need = new int[128];
        for (int i = 0; i < str2.length(); i++) {
            need[str2.charAt(i)]++;
        }
        int l = 0, r = 0, size = Integer.MAX_VALUE, count = str2.length(), start = 0;
        while (r < str1.length()) {
            char c = str1.charAt(r);
            if (need[c] > 0) {
                count--;
            }
            need[c]--;
            if (count == 0) {
                while (l < r && need[str1.charAt(l)] < 0) {
                    need[str1.charAt(l)]++;
                    l++;
                }
                if (r - l + 1 < size) {
                    size = r - l + 1;
                    start = l;
                }
                need[str1.charAt(l)]++;
                l++;
                count++;
            }
            r++;
        }
        return size == Integer.MAX_VALUE ? "" : str1.substring(start, start + size);
    }
}

