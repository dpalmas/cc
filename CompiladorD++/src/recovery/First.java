package recovery;

import parser.*;

public class First { // implementa os conjuntos first p/ alguns n.terminais

	static public final RecoverySet main = new RecoverySet();

	static {
		main.add(new Integer(CompiladorDPPConstants.EOF));
		
	}
}
