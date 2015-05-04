package sort;

/**
 * 希尔排序
 * 不稳定
 * 时间复杂度：平均（不确定），最好O(n),最坏O(n^2)-退化成直接插入
 * */
public class ShellSort {
	public static void sort(int[] list){
		int N = list.length;
		//步长计算：3x+1
		int h = 1;
		while(h < N/3){
			h = 3*h +1;
		}
		
		while(h>=1){
			for(int i=h; i<N; i++){
				//每一堆做直接插入排序
				for(int j=i; j>=h && list[j]<list[j-h];j-=h){
					int tmp = list[j];
					list[j] = list[j-h];
					list[j-h] = tmp;
				}
			}
			h /= 3;
		}
	}
}
