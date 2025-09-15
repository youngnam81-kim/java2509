package extProject;

import extProject.ext.Exten;
import extProject.overload.Calcul;
import extProject.overload.Calculator;

public class ClassMain {

	public static void main(String[] args) {
		Exten exten = new Exten();
		Calcul calcul = new Calcul();
		
		
		//힙영역과 스텍영역
		String a1 = "START";
		String a2 = "START";
		String a3 = "START";
		
		if ( a1 == a2) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}

}
