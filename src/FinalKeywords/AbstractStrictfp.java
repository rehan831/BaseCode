package FinalKeywords;
//we can declare abstract and strictfp for clasees but not for method
  class AbstractStrictfp extends Strict {
	public void rehan() {
		System.out.println("Abstract and strictfp method combination is not lagal ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractStrictfp f = new AbstractStrictfp();
		f.rehan();
			}

}
abstract class Strict{
	abstract public  void rehan();
}