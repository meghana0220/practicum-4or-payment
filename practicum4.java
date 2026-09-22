import java.util.Scanner;
class Payment {
 void makePayment(double a) {
 System.out.println(a <= 0 ? "Invalid payment amount" :
 "Payment processed: Rs. " + a);
 }
 void makePayment(double a, String id) {
 if (a <= 0)
 System.out.println("Invalid payment amount");
 else if (id.isEmpty())
 System.out.println("Invalid transaction ID");
 else if (!id.matches("TXN\\d+"))
 System.out.println("Invalid transaction ID format");
 else {
 System.out.println("Amount: Rs. " + a);
 System.out.println("Transaction ID: " + id);
 }
 }
}
class CreditCardPayment extends Payment {
 void makePayment(double a) {
 System.out.println(a <= 0 ? "Invalid payment amount" :
 "Credit Card Payment: Rs. " + a);
 }
}
class UPIPayment extends Payment {
 void makePayment(double a) {
 System.out.println(a <= 0 ? "Invalid payment amount" :
 "UPI Payment: Rs. " + a);
 }
}
class NetBankingPayment extends Payment {
 void makePayment(double a) {
 System.out.println(a <= 0 ? "Invalid payment amount" :
 "Net Banking Payment: Rs. " + a);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 Payment p;
 double a;
 String id;
 System.out.println("1.Credit Card 2.UPI 3.Net Banking");
 System.out.println("4.Overloading 5.Runtime Polymorphism");
 System.out.println("6.Negative 7.Zero 8.Empty ID");
 System.out.println("9.Null Object 10.Invalid ID");
 System.out.print("Enter choice: ");
 int c = s.nextInt();
 switch (c) {
 case 1:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 p = new CreditCardPayment();
 p.makePayment(a);
 break;
 case 2:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 p = new UPIPayment();
 p.makePayment(a);
 break;
 case 3:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 p = new NetBankingPayment();
 p.makePayment(a);
 break;
 case 4:
 case 8:
 case 10:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 s.nextLine();
 System.out.print("Enter Transaction ID: ");
 id = s.nextLine();
 p = new Payment();
 p.makePayment(a, id);
 break;
 case 5:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 p = new CreditCardPayment(); p.makePayment(a);
 p = new UPIPayment(); p.makePayment(a);
 p = new NetBankingPayment(); p.makePayment(a);
 break;
 case 6:
 case 7:
 System.out.print("Enter amount: ");
 a = s.nextDouble();
 p = new Payment();
 p.makePayment(a);
 break;
 case 9:
 p = null;
 try {
 p.makePayment(1000);
 } catch (NullPointerException e) {
 System.out.println("NullPointerException");
 }
 break;
 default:
 System.out.println("Invalid choice");
 }
 s.close();
 }
}
