import java.util.Scanner;

/*
练习1:随意给出一个整数，打印显示它的百位数，十位数，个位数的值。
*/
class Lesson1{
	public static void main(String[] args){
		int num = 187;
		int bai = num /100;
		int shi = num % 100 / 10;
		int ge = num % 10;

		System.out.println("百位数是:" + bai);
		System.out.println("十位数是:" + shi);
		System.out.println("个位数是:" + ge);
	}
}


/*
练习2:获取一个10-99的随机数
*/
class Lesson2{
	public static void main(String[] args){
		int Value = (int)(Math.random() * 90 + 10);
		System.out.println(Value);
	}
}


/*
练习3:遍历100以内的偶数，输出所有偶数的和，输出偶数的个数
*/
class Lesson3{
	public static void main(String[] args){
		int sum = 0;
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 ==0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("偶数总和为: " + sum);
		System.out.println("偶数个数为: " + count);
	}
}


/*
练习4:编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数上打印出“foo“，5的倍数上打印"biz"，7的倍数上打印"baz"
*/
class Lesson4{
	public static void main(String[] args){
		for(int i1 = 1;i1 <= 150;i1++){
			System.out.print(i1 + " ");
			if(i1 % 3 ==0){
   				System.out.print("foo  ");
			}
			if(i1 % 5 ==0){
				System.out.print("biz  ");
			}
			if(i1 % 7 ==0){
				System.out.print("baz  ");
			}
			System.out.println();
		}
	}
}


/*
练习5:键盘输入两个正整数m和n，求其最大公约数和最小公倍数。比如：12和20的最大公约数是4，最小公倍数是60
*/

class Lesson5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个正整数");
		int m = scan.nextInt();
		System.out.println("请输入第二个正整数");
		int n = scan.nextInt();

		int max = (m <= n)?m:n;
		for(max = m;max >=1;max--){
			if(m % max ==0 && n % max ==0){
				System.out.println("最大公约数为： " + max);
				break;
			}	
		}

		int min = (m >= n)?m:n;
		for(min = m;min <= m*n;min++){
			if(min % m ==0 && min % n ==0){
				System.out.println("最小公倍数为： " + min);
				break;
			}
		}
	}
}


/*
练习6:从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入0时结束程序
*/
class Lesson6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int positiveNumber = 0;
		int negativeNumber = 0;
		while(true){
			int number = scan.nextInt();
			if(number > 0){
				positiveNumber++;
			}else if(number < 0){
				negativeNumber++;
			}else{
				break;
			}
		}
		System.out.println("正数的个数为： " + positiveNumber);
		System.out.println("负数的个数为： " + negativeNumber);
	}
}


/*
练习7:输出下面图形
*              
**             
***            
****           

****
***
**
*

   *
  **
 ***
****

****
 ***
  **
   *
*/
class Lesson7{
	public static void main(String[] args){
		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();

		for(int i = 4;i > 0;i--){
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();

		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= 4;j++){
				if(i + j >=5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}

		System.out.println();

		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= 4;j++){
				if(i <= j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}


/*
练习8：99乘法表
*/
class Lesson8{
	public static void main(String[] args){
		for(int m = 1;m <= 9;m++){
			for(int n = 1;n <= m; n++){
				System.out.print(m + "*" + n + "=" + (m * n) + " ");
			}
		System.out.println();
		}
	}
}


/*
练习9:遍历100以内的所有质数 （最小的质数为2）
*/
class Lesson9{
	public static void main(String[] args){	
		for(int n = 2;n <= 100;n++){
			boolean isFlag = true;
			for(int m = 2; m < Math.sqrt(n);m++){
				if(n % m == 0){
					isFlag = false;
					break;
				}
			}
			if(isFlag == true){
				System.out.println(n);
			}

		}
	}
}


/*
一个数如果恰好等于它的因子只和，这个数就称为”完数“。例如6=1+2+3.
编程：找出1000以内的所有完数。
*/
class Lesson10{
	public static void main(String[] args){
		for(int i = 1;i <= 1000;i++){
			int sum = 0;
			for(int j = 1;j <= i/2;j++){
				if(i % j == 0){
					sum += j;
				}
			}	
			if(i == sum){
				System.out.println(i);
			}
		}
	}
}







