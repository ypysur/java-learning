package Variable;

import java.util.Scanner;

public class VariableDemo6 {
    //通过Scanner输入两个正整数，利用辗转相除法（欧几里得算法）求两个正整数的最大公约数
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            int temp = a;
            a=b;
            b=temp;
        }
        while(b!=0){
            int temp1 = a%b;
            a=b;
            b=temp1;
        }
        System.out.println("最大公约数是: "+a);
    }


}
