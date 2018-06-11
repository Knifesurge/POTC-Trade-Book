package ca.hjalmionlabs.tradebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Represents an enhanced Trade Book in the Pirates of the Caribbean PC game. Instead of only Import/Exports being shown,
 * this represents all Products in the stores.
 * 
 * TODO: variables prepended with an underscore are set to replace the ones without
 * @author Knifesurge
 *
 */
public class TradeBook {

	/**
	 * Maps product name (String) to buy/sell prices (Map<String, Integer>)
	 */
	public static Map<String, Map<String, Integer>> 		conceicaoPrices;
	public static Map<String, Integer> 						conceicaoBuySell;
	public static Map<String, Map<String, Integer>> 		redmondPrices;
	public static Map<String, Integer> 						redmondBuySell;
	public static Map<String, Map<String, Integer>> 		oxbayPrices;
	public static Map<String, Integer> 						oxbayBuySell;
	public static Map<String, Map<String, Integer>> 		falaisePrices;
	public static Map<String, Integer> 						falaiseBuySell;
	public static Map<String, Map<String, Integer>> 		islaPrices;
	public static Map<String, Integer> 						islaBuySell;
	public static Map<String, Map<String, Integer>> 		douwesenPrices;
	public static Map<String, Integer> 						douwesenBuySell;

	public static Map<String, Product>		_conceicaoPrices;
	
	public static Map<String, Map<String, Map<String, Integer>>> countryList;
	
	public static Map<String, Map<String, Product>> _countryList;
	
	private static void printPrices(Map<String, Map<String, Map<String, Integer>>> list)
	{
		Set<String> countryNameList = list.keySet();	// Get the names of the countries in the list
		
		countryNameList.forEach(e -> {	// Iterate over each country
			System.out.println("=============================" + e + "=============================");	// Print country name
			Map<String, Map<String, Integer>> productList = list.get(e);	// Get the Product List for the current country
			Set<String> productNameList = productList.keySet();		// Get the names of the products in the list
			
			productNameList.forEach(p -> {	// Iterate over each product
				System.out.println("\n" + p);	// Print the product name
				Map<String, Integer> priceList = productList.get(p);	// Get the prices for the products
				
				int buyPrice = priceList.get("B").intValue();
				int sellPrice = priceList.get("S").intValue();
				
				System.out.println("B: " + buyPrice);
				System.out.println("S: " + sellPrice);
			});
		});
	}
	
	private static void _printPrices(Map<String, Map<String, Product>> list)
	{
		
	}
	
	public static void main(String[] args)
	{
		/* ======================== Conceicao ========================= */
		conceicaoPrices = new HashMap<String, Map<String, Integer>>();
		conceicaoBuySell = new HashMap<String, Integer>();
		
		conceicaoPrices.put("Cinnamon", conceicaoBuySell);
		conceicaoBuySell.put("B", 8);
		conceicaoBuySell.put("S", 5);	// BOGUS value
		
		
		/* ======================== Country List ========================= */
		countryList = new HashMap<String, Map<String, Map<String, Integer>>>();
		countryList.put("Conceicao", conceicaoPrices);
		countryList.put("Redmond", redmondPrices);
		countryList.put("Oxbay", oxbayPrices);
		countryList.put("Falaise de Fleur", falaisePrices);
		countryList.put("Isla Muelle", islaPrices);
		countryList.put("Douwesen", douwesenPrices);
		
		printPrices(countryList);
		_printPrices(_countryList);
	}

}
