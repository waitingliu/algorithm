package sort;

/**
 * �Ż��Ĳ�������
 * ���ٽ�������
 * �ȶ�
 * ʱ�临�Ӷȣ�ƽ��O(n^2);�O��n^2);���O(n)
 * */
public class InsertionSort2 {
	public static void sort(int[] list){
		for(int i=1; i<list.length; i++){
			int tmp = list[i];//��Ҫ�Ƚϵ�Ԫ��
			int j=i-1;//��ǰһ��Ԫ�ؿ�ʼ�Ƚ�
			while(j>=0 && tmp<list[j]){
				list[j+1] = list[j];//�ȵ�ǰԪ�ش�ģ�������ƣ��ڳ�λ��
				j--;
			}
			list[j+1]= tmp;//���ʵ�λ�ã�ֱ�Ӳ���Ԫ��
		}
	}
}


