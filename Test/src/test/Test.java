package test;

public class Test {
	public static enum Haha{
		Db,Sb
	}
	public static void main(String[] args){
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(System.currentTimeMillis());
		
		Haha ddb = Haha.Db;
		Haha dsb = Haha.Sb;
		
		Haha dddb = Haha.Db;
		System.out.println(ddb == dddb);
		byte hoho = 0;
	}
}
