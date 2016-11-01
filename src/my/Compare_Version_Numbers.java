package my;

/**
 * Created by dean on 16/10/31.
 */
public class Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.min(v1.length,v2.length);
        for (int i = 0;i < len; ++i){
            if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
                return 1;
            }
            if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
                return -1;
            }
        }
        if (v1.length > len){
            for (int i = len;i < v1.length; ++i){
                if (Integer.parseInt(v1[i]) > 0){
                    return 1;
                }
            }
        }
        if (v2.length > len){
            for (int i = len;i < v2.length; ++i){
                if (Integer.parseInt(v2[i]) > 0){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //Compare_Version_Numbers c = new Compare_Version_Numbers();
        //c.compareVersion("1.0","1.1");
    }
}
