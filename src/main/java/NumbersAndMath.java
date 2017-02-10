public class NumbersAndMath {
  public static void main (String[] args) {
    System.out.println( "I will now count my chickens:" );

    System.out.println( "Hens " + ( 25 + 30 / 6 ) );
    System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

    System.out.println( "Now I will count the eggs:" );

    System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

    System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

    System.out.println( 3 + 2 < 5 - 7 );

    System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
    System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

    System.out.println( "Oh, that's why it's false." );

    System.out.println( "How about some more." );

    System.out.println( "Is it greater? " + ( 5 > -2 ) );
    System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
    System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );

/*

Why is the % character called "modulus" instead of "percent"?
Mostly that's just how the designers of Java chose to use that symbol. In normal writing you are correct to read it as a "percent", as in "100%" is "one hundred percent". In programming this calculation is typically done with simple division and the / operator. The % modulus is a different operation that just happens to use the % symbol.

How does modulus (%) work?
Another way to say it is, "X divided by Y with J remaining." As in, "100 divided by 16 with 4 remaining." The result of % is the J part, or the remainder part.

What is the order of operations?
In the United States we use an acronym called PEMDAS which stands for Parentheses Exponents Multiplication Division Addition Subtraction. That's the order Java follows as well.

Why does / (divide) round down?
It's not really rounding down, it's just dropping the fractional part after the decimal. Try doing 7.0 / 4.0 and compare it to 7 / 4 and you'll see the difference. The first way uses "floating point division" and the second way uses "integer division".

*/
  }
}