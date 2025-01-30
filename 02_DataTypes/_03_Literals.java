// Any constant value which can be assigned to the variable is called literal or constant.
public class _03_Literals{
    public static void main(String[] args){
        // 01_Integer_Literals ==> For Integral data types (byte, short, int, long), we can specify literals in 4 ways:- 
            // Decimal literals (Base 10): In this form, the allowed digits are 0-9.
            int a1 = 101;
            System.out.println("Decimal equivalent of decimal 101: " + a1);

            /*
            Octal literals (Base 8): In this form, the allowed digits are 0-7.
            The octal number should be prefix with 0.
            */
            int a = 0146; 
            System.out.println("Decimal equivalent of octal 146: " + a); // display decimal equivalent value i.e. 102

            /*
            Hexa-decimal literals (Base 16): In this form, the allowed digits are 0-9, and characters are a-f. 
            The hexa-decimal number should be prefix with 0X or 0x.
            */
            int b = 0X12Fa;
            System.out.println("Decimal equivalent of hexadecimal 12Fa: " + b); // display decimal equivalent value i.e. 4858

            /*
            Binary literals: In this form, the allowed digits are 0 and 1. 
            Literals value should be prefixed with 0b or 0B.
            */
            int c=0b1011;
            System.out.println("Deciaml equivalent of binary 1011: " + c); // display decimal equivalent value i.e. 11

        // 02_Floating-Point literal==>For Floating-point data types, we can specify literals in only decimal form, and we cant specify in octal and Hexadecimal forms. 

            // Float Literal
            float d=12.55f;
            System.out.println("Float literal is " + d);

            // Double literal
            double e=12.55658d; // Using d at last is optional as it is default floating point literal
            System.out.println("Double literal is " + e);


        // 03_Character Literals ==> It can be specified in 4 ways

            //Single quote
            char ch1 = 'a';
            System.out.println("Single quote character: " + ch1);

            //Char literal as Integral literal
            char ch2 = 0146; // Here, 0146 is octal literal. hex, decimal, binary, etc are also allowed
            System.out.println("Char literal as Integral literal: " + ch2);

            // Unicode Representation: We can specify char literals in Unicode representation ‘\\uxxxx’. Here xxxx represents 4 hexadecimal numbers.
            char ch3 = '\u0041';// Here /u0061 represent a.
            System.out.println("Char literal of unicode 0041: " + ch3);


            // Escape Sequence: Every escape character can be specified as char literals.
            char ch4 = '\n'; // \n means new line. Other escape sequences are \n, \a, \t, etc.
            System.out.println("Escape sequence: " + ch4);

        // 04_String literals: Sequence of charactes within a double quotes.
        String name="Ram";
        System.out.println("String literal: " + name);

        // 05_Boolean literals: true or false(default)
        boolean isWorking=true;
        System.out.println("Boolean literal: " + isWorking);
    }
}