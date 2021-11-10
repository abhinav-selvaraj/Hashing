//HashTable Class that implements the multiplcation HashFunction and Linear Probing(Open adress) for collision prevention

public class HashTableM {
	String[] hashTable;
	
	
	public HashTableM(int size) {
		hashTable = new String[size];
	}
	
	//Multiplication hash function to Calculate index
	public static int hashCodeMultiply(String s) {
		/*
		double A = (Math.sqrt(5) - 1) /2;
		int key = Math.abs(s.hashCode());
		double constant = key * A;
		double temp = constant % 1;
		temp = temp * 64;
		key = (int)temp;
		return key;
		*/
		double A = (Math.sqrt(5) - 1) /2; //Constant A
		int key = Math.abs(s.hashCode()); //The Key Value
		double x = A * (Math.pow(2, 16)); // s = A*2^w
		int y = (int) ((key*x) % (Math.pow(2, 16))); // k * s % 2^16
		int bit = 10; // w- p (16-6) amount of bits to shift to the right
		return (y >> bit); //shift right by bits
	}
	
	//Inserts a String S into the HashTable
	public void insert(String s) {
		int i  = 0; //counter
		int code = hashCodeMultiply(s); //get index
		//if no value in the poritions, set it and return
		while(i < hashTable.length) {
			if(hashTable[code].equals("DELETED")) {
				hashTable[code] = (s);
				return;
			}
			else {
				code++; //get the next index to check(linear probing)
				//makes sure position to stay in range of 0 - hashTable.length
				if(code > hashTable.length-1) {
					code %= 64;
				}
				i++; //increase counter; 
			}
		}
		
		//if gone through every cell in the array
		System.out.println("Error unable to insert because table is full ");
	}
	
	//search for a String s
	public int search(String s) {
		int i = 0; //counter
		int pos = hashCodeMultiply(s); //index
		//while there are positions in the cell that have not been traversed
		while(i < hashTable.length) {
			//if found return
			if(hashTable[pos].equals(s)) {
				System.out.println("The position is "+ pos);

				return pos;
			}
			else {
				pos ++; //linear probing
				if(pos > hashTable.length-1) {
					pos %= 64;
				}
				i++; //keep going till every cell is checked
			}
		}
		//unable to find
		System.out.println("Not found");
		return -1;
	}
	
	//deletes a string s from the table
	public void delete(String s) {
		//searches for the string, and if it cant find, it does not exist in table
		if(search(s) == -1) {
			System.out.println("Does not exist in table");
			return;
		}
		else {
			//delete at the position
			int pos = search(s);
			hashTable[pos] = "DELETED";
		}
		
		
	}
	
	//helper method to print the hashTable
	public void printHashTable()
    {
        System.out.println();
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("At " + i + ":  " + hashTable[i]);
          
        }
    }
	
	//TEST
	public static void main(String[] args) {
		HashTableM hashTab = new HashTableM(64);
		for (int i = 0; i < 64; i++) {
            hashTab.hashTable[i] = "DELETED";
        }
   // System.out.println("The hashcode for gmail is " + hashCodeMultiply("gmail"));
    hashTab.insert("youtube");
    hashTab.insert("facebook");
    hashTab.insert("amazon");
    hashTab.insert("gmail");
    hashTab.insert("google");
    hashTab.insert("yahoo");
    hashTab.insert("yahoo mail");
    hashTab.insert("weather");
    hashTab.insert("netflix");
    hashTab.insert("walmart");
    hashTab.insert("ebay");
    hashTab.insert("google translate");
    hashTab.insert("home depot");
    hashTab.insert("usps tracking");
    hashTab.insert("translate");
    hashTab.insert("craigslist");
    hashTab.insert("fox news");
    hashTab.insert("google docs");
    hashTab.insert("news");
    hashTab.insert("google maps");
    hashTab.insert("google classroom");
    hashTab.insert("roblox");
    hashTab.insert("cnn");
    hashTab.insert("lowes");
    hashTab.insert("calculator");
   
    hashTab.insert("amazon prime");
    hashTab.insert("paypal");
    hashTab.insert("speed test");
    hashTab.insert("hotmail");
    hashTab.insert("target");
    hashTab.insert("google drive");
    hashTab.insert("msn");
    hashTab.insert("instagram");
    hashTab.insert("zillow");
    hashTab.insert("twitter");
    hashTab.insert("best buy");
    hashTab.insert("aol mail");
    hashTab.insert("bank of america");
    hashTab.insert("wells fargo");
    hashTab.insert("maps");
    hashTab.insert("hulu");
    hashTab.insert("discord");
    hashTab.insert("ups tracking");
    hashTab.insert("trump");
    hashTab.insert("traductor");
    hashTab.insert("costco");
    hashTab.insert("reddit");
    hashTab.insert("indeed");
    hashTab.insert("disney plus");
    hashTab.insert("you tube");

    //hashTab.printHashTable();
    //System.out.println();
   hashTab.search("msn");
   hashTab.delete("msn");
   //ystem.out.println();
    //hashTab.search("msn");
    hashTab.printHashTable();
	}
	
	
	
	
}
