package com.java.jsf.RichFaces;
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
@ManagedBean  
@RequestScoped  
public class Country {  
String CountryName;  
public List<String> countryList() {  
ArrayList<String> list = new ArrayList<>();  
list.add("India");  
list.add("Australia");  
list.add("Germany");  
list.add("Italy");  
list.add("United States");  
list.add("Russia");  
return list;  
}  
public String getCountryName() {  
return CountryName;  
}  
public void setCountryName(String CountryName) {  
this.CountryName = CountryName;  
}  
}  