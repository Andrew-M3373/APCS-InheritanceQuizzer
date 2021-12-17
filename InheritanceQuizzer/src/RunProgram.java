
public class RunProgram {

	public static void main(String[] args) {

		Hobby x = new Hobby();x.haveFun();
		Hobby x1 = new Hobby();x1.wasteTime();
//		Hobby x2 = new Hobby();x2.seeTheWorld();
//		Hobby x3 = new Hobby();((Flying)x3).seeTheWorld();
		Hobby x4 = new Flying();x4.haveFun();
		Hobby x5 = new Flying();x5.wasteTime();
//		Hobby x6 = new Flying();x6.seeTheWorld();
		Hobby x7 = new Flying();((Flying)x7).seeTheWorld();
		Flying x8 = new Flying();x8.haveFun();
		Flying x9 = new Flying();x9.wasteTime();
		Flying x10 = new Flying();x10.seeTheWorld();
		Flying x11 = new Flying();((Flying)x11).seeTheWorld();
		
	}

}
