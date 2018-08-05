
/**
 * FunctionalInterface Tester
 *
 * Apply <code>@FunctionalInterface</code> feature to define the inherited method with any data type.
 *
 * In this example, the given data of <code>String</code> will be converted to the generic type
 * as define the abstract method <code>substr</code>.
 *
 * @version	2018.08.05
 * @author	BingLi224
 */

public class FunctionalInterfaceTester
{
	public static void main ( String [] argv )
	{
		// original String data
		String str = "000010.987654321012345678";
		if ( argv.length > 0 )
		{
			// use the given argument to be evaluated
			str = argv [ 0 ];
		}

		System.out.println ( "Original String:" );
		System.out.println ( str );

		// get the first half part of String
		Substr <String> str1 = s -> s.substring ( 0, s.length ( ) / 2 );
		System.out.println ( "First half String:" );
		try {
			System.out.println ( str1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the last half part of String
		System.out.println ( "Last half String:" );
		Substr <String> str2 = s -> s.substring ( s.length ( ) / 2, s.length ( ) );
		try {
			System.out.println ( str2.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as character
		System.out.println ( "First char:" );
		Substr <Character> c1 = s -> s.charAt ( 0 );
		try {
			System.out.println ( c1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as byte
		System.out.println ( "First byte:" );
		Substr <Byte> b1 = s -> s.getBytes ( ) [ 0 ];
		try {
			System.out.println ( b1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as short
		System.out.println ( "Convert to short:" );
		Substr <Short> s1 = s -> Short.parseShort ( s );
		try {
			System.out.println ( s1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as integer
		System.out.println ( "Convert to int:" );
		Substr <Integer> i1 = s -> Integer.parseInt ( s );
		try {
			System.out.println ( i1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as float
		System.out.println ( "Convert to float:" );
		Substr <Float> f1 = s -> Float.parseFloat ( s );
		try {
			System.out.println ( f1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

		// get the conveted data as double
		System.out.println ( "Convert to double:" );
		Substr <Double> d1 = s -> Double.parseDouble ( s );
		try {
			System.out.println ( d1.substr ( str ) );
		} catch ( Exception e ) { e.printStackTrace ( ); }

	}

	@FunctionalInterface
	interface Substr <T>
	{
		abstract T substr ( String str );
	}
}

