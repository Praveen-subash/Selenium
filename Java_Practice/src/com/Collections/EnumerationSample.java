package com.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
  
        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements();
  
        // Method 1 of Enumeration
        while (e.hasMoreElements())
        {
        	// Method 2 of Enumeration
            int i = (Integer)e.nextElement();
  
            System.out.print(i + " ");
        }

	}

}
