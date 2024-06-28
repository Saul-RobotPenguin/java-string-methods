public class Contain {
    public static void main(String[] args) {
        String str1 = "Learn Java";


        Boolean result;

        // check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result);  // true

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);  // false

        // check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);  // true


         str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));


        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false


         s1="Perscholas";
         s2="Perscholas";
         s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)


        s1="Perscholas";
        s2="Perscholas";
        s3="Perschola";
        s4="PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )




    }
}
