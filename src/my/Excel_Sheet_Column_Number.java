package my;

/**
 * Created by dean on 16/10/7.
 */
public class Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int num = 0;
        char[] ch = s.toCharArray();
        int len = ch.length;
        for (int i = 0;i < len; ++i){
            num += (ch[i] - 'A' + 1)*Math.pow(26,len - i - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        Excel_Sheet_Column_Number excel_sheet_column_number = new Excel_Sheet_Column_Number();
        System.out.println(excel_sheet_column_number.titleToNumber("AB"));
    }
}
