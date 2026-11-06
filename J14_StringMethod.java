public class J14_StringMethod {
    public static void main(String[] args) {

        String name = "  Bro Code  ";

        //length() – Find length of a string
        int length = name.length();

        //charAt()– Get character at a specific index
        char letter = name.charAt(3);

        //indexOf(): Returns the position of a character
        int index = name.indexOf("o");

        //lastIndexOf(): Returns last occurrence
        int lastIndex=name.lastIndexOf("o");

        name=name.toUpperCase();//Convert to uppercase
        name=name.toLowerCase();//Convert to lowercase

        name=name.trim();//Removes spaces from the beginning and end
        name=name.replace("o", "a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));
        System.out.println(name.equals("pass"));
        System.out.println(name.equalsIgnoreCase("bra cade"));


    }
}
// Summary of String Methods Used:
// length() – Returns the number of characters in the string.
// charAt(index) – Returns the character at a specific position.
// indexOf() – Returns the first occurrence index of a character or substring.
// lastIndexOf() – Returns the last occurrence index of a character or substring.
// toUpperCase() – Converts all characters of the string to uppercase.
// toLowerCase() – Converts all characters of the string to lowercase.
// trim() – Removes spaces from the beginning and end of the string.
// replace() – Replaces characters or substrings with new ones.
// isEmpty() – Checks whether the string is empty or not.
// contains() – Checks if the string contains a specified sequence of characters.
// equals() – Compares two strings and checks if they are exactly the same.
// equalsIgnoreCase() – Compares two strings ignoring uppercase and lowercase differences.