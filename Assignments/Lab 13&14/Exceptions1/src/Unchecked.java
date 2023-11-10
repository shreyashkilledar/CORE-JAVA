

public class Unchecked {

	public static void main(String[] args) {
		try{
			int a=(Integer) null;
		}catch(NullPointerException e)
		{
			System.out.println("Null pointer value");
		}
		
	}

}
