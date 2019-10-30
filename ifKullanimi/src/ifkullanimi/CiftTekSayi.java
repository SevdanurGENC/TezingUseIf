package ifkullanimi; 

public class CiftTekSayi { 

    public String checkNumber(int number) { 
        String answer = "";
        if(number%2 == 0) {   
            answer = "Cift Sayi";   
        } else { 
            answer = "Tek Sayi";  
        } 
        return answer; 
    }
}
