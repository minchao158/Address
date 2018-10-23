public class Address {
	public static void main(String[] args)
	{
		String a, c="hello";
		a=c;
		a="hi";
		System.out.println(a+" "+c);
		System.out.println(a.indexOf('i'));//输出字符串的位置,错误则显示-1
		System.out.println(a.hashCode()+"\n"+c.hashCode());
		/*
		 * using int arithmetic, where s[i] is the ith character of the string, 
		 * n is the length of the string, 
		 * and ^ indicates exponentiation. 
		 * (The hash value of the empty string is zero.)
		 */
	}
}
