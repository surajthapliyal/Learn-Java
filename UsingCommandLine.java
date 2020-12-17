
public class UsingCommandLine {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("args ["+i+"] = "+ args[i]);
		}
	}
	/** when we run it in command line with passing the String juts followed by program name with java command
	  to compile it then it will type in all the Strings stored in the args
	 * Ex = hello my name is Suraj Thapliyal
	 * OUTPUT::::::::::::::
	  	args [0] = hello
		args [1] = my
		args [2] = name
		args [3] = is
		args [4] = Suraj
		args [5] = Thapliyal
	 */
}
