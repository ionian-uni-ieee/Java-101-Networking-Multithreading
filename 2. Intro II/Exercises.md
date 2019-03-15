
**1. Φτιάξτε μία κλάση με το όνομα Robot. Η κλάση θα πρέπει να έχει δύο χαρακτηριστικά, μια μεταβλητή που θα κρατάει το βάρος του
και μία μεταβλητή που θα μας λέει αν ξέρει να πολεμάει ή οχι.**.

<details><summary>Code example</summary>
  <p>
    
```java
  public class Robot {    //Σε αρχείο με το όνομα Robot.java
      int weight;
      boolean canFight;
  }
```
    
</p>
</details>


---
---


**2. Τροποποιήστε την ίδια κλάση ώστε να δίνουμε τα χαρακτηριστικά του Robot που φτιάχνουμε κατά την δημιουργία του αντικειμένου, όχι μετά.**

<details><summary>Hint</summary>
<p>
  
  Θα πρέπει να χρησιμοποιήσουμε Constructor. Ο Constructor της κλάσης είναι μια ειδική μέθοδος που 
  καλείται κάθε φορά που δημιουργούμε ένα αντικείμενο. Ορίζουμε έναν Constructor όπως ορίζουμε μία μέθοδο αλλά πρέπει να έχει το όνομα της κλάσης
  και να μην έχει return type. Μπορούμε να ορίσουμε πολλούς διαφορετικούς constructors αρκεί να δέχονται διαφορετικά arguments ο καθένας
  
  ```java 
  public class Employee {    
  int salary;
  
    public Employee(int s){
        System.out.println("Hey Hey");
        salary = s;             //constructor που δέχεται ένα int argument και βάζει την τιμή του στον μισθό
    }

    public Employee(){
       System.out.println("Hey");
    }

    public static void main(String[] args){
        Employee e = new Employee();  //Ο κώδικας του constructor χωρίς arguments τρέχει οπότε εμφανίζεται Hey στην οθόνη
        Employee e = new Employee(3); //Ο κώδικας του contructor που δέχεται έναν ακέραιο τρέχει οπότε εμφανίζεται Hey Hey στην οθόνη και αρχικοποιείται ο μισθός του. 
    }
  } //class ends
  ```
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
  public class Robot {  //Σε αρχείο με το όνομα Robot.java
      int weight;
      boolean canFight;
      
      public Robot(int w , boolean b){
          weight = w;
          canFight = b;
      }
 }
      
```
    
</p>
</details>

---
---


**3. Στην κλάση Robot, βάλτε μια μεταβλητή που θα κρατάει το πόσα αντικείμενα Robot έχουν δημιουργηθεί. Μετά στην μέθοδο main δημιουργήστε
 μερικά αντικείμενα Robot και επιβεβαιώστε ότι δουλεύει**
 
 <details><summary>Necessary Hint</summary>
<p>
  
  Ένας αφελής τρόπος θα ήταν να δοκιμάσουμε κάτι τέτοιο:
   
  
  ```java 
 class Robot {
      int weight;
      boolean canFight;
      int robotCounter;
      
   public Robot(){
      robotCounter++;  //καλείται κάθε φορα που δημιουργείται αντικείμενο και αυξάνει τον robotCounter κατά ένα.
    }
    
    public static void main(String[] args){
        Robot b1 = new Robot();
        Robot b2 = new Robot();
        Robot b3 = new Robot();
        
        System.out.println(b3.robotCounter) // 1 . 
    }
   }//end class
  ```
  Γιατί μας δίνει 1 και όχι 3; Γιατί δεν μπορώ να μοιραστώ την ίδια μεταβλητή με όλα τα αντικείμενα; Που είναι οι global μεταβλητές μου;
  Γιατί μαθαίνω java;
  
  ### Το static keyword
  
  Το keyword static είναι κάτι που έχουμε δει αρκετές φορές , κυρίως στην main , αλλά δεν έχουμε μάθει ακόμα τι κάνει.
  Με λίγα λόγια, ότι είναι static, είναι το ίδιο για όλα τα αντικείμενα.
  
```java
 public class Foo {
    static int bar=10;
      
    public static void main(String[] args){
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        f1.bar = 100;
        System.out.println(f2.bar);  //100. Η μεταβλητή είναι ίδια για όλα τα αντικείμενα, την αλλάξαμε από το f1 οπότε άλλαξε και για  το f2
      }
  } //end class
```
  Τι είναι οι static μέθοδοι όμως;
  
  Όταν μία μέθοδος είναι static σημαίνει ότι θα τρέξει ακριβώς το ίδιο για όλα τα αντικείμενα.
  
```java
public class Foo{
   String textWithNoMeaning;
      
    public void scream(){
       System.out.println(textWithNoMeaning);
          
    public static void main(String[] args){
      Foo f1 = new Foo();
      Foo f2 = new Foo();
      f1.textWithNoMeaning = "hey";
      f2.textWithNoMeaning = "hoi";
         
      f1.scream();     //εμφανίζει hey στην οθόνη
      f2.scream();     //εμφανίζει hoi στην οθόνη
  }
} //end class
```
   Η scream θα εμφανίσει διαφορετικό μήνυμα ανάλογα με το ποιο αντικείμενο θα το καλέσει.
   Μια static μέθοδος θα τρέξει πάντα το ίδιο. Αυτό έχει τον περιορισμό οτι μία static μέθοδος δεν μπορεί να χρησιμοποιήσει μή-static
   μεταβλητές. Αυτές οι μεταβλητές είναι διαφορετικές για κάθε αντικείμενο, ποιου αντικειμένου μεταβλητές θα χρησιμοποιούσε;
      
  Ένα άλλο χαρακτηριστικό των static μεθόδων είναι οτι δεν χρειάζεται να φτιάξουμε αντικείμενο για να τις καλέσουμε. Αφου είναι το ίδιο για όλα τα αντικείμενα δεν υπάρχει λόγος. Μπορούμε απλά να τις καλέσουμε με το όνομα της κλάσης.
```java
   public class Employee{
      public static woo(){ 
        System.out.println("woo!");
      }
      
      public static void main(String[] args){
         Employee.woo();  //woo!
      }
   }
```
</p>
</details>

<details><summary>Code example</summary>
  <p>
    
```java
  class Robot {  //Σε αρχείο με το όνομα Robot.java
      int weight;
      boolean canFight;
      static int robotCounter;
   
   public Robot(){
      robotCounter++;  //καλείται κάθε φορα που δημιουργείται αντικείμενο και αυξάνει τον robotCounter κατά ένα.
    }
    
    public static void main(String[] args){
        Robot b1 = new Robot();
        Robot b2 = new Robot();
        Robot b3 = new Robot();
        
        System.out.println(b3.robotCounter) // 3 . 
    }
  }//end class
      
```
    
</p>
</details>

---
---

**4. Φτιάξτε μία κλάση Animal και μία κλάση Dog που θα κάνει inherit από την Animal. Μπορείτε να βάλετε ότι χαρακτηριστικά και μεθόδους
θέλετε**
  
  <details><summary>Hint</summary>
<p>

 Μία κλάση κάνει inherit από μία άλλη με το keyword `extends`
 
 ```java
 public class X extends Y {
 
 }
 ```
 
 Όταν μία κλάση κάνει inherit από μία άλλη κληρονομεί όλες τις μεθόδους και τα χαρακτηριστικά της, σαν τα είχε η ίδια
 
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
  public class Animal {   //Σε αρχείο Animal.java

    public void makeSound(){
        System.out.println("wooo!");
    }
  }


  public class Dog extends Animal{  //Σε διαφορετικό αρχείο με το όνομα Dog.java

     public void makeNewSound(){
        System.out.println("woof!");
     }
  }
```
    
  </p>
  </details>

---
---

**5. Φτιάξτε μία νέα κλάση Cat σε ένα αρχείο Cat.java που επίσης θα κάνει extend την κλάση Animal και φτιάξτε έναν πίνακα που θα μπορεί να δέχεται αντικείμενα και Cat και Dog**

<details><summary>Hint</summary>
<p>
  
  Ένα αντικείμενο Cat είναι και αντικείμενο Animal.

</p>
</details>
<details><summary>Code example</summary>
  <p>
    
```java
public class Tester {
  public static void main(String[] args){
   
   Animal[] arr = new Animal[10];
   arr[0] = new Dog();
   arr[1] = new Cat();
   arr[2] = new Dog();
   }
 }
      
```
    
</p>
</details>


---
---

**FINAL. Θέλουμε να φτιάξουμε το παιχνίδι Ναυμαχία. Αλλά επειδή δεν έχουμε μάθει GUI ακόμα το παιχνίδι θα παίζεται στο command line.
Το παιχνίδι είναι ο παίκτης ενάντια στον υπολογιστή. Με την εκκίνηση του παιχνιδιού ο υπολογιστής βάζει τρία πλοία τυχαία σε ένα 7x7 grid. Σκοπός του παίκτη είναι να βουλιάξει τα πλοία με τον μικρότερο αριθμό επιθέσεων. Σε κάθε γύρο ο παίκτης μαντεύει ένα σημείο στο 7x7 grid και ο υπολογιστής του λέει αν ήταν Hit ή Miss. Αν χτυπήσουμε όλα τα κουτάκια ενός πλοίου τότε το πλοίο βουλιάζει.
Επίσης δεν βουλιάζουμε πλοία, βουλιάζουμε γλώσσες προγραμματισμού**

![github-small](https://github.com/aMimikyu/test/blob/master/2/unknown.png)

  
 **Αυτός είναι ο τελικός στόχος αλλά θα κάνουμε κάτι πιο απλό για αρχή. Το παιχνίδι θα τρέχει σε 7 κουτάκια, όχι σε ένα 7x7 grid. θα υπάρχει μόνο μία γλώσσα προγραμματισμού (βάλτε μία που δεν σας αρέσει) και θα πιάνει 3 συνεχόμενα κουτάκια. O χρήστης θα μαντεύει ένα νούμερο από το 0 ως το 6 και το πρόγραμμα θα του λέει αν είναι Hit ή Miss. Αν ο χρήστης βρει και τα 3 κουτάκια τότε το πρόγραμμα του λέει οτι κέρδισε και του εμφανίζει το πόσες προσπάθειες χρειάστηκε.**

**Δείγμα:** 

![github-very-small](https://github.com/aMimikyu/test/blob/master/2/sample.png)
 
 **Τέλος σας δίνεται μία βοηθητική κλάση η οποία θα είναι υπεύθυνη για το input του χρήστη και την οποία θα χρησιμοποιήσετε ως εξής:**
 
 ```java
 GameHelper helper = new GameHelper();
 String guess = helper.getUserInput("enter a number");
 ```
 
 **ΜΗΝ προσπαθήσετε να καταλάβετε τον κώδικα της GameHelper, θα το δούμε σε επόμενο εργαστήριο**

<details><summary>Hint</summary>
<p>
 Όπως συνήθως, δεν έχει hint.
  </p>
  </details>

---


