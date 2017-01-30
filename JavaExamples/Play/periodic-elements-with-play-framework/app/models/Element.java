package models;

public class Element {
	private final String name;
	private final int atomicNumber;
	private final String symbol;
	private final String metalGroup;
		
	public Element(String name, int atomicNumber, String symbol, String metalGroup) {
		this.name = name;
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.metalGroup = metalGroup;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getMetalGroup() {
		return metalGroup;
	}
}
