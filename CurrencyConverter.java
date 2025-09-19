import java.util.* ;

class CurrencyConverter{

    /* 

	Java Concepts Used:
         1. Arrays (1D and 2D)
         2. Control Structures (if-else, switch-case, loops)
         3. User Input Handling (Scanner class)
		 4. String Manipulation (toUpperCase, equals)
		 5. Matrix Operations (2D array indexing)
		 6. Exception Handling (Input validation)		
    */
	
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice;
		
		// Array storing currency codes
		String[] Currencies ={"INR","USD","EUR","AUD","RUB","ZAR","THB","AED","MYR","SGD","LKR","MVR","GBP","CHF","NZD","JPY",
							  "IDR","VND","KRW","CAD","CNY"};

		String[] CurrencyName={
				"Indian Rupee","US Dollar","Euro","Australian Dollar","Russian Ruble","South African Rand","Thai Baht","UAE Dirham","Malaysian Ringgit",
				"Singapore Dollar","Sri Lankan Rupee","Maldivian Rufiyaa","British Pound","Swiss Franc","New Zealand Dollar","Japanese Yen","Indonesian Rupiah",
				"Vietnamese Dong","South Korean Won","Canadian Dollar","Chinese Yuan"
			};

		// 2D array storing conversion rates from one currency to another
		double[][] conversionRates ={
			{1,0.012,0.011,0.018,1.02,0.21,0.39,0.042,0.054,0.015,3.43,0.18,0.0092,0.010,0.020,1.73,186.91589,294.66,16.61,0.016,0.084},	//INR to other
			{86.84,1,0.96,1.59,100.01,18.46,33.89,3.67,4.39,1.35,297.20,15.40,0.80,0.91,1.77,155.38,16223.75,25080.01,1447.11,1.44,7.25},	//Dollar to other
			{90.23,1.04,1,1.66,104.37,19.26,35.32,3.83,4.58,1.41,309.52,16.15,0.84,0.94,1.84,161.83,16904,26147,1507.59,1.50,7.56},	//EUR to other
			{54.44,0.63,0.60,1,62.98,11.63,21.14,2.29,2.74,0.84,186.64,9.61,0.50,0.57,1.10,96.92,10127.98,15654.06,902.64,0.89,4.53},	//AUD to other
			{0.87,0.010,0.0096,0.016,1,0.18,0.34,0.043,0.27,0.011,2,65,0.21,0.008,0.009,0.021,0.64,19.15,320.91,22.78,0.012,0.079},	//RUB to other
			{4.68,0.054,0.052,0.086,5.41,1,1.81,0.20,2.55,0.26,11.80,4.60,0.041,0.18,0.30,9.10,1080,16450,6.85,0.10,1.50},	//ZAR to other
			{2.50,0.029,0.027,0.045,2.55,0.49,1,0.092,0.12,0.038,3.89,0.67,0.024,0.027,0.045,3.80,700,560,37.70,0.040,0.21},	//THB to other
			{23.10,0.27,0.25,0.42,9.30,5.10,7.50,1,1.05,0.98,111.50,4.70,0.20,0.23,0.42,1.02,95,7000,350,0.27,1.05},	//AED to other
			{18.70,0.22,0.21,0.34,5.80,3.90,8,0.95,1,0.30,52.40,3.60,0.18,0.20,0.35,7.60,8600,5800,320,0.28,170},	//MYR to other
			{23.10,0.27,0.25,0.42,9.30,5.10,7.50,0.19,1.05,1,111.50,4.70,0.20,0.23,0.42,1.02,95,7000,350,0.27,1.05},	//SGD to other
			{0.27,0.0052,0.0048,0.0079,0.392,0.085,0.18,0.019,0.022,0.0070,1,0.080,0.0042,0.0046,0.0078,0.72,75.78,122.53,6.97,0.0069,0.035},	//LKR to other
			{6.24,0.063,0.059,0.097,4.91,1.43,2.73,0.24,0.28,0.085,19.30,1,0.051,0.055,0.096,8.47,976.7,1539,84.6,0.085,0.46},	//LKR to other
			{102.55,1.24,1.14,1.94,98.62,22.50,45.90,4.55,5.39,1.66,240,42.17,1,1.15,2.05,165.95,19250,29000,1625,1.67,8.85},	//MVR to other
			{95.14,1.08,0.94,1.47,79.84,19.19,36.24,3.96,4.60,1.45,255,10.78,0.91,1,1.70,144.34,16743,25800,1440,1.48,7.38},	//GBP to other
			{51.23,0.62,0.57,0.94,49.05,12.21,17.10,3.59,2.61,0.91,130.20,5.44,0.51,0.59,1,84.47,10348,15990,820,0.84,4.58},	//CHF to other	
			{0.61,0.0067,0.0060,0.0093,0.56,0.14,3.25,0.025,0.029,0.0090,13.10,0.56,0.0053,0.0063,0.012,1,88.54,153.49,9.85,0.0091,0.048},	//NZD to other
			{0.052,0.000065,0.000060,0.000095,0.0052,0.0016,0.21,0.00024,0.00028,0.000088,1.33,0.054,0.000051,0.000060,0.000098,0.0085,1,1.55,7.93,0.000087,0.00048},	//IDR to other
			{0.03,0.000042,0.000039,0.000061,0.0039,0.00090,0.091,0.00016,0.00018,0.000058,0.82,0.034,0.000036,0.000042,0.000064,0.0055,19.55,1,1.67,0.000056,0.00030},	//VND to other
			{0.062,0.00076,0.00070,0.0012,0.061,0.015,0.019,0.0028,0.0033,0.0011,15.10,0.63,0.00060,0.00070,0.0012,8.47,7.93,1.67,1,0.0010,0.0054},	//KRW to other
			{61.50,0.74,0.68,1.11,59.39,14.26,25.70,2.72,3.68,1,132.75,6.20,0.58,0.65,1.21,100.92,11435,17600,957,1,5.09},	//CAD to other
			{11.30,0.14,0.14,0.21,11.51,2.27,5.34,0.52,0.67,0.20,35.50,1.50,0.12,0.13,0.22,16.88,2196,3400,188.88,0.19,1},	//CNY to other
		};
		
		// Welcome message
        System.out.println("\033[36mWelcome to the Currency Converter\033[0m");
        System.out.println("=================================");
        
        boolean temp=true;

        do{
            // Display Menu
            System.out.println("\nCurrency Converter Menu:");
            System.out.println("1. Display Available Currencies");
            System.out.println("2. Convert Currency");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice=sc.nextInt();
            sc.nextLine();		// Consume new line

            switch(choice){
                case 1:
					// Display available currencies
					System.out.println("\nAvailable currencies are:");
					System.out.println();
					System.out.println("\033[1;32mCurrency Code\tCurrency Name\033[0m");
					System.out.println("-------------------------------------------");

					for(int i=0;i<Currencies.length;i++){
						System.out.println(Currencies[i] + "\t\t"  + CurrencyName[i]);
					}
					break;

                case 2:
					// Handling source currency input and validation
					boolean sourceMatch=false;
					String a="";		// Variable to store sourse currency code
					while(!sourceMatch){
						System.out.print("\nEnter source currency's code: ");
						a=sc.nextLine().toUpperCase();
						System.out.println("Selected Currency Code: " + "\033[32m" + a + "\033[0m");
        
					for(String allowed : Currencies){
						if(a.equals(allowed)){
							sourceMatch=true;
							break;
						}
					}
        
					// Notify user if the soure currency is invalid
					if (!sourceMatch) {
							System.out.println("\033[31m" + "\n--> Input currency code doesn't valid.\n   Please enter a valid currency code." + "\033[0m");
						}
					}
					
					// Handling target currency input and validation
					boolean targetMatch=false;
					String b="";		// Variable to store target currency code

					while(!targetMatch){
						System.out.print("\nEnter target currency's code: ");
						b=sc.nextLine().toUpperCase();
						System.out.println("Selected Currency Code: " + "\033[32m" + b + "\033[0m");
        
					for(String valid : Currencies){
						if(b.equals(valid)){
							targetMatch=true;
							break;
						}
					}
        
					// Notify user if the target currency is invalid
					if (!targetMatch) {
							System.out.println("\033[31m" + "\n--> Input currency code doesn't valid.\n   Please enter a valid currency code." + "\033[0m");
							System.out.println();
						}
					}

					// Input amount for conversion
					double amount;
					do {
                        System.out.print("\nEnter the amount to convert: ");		// Input amount for convertion
                        amount=sc.nextDouble();
                        sc.nextLine();		// Consume new line

                        if(amount<=0){
                            System.out.println("\033[31m" + "\n--> Please enter a valid amount greater than zero." + "\033[0m");
							
                        }
                    }while (amount<=0);
					
					// Find indexes for conversion rates
    				int sourceIndex = Arrays.asList(Currencies).indexOf(a);
    				int targetIndex = Arrays.asList(Currencies).indexOf(b);


					// Perform conversion
    				double conversionRate=conversionRates[sourceIndex][targetIndex];
    				double convertedAmount=amount*conversionRate;
					
					System.out.println("Converted Amount: " + "\033[32m" + convertedAmount + "\033[0m");		//Display the converted amount
					System.out.println("\n--> Press Enter to continue. <--");
					sc.nextLine();													//Consume new line
					break;

                case 3:
					// Exit confirmation
					System.out.print("\033[33m\nDo you want to perform another conversion? \033[0m(Y/N): ");
					String confirm=sc.nextLine().toUpperCase();

					if(confirm.equals("Y")){
						System.out.println("\033[33m\nReturning to menu...\033[0m");
					}else{
						System.out.println("\033[1;36m\n--> THANK YOU FOR VISITING. <--\033[0m");
						temp=false;
					}
					break;
					
                default:
                    System.out.println("\033[31m" + "\nInvalid choice. Please try again." +"\033[0m");
            }
        }
		while(temp);	// Continue until user chooses to exit
    }
}