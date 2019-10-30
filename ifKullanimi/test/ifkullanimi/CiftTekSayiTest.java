package ifkullanimi; 

import org.junit.BeforeClass;
import org.junit.Test; 
import static org.junit.Assert.assertEquals;

public class CiftTekSayiTest {
    
    private static CiftTekSayi ifElseObject;
    private int number;

    @BeforeClass
    public static void beforeIfElseClass() { 
        ifElseObject = new CiftTekSayi(); 
    }

    @Test
    public void ciftSayiKontrol() { 
        number = 20;
        assertEquals("Cift Sayi", ifElseObject.checkNumber(number)); 
    }

    @Test
    public void tekSayiKontrol() { 
        number = 15;
        assertEquals("Tek Sayi", ifElseObject.checkNumber(number)); 
    }
}
