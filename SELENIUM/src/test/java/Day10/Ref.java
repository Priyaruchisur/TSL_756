package Day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.testng.annotations.Test;



public class Ref 
{
  @Test
  public void f() throws Exception
  {
	  Class cl=Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
	  
//	 Constructor[] CS=cl.getConstructors();
//	 for(Constructor C:CS)
//	 {
//		 System.out.println(C.getName());
//	 }
//	 System.out.println();

	 Field[] DF=cl.getDeclaredFields();
	 for(Field F:DF)
	 {
		 System.out.println(F.getName());
	 }
	 System.out.println();
	 System.out.println(cl.getSuperclass());
	 System.out.println();

	 Method[] MD=cl.getMethods();
	 for(Method M:MD)
	 {
		 System.out.println(M.getName());
		 Parameter PM[]=M.getParameters();
		 for(Parameter P:PM)
		 {
			 System.out.println(P.getParameterizedType()+" ");
			 System.out.println(P.getName()+" ");
		 }
	 }
  }
}
