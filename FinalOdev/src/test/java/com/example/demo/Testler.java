package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")
public class Testler {
	// Kişileri Kontrol Testi
	@Test
	public void ListeKontrol() {
		//Given  - Koşullar - Ön Şartlar
	List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrenci1 ="Hakan";
			 String ogrenci2 ="ali";
			 String ogrenci3 ="simge";
			
	   //When 	
		
		ogrenciler.add(ogrenci1);
		ogrenciler.add(ogrenci2);
		ogrenciler.add(ogrenci3);
			
	  //Then - Kontrol	
			assertEquals("Atakan",ogrenci1);
			assertEquals("Ali",ogrenci2);
			assertEquals("Ayşe",ogrenci3);
			
			
		}
		 
		
		
	}
private void assertEquals(String string, String ogrenci1) {
		// TODO Auto-generated method stub
		
	}
@GetMapping("/ogrenciEkle/{ogrenciAdi}")
@Test
//OgrenciEkleTesti
//Given
public void   OgrenciEkle() {
	List<String> ogrenciler = new ArrayList<>();
	 {
		 String std1 ="Emrullah";
		 String std2 ="sevgi";
		 String std3 ="irem";
	 }
	 //When
	 String yeniogrenci="Emrullah";
	 ogrenciler.add(yeniogrenci);
	 //Then
	 assertEquals(yeniogrenci,"Emrullah");
   
	}
}