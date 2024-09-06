
public class Driver {

	public static void main(String[] args) {

		MyString s = new MyString("hi");
		MyString t = new MyString("there");
		MyString u = new MyString(s);
		
		System.out.println("length of s" + s.length());
		System.out.println("character at index 1 in s: " + s.get(1));
		System.out.println("s to upper: " + s.toUpper().toString());
		System.out.println("t to lower: " + t.toLower().toString());

		MyString d = s.concat(t);
		System.out.println(d.toString());

		System.out.println(s.indexOf(new MyString("i");

		MyString e = new MyString("hiii");
		System.out.println(e.lastIndexOf(new MyString("lo")));

		System.out.println(s.substring(1).toString());
                System.out.println(s.substring(1, 2).toString());

		 System.out.println(s.compareTo(t)); 
        	 System.out.println(s.compareTo(u)); 

	}

}
