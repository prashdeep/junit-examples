package com.sapient.soap.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.sapient.soap.test.ArrayOftContinent;
import com.sapient.soap.test.CountryInfoService;
import com.sapient.soap.test.CountryInfoServiceSoapType;
import com.sapient.soap.test.TContinent;
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
	public void testCurrencyByIsoCode() {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType countryInfoServiceSoap = countryInfoService.getCountryInfoServiceSoap();
		
		TCurrency currency = countryInfoServiceSoap.countryCurrency("IN");
		
		assertEquals("INR", currency.getSISOCode());
		
		
	}

}
