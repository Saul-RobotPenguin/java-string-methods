public class Compare {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal

        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));


        String string1 = "Java is fun";
        int result;

        // getting index of character 's'
        result = string1.indexOf('s');

        System.out.println(result); // 6

        // getting index of character 'J'
        result = string1.lastIndexOf('J');
        System.out.println(result); // 0

        result = string1.lastIndexOf('a');
        System.out.println(result); // 3

        // character not in the string
        result = string1.lastIndexOf('j');
        System.out.println(result); // -1

        // getting the last occurrence of "ava"
        result = string1.lastIndexOf("ava");
        System.out.println(result); // 1

        // substring not in the string
        result = string1.lastIndexOf("java");
        System.out.println(result); // -1








    }
}

