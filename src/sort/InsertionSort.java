package sort;

public class InsertionSort {
	public static void sort(int[] list){
		for(int i=1; i<list.length; i++){
			int tmp = list[i];
			int j=i-1;//��ǰһ��Ԫ�ؿ�ʼ�Ƚ�
			while(j>=0 && list[j]>tmp){
				list[j+1] = list[j];//�������
				j--;
			}
			list[j+1]= tmp;//������ʵ�λ��
		}
	}
}
