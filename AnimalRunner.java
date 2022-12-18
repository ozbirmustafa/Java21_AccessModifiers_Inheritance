package day21accessmodifiersinheritance;


public class AnimalRunner {
     /*
           1) "Inheritance" sayesinde
             i) Code tekrarlarından kurtuluruz
            ii) Code maintance(tamiri) kolay olur
           iii) Child Class'ları daha atomic yapmiş oluruz.

           2) Bir "Class"ı başka bir "Class"ın "Child Class"ı yapmak için "extends" keyword kullanılır.
              İlk yazılan Class Child, ikinci yazılan Class parent olur.

           3) Child Class objectleri Parent Class'dan method ve variable ları kullanabilir.

           4) Parent Class objectleri Child Class'dan method ve variable ları kullanamazlar. (Yukarıdan aşağı kullanım olmaz)

           5) Object Class her Class'ın parent'ıdır.
              Java'da Object Class hariç her Class ın parent i vardır.
              Java'da Parent Class'ı olmayan tek Class "Object Class"dır.
           6) "private" method ve variable'lar Child Class'lar tarafından kullanılamazlar.
              "protected" method ve variable'lar Child Class'lar tarafından kullanılabilir.
              "default" method ve variable'lar "aynı package"deki Child Class'lar tarafından kullanılabilir.
              "public" method ve variable'lar Child Class'lar tarafından kullanılabilir.

              Note: Child Class'lar tarafından kullanılabilir olmak "Inherit edilebilir" demektir.

           7) 4 tip Inheritance vardır
             i)Multilevel Inheritance: apartman tipi
            ii)Hierarchical Inheritance: Bir parent için çoklu child
           iii)Multiple Inheritance: JAVA DOES NOT SUPPORT
            iv)Single Inheritance: Bir Child Class için bir Parent Class
     */
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        System.out.println();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        System.out.println();

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();




    }
}
