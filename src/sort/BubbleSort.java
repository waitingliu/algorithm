package sort;

/**
 * �ȶ�
 * ʱ�临�Ӷȣ�ƽ��O(n^2)���O(n^2)�����O(n)
 * */
public class BubbleSort {
	public static void sort(int[] list){
		int flag;
		for(int i=list.length-1; i>0; i--){
			flag = 0;
			for(int j=0; j<i; j++){
				if(list[j] > list[j+1]){
					int tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
					flag = 1;
				}
			}
			if(flag == 0){
				break;
			}
		}
		
	}
}
