package com.practice.kickstart.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
	/*
	 * Task is to make Camel-case every String from a list of string 
	 * where the strings will consists of (A-Z),(a-z),(0-9) and space(" ")
	 */
	public static void practiceMethod(List<String> stringList){
    	List<String> processedList = new ArrayList<>();
    	for(String string : stringList) {
    		processedList.add(processStringToCamelCase(string));
    	}
    	for(String string: processedList) {
    		System.out.print(string);
    	}
    }

	public static String processStringToCamelCase(String string) {
		List<String> splittedString = Arrays.asList(string.split(" "));
		boolean isStarting = true;
		StringBuilder processedString = new StringBuilder();
		for(String splitedPart : splittedString) {
			if(isStarting) {    				
				processedString.append(makeFirstCharecterToLowercase(splitedPart));
				isStarting = false;
			}else {
				processedString.append(makeFirstCharecterToUppercase(splitedPart));
			}
		}
		return processedString.toString();
	}
	
	public static String makeFirstCharecterToLowercase(String string) {
		if(string.length()==0) {
    		return "";
    	} else if(string.length()==1) {
    		return string.toLowerCase();
    	}
		return string.substring(0,1).toLowerCase().concat(string.substring(1));
	}
	
	public static String makeFirstCharecterToUppercase(String string) {
		if(string.length()==0) {
    		return "";
    	} else if(string.length()==1) {
    		return string.toUpperCase();
    	}
		return string.substring(0,1).toUpperCase().concat(string.substring(1));
	}


}
