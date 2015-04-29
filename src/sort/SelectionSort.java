package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void sort(int[] list){
		for(int i=0; i<list.length; i++){//��i������
			int min = i;//�����һ����С
			//���������Ԫ�رȽϣ��ҳ���С��
			for(int j=i+1; j<list.length;j++){
				if(list[j]<list[min]){
					min = j;
				}
			}
			//����С��Ԫ�ؽ�������ǰ��
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
