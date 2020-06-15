package com.example.demo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/ogrenci")
public class MainApp {

 

    private static List<Ogrenciler> ogrenciler = new ArrayList<>();
    static {
    	ogrenciler.add(new Ogrenciler("Hakan", 20));
    	ogrenciler.add(new Ogrenciler("ali", 29));
    	ogrenciler.add(new Ogrenciler("simge", 21));
    }
    
    @GetMapping("/bilgi")
    public List<Ogrenciler> listele(){
        return ogrenciler;
    }
    @PostMapping("/ekle")
    public  Ogrenciler Ekle(@RequestBody Ogrenciler ogrenci){
    	ogrenciler.add(ogrenci);
		return ogrenci;
    }
    
    @PostMapping("/sil")
    public  Ogrenciler sil(@RequestBody Ogrenciler ogrenci){
    	ogrenciler.add(ogrenci);
		return ogrenci;
    }
    
}
