package algorithm;

import java.util.Arrays;
/**
 * 问题：输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * 思路：
 *	设置两个指针，一个指向开头，一个指向结尾，同时向中间移动
 * 	如果头指针指向的数是偶数，并且尾指针指向的数是奇数，就交换两个数
 * 	直到两个指针相遇为止
 * 	时间复杂度为O(n)
 * */
public class OddEvenArray {
	public static int[] oddEvenSort(int[] array){
		int front = 0, end = array.length-1;
		while(front < end){
			//如果前面的数是偶数
			if(array[front]%2!=0){
				front++;
			}
			else if(array[end]%2==0){
				end--;
			}
			else{
				int tmp = array[front];
				array[front] = array[end];
				array[end] = tmp;
			}
			
		}
		return array;
	}
	public static void main(String args[]){
		int[] array = {1,3,4,5,6,3,2,4,6,3,2,3,5,6,2};
		OddEvenArray.oddEvenSort(array);
		System.out.println(Arrays.toString(array));//有一个缺点：改变了原来奇数，偶数的顺序
	}
}
