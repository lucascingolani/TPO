package TPO_Prog3;

import java.util.List;
import java.util.ArrayList;

public class TreeMerkle {
	private NodeMerkle raiz;
	private List<NodeMerkle> nodos;
	
	public TreeMerkle() {
		this.nodos = new ArrayList<>();
	}
	
	public void buildTree(List<NodeMerkle> nodos) {
		if (nodos.size()==1) {
			this.raiz = nodos.get(1);
		}
		else if () {
			
			
		}
	}
	
}
