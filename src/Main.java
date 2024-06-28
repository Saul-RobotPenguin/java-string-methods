public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String str1 = "Java";
        String str2 = "";

        //Length()
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());


        //IsEmpty()
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());



        //trim()
        String string1="  hello   ";
        System.out.println(string1+"how are you");        // without trim()
        System.out.println(string1.trim()+"how are you"); // with trim()


        String stoop1="HELLO HOW Are You?";
        String s1lower=stoop1.toLowerCase();
        System.out.println(s1lower);

        String step1="hello how are you";
        String s1upper=step1.toUpperCase();
        System.out.println(s1upper);








    }
}