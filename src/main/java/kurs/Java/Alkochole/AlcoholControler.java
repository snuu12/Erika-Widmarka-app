package kurs.Java.Alkochole;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlcoholControler {
    //ścieżka swerwera localhost:8080/
    @GetMapping("/")
    public  String home(){
        return "alcohol";// zwróć plik alcohl.html
        // z folderu resources/templates
    }


    private AlcoholCounter alcoholCounter=new AlcoholCounter();


    //@RequesrParam automatycznie zamienia nam zmienne z adresue url na zmianne javowe
    @GetMapping ("/result")
    public String getResult(
        @RequestParam Double quantity,
        @RequestParam Double weight,
        @RequestParam String alcohol,ModelMap modelMap

    ){
        Alkohol alcocholEnum=Alkohol.valueOf(alcohol);// zamiana stringa na enum
        System.out.println("Wartosci: "+quantity + " "+weight+" "+alcohol);
       float result=alcoholCounter.calculatePerMil
                (quantity*100,weight,true,alcocholEnum);
        String resultString=String.format("%.2f",result);
        modelMap.put("result",resultString);

        return "result";// templates/result.html



    }

    }



    //@GetMaping("/hello" )// ; localhost:8080/hello



