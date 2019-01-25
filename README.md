# coffee-bot
my first assignment 

Task Describtion

Customers can interact with the bot, order coffee and select the number of coffee shots in each cup. The system will provide an order summary and confirm the order with the customer. Payment will be processed using only valid coin and note denominations, with change being refunded in an optimal way that uses the least amount of coins and notes required.

# Implementation details

Write a program in Java that enables your coffee bot to interact with customers, select their order, summarise their order and

process transaction using cash and coins, using the correct denominations, i.e. $100.00, $50.00, $20.00, $10.00, $5.00, $2.00, $1.00, $0.50, $0.20, $0.10 and $0.05.

Your program must be contained in one file called CoffeeBot.java and produce no errors when compiled using javac on the lab machines and Ed. Your program will be run using java CoffeeBot with given arguments, reading input from standard input and writing output to standard output.

# Command line arguments

Your program should take two positive integer command line arguments that specify the supply of coffee cups and shots that will be available. You can assume your program only needs to handle integer arguments. If any given arguments are missing or invalid then output an error message that describes the issue and immediately terminate the program. Several examples are shown below.

There are no command line arguments

$ java CoffeeBot
No arguments. System terminating.
There are not enough command line arguments

$ java CoffeeBot 10
Not enough arguments. System terminating.
There are too many command line arguments

$ java CoffeeBot 10 20 30
Too many arguments. System terminating.
The supply of coffee cups is negative

$ java CoffeeBot -10 20
Negative supply of coffee cups. System terminating.
The supply of coffee shots is negative

$ java CoffeeBot 10 -20
Negative supply of coffee shots. System terminating.
The supply of both coffee cups and shots is negative

$ java CoffeeBot -10 -20
Negative supply chain. System terminating.
Greeting the user

Once the supply of coffee cups and shots has been entered correctly, the coffee bot will then greet the customer and ask for their name so that the coffee bot can optimise the user experience.

$ java CoffeeBot 1 2
Hello, what's your name?
Read and store the name entered and then ask the customer whether

they want to order some coffee.

Hello, what's your name? Scott
Would you like to order some coffee, Scott? (y/n)
The customer can choose to proceed with the order by entering either y or n as the response. If the response is different

from the possible options then display the following message and ask again.

Would you like to order some coffee, Scott? (y/n) ok
Invalid response. Try again.
Would you like to order some coffee, Scott? (y/n)
If the user decides to not proceed, display the following message and terminate.

Would you like to order some coffee, Scott? (y/n) n
Come back next time, Scott.
If the user decides to proceed, display the following message and continue onward.

Would you like to order some coffee, Scott? (y/n) y
Great! Let's get started.
Order selection

Once the user decides to order then display the banner and available supply as shown below.

Would you like to order some coffee, Scott? (y/n) y
Great! Let's get started.

Order selection
---------------

There is 1 coffee cup in stock and each costs $2.00.
There is 1 coffee shot in stock and each costs $1.00.
Choosing the number of cups

The customer should then be asked how many cups of coffee they want to order.

Order selection
---------------

There is 1 coffee cup in stock and each costs $2.00.
There is 1 coffee shot in stock and each costs $1.00.

How many cups of coffee would you like?
If the customer wants zero cups, display the following message and terminate.

How many cups of coffee would you like? 0
No cups, no coffee. Goodbye.
If the number of cups entered is negative, display the following message and terminate.

How many cups of coffee would you like? -100
Does not compute. System terminating.
If the customer wants more cups than the stock, display the following message and terminate.

How many cups of coffee would you like? 100
Not enough stock. Come back later.
Choosing the number of coffee shots in each cup

For each cup, ask the customer how many shots of coffee they want. Amounts zero or more are valid.

How many cups of coffee would you like? 2

How many coffee shots in cup 1? 0
How many coffee shots in cup 2? 1
If the number of shots entered is negative, display the following message and ask again.

How many coffee shots in cup 1? -1
Does not compute. Try again.
How many coffee shots in cup 1?
If the customer wants more shots than the stock, display the following message and ask again.

How many coffee shots in cup 1? 10
There is only 1 coffee shot left. Try again.
How many coffee shots in cup 1?
Order summary

Once the order is selected, display an order summary and ask the customer whether they want to proceed to payment. The price of each coffee cup is $2.00 and the price of each coffee shot is $1.00.

How many cups of coffee would you like? 3

How many coffee shots in cup 1? 1
How many coffee shots in cup 2? 2
How many coffee shots in cup 3? 3

Order summary
-------------

Cup 1 has 1 shot and will cost $3.00
Cup 2 has 2 shots and will cost $4.00
Cup 3 has 3 shots and will cost $5.00

3 coffees to purchase.
Purchase price is $12.00
Proceed to payment? (y/n)
Payment process

Once the customer proceeds, display the amount to be paid and prompt for payment.

Order payment
-------------

$12.00 remains to be paid. Enter coin or note:
The payment should be entered in the format $10.00, where the $ sign is followed by a valid coin or note denomination. If the payment is invalid, prompt the customer to enter another payment value.

$12.00 remains to be paid. Enter coin or note: 10
Invalid coin or note. Try again.
$12.00 remains to be paid. Enter coin or note:
After a valid payment have been entered, check if the payment is enough to pay for the purchase. Continue to prompt the customer to enter payment until the purchase is paid for. For example:

$10.00 remains to be paid. Enter coin or note: $10.00
$2.00 remains to be paid. Enter coin or note: $2.00
Once the purchase has been paid for proceed to printing the receipt and dispensing change.

Refunding change

If the amount of money paid by the customer equals

the purchase price, then display the following.

$2.00 remains to be paid. Enter coin or note: $2.00

You gave $2.00
Perfect! No change given.

Thank you, Scott.
See you next time.
If there is change to be given, it should be dispensed in optimal coin denominations, i.e. using the minimum possible number of notes and coins. The change should be displayed in the format shown below, outputted in order from the highest to the lowest value denomination.

$4.00 remains to be paid. Enter coin or note: $100.00

You gave $100.00
Your change:
1 x $50.00
2 x $20.00
1 x $5.00
1 x $1.00

Thank you, Scott.
See you next time.
