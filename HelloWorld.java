//	两个正斜杠可进行单行注释

/*	正斜杠加上星号可以进行
	多行注释（区块注释）
	以星号加正斜杠结尾
*/

/** 
	文档注释，javadoc.exe	
*/  

//	这是定义了一个名字叫做HelloWorld的类，类是java当中所有代码的一个基本组织单位。
//	第三个单词必须和文件名完全一样
public class HelloWorld {
	//	第二行是固定写法，基本不能改变，这是程序启动的起点。
	public static void main(String[] args)  {
		//	第三行开始，就是程序执行的内容。
		//	这一行是一个输出语句，打印语句，就是在屏幕当中显示一行字。
		//	英文格式下的双引号中间就是显示的文本内容。
		System.out.println("Hello,World!!!");
		
		System.out.println("I Love Java!");
	}
}


