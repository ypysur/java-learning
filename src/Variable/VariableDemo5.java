package Variable;

import java.util.Scanner;

public class VariableDemo5 {
    static void main() {
        //1、 利用Scanner输入正整数n, 计算多项式1！+2！+3！…+n!，如果多项式之和超过2000时需中止后续项的相加操作，并输出累加之和以及停止时累加项（a!）的a值。
        //  输出格式参考：
        //System.out.printf("the sum  is %d, and the last item is %d",sum,i);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 1;
        for(int i=1;i<=n;i++){
            a = a*i;
            sum += a;
            if(sum>2000){
                System.out.printf("the sum  is %d, and the last item is %d",sum,i);
                break;
            }
        }
        if(sum<=2000){
            System.out.printf("the sum  is %d, and the last item is %d",sum,n);
        }
    }
}
