class Ecommerce {
    int items = 4;
    synchronized void addToCart(String prodName, int quantity){
        System.out.println(prodName + " placing the order " + quantity);
        if(quantity > items){
            System.out.println(prodName + " Invalid response");
        } else {
            System.out.println(prodName + " order placed successfully!");
        }
    }
    static class EUser extends Thread {
        Ecommerce ecom;
        String prodName;
        int item;
        EUser(Ecommerce ecom, String prodName, int item){
            this.ecom = ecom;
            this.prodName = prodName;
            this.item = item;
        }
        public void run() {
            ecom.addToCart(prodName, item);
        }
    }
}
public class Flipkart {
    public static void main(String[] args) {
        Ecommerce ecom = new Ecommerce();
        Ecommerce.EUser user1 = new Ecommerce.EUser(ecom, "USB Cable", 2);
        Ecommerce.EUser user2 = new Ecommerce.EUser(ecom, "Adapter", 3);
        Ecommerce.EUser user3 = new Ecommerce.EUser(ecom, "Mobile", 6);
        user1.start();
        user2.start();
        user3.start();
    }
}