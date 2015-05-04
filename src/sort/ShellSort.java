package sort;

/**
 * ϣ������
 * ���ȶ�
 * ʱ�临�Ӷȣ�ƽ������ȷ���������O(n),�O(n^2)-�˻���ֱ�Ӳ���
 * */
public class ShellSort {
	public static void sort(int[] list){
		int N = list.length;
		//�������㣺3x+1
		int h = 1;
		while(h < N/3){
			h = 3*h +1;
		}
		
		while(h>=1){
			for(int i=h; i<N; i++){
				//ÿһ����ֱ�Ӳ�������
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
