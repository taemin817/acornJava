package day13.test;

public class test08 {

	public static void main(String[] args) {
		
		Book info1 = new Book("AA1001","SpringMVC","최작가");
		Book info2 = new Book("BB1001","JSP/Sevlet","이작가");
		Book info3 = new Book("CC1001","MVC","박작가");
		
		System.out.println(info1+"\n");
		System.out.println(info2+"\n");
		System.out.println(info3+"\n");
		
		System.out.println("*********************************");
		
		Book[] arr = new Book[3];
		arr[0] = new Book("AA1001","SpringMVC","최작가");
		arr[1] = new Book("BB1001","JSP/Sevlet","이작가");
		arr[2] = new Book("CC1001","MVC","박작가");

		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]+"\n");
		}
	}

}
