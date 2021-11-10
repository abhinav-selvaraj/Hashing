//Class to implement HashTable using Double Hashing(open addressing)
public class DoubleHash {
	 String[] hashTable; 
	 public int size; //counter
	
	 //constructs a new table
	public DoubleHash(int size) {
		hashTable = new String[size];
		size = 0;
	}
	
	//first hash function: k mod 57
	public static  int dHashOne(String s) {
		int hash = Math.abs(s.hashCode());
		hash  = (hash % 57);
		return hash;
	}
	
	//second hash function: 1 + (k mod 13)
	public static int dHashTwo(String s) {
		int hash = Math.abs(s.hashCode());
		hash = (((hash % 13)) + 1);
		return hash;
		
	}
	
	//inserts a String s into the table
	public void insert(String s) {
		//checks if table is full
		if(size >=57) {
			System.out.println("Table is full");
			return;
		}
		int pos = dHashOne(s); //calculate first hashValue
		int add = dHashTwo(s); //calculate second hashValue
		int i = 0; //counter
		
		//if empty at pos, insert and return
		while(i < hashTable.length) {
			if(hashTable[pos].equals("DELETED")) {
				hashTable[pos] = s;
				return;
			}
			else {
				//if not, increment by 2nd hashFunction 
				pos = pos + add; 
				
				//keep in range of 0 - hashTable.length-1
				if(pos > hashTable.length-1) {
					pos = pos%57;
				}
				i++; //counter to make sure it will exit after checking each cell
			}
		}
		size++; //increase size counter;
		
	}
	
	//search for a string in the table
	public int search(String s) {
		int pos = dHashOne(s);
		int add = dHashTwo(s);
		int i = 0;
		//if at pos, ret pos, else inc by add and keep looping till found
		while(i < hashTable.length-1) {
			if(hashTable[pos].equals(s)) {
				System.out.println("The position is "+ pos);
				return pos;
			}
			else {
				pos = pos +add;
				if(pos > hashTable.length-1) {
					pos %= 57;
				}
				i++;
			}
			
		}
		//did not find
		System.out.println("Not found");
		return -1;
	}
		
		
	//Helper method to print the HashTable
	public void printHashTable()
    {
        System.out.println();
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("At " + i + ":  " + hashTable[i]);
          
        }
    }
	
	//TESTS
	public static void main(String[] args) {
		DoubleHash hashTab = new DoubleHash(57);
		for (int i = 0; i < 57; i++) {
            hashTab.hashTable[i] = "DELETED";
        }
   // System.out.println(dHash("youtube"));
    //System.out.println("The two hash values for 'discord' are " +dHashOne("discord") + " " + dHashTwo("discord"));
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
    hashTab.insert("paypa");
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
    
    hashTab.insert("doge");
    hashTab.printHashTable();
    hashTab.search("doge");
    //hashTab.search("indeed");
    
	}
	
	
}

