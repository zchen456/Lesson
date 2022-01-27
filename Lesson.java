/*
练习1: 随意给出一个整数，打印显示它的百位数，十位数，个位数的值。
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