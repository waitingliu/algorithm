package sort;

import java.util.Arrays;

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
