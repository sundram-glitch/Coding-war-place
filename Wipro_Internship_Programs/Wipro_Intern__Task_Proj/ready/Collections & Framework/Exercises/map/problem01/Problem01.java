package com.wipro.org.map.problem01;

import java.util.*;
import java.util.Map.Entry;
public class Problem01 {
  HashMap<String, String> mapObj = new HashMap<>();
  String saveCountryCapital(String country, String capital) {
	  return mapObj.put(country, capital);
  }
  String getCapital(String country) {
	  return  mapObj.get(country)==null?"No Country Found":mapObj.get(country);	  
  }
  String getCountry(String capital) {
	  for (Entry<String, String> itr : mapObj.entrySet()) 
		  if(itr.getValue().equalsIgnoreCase(capital))return itr.getKey();
	  return "No Country Found";	  
  }
  Map copyMapObj() {
	  HashMap<String , String> newMap = new HashMap< >();
	  for (Entry<String, String> itr : mapObj.entrySet()) 
		newMap.put(itr.getValue(), itr.getKey());
	  return newMap;
  }
  ArrayList copyCountry(){
	  ArrayList<String> list = new ArrayList<>();
	  for (Entry<String, String> itr : mapObj.entrySet()) 
		 list.add(itr.getKey());
	  return list;
  }
  ArrayList copyCapital(){
	  ArrayList<String> list = new ArrayList<>();
	  for (Entry<String, String> itr : mapObj.entrySet()) 
		  list.add(itr.getValue());
	  return list;
  }
}
