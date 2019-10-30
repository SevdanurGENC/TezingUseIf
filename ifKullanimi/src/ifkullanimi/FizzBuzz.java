package ifkullanimi;
//    1 ile 100 arasında bir sayı al eğer sayı 3’e tam bölünüyorsa string “Fizz” değerini döndür.
//    1 ile 100 arasında bir sayı al eğer sayı 5’e tam bölünüyorsa string “Buzz” değerini döndür.
//    1 ile 100 arasında bir sayı al eğer sayı 3 ve 5’e tam bölünüyorsa string “FizzBuzz” değerini döndür.
//    1 ile 100 arasında bir sayı al eğer sayı 3 ve 5’e tam bölünmüyorsa string “Girilen sayı 3 ve 5’e tam bölünmüyor.” değerini döndür.
//    Eğer girilen sayı 1 ile 100 arasında değilse string “Girilen sayı 1 ile 100 arasında olmalıdır.” değerinin döndür.

public class FizzBuzz {
    
    public String sayiKontrol(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        }
        if (x % 3 == 0) {
            return "Fizz";
        }
        if (x % 5 == 0) {
            return "Buzz";
        }
        if (x % 3 != 0 && x % 5 != 0) {
            return "Girilen sayı 3 ve 5'e tam bölünmüyor.";
        }
        if (x < 1 && x > 100) {
            return "Girilen sayı 1 ile 100 arasında olmalıdır."; 
        } 
        return null;
    } 
}
