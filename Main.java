//Driver Class where the application will run
import java.util.Scanner;

public class Main {
	static HashTableD chain = new HashTableD(17);
	static HashTableM m = new HashTableM(64);
	static DoubleHash dble = new DoubleHash(57);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		chain.insert("youtube");
		chain.insert("facebook");
		chain.insert("amazon");
		chain.insert("gmail");
		chain.insert("google");
		chain.insert("yahoo");
		chain.insert("yahoo mail");
		chain.insert("weather");
        chain.insert("netflix");
        chain.insert("walmart");
        chain.insert("ebay");
        chain.insert("google translate");
        chain.insert("home depot");
        chain.insert("usps tracking");
        chain.insert("translate");
        chain.insert("craigslist");
        chain.insert("fox news");
        chain.insert("google docs");
        chain.insert("news");
        chain.insert("google maps");
        chain.insert("google classroom");
        chain.insert("roblox");
        chain.insert("cnn");
        chain.insert("lowes");
        chain.insert("calculator");
        chain.insert("amazon prime");
        chain.insert("paypa");
        chain.insert("speed test");
        chain.insert("hotmail");
        chain.insert("target");
        chain.insert("google drive");
        chain.insert("msn");
        chain.insert("instagram");
        chain.insert("zillow");
        chain.insert("twitter");
        chain.insert("best buy");
        chain.insert("aol mail");
        chain.insert("bank of america");
        chain.insert("wells fargo");
        chain.insert("maps");
        chain.insert("hulu");
        chain.insert("discord");
        chain.insert("ups tracking");
        chain.insert("trump");
        chain.insert("traductor");
        chain.insert("costco");
        chain.insert("reddit");
        chain.insert("indeed");
        chain.insert("disney plus");
        chain.insert("you tube");
        
        //Initiliazie eveyrthing to DELETED
        for(int i = 0 ; i < m.hashTable.length; i ++)
        {
        	m.hashTable[i] = "DELETED";
        }
        m.insert("youtube");
        m.insert("facebook");
        m.insert("amazon");
        m.insert("gmail");
        m.insert("google");
        m.insert("yahoo");
        m.insert("yahoo mail");
        m.insert("weather");
        m.insert("netflix");
        m.insert("walmart");
        m.insert("google translate");
        m.insert("home depot");
        m.insert("usps tracking");
        m.insert("translate");
        m.insert("craigslist");
        m.insert("fox news");
        m.insert("google docs");
        m.insert("news");
        m.insert("google maps");
        m.insert("google classroom");
        m.insert("roblox");
        m.insert("cnn");
        m.insert("lowes");
        m.insert("calculator");
        m.insert("amazon prime");
        m.insert("paypa");
        m.insert("speed test");
        m.insert("hotmail");
        m.insert("target");
        m.insert("google drive");
        m.insert("msn");
        m.insert("instagram");
        m.insert("zillow");
        m.insert("twitter");
        m.insert("best buy");
        m.insert("aol mail");
        m.insert("bank of america");
        m.insert("wells fargo");
        m.insert("maps");
        m.insert("hulu");
        m.insert("discord");
        m.insert("ups tracking");
        m.insert("trump");
        m.insert("traductor");
        m.insert("costco");
        m.insert("reddit");
        m.insert("indeed");
        m.insert("disney plus");
        m.insert("you tube");
        
        
        //Initiliazie eveyrthing to DELETED
        for(int i = 0 ; i < dble.hashTable.length; i ++)
        {
        	dble.hashTable[i] = "DELETED";
        }
        dble.insert("youtube");
        dble.insert("facebook");
        dble.insert("amazon");
        dble.insert("gmail");
        dble.insert("google");
        dble.insert("yahoo");
        dble.insert("yahoo mail");
        dble.insert("weather");
        dble.insert("netflix");
        dble.insert("walmart");
        dble.insert("google translate");
        dble.insert("home depot");
        dble.insert("usps tracking");
        dble.insert("translate");
        dble.insert("craigslist");
        dble.insert("fox news");
        dble.insert("google docs");
        dble.insert("news");
        dble.insert("google maps");
        dble.insert("google classroom");
        dble.insert("roblox");
        dble.insert("cnn");
        dble.insert("lowes");
        dble.insert("calculator");
        dble.insert("amazon prime");
        dble.insert("paypa");
        dble.insert("speed test");
        dble.insert("hotmail");
        dble.insert("target");
        dble.insert("google drive");
        dble.insert("msn");
        dble.insert("instagram");
        dble.insert("zillow");
        dble.insert("twitter");
        dble.insert("best buy");
        dble.insert("aol mail");
        dble.insert("bank of america");
        dble.insert("wells fargo");
        dble.insert("maps");
        dble.insert("hulu");
        dble.insert("discord");
        dble.insert("ups tracking");
        dble.insert("trump");
        dble.insert("traductor");
        dble.insert("costco");
        dble.insert("reddit");
        dble.insert("indeed");
        dble.insert("disney plus");
        dble.insert("you tube");

        displayOptions();
	}
	
	//displays what the user should be able to do
	public static void displayOptions() {
		System.out.println("Choose Program to Run: \n"
				+ "1) Hashing with chaining and division \n"
				+ "2) Hashing with multiplication \n"
				+ "3) Hashing with double hashing \n"
				+ "4) Exit Program");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			chaining();
		}
		else if(choice == 2) {
			multi();
		}
		else if(choice == 3) {
			dhash();
		}
		else if(choice == 4) {
			System.exit(0);
		}
		else{
			System.out.println("Not a valid option");
			displayOptions();
		}
	}
	
	//mulitiplication table choices
	private static void multi() {
		System.out.println("This is the current hash table with multiplication and linear probing: ");
		m.printHashTable();
		System.out.println("Choose: \n"
				+ "1) insert word \n"
				+ "2) search keyword \n"
				+ "3) delete keyword \n"
				+ "4) go back");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			mInsert();
			displayOptions();
		}
		else if(choice == 2) {
			mSearch();
			displayOptions();
				
			
		}
		else if(choice == 3) {
			mDelete();
			displayOptions();
		}
		else if(choice == 4) {
			displayOptions();
		}
		else{
			System.out.println("Not a valid option");
			System.exit(0);
		}
		
	}
	//method to delete in hashTable with multiplication
	private static void mDelete() {
		System.out.println("What word do u want to delete");
		sc.nextLine();
		String temp = sc.nextLine();
		m.delete(temp);
		m.printHashTable();
		
	}

	//method to search in hashTable with multiplication
	private static void mSearch() {
		System.out.println("What word do u want to search");
		//sc.nextLine();
		String temp = sc.nextLine();
		m.search(sc.nextLine());
		
	}
	
	//method to insert in hashTable with multiplication
	private static void mInsert() {
		System.out.println("What word do u want to insert?");
		sc.nextLine();
		String temp = sc.nextLine();
		m.insert(temp);
		m.printHashTable();		
	}

	//double hash table options
	private static void dhash() {
		System.out.println("This is the current hash table with Open Adressing(double hash): ");
		dble.printHashTable();
		System.out.println("Choose: \n"
				+ "1) insert word \n"
				+ "2) search keyword \n"
				+ "3) go back");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			dbleInsert();
			displayOptions();
		}
		else if(choice == 2) {
			dbleSearch();
			displayOptions();
		
		}
		
		else if(choice == 3) {
			displayOptions();
		}
		else{
			System.out.println("Not a valid option");
			System.exit(0);
		}
		
	}

	//search for a string in the double hashing hashTable
	private static void dbleSearch() {
		System.out.println("What word do u want to search");
		//sc.nextLine();
		String temp = sc.nextLine();
		dble.search(sc.nextLine());
		
	}
	//Insert a string in the double hashing hashTable
	private static void dbleInsert() {
		System.out.println("What word do u want to insert?");
		sc.nextLine();
		String temp = sc.nextLine();
		dble.insert(temp);
		dble.printHashTable();
		
	}

	//User abilities for hashTable(chain)
	public static void chaining() {
		System.out.println("This is the current hash table with Chaining: ");
		chain.printHashTable();
		System.out.println("Choose: \n"
				+ "1) insert word \n"
				+ "2) search keyword \n"
				+ "3) delete keyword \n"
				+ "4) go back");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			chainInsert();
			displayOptions();
		}
		else if(choice == 2) {
			chainSearch();
			displayOptions();
				
			
		}
		else if(choice == 3) {
			chainDelete();
			displayOptions();
		}
		else if(choice == 4) {
			displayOptions();
		}
		else{
			System.out.println("Not a valid option");
			System.exit(0);
		}
		
	}
	
	//method for user to delete a word in hashTable(chain)
	private static void chainDelete() {
		System.out.println("What word do u want to delete");
		sc.nextLine();
		String temp = sc.nextLine();
		chain.delete(temp);
		chain.printHashTable();
		
	}

	//method for user to search for a word in hashTable(chain)
	private static void chainSearch() {
		System.out.println("What word do u want to search");
		//sc.nextLine();
		String temp = sc.nextLine();
		chain.search(sc.nextLine());
		
	}
	
	//method for user to insert into hashTabel(chain)
	private static void chainInsert() {
		System.out.println("What word do u want to insert?");
		sc.nextLine();
		String temp = sc.nextLine();
		chain.insert(temp);
		chain.printHashTable();
		
	}
}
