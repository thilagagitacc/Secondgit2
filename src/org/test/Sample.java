package org.test;

public class Sample {
	
	public static void main(String[] args) {
		
		String s = "Thilaga23Raju073";
        String numberOnly = s.replaceAll("[^0-9]", "");
        System.out.println(numberOnly);
      }
  }


