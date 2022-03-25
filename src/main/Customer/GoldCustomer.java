package main.Customer;

public class GoldCustomer extends SilverCustomer{
    public GoldCustomer(String id,int amount){
        super(id,amount);
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+amount +"\t"+(amount-discount())+"("+discount()+")");
    }
}
