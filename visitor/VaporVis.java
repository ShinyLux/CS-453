package nanojava;

import java.util.*;
import syntaxtree.*;
import visitor.*;

public class VaporVis extends GJDepthFirst<MyVaporAst, MyArgsType>{
	public int count;
	public String str;
	public Boolean debug = false;
	//ntn = new temp name
	private String ntn(){
		String s = "t." + count;
		count++;
		return s;
	}
	public MyVaporAst visit(Goal n, MyArgType arg){
		if (debug){
			System.out.println("Visiting goal");
		}
		count = 0;
		str ="";
		MyVaporAst ret = n.f0.accept(this, arg);
	}
}
