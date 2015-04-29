package sort;

public class InsertionSort {
	public static void sort(int[] list){
		for(int i=1; i<list.length; i++){
			int tmp = list[i];
			int j=i-1;//从前一个元素开始比较
			while(j>=0 && list[j]>tmp){
				list[j+1] = list[j];//逐个后移
				j--;
			}
			list[j+1]= tmp;//插入合适的位置
		}
	}
}
