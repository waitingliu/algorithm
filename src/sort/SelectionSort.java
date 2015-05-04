package sort;

import java.util.Arrays;
/**
 * 最简单的排序
 * 第一趟：找到最小的元素，交换位置到第一个
 * 第二趟：找到第二小的元素，交换到第二个
 * ...
 * 不稳定
 * 时间复杂度：平均、最好、最坏O(n^2)
 * */
public class SelectionSort {
	public static void sort(int[] list){
		for(int i=0; i<list.length; i++){//第i躺排序
			int min = i;//假设第一个最小
			//与后面所有元素比较，找出最小的
			for(int j=i+1; j<list.length;j++){
				if(list[j]<list[min]){
					min = j;
				}
			}
			//将最小的元素交换到最前面
			if(min != i){
				int tmp = list[i];
				list[i] = list[min];
				list[min] = tmp;
			}
		}
	}
	public static void main(String args[]){
		int[] list = {100,32,54,2,8,45,23,2,5,2,21,45};
		SelectionSort.sort(list);
		System.out.println(Arrays.toString(list));
	}
}
