package ca.hjalmionlabs.tradebook;

/**
 * Represents a product within the game. Has a name, and associated buy/sell price. Bool value for whether or not this 
 * is an export or an import, or if it is contraband. Import/Export/Contraband status defaults to false
 * @author Knifesurge
 */
public class Product
{

	private String name;
	private int buyPrice;
	private int sellPrice;
	private boolean _import = false;
	private boolean _export = false;
	private boolean _contraband = false;
	
	/**
	 * Creates a new Product with the specified name. Buy/Sell price initialized to 0
	 * @param name - Name of the product
	 */
	public Product(String name)
	{
		this.name = name;
		buyPrice = 0;
		sellPrice = 0;
	}
	
	/**
	 * Creates a new Product with the specified name, and buy/sell prices. Use this as the constructor if
	 * the Product is not an import/export/contraband.
	 * @param name - Name of the Product
	 * @param buyPrice - Price of buying this Product
	 * @param sellPrice - Price of selling this Product
	 */
	public Product(String name, int buyPrice, int sellPrice)
	{
		this.name = name;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	
	/**
	 * Creates a new Product with the specified name, and buy/sell price. Use this as the constructor if 
	 * the Product is an import/export/contraband
	 * @param name - Name of the Product
	 * @param buyPrice - Price of buying this Product
	 * @param sellPrice - Price of selling this Product
	 * @param isImport - Is this Product an import?
	 * @param isExport - Is this Product an export?
	 * @param isContraband - Is this Product considered contraband?
	 */
	public Product(String name, int buyPrice, int sellPrice, boolean isImport, boolean isExport, boolean isContraband)
	{
		this.name = name;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this._import = isImport;
		this._export = isExport;
		this._contraband = isContraband;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getBuyPrice()
	{
		return buyPrice;
	}
	
	public int getSellPrice()
	{
		return sellPrice;
	}
	
	public boolean isExport()
	{
		return _export;
	}
	
	public boolean isImport()
	{
		return _import;
	}
	
	public boolean isContraband()
	{
		return _contraband;
	}
}
