package day21accessmodifiersinheritance;

public class Student {

    /*
            Access Modifier
            1)public
            2)protected
            3)default (Access modifier ı default yapmak için access modifier yazmayız)
            4)private

            ********************************************************************************************************************

            ***Interview Soruları***

            Note: Access Modifier'ları genişten dara doğru sayınız.
            public > protected > default > private

            Note: Access Modifier'ları birer birer açıklayınız.
            -public her class'tan ulaşalılabilir.
            -protected olanlar başka package'lerden kullanılamazlar ancak başka package'de "child class" içinden kullanılabilir.
            -default olanlar başka package'den kullanılamazlar.
            -private olanlar sadece oluşturuldukları class içinde kullanılabilirler.

            Note: protected ile default farkını söyleyiniz.
            -protected olanlar başka package'lerden kullanılamazlar ancak başka package'de "child class" içinden kullanılabilir.
            -default olanlar başka package'den kullanılamazlar.

            Note: Class lar için hangi Access Modifier'lar kullanılabilir
            public , default kullanılabilir ama protected ve private kullanılamaz.

            ********************************************************************************************************************


    */

    //public her class'tan ulaşalılabilir.
    public String stdNames = "Tom Hanks";

    //protected olanlar başka package'lerden kullanılamazlar ancak başka package'de "child class" içinden kullanılabilir.
    protected String address = "Miami";

    //default olanlar başka package'den kullanılamazlar.
    String email = "th@gmail.com";

    //private olanlar sadece oluşturuldukları class içinde kullanılabilirler.
    private String stdId = "20206517004";




}
