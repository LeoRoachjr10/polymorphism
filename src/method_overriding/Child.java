
package method_overriding;

public class Child extends Parent {
	
@Override
public void marriage() {
	super.marriage();
	System.out.println("leo");
}

	
	public static void main(String[] args) {
 Child m =new Child ();		
	m.marriage();
	m.property();
	}

}
