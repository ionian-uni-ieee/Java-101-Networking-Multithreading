**1. Γράψτε ένα πρόγραμμα που να ζητάει και να δέχεται Input από τον χρήστη (ότι θέλετε εσείς) και μετα το εμφανίζει στην οθόνη**

<details><summary>Hint</summary>
<p>
Χρησιμοποιήστε τις κλάσεις BufferedReader και InputStreamReader
  </p>
  </details>

<details><summary>Code example</summary>
  <p>

```java
import java.io.*;
public class Test {
  public static void main(String[] args){	
  String output;
    try{
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(in);
      System.out.println("Say something");
      output = reader.readLine();
      System.out.println(output);
    }
    catch(Exception e){
      System.out.println("Oops, something went wrong!");
    }
  }
}
```

</p>
</details>
