package sort;

/**
 * ��������
 * ʵ����������õ�ѡ��ƽ�����ܺ�
 * ʱ�临�Ӷȣ�ƽ��O(nlogn),�O(n^2)
 * */
public class QuickSort {
	
	public static void sort(int[] list){
		sort(list, 0, list.length-1);
	}
	/**
	 * �㷨˼�룺���η�
	 * 1.�ֽ⣺���鱻���ֳ����������飬ʹ����ߵ�ÿ��Ԫ�ض�С����ŦԪ���ұߵ�ÿ��Ԫ�ض�������ŦԪ
	 * 2.�����ͨ���ݹ���ÿ������򣬶���������������ֱ�����
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
	 * �ֽ�������list[lo..hi] ʹ�� list[lo..j-1] <= a[j] <= a[j+1..hi]
	 * ������ŦԪ j
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
			//��������Ԫ��
			exchange(list,i,j);
		}
		exchange(list,lo,j);
		return j;
	}
	/**
	 * ���������е�����Ԫ��
	 * @param list Ԫ����������
	 * @param i Ҫ������Ԫ���±�
	 * @param j Ҫ������Ԫ���±�
	 * */
	public static void exchange(int[] list, int i, int j){
		int tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	}
}
