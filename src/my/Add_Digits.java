package my;

/**
 * Created by dean on 16/10/6.
 */
public class Add_Digits {

    public int addDigits(int num) {
        if(num < 10) return num;
        int sum = 0;
        while (num != 0){
            sum += num%10;
            num/=10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        Add_Digits add_digits = new Add_Digits();
        System.out.println(add_digits.addDigits(38));
    }
}
