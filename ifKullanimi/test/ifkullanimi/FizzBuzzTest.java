package ifkullanimi; 

import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;
 
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
 
    @Test
    public void sayininUceBolunmeDurumu() { 
        Assert.assertEquals("Fizz", fizzBuzz.sayiKontrol(3));
    }
 
    @Test
    public void sayininBeseBolunmeDurumu() {
        Assert.assertEquals("Buzz", fizzBuzz.sayiKontrol(5));
    }
 
    @Test
    public void hemUceHemBeseBolunmeDurumu() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.sayiKontrol(30));
    }
 
    @Test
    public void sayiUceVeBeseBolunmemeDurumu() {
        Assert.assertEquals("Girilen sayı 3 ve 5'e tam bölünmüyor.", fizzBuzz.sayiKontrol(7));
    }
 
    @Test
    public void birIleYuzArasindaOlmamaDurumu() {
        Assert.assertEquals("Girilen sayı 3 ve 5'e tam bölünmüyor.", fizzBuzz.sayiKontrol(101));
    }
 
    @After
    public void tearDown() {
        fizzBuzz = null;
    }
}
