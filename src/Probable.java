import java.util.*;

class Probable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reg_num = sc.nextInt();
        int odd_sum = 0;
        int even_sum = 0;
        while(reg_num !=0){
            int digit = reg_num%10;
            if(digit%2==0) even_sum+=digit;
            else odd_sum+=digit;
            reg_num = reg_num/10;
        }
        if(odd_sum == even_sum) System.out.println("Given num is Probable Number");
        else System.out.println("Given num is not Probable Number");
    }
}