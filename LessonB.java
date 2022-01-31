import java.util.Scanner;
/*
练习11:从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩 >= 最高分-10分  等级为A
成绩 >= 最高分-20分  等级为B
成绩 >= 最高分-30分  等级为C
其余                等级为D
*/
class Lesson11{
	public static void main(String[] args){
		//使用Scanner，读取学生个数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数： ");
		int number = scan.nextInt();

		//创建数组，存储学生成绩：动态初始化
		int[] scores = new int[number];

		//给数组中的元素赋值
		System.out.println("请输入" + number + "个学生成绩： ");
		for(int i = 0;i < scores.length;i++){
			scores[i] = scan.nextInt();	
		}

		//获取数组中的元素的最大值：最高分
		int maxScore = 0;
		for(int i = 0;i < scores.length;i++){
			if(maxScore < scores[i]){
				maxScore = scores[i];
			}
		}

		//根据每个学生的成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		char level;
		for(int i = 0;i < scores.length;i++){
			if(maxScore - scores[i] <= 10){
				level = 'A';
			}else if(maxScore - scores[i] <= 20){
				level = 'B';
			}else if(maxScore - scores[i] <= 30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("student " + i + " score is " + 
				scores[i] + ", grade is " + level);
		}
	}
}


/*
使用二维数组打印一个10行杨辉三角。
第一行有1个元素，第n行有n个元素；
每一行的第1个元素和最后一个元素都是1
从第三行开始，对于非第一个元素和最后一个元素的元素，即：
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
*/
class Lesson12{
	public static void main(String[] args){
		//声明并初始化二维数组
		int [][] yangHui = new int [10][];
		//给数组的元素赋值
		for(int i = 0; i < yangHui.length;i++){
			yangHui[i] = new int[i + 1];
			//给首末元素赋值
			yangHui[i][0] = yangHui[i][i] = 1;
			//给每行的非首末元素赋值
			if(i > 1){
				for(int j = 1;j < yangHui[i].length - 1;j++){
				yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
				}
			}
		}
		// 遍历二维数组
		for(int i = 0;i < yangHui.length;i++){
			for(int j = 0;j < yangHui[i].length;j++){
				System.out.print(yangHui[i][j] + " ");
			}
			System.out.println();
		}
	}
}


/*创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。
同时要求元素的值各不相同
*/
class Lesson13{
	public static void main(String[] args){
		int[] arr = new int[6];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() * 30 + 1);

			for(int j = 0; j < i;j++){
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}

		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}


/*
输入一个数，创建回型数组
*/
class Lesson14{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int len = scan.nextInt();
		int[][] arr = new int[len][len];
		int s = len * len;
		int left = 0;
		int top = 0;
		int right = len - 1;
		int bot = len - 1;
		int dir = 0;
		int m = 1;


		while (left <= right && top <= bot) {

			if(dir % 4 == 0){
				for(int j = left;j <= right;j++){
					arr[top][j] = m;
					m++;
				}
				dir++;
				top++;
			}
			if(dir % 4 == 1){
				for(int i = top;i <= bot;i++) {
					arr[i][right] = m++;
				}
				dir++;
				right--;
			}
			if (dir % 4 == 2) {
				for (int j = right;j >= left;j--) {
					arr[bot][j] = m++;
				}
				dir++;
				bot--;
			}
			if(dir % 4 == 3) {
				for(int i = bot;i >= top;i--) {
					arr[i][left] = m++;
				}
				dir++;
				left++;
			}
		}
		for(int i = 0;i < len;i++) {
			for (int j = 0;j < len; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}


/*
定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
然后求出所有元素的最大值，最小值，和值，平均值，并输出出来
要求所有随机数都是两位数
*/
class Lesson15{
	public static void main(String[] args){
		int[] arr = new int [10];

		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() * 90 + 10);
		}


		for(int i = 0;i < arr.length;i ++){
			System.out.print(arr[i] + "\t");
		}

		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("最大值为： " + max);

		int min = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("最小值为： " + min);

		int sum = 0;
		for(int i = 0;i < arr.length;i++){
			sum += arr[i];
		}
		int average = sum / arr.length;
		System.out.println("和为： " + sum);
		System.out.println("平均数为： " + average);
	}
}


/*
创建一个名为Lesson16的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
使用大括号{}把array1初始化为8个素数：2，3，5，7，11，13，17，19
显示array1的内容
赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值（如array[0]=0,array[2]=2。打印出array1
*/
class Lesson16{
	public static void main(String[] args){
		int[] array1,array2;
		array1 = new int[]{2,3,5,7,11,13,17,19};
		for(int i = 0;i < array1.length;i++){
			System.out.print(array1[i] + "\t");
		}

		//数组的复制
		array2 = new int[array1.length];
		for(int i = 0;i < array2.length;i++){
			array2[i] = array1[i];
		}

		for(int i = 0;i < array2.length;i++){
			if(i % 2 ==0){
				array2[i] = i;
			}
		}
		System.out.println();
		for(int i = 0;i < array1.length;i++){
			System.out.print(array1[i] + "\t");
		}
	}
}
/*
数组的复制，反转演示
*/
class Lesson17{
	public static void main(String[] args){
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		//数组的复制
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++){
			arr1[i] = arr[i];
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}

		//数组的反转:方式一
		for(int i = 0;i < arr.length / 2;i++){
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		//数组的反转：方式二
		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}


/*
数组的查找/搜索
*/
class Lesson18{
	public static void main(String[] args){
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		//查找（或搜索）
		//线性查找：
		String dest = "BB";
		boolean isFlag = true;
		for(int i = 0;i < arr.length;i++){
			if(dest.equals(arr[i])){
				System.out.println("找到了指定的元素，位置为： " + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag){
		System.out.println("很遗憾，没有找到");
		}
	}
}









