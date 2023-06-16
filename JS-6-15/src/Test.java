public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;//虽然默认为int 编辑器会帮你建厂 如果字面值的范围在自己表示的范围内，就不会报错
        byte c = (byte)(a+b);//小于4个字节的在运算的时候，会提升为4个字节
    }
    public static void main16(String[] args) {
        int a = 10;
        long b = 20;
        //int c =int a + b; // 编译出错: a + b==》int + long--> long + long 赋值给int时会丢失数据
        long d = a + b; // 编译成功：a + b==>int + long--->long + long 赋值给long
    }
    public static void main15(String[] args) {
        int a = 10;
        long b = 100L;
        b = a; // int-->long，数据范围由小到大，隐式转换
        a = (int)b; // long-->int, 数据范围由大到小，需要强转，否则编译失败
        float f = 3.14F;
        double d = 5.12;
        d = f; // float-->double，数据范围由小到大，隐式转换
        f = (float)d; // double-->float, 数据范围由大到小，需要强转，否则编译失败
        //a = d; // 报错，类型不兼容
        a = (int)d; // int没有double表示的数据范围大，需要强转，小数点之后全部丢弃
        byte b1 = 100; // 100默认为int，没有超过byte范围，隐式转换
        byte b2 = (byte)257; // 257默认为int，超过byte范围，需要显示转换，否则报错
        boolean flag = true;
        //a = flag; // 编译失败：类型不兼容
       // flag = a; // 编译失败：类型不兼容
    }
    public static void main14(String[] args) {
        System.out.println(1024); // 整型默认情况下是int
        System.out.println(3.14); // 浮点型默认情况下是double

        int a = 100;
        long b = 10L;
        b = a; // a和b都是整形，a的范围小，b的范围大，当将a赋值给b时，编译器会自动将a提升为long类型，然后赋值
       // a = b; // 编译报错，long的范围比int范围大，会有数据丢失，不安全
        float f = 3.14F;
        double d = 5.12;
        d = f; // 编译器会将f转换为double，然后进行赋值
        //f = d; // double表示数据范围大，直接将float交给double会有数据丢失，不安全
        byte b1 = 100; // 编译通过，100没有超过byte的范围，编译器隐式将100转换为byte
     //  byte b2 = 257; // 编译失败，257超过了byte的数据范围，有数据丢失

    }
    public static void main13(String[] args) {
        int a = 10;
        long b = 100L;
        b = a; // 可以通过编译
        a = b; // 编译失败

    }

    public static void main12(String[] args) {
        //JVM 没有明确他的大小
        boolean flg = true;
        boolean fly = false;
        //bolean flg =1;//错误 不能赋值 其取值只能是true 和false
        System.out.println(flg);//true
        System.out.println(fly);//false
    }
    public static void main10(String[] args) {
        char c1 = 'A'; // 大写字母
        char c2 = '1'; // 数字字符
        System.out.println(c1);// A
        System.out.println(c2);// 1
// 注意：java中的字符可以存放整形
        char c3 = '帅';
        System.out.println(c3);//帅
        //计算机中的字符本质上是一个整数. 在 C 语言中使用 ASCII 表示字符, 而 Java 中使用 Unicode 表示字符. 因此
        //一个字符占用两个字节, 表示的字符种类更多, 包括中文
    }
    public static void main9(String[] args) {
        float num = 1.0f; // 写作 1.0F 也可以
        System.out.println(num);
    }
    public static void main8(String[] args) {
        //8个字节
        double d = 12.500;
        System.out.println(d);//12.5

        double num = 1.1;
        System.out.println(num*num);//1.2100000000000002
        //小数其实没有精确的 只能说 精确到某一位上
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);//4.9E-324
        int a = 1;
        int b = 2;
        System.out.println(a/b);//0 这边是取商 不管余数部分
    }
    public static void main7(String[] args) {
        byte b = 10;
        System.out.println(b);
// byte型变量所能表示的范围：
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

    }
    public static void main6(String[] args) {
        short a = 10;
        System.out.println(a);
// short型变量所能表示的范围：
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

    }
    public static void main5(String[] args) {
        int a = 10;
        long b = 10; // long定义的长整型变量
        long c = 10L; // 为了区分int和long类型，一般建议：long类型变量的初始值之后加L或者l
        long d = 10l; // 一般更加以加大写L，因为小写l与1不好区分
// long型变量所能表示的范围：这个数据范围远超过 int 的表示范围. 足够绝大部分的工程场景使用.
        System.out.println(Long.MIN_VALUE);//最小值 -9223372036854775808
        System.out.println(Long.MAX_VALUE);//最大值 9223372036854775807
    }
    public static void main4(String[] args) {
        // 方式一：在定义时给出初始值
        int a = 10;
        System.out.println(a);
// 方式二：在定义时没有给初始值，但使用前必须设置初值
        int b;
        b = 10;
        System.out.println(b);
// 使用方式二定义后，在使用前如果没有赋值，则编译期间会报错
       /* int c;
        System.out.println(c);//
        c = 100;*/
// int型变量所能表示的范围：
        System.out.println(Integer.MIN_VALUE);//最大值:2147483647
        //Integer 是包装类
        System.out.println(Integer.MAX_VALUE);//最小值:-2147483648
// 注意：在定义int性变量时，所赋值不能超过int的范围
      //  int d = 12345678901234; // 编译时报错，初值超过了int的范围

    }
    public static void main3(String[] args) {
        long a=10;//这里没有报错，是因为这是自动类型转换(隐式）这边long的字节占的多
        long b = 10l;//这么写严谨一点
        //float f= 1.4;//因为浮点数默认情况下是double类型 所以这边会报错
        float f=1.4f;//正确
        System.out.println(a);
    }
    public static void main2(String[] args) {
      //int a=2;
        // int 是整型 ， a是变量 。
        //final相当于C语言的const
        final  int a=2;
        //a =10;
    }
    public static void main1(String[] args) {
        System.out.println("Hello World！");
    }
}
