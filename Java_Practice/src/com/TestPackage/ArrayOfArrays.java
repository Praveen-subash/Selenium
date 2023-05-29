package com.TestPackage;

 class ArrayOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3D Array
		int[][][] a = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		System.out.println(a.length); //a.length is 2
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {// we are traversing to first and second 2D arrays
				
				for(int k=0;k<a[i][j].length;k++) { //
					
					System.out.println("the value of "+i+","+j+","+k+" is "+a[i][j][k]);
					
				}
					
			}
			
		}
		
		//Using For Each loop
		for(int[][] array2D : a) {  //Here, we are getting each in the form of 2D array first
			
			for(int array1D[] : array2D ) {  //In that 2D array, we are getting each in the form of 1D array
				
				for(int z : array1D) {
					
					System.out.println(z);
				}
					
			}
				
		}
	
		//2D Array
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(b.length); // b.length is 3 where each value of b is a 1D array
		//b[0] will have 1,2,3. b[1] will have 4,5,6. b[2] will have 7,8,9.
		
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				
					System.out.println("the value of "+i+","+j+" is "+b[i][j]);
					
			}
			
		}
		
		
		//Using for each loop
		for(int[] array1D : b) {  //Here, we are getting each in the form of 1D array first
			
			for(int y : array1D) {  //And then we are iterating from array x
				
				System.out.println(y);
			}
			
		}
		
		
		
	}
	
	void m1() {
		
		System.out.println("Method m1 with default access modifier");
	}

}