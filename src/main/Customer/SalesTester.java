package main.Customer;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1=new Customer("0001",1200);
        c1.print();
        SilverCustomer c2=new SilverCustomer("0002",2000);
        c2.print();
        GoldCustomer c3=new GoldCustomer("0003",2500);
        c3.print();
    }
}
