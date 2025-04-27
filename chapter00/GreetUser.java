import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象用于接收输入
        System.out.print("请输入你的名字：");
        String name = scanner.nextLine(); // 读取一行输入
        System.out.println("你看完下面不涨吗？" + name + "！");
        scanner.close(); // 关闭 Scanner
    }
}
