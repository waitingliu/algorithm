package algorithm;

import java.util.Arrays;
/**
 * ���⣺����һ���������飬�������������ֵ�˳��ʹ����������λ�������ǰ�벿�֣�����ż��λ������ĺ�벿�֡�
 * ˼·��
 *	��������ָ�룬һ��ָ��ͷ��һ��ָ���β��ͬʱ���м��ƶ�
 * 	���ͷָ��ָ�������ż��������βָ��ָ��������������ͽ���������
 * 	ֱ������ָ������Ϊֹ
 * 	ʱ�临�Ӷ�ΪO(n)
 * */
public class OddEvenArray {
	public static int[] oddEvenSort(int[] array){
		int front = 0, end = array.length-1;
		while(front < end){
			//���ǰ�������ż��
			if(array[front]%2!=0){
				front++;
			}
			else if(array[end]%2==0){
				end--;
			}
			else{
				int tmp = array[front];
				array[front] = array[end];
				array[end] = tmp;
			}
			
		}
		return array;
	}
	public static void main(String args[]){
		int[] array = {1,3,4,5,6,3,2,4,6,3,2,3,5,6,2};
		OddEvenArray.oddEvenSort(array);
		System.out.println(Arrays.toString(array));//��һ��ȱ�㣺�ı���ԭ��������ż����˳��
	}
}
