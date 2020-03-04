import java.io.*;
import visitor.*;
import syntaxtree.*;
import java.util.*;
import nanojava.*;

public class J2V{
	public static void main(String[] args){
		Node root = null;
		try{
			root = new MiniJavaParser(System.in).Goal();
			VaporVis vs = new VaporVis();
			MyVaporAst res = root.accept(vs, null);
			System.out.println("====== OUTPUT VAPOR ======");
			System.out.println(vs.res_str);
		}
		catch(ParseException e){
			System.out.println(e.toString());
			System.exit(1);
		}
	}

}
