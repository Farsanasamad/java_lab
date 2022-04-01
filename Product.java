public class Product
{
	String pcode;
	String pname;
	int price;

	public Product(String pcode_get,String pname_get,int price_get)
	{
	 pcode = pcode_get;
	 pname = pname_get;
	 price = price_get;
	}
	
	public int get_price()
	{
	 return price;
	}
	
	public static void main(String[] args)
	{
	 Product p_1 = new Product("a13","tv",2);
	 Product p_2 = new Product("b13","radiio",21);
	 Product p_3 = new Product("c13","dvd",3);

	 if(p_1.price <= p_3.price && p_1.price <= p_2.price)
		System.out.println("lowest product id is:"+p_1.pcode);
	 if(p_3.price <= p_1.price && p_3.price <= p_2.price)
		System.out.println("lowest product id is:"+p_3.pcode);
	 if(p_2.price <= p_3.price && p_2.price <= p_1.price)
		System.out.println("lowest product id is:"+p_2.pcode);
	}
}
