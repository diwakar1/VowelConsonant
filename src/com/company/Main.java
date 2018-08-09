package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " theie is a mouse";
        String s3 = "I am exicted";
        System.out.println( " first method");
        findNumberOfVowelsAndcons(s1);
        findNumberOfVowelsAndcons(s2);
        findNumberOfVowelsAndcons(s3);

        System.out.println( "second method");
        findNumberOfVowelsAndcons(s1);
        findNumberOfVowelsAndcons(s2);
        findNumberOfVowelsAndcons(s3);




    }
    public  static void findNumberOfVowelsAndcons( String s)
    {
        int vowelsCount = 0;
        int consCount = 0;
        String vowels = "aeiouy";
        String normalized = (s.toLowerCase()).trim();
        char[] sCharArry = normalized.toCharArray();
        for(char c : sCharArry)
        {
            if (vowels.indexOf(c) !=-1)
            {
                vowelsCount++;
            }
            else if(c!= ' ')
            {
                consCount++;
            }
        }
        System.out.println(" there are " + vowelsCount + " vowels in " + s);
        System.out.println(" there are " + consCount + " constants in " + s);
    }
    public static void findNumberOfVowelsAndConsAscii( String s)
    {
        int vowelCounts = 0;
        int consCounts = 0;
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i< s.length(); i++)
        {
            int asciiValue = s.charAt(i);
            if((asciiValue<=90 && asciiValue>=65)
                    || asciiValue<=122&&asciiValue>=97)
            {

                if(vowels.contains(Character.toString(s.charAt(i))))
                {
                    vowelCounts++;
                }else
                {consCounts++;

                }
            }
        }
        System.out.println(" there are " + vowelCounts + " vowels in " + s);
        System.out.println(" there are " + consCounts + " constants in " + s);
    }
}

