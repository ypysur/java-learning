package Variable;

public class VariableDemo4 {
    static void main() {
        //1.定义变量记录秒数
        int seconds=3661;
        //2.记录小时数
        int hours=seconds/3600;
        System.out.println(hours);
        //3.记录分钟数
        int minutes=(seconds%3600)/60;
        System.out.println(minutes);
        int second=seconds%3600/60;
    }
}
