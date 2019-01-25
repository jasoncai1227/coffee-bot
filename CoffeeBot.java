/**
 * info1103 - assignment 1
 * Canhong (jason) Cai
 * ccai6142
 */
import java.util.Scanner;
public class CoffeeBot {

	public static void main(String[] args) {

		if(args.length < 1) {
     System.out.println("No arguments. System terminating.");
			return;

		}
		int cups=Integer.parseInt(args[0]);
		if (args.length==1) {
		 System.out.println("Not enough arguments. System terminating.");
		 return;
	 }
		int shots=Integer.parseInt(args[1]);

	 if(args.length>2){
		System.out.println("Too many arguments. System terminating.");
		System.exit(1);
	}
	else if(cups<0||shots<0){
System.out.println("Negative supply of coffee cups. System terminating.");
System.exit(1);
	}

  else if(cups>0&&shots>0){
	double sum=0.00;
	System.out.print("Hello, what's your name? ");
	Scanner keyboard=new Scanner(System.in);
	String name=keyboard.next();

	System.out.print("Would you like to order some coffee, "+name+"? (y/n) ");
	boolean righttypein=false;
	while(righttypein==false){
    String decision=keyboard.next();
    if(decision.equals("n")){
		System.out.println("Come back next time, "+name+".");
		break;
	  }
    else if(decision.equals("y")){

		System.out.println("Great! Let's get started.");
		System.out.println("Order selection");
		System.out.println("---------------");
		System.out.println();
		   if(cups==1&&shots==1){
		System.out.println("There is "+cups+" coffee cup in stock and each costs $2.00.");
		System.out.println("There is "+shots+" coffee shot in stock and each costs $1.00.");
		  }
		   else if(cups>1&&shots>1){
	    System.out.println("There is "+cups+" coffee cups in stock and each costs $2.00.");
		System.out.println("There is "+shots+" coffee shots in stock and each costs $1.00.");
		   }
		System.out.println();

		System.out.print("How many cups of coffee woulld you like? ");
		int numberOfCups=keyboard.nextInt();
		if(numberOfCups==0){
			System.out.println("No cups, no coffee. Goodbye.");
		}
		else if(numberOfCups<0){
			System.out.println("Does not compute. System terminating.");
		}
		else if(numberOfCups>=cups){
			System.out.println("Not enough stock. Come back later.");
		  }
		else if(numberOfCups<=cups){

			int n=1;
			int[] numberOfShots=new int[numberOfCups];
			int a=0;
			double[] money=new double[numberOfCups];
			int b=0;
			while(n<=numberOfCups){

			System.out.print("How many coffee shots in cup "+n);
			numberOfShots[a]=keyboard.nextInt();

		     if(numberOfShots[a]<0){
				System.out.println("Does not compute. Try again.");
			  }
		    else if(numberOfShots[a]>0&&numberOfShots[a]>shots){
				   if(numberOfShots[a]==1){
				System.out.println("There is only "+shots+" coffee shot left. Try again.");
			      }
				  else{
					System.out.println("There is only "+shots+" coffee shots left. Try again.");
				  }
			  }
			 else if(numberOfShots[a]>0&&numberOfShots[a]<=shots){

				money[b]=2.00+(double)numberOfShots[a]*1.00;

				sum=sum+money[b];
				n=n+1;
				a=a+1;
			    b=b+1;
			   }

		  }
			System.out.println("Order summary");
						System.out.println("-------------");
							System.out.println();
			int c=1;
			int d=0;
			int e=0;
			while(c<=numberOfCups){
				System.out.println("Cup "+c+" has "+numberOfShots[d]+" shots and will cost $"+money[e]);

				c=c+1;
				d=d+1;
				e=e+1;
			}

		 System.out.println();
			if(numberOfCups==1){
	  System.out.println(numberOfCups+" coffee to purchase.");
			}
			else{
				System.out.println(numberOfCups+" coffees to purchase.");
			}
	    System.out.println("Purchase price is $"+sum);
			System.out.print("Proceed to payment? (y/n) ");
			String proceed=keyboard.next();
			if(proceed.equals("n")){
				System.out.println("Come back next time, "+name);
			}
			else if(proceed.equals("y")){
				System.out.println("Order payment");
				System.out.println("-------------");
				System.out.println();

				boolean correct=false;
				 while(correct==false){
				System.out.println("$"+sum+" remains to be paid. Enter coin or note:");
				String payment=keyboard.next();
				String signpayment=payment.substring(0,1);
				int lengthofpayment=payment.length();


				if(lengthofpayment==1){
					String lasttwodigitsofpayment=payment.substring(lengthofpayment-1,lengthofpayment);
					System.out.println("Invalid coin or note. Try again.");
				}
				else if(lengthofpayment>1){


          String lasttwodigitsofpayment=payment.substring(lengthofpayment-2,lengthofpayment);
					if(signpayment.equals("$")&&lasttwodigitsofpayment.equals(".0")){

						String moneypart=payment.substring(1,lengthofpayment);
						double receivedmoney=Double.parseDouble(moneypart);
						if(receivedmoney==sum){
							System.out.println("You gave $"+receivedmoney);
							System.out.println("Perfect! No change given.");
							System.out.println("Thank you, "+name);
							System.out.println("See you next time.");
							  correct=true;
						}
						else if(receivedmoney<sum){
							sum=sum-receivedmoney;

						}
            else if(receivedmoney>sum){
							sum=receivedmoney-sum;
							System.out.println("You gave $"+receivedmoney);
							System.out.println("You change:");

          while((int)sum>0){
							if((int)sum>=50){
							int numberOf50=(int)sum/50;
							sum=(int)sum%50;
							System.out.println(numberOf50+" x $50.00");
						}
						if(20<=(int)sum&&(int)sum<50){
							int numberOf20=(int)sum/20;
							sum=(int)sum%20;
							System.out.println(numberOf20+" x $20.00");
						}
						if(10<=(int)sum&&(int)sum<20){
							int numberOf10=(int)sum/10;
							sum=(int)sum%10;
							System.out.println(numberOf10+" x $10.00");
						}
						if(5<=(int)sum&&(int)sum<10){
							int numberOf5=(int)sum/5;
							sum=(int)sum%5;
							System.out.println(numberOf5+" x $5.00");
						}
						if(sum<5){
							int numberOf1=(int)sum/1;

							System.out.println(numberOf1+" x $1.00");

							break;
						}
						}
						System.out.println("Thank you, "+name);
						System.out.println("See you next time.");
						correct=true;
						}
          }
					else if(!(signpayment.equals("$")&&lasttwodigitsofpayment.equals(".0"))){
									System.out.println("Invalid coin or note. Try again.");
			}
		}
					}
			 }
			}
			righttypein=true;
		}
		else{
			System.out.println("Invalid response. Try again.");
		}
	 }
  }
}
}

