package com.sapient.soap.junit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sapient.soap.test.ArrayOftContinent;
import com.sapient.soap.test.ArrayOftCountryCodeAndName;
import com.sapient.soap.test.CountryInfoService;
import com.sapient.soap.test.CountryInfoServiceSoapType;
import com.sapient.soap.test.ListOfCountryNamesByCode;
import com.sapient.soap.test.TContinent;
import com.sapient.soap.test.TCountryCodeAndName;
import com.sapient.soap.test.TCurrency;

public class SoapTest {
	
	@Test
	public void testCountryCode() {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType countryInfoServiceSoap = countryInfoService.getCountryInfoServiceSoap();
		
		ArrayOftContinent continents = countryInfoServiceSoap.listOfContinentsByName();
		
		List<TContinent> listOfContinents =  continents.getTContinent();
		
		assertEquals(6, listOfContinents.size());
	}
	

	
	@Test
	public void testCountryNameByName() {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType countryInfoServiceSoap = countryInfoService.getCountryInfoServiceSoap();
		
		ArrayOftCountryCodeAndName listOfCountryNames = countryInfoServiceSoap.listOfCountryNamesByName();
		
		List<TCountryCodeAndName> list = listOfCountryNames.getTCountryCodeAndName();
		
		assertEquals(246,list.size());
		
	}
	
	@Test
	public void testContinentByName() {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType countryInfoServiceSoap = countryInfoService.getCountryInfoServiceSoap();
		
		ArrayOftContinent listOfContinentNames = countryInfoServiceSoap.listOfContinentsByName();
		
		List<TContinent> list = listOfContinentNames.getTContinent();
		
		assertEquals(6,list.size());
		
	}
	
	@Test
	public void testCountryISOCode() {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType countryInfoServiceSoap = countryInfoService.getCountryInfoServiceSoap();		
		String ans = countryInfoServiceSoap.countryISOCode("INDIA");
		assertNotEquals("IN", ans);
		
		
	}
	

}
