package sort;


/**
 * �����ң�ÿ���ƶ�һ��Ԫ�ص������ʵ�λ��
 * ��Ԫ�ػ�������������Ч�ʸ�
 * �ȶ�
 * ʱ�临�Ӷȣ�ƽ��O(n^2);�O��n^2);���O(n)
 * */
public class InsertionSort {
	public static void sort(int[] list){
		//���ѭ���������Ѿ��ֲ������Ԫ�ظ���
		for(int i=0; i<list.length; i++){
			for(int j=i; (j>0)&&(list[j]<list[j-1]); j--){
				//�����ǰԪ�ر�����ߵ�Ԫ��С��������ֱ�������������ʵ�λ�ã��൱���������ƶ��� 
				int swap = list[j];
			    list[j] = list[j-1];
			    list[j-1] = swap;
			}
		}
	}
}
