
public class StringEx {
public static void main(String[] args) {
	
	//creating string
	
	String s1="CSMA";
	String s2="CSMA";
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	String s3=new String(); //empty string
	String s4=new String("CSMA");
	String s5=new String("CSMA");
	System.out.println("S3:"+s3);
	System.out.println("S4:"+s4);
	System.out.println("S5:"+s5);
	
	char c[]= {'C','S','M','A'};
	String s6=new String(c);
	System.out.println("S6:"+s6);
	
	//methods
	
	System.out.println("s1.length():"+s1.length());
	System.out.println("s1.isEmpty():"+s1.isEmpty());
	System.out.println("s3.isEmpty():"+s3.isEmpty());
	
	
	System.out.println("s1==s2"+(s1==s2));
	System.out.println("s4==s5"+(s4==s5));
	
	System.out.println("s1.equals(s2)"+s1.equals(s2));
	System.out.println("s4.equals(s5)"+s4.equals(s5));
	
	System.out.println("s1.substring(3)"+s1.substring(3));
	System.out.println("s1.substring(0,3)"+s1.substring(0,3));
	
	System.out.println("s1.charAt(2)"+s1.charAt(2));
	
	System.out.println("s1.toLowerCase():"+s1.toLowerCase());
	System.out.println("s1.replaceAll(CSMA,csmb)"+s1.replaceAll("CSMA","csmb"));
}
}
