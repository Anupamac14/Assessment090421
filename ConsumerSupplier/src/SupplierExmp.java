import java.util.function.Supplier;

public class SupplierExmp {

	public static void main(String[] args) {
		
		Supplier<String>SupplierObj=()->{
			String EmpId="";
			
			for(int i=0;i<5;i++)
			{
				EmpId=EmpId+ (int) (Math.random()*10);
			}
			return EmpId;
		};
		
		String string = SupplierObj.get();
		System.out.println(string);
	} 	
}
