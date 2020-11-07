package TPO_Prog3;

public class NodeMerkle {
	private String hash;
	private NodeMerkle nodoIzquierdo;
	private NodeMerkle nodoDerecho;
	
	public void setHash(String hash) {
		this.hash = hash;
	}
	public void setLeft(NodeMerkle izq) {
		this.nodoIzquierdo= izq;
	}
	
	public void setRight(NodeMerkle der) {
		this.nodoDerecho=der;
	}
	public String getHash() {
		return(this.hash);
	}
	public NodeMerkle getLeft() {
		return this.nodoIzquierdo;
	}
	public NodeMerkle getRight() {
		return this.nodoDerecho;
	}
	public boolean equals (NodeMerkle other) {
		return this.hash.equals(other.hash);
	}
	
	
}
