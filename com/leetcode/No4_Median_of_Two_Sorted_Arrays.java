package com.leetcode;

public class No4_Median_of_Two_Sorted_Arrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lan1 = nums1.length;
        int lan2 = nums2.length;
        if((lan1+lan2)%2==1)
        	return search(nums1,nums2,0,0,((lan1+lan2)>>1)+1);
        else
        	return (search(nums1,nums2,0,0,(lan1+lan2)>>1)+
        			search(nums1,nums2,0,0,((lan1+lan2)>>1)+1))/2;
        
    }

	private double search(int[] a, int[] b, int i, int j, int k) {
		int lan1 = a.length;
        int lan2 = b.length;
        if(lan1-i>lan2-j) return search(b,a,j,i,k);
        if(i>=lan1) return b[j+k-1];
        if(k==1) return a[i]<b[j]?a[i]:b[j];
        int index1 = i+Math.min(k>>1,lan1-i)-1;
        int index2 = j+(k-Math.min(k>>1,lan1-i))-1;
        if(a[index1]<b[index2]) return search(a,b,index1+1,j,k-(index1+1-i));
        else return search(a,b,i,index2+1,k-(index2+1-j));
	}
	public static void main(String[] args) {
		No4_Median_of_Two_Sorted_Arrays no = new No4_Median_of_Two_Sorted_Arrays();
		int[] a = {2};
		int[] b = {1,3};
		System.out.println(no.findMedianSortedArrays(a, b));
	}
}
