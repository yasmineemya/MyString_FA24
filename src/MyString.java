//CSC330 Assignment 1
//complete the MyString class

public class MyString {
	//provided code
	private char [] str_arr;
	private int curr_len;
	
	//constructors
	public MyString() {
		str_arr = null;
		curr_len = 0;
	}
	public MyString(String str) {
		//make the array
		str_arr = new char[str.length()];
		//copy the characters
		for(int i = 0; i < str.length(); i++) {
			str_arr[i] = str.charAt(i);
		}
		//update the length
		curr_len = str.length();
	}
	public MyString(MyString str) {
		this.str_arr = new char[str.curr_len];
		for(int i = 0; i < str.curr_len; i++) {
			this.str_arr[i] = str.str_arr[i];
		}
		this.curr_len = str.curr_len;
	}
}
