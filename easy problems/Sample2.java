import java.io.*;

public class Sample2 {
    public static void main(String[] args) {
        int pid, qty;
        float price, amount, disp, discount, netbill;
        String pname;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the Product ID: ");
            pid = Integer.parseInt(br.readLine());
            System.out.println("Enter the Product name: ");
            pname = br.readLine();
            System.out.println("Enter the price: ");
            price = Float.parseFloat(br.readLine()); 
            System.out.println("Enter quantity: ");
            qty = Integer.parseInt(br.readLine());
            amount = price * qty;
            System.out.println("Enter discount %: ");
            disp = Float.parseFloat(br.readLine());
            discount = amount * disp / 100;
            netbill = amount - discount;
            System.out.println("Product ID: " + pid);
            System.out.println("Product Name: " + pname);
            System.out.println("Product price: " + price);
            System.out.println("Product quantity: " + qty);
            System.out.println("Total: " + amount);
            System.out.println("Discount %: " + disp);
            System.out.println("Total discount: " + discount);
            System.out.println("NetBill is: " + netbill);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
