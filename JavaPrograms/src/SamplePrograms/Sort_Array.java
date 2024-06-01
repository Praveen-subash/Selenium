package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {37,12,0,1,96,12};
		int temp;
		
		//DUPLICATE ELEMENTS
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
					
				}
		
				
			}
			
	
			
		}
		System.out.println("---");
		
		
		//DESCENDING
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
		
				
			}
			
	
			
		}
		
		for(int k:a) {
			
			System.out.println(k);
			
		}
		System.out.println("---");
		
		//ASCENDING
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
		
				
			}
			
	
			
		}
		
		for(int k:a) {
			
			System.out.println(k);
			
		}
		System.out.println("---");
		
		

		}
		
		
	}


