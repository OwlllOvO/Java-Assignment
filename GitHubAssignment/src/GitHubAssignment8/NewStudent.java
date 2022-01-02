package GitHubAssignment8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class NewStudent {
	static Set<Student>st=new TreeSet<Student>();
	public static void main(String[] args)throws java.io.IOException {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String id,name;
		int age;
		for(int i=0;i<n;i++) {
			System.out.println("学号:");
			id=input.next();
			System.out.println("姓名:");
			name=input.next();
			System.out.println("年龄:");
			age=input.nextInt();
			st.add(new Student(id,name,age));
		}
		for(Student key:st) {
			System.out.println(key.To_String());
		}
		write();
	}
	public static void write()throws java.io.IOException {
		java.io.File file=new java.io.File("studentinfo.txt");
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		output.println(st.size());
		for(Student key:st) {
			output.println(key.To_String());
		}
		output.close();
	}
}