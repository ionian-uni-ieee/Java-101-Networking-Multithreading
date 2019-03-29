**1. Φτιάξτε δύο κλάσεις, μία κλάση Goblin και μία κλάση Orc, βάλτε ότι χαρακτηριστικά και μεθόδους κρίνετε απαραίτητα** 

---
---

**2. Φτιάξτε στην main έναν πίνακα που θα δέχεται αντικείμενα και  Goblin και Orc , εμφανίστε όλα τα στοιχεία του πίνακα μαζί με την πληροφορία για το αν το κάθε στοιχείο είναι Orc ή Goblin**

---
---



**3. Φτιάξτε μία κλάση Player με μία μέθοδο hitEnemy που δέχεται σαν όρισμα ένα αντικείμενο τύπου Killable. Αλλάξτε τις κλάσεις Goblin και Orc ωστε να μπορούν να δεχτούν ως ορίσματα από την μέθοδο hitEnemy**


---
---


**4. Δίνονται τα αρχεία E.java και ETester.java . Τι αποτέλεσμα θα εμφανιστεί αν τρέξουμε το ETester.java;** 


<details><summary>E.java</summary>
<p>

  ```java
  public class E {

	  public void riskyMethod() throws Exception{
		  //really risky code goes here
		  System.out.println("Succesfully took risk");
	  }
  }
```
</p>
</details>

<details><summary>ETester.java</summary>
<p>

  ```java
  public class ETester{
    public static void main(String[] args){
      E obj = new E();

      try {
        obj.riskyMethod();
      }
      catch(Exception e){
        System.out.println("Failed to take risk");
      }
    }
  }
```
</p>
</details>

---
---

**5. Τι θα εμφανίσει ο παρακάτω κώδικας;**

<details><summary>Code </summary>
<p>

```java

public class TestException {
	public static void main(String[] args){

		String test = "no";

		try {
			System.out.println("start try");
			doRisky(test);
			System.out.println("end try");
		}
		catch(ScaryException se){
			System.out.println("scary exception");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("end of main");
	}

	static void doRisky(String test) throws ScaryException {
		System.out.println("start risky");
		
		if("yes".equals(test)){
			throw new ScaryException();
		}
		System.out.println("end risky");
	}
}


class ScaryException extends Exception{

}
```
</p></details>

---
---


**6. Τι θα εμφάνιζε ο κώδικας της 5 αν η τρίτη γραμμή του κώδικα άλλαζε σε: String test = "yes" ;**

---
---


**BONUS. Επεκτείνετε το παιχνίδι** 
