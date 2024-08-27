
public class Driver {

	public static void main(String[] args) {

		MyString s = new MyString("suMfd-=as@@1AAQmer");
		MyString t = new MyString("T");
		MyString u = new MyString(t);
		
		System.out.println(s.toLower() + " " + t + " " + u);
		System.out.println(s.get(1));

	}

}
