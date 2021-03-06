package replit.StringPractice;

public class HasJava {

    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        int countJava = 0;
        int countPython = 0;

        while (sentence.contains("java") || sentence.contains("python")) {

            while (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", " ");
                countJava += 1;
                continue;
            }

            while (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", " ");
                countPython += 1;
                continue;
            }

        }

        boolean equal = countJava == countPython;

        System.out.println(equal);

    }
}





/*
        if (word.contains("java")))) || {
          boolean  hasJava = true;

        }else{
            hasJava = false;
        }
        System.out.println(hasJava);
*/



/*
if (word.equals(word.indexOf("java")) && word.startsWith("" + word.indexOf(0))){
      //      exists = true;
     //}else{
     //  exists = false;
    // }

Use String methods to check if the given word contains the text java, but not anywhere in the String.
The java text must be in either position 0 or position 1 of the String. If the text java appears in any
 other position it is not valid and is not considered to be found in the String. Output a boolean value,
  true or false.
Note: You won't be able to just use contains method
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    javapython

  Output:
    true

Copied!
Ex:
  Input:
    cjavac++

  Output:
    true
Ex:
  Input:
    c#javaruby

  Output:
    false

  -> The 'java' is not in positions 0 or 1
 */