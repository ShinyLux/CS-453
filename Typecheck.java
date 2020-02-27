import syntaxtree.Goal;
import myVisitor.PrettyPrinterVisitor;

public class Typecheck{
	public static void main(String args[]) throws ParseException{
		MiniJavaParser parser = new MiniJavaParser(System.in);
		Goal tee = parser.Goal();
		PrettyPrinterVisitor printer = new PrettyPrinterVisitor();
		printer.visit(tree);	
	}
}
