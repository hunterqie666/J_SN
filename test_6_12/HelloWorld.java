
public class HelloWorld{
	public static void main(String[] args){
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
	}
}
/*
public：访问修饰限定符
class：当前文件中 class定义的叫类。后面的HelloWorld是类名
 */
//public class HelloWorld {
//    //在C语言里main是函数 在Java里面叫方法 string[]表示是字符串数组 args形式参数 void是返回值
//    public static void main(String[] args){
//        System.out.println("hello world");//相当于C的printf打印 ln是表示换行
//    }
//}