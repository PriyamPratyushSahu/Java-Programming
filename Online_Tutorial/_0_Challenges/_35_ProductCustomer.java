package _0_Challenges;

class Product {
    
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno){ //Constructor 1
        itemNo=itemno;
    }
    public Product(String itemno,String name){ //Constructor 2
        itemNo=itemno;
        setName(name);
    }
    public Product(String itemno,String name,double price,short qty){ //Constructor 3
        itemNo=itemno;
        setName(name);
        setPrice(price);
        setQuantity(qty);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(short qty){
        this.qty=qty;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }    
}

class Customer {
    
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name){ //Constructor 1
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno){ //Constructor 2
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
    
    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }
}

public class _35_ProductCustomer {

    public static void main(String args[]) {

        Product pr = new Product("Item101", "Chair");
        pr.setPrice(500.00);
        pr.setQuantity((short) (1 + Math.round(Math.random() * 10)));
        System.out.println("Product Details:");
        System.out.format("Product Id: %s\nProduct Name: %s\nProduct Price: %.2f\nProduct Quantity: %d\n",
                pr.getItemNo(), pr.getName(), pr.getPrice(), pr.getQuantity());
        System.out.println("Total Price: " + (pr.getPrice() * pr.getQuantity()));

        Customer cr = new Customer("Cust101", "Franklin");
        cr.setAddress("West Mile Road, Toronto");
        cr.setPhno("8731934");
        System.out.println("\n\nCustomer Details:");
        System.out.format("Customer Id: %s\nCustomer Name: %s\nCustomer Address: %s\nCustomer Phone Number: %s\n",
                cr.getCustId(), cr.getName(), cr.getAddress(), cr.getPhno());
    }
}

/*
        ******************************** VARIABLE DESCRIPTION********************************
       Variable                        Type                    Description
1.      itemNo                        String                   Item number of the Product
2.      name                          String                   Name of the Product
3.      price                         double                   Price of the Product
4.      qty                           short                    Quantity of the Product
5.      setName(String name)          method                   set Product nName
6.      setPrice(double price)        method                   set Product price
7.      setQuantity(short qty)        method                   set Product quantity
8.      getItemNo()                   method                   fetch Product item number
9.      getName()                     method                   fetch Product name
10.      getPrice()                    method                   fetch Product price
11.      getQuantity()                 method                   fetch Product quantity

12.      custID                        String                   Customer id
13.      name                         String                   Customer name
14.      address                      String                   Customer address
15.      phno                         String                   Customer phone number
16.      setAddress(String address)    method                   set Customer address
17.      setPhone(String phno)         method                   set Customer phone number
18.      getCustId()                   method                   fetch Customer id
19.      getName()                     method                   fetch Customer name
20.      getAddress()                  method                   fetch Customer address
21.      getPhno()                     method                   fetch Customer phone number

 */

/*
****************************** OUTPUT ******************************
Product Details:
Product Id: Item101
Product Name: Chair
Product Price: 500.00
Product Quantity: 2
Total Price: 1000.0


Customer Details:
Customer Id: Cust101
Customer Name: null
Customer Address: West Mile Road, Toronto
Customer Phone Number: 8731934
 */
