package sort;

/**
 * 快速排序
 * 实际排序中最好的选择：平均性能好
 * 时间复杂度：平均O(nlogn),最坏O(n^2)
 * */
public class QuickSort {
	
	public static void sort(int[] list){
		sort(list, 0, list.length-1);
	}
	/**
	 * 算法思想：分治法
	 * 1.分解：数组被划分成两个子数组，使得左边的每个元素都小于枢纽元，右边的每个元素都大于枢纽元
	 * 2.解决：通过递归调用快速排序，对左右两个子数组分别排序
	 * */
	public static void sort(int[] list, int lo, int hi){
		if(hi <= lo){
			return;
		}
		int j = partition(list, lo, hi);
		sort(list, lo, j-1);
		sort(list, j+1, hi);
	}
	
	/**
	 * 分解子数组list[lo..hi] 使得 list[lo..j-1] <= a[j] <= a[j+1..hi]
	 * 返回枢纽元 j
	 * */
	public static int partition(int[] list, int lo, int hi){
		int i = lo;
		int j = hi;
		int pivot = list[lo];
		while(true){
			while(list[i] <= pivot){
				i++;
				if(i == hi){
					break;
				}
			}
			while(list[j] >= pivot){
				j--;
				if(j == lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			//交换两个元素
			exchange(list,i,j);
		}
		exchange(list,lo,j);
		return j;
	}
	/**
	 * 交换数组中的两个元素
	 * @param list 元素所在数组
	 * @param i 要交换的元素下标
	 * @param j 要交换的元素下标
	 * */
	public static void exchange(int[] list, int i, int j){
		int tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	}
}
