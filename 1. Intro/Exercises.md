**1. Γράψτε πρόγραμμα που να εμφανίζει το μήνυμα "Hello World" στην οθόνη**.



<details><summary>Hint</summary>
<p>
  <b>Χρήσιμες εντολές:</b>
  
  `System.out.println("message");`
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
public class MyClass {
  public static void main(String[] args){
    System.out.println("Hello World");
  }
}
```
    
</p>
</details>


---



**2. Φτιάξτε μία κλάση με το όνομα Employee και τα ακόλουθα χαρακτηριστικά:**

- age
- salary

**και μία μέθοδο print() που να εμφανίζει στην οθόνη τα χαρακτηριστικά του κάθε αντικειμένου.**
  
  <details><summary>Hint</summary>
<p>

  Για να εμφανίσουμε μεταβλητές με την `System.out.println()` μπορούμε απλά να δώσουμε το όνομα της μεταβλητής.
  
  ```java
  int a = 3;
  System.out.println(a); //3
  ````
  
  Μπορούμε να ενώσουμε δύο Strings με το ` + ` . Αυτό λέγεται string concatenation.
  
`String s = "hello " + "world"; //hello world `   

 Όταν πρoσθέτουμε ένα String και κάτι άλλο το αποτέλεσμα είναι πάντα String.
 
 `String s = "hello " + 3; //hello 3`
  
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
public class Employee {
  int age;
  int salary;
  
  public void print(){
    System.out.println("Age: " + this.age + "\nSalary: " + this.salary);
  }
}
      
```
    
</p>
</details>

---


**3. Φτιάξτε μία νέα κλάση με το όνομα EmployeeTester που θα έχει μόνο την μέθοδο main. Εκεί φτιάξτε τρία νέα αντικείμενα τύπου Employee ,δώστε μισθό και ηλικία στο καθένα από αυτά και καλέστε την μέθοδο print()**

<details><summary>Hint</summary>
<p>
  
  Αν έχουμε 10 αντικείμενα Employee (10 υπαλλήλους) και γράψουμε απλά
  
  `print();`
  
  Ποιανού την ηλικία και μισθό θα εμφανίσει το πρόγραμμα;
  
  Μία μέθοδος είναι κάτι που μπορεί να κάνει **ένα αντικείμενο**. Ο κώδικας είναι ο ίδιος για όλα τα αντικείμενα αλλά το τι θα εμφανιστεί αλλάζει από αντικείμενο σε αντικείμενο.
  
  
  Για να καλέσουμε μία μέθοδο χρησιμοποιούμε το όνομα του αντικειμένου , τελεία και το όνομα της μεθόδου.
  
  Το ίδιο και για να αλλάξουμε μία μεταβλητή
  
  ```java 
  Employee e = new Employee();
  e.age = 32;
  e.salary = 1000;
  e.print();
  ```
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
public class EmployeeTester {
  public static void main(String[] args){
    
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    
    e1.age = 20;
    e1.salary = 592;
    
    e2.age = 41;
    e2.salary = 3000;
    
    e3.age = 30;
    e3.salary = 3100;
    
    e1.print();
    e2.print();
    e3.print();
  }
}
      
```
    
</p>
</details>


---

**4. Στην κλάση EmployeeTester φτιάξτε έναν πίνακα για υπαλλήλους και γεμίστε τον με τους υπαλλήλους που φτιάξατε.**

<details><summary>Hint</summary>
<p>
  
  Δηλώνουμε έναν πίνακα όπως θα δηλώναμε κάθε άλλη μεταβλητή, μόνο που βάζουμε brackets μετά τον τύπο της μεταβλητής για να δείξουμε οτι είναι ένας πίνακας.
  
  ```java 
  int[] arr;  //Μεταβλητή που θα δείχνει σε πίνακα ακεραίων
  ```
 Δημιουργούμε έναν πίνακα με το `new`
 
 ```java
 arr = new int[3];  //Νέος πίνακας ακεραίων με 3 θέσεις. Η μεταβλητή arr δείχνει σε αυτόν.
 ```
 
 Αν θέλουμε να αλλάξουμε ένα στοιχείο του πίνακα απλά χρησιμοποιούμε το όνομα της μεταβλητής και την θέση του πίνακα.
 
 ```java
 arr[0] = 3;
 ```
 
  </p>
  </details>

<details><summary>Code example</summary>
  <p>
    
```java
public class EmployeeTester {
  public static void main(String[] args){
    
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    
    e1.age = 20;
    e1.salary = 592;
    
    e2.age = 41;
    e2.salary = 3000;
    
    e3.age = 30;
    e3.salary = 3100;
    
    e1.print();
    e2.print();
    e3.print();
    
    Employee[] empArr = new Employee[3];
    empArr[0] = e1;
    empArr[1] = e2;
    empArr[2] = e3;
  }
}
```
</p>
</details>

---

**BONUS. Φτιάξτε πρόγραμμα που να εμφανίζει τους στοίχους από το τραγούδι [99 Bottles of Beer](http://www.99-bottles-of-beer.net/lyrics.html) στην οθόνη**

<details><summary>Hint</summary>
<p>
  
  Δεν έχει Hint
  </p>
  </details>
