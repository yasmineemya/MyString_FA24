import java.util.Arrays;

//CSC330 Assignment 1
//complete the MyString class

public class MyString implements Comparable {
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
	
	
	//utilities
	private void ensureCapacity() {
		if(str_arr == null) {
			str_arr = new char[5];
		}
		else if(curr_len == str_arr.length){
			//need more room
			char [] temp = new char[str_arr.length*2];
			//copy the chars to new space
			for(int i = 0; i < curr_len; i++) {
				temp[i] = str_arr[i];
			}
			//update str_arr 
			str_arr = temp;
		}
	}
	
	private void addChar(char ch) {
		ensureCapacity();
		str_arr[curr_len++] = ch;
	}
	
	
	@Override
	public String toString() {
		String s = "";
		for(char c : str_arr) {
			s+=c;
		}
		return s;
	}
	
	//accessors
	public char get(int index) {
		if(index < 0 || index >= curr_len) {
			throw new IndexOutOfBoundsException();
		}
		return str_arr[index];
	}
	
	public int length() {
		return curr_len;
	}
	
	//using String class methods
	public MyString toUpper() {
		String str = this.toString();
		str = str.toUpperCase();
		MyString result = new MyString(str);
		return result;
	}
	
	//manipulating the data directly
	public MyString toLower() {
		//make a new MyString
		MyString str = new MyString(this);
		for(int i = 0; i < str.length(); i++) {
			if(str.str_arr[i] >= 'A' && str.str_arr[i] <= 'Z') {
				str.str_arr[i] = Character.toLowerCase(str.str_arr[i]);
			}
		}
		return str;		
	}
	
	
	
	//end of provided code.
	
	//write your implementations here
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//+concat(str : MyString) : MyString
	
	//+concat(str : String) : MyString
	
	
}
