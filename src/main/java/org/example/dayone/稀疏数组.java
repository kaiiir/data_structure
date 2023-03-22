package org.example.dayone;

import org.apache.commons.lang3.StringUtils;

/**
 * @author gongkang
 * @date 2023年03月22日 10:56
 */
public class 稀疏数组 {

	/**
	 *    行 列 值
	 * 0  6  6  2
	 * 1  1  2  1
	 * 2  2  3  2
	 *
	 * 1. 稀疏数组第一行表示原数组有多少行，多少列，有多少个非零元素（有效值）
	 * 2. 稀疏数组行和列是从0开始的
	 * 3. 稀疏数组的行数等于有效值+1，列数固定都为3
	 */
	public static void main(String[] args) {
		int[][] cheArr = new int[5][5];
		cheArr[1][2] = 1;
		cheArr[2][3] = 2;

		//计算有效数字
		int sum = 0;
		for (int[] ints : cheArr) {
			for (int anInt : ints) {
				if(anInt != 0){
					sum++;
				}
			}
		}
		//根据有效数数量创建稀疏数组
		//arr[1+sum][3]
		int[][] sx = new int[1+sum][3];
		sx[0][0] = cheArr.length;
		sx[0][1] = cheArr[0].length;
		sx[0][2] = sum;


	}

	public static void day(int[][] cheArr){
		for (int[] strings : cheArr) {
			for (int string : strings) {
				if(string == 0){
					System.out.print("0");
				}else if(string == 1){
					System.out.print("1");
				}else if(string == 2){
					System.out.print("2");
				}
			}
			System.out.println("");
		}
	}
}
