package sort;


/**
 * 从左到右，每次移动一个元素到它合适的位置
 * 在元素基本有序的情况下效率高
 * 稳定
 * 时间复杂度：平均O(n^2);最坏O（n^2);最好O(n)
 * */
public class InsertionSort {
	public static void sort(int[] list){
		//外层循环数代表已经局部有序的元素个数
		for(int i=0; i<list.length; i++){
			for(int j=i; (j>0)&&(list[j]<list[j-1]); j--){
				//如果当前元素比它左边的元素小，交换，直到交换到它合适的位置（相当于在向左移动） 
				int swap = list[j];
			    list[j] = list[j-1];
			    list[j-1] = swap;
			}
		}
	}
}
