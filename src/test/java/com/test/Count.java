package com.test;

import java.util.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count {

	

			public static void main(String[] args) {

				String s= "Keerthana keerthana keerthana is a good girl";
				Map<String,Integer> mymap = new LinkedHashMap<String,Integer>();
				String[] ch = s.toLowerCase(). split(" ");
				for( String c:ch)
				{
					if(mymap.containsKey(c))
					{
						Integer x = mymap.get(c);
						mymap.put(c, x+1);
						
					}
					else
					{
						mymap.put(c,1);
					}
					
				}
				System.out.println(mymap);
				
				for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
					if(entry.getKey().equals("keerthana"))
					{
						System.out.println(entry.getKey()+"="+entry.getValue());
					}
					
				}
				
			}

		}

	
