
public class CelebrityName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1 = "Allan Alda";
     String s2 = "John Wayne";
     String s3 = "Gregory Peck";
     
     int len1 = s1.length();
     int len2 = s2.length();
     int len3 = s3.length();
     
     System.out.println(s1 + ">>>" + s1.substring(2, len1-3));
     System.out.println(s1 + ">>>" + s2.substring(2, len2-3));
     System.out.println(s1 + ">>>" + s3.substring(2, len3-3));
	}

}
