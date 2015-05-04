package sort;

/**
 * 优化的插入排序
 * 减少交换次数
 * 稳定
 * 时间复杂度：平均O(n^2);最坏O（n^2);最好O(n)
 * */
public class InsertionSort2 {
	public static void sort(int[] list){
		for(int i=1; i<list.length; i++){
			int tmp = list[i];//需要比较的元素
			int j=i-1;//从前一个元素开始比较
			while(j>=0 && tmp<list[j]){
				list[j+1] = list[j];//比当前元素大的，逐个后移，腾出位置
				j--;
			}
			list[j+1]= tmp;//合适的位置，直接插入元素
		}
	}
}


