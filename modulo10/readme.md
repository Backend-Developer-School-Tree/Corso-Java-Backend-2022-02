## MyStringBuilder 🛴

Progettare una classe `MyStringBuilder` che consenta di costruire una stringa (che possiamo "wrappare" in una classe
`MyString`) e di concatenarne altre step-by-btep.

Il risultato finale dovrebbe essere analogo al comportamento della classe `StringBuilder` già esistente
([qui](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html) la documentazione).

```Java
StringBuilder sb = new StringBuilder();

sb.append("Facilissimo")
  .append(" concatenare")
  .append(" stringhe!");

String finalString = sb.toString();

System.out.println(finalString);
```

La classe `MyStringBuilder` dovrà quindi implementare almeno:
- la possibilità di costruire una `MyString` a partire da una stringa o partendo da zero
- un metodo `append` che consenta di aggiungere una stringa all'istanza attuale 
- un metodo `build` che si occupi di costruire e restituire l'istanza finale della classe `MyString`

E consentire la corretta esecuzione del seguente codice:

```Java
MyStringBuilder msb = new MyStringBuilder(); 
// oppure MyString.Builder msb = new MyString.Builder();
// se avete utilizzato una classe innestata

msb.append("Facilissimo")
  .append(" concatenare")
  .append(" stringhe!");

MyString myFinalString = msb.build();

System.out.println(myFinalString.toString());
```

Feel free to improve your StringBuilder!