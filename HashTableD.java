//HashTable Class that implements the division HashFunction and Chaining for collision prevention
public class HashTableD {
	StringNode[] hashTable;
	
	//constructor sets size of table
	public HashTableD(int size) {
		hashTable = new StringNode[size];
		
	}
	
	//inserts a string into the table
	public void insert(String s) {
		
		int position = hashCodeDivision(s); //gets hashcode
		StringNode n = new StringNode(s); //greats a new Node with the string
		StringNode start = hashTable[position]; //assigns the first node as start at the index of hashcode
		//if null, assign the new string to be the head
		if (hashTable[position] == null)
            hashTable[position] = n;
       //if values already in the list, set the head as the new val and update pointers
		else {
            n.next = start;
            start.prev = n;
            hashTable[position] = n;
        }
	}
	
	//calculate hashCode using division method
	public static int hashCodeDivision(String s) {
		int hash = 0;
		hash = s.hashCode() % 17;
		return Math.abs(hash); //if its negative, get positive value;
	}
	
	public void delete(String s) {
		//shows user its not in table so unable to delete
		if(search(s) == -1) {
			System.out.println("Not in Table");
			return;
		}
		int pos = hashCodeDivision(s); //get position of where string will be
		StringNode start = hashTable[pos];
		StringNode temp = start;
		
		//if its the only string in the list, just set it to null 
		if(start.string.equals(s)) {
			if(start.next.equals(null)) {
				hashTable[pos] = null;
				return;
			}
			//sets the "start" to the next val and set the new "start's" prev val to null;
			start = start.next;
			start.prev = null;
			hashTable[pos] = start;
			return;
		}
		
		//find the string before the searched string
		while(temp.next!= null && !temp.next.string.equals(s))
			temp = temp.next;
		
		if(temp.next == null) {
			return;
		}
		
		if(temp.next.next == null) {
			temp.next = null;
			return;
		}
		
		//fix pointers in linked List
		temp.next.next.prev = temp;
		temp.next = temp.next.next;
		hashTable[pos] = start;
	}
	
	//Searches the hashTable for a String s
	public int search(String s) {
		int pos = hashCodeDivision(s); // get position in table
		//iterate through each node to check if equal
		StringNode start = hashTable[pos];
		while(start!= null)
		{
			//if its the head, return
			if(s.equals(start.string)) {
				System.out.println("The position is index " + pos);
				return pos;
			}
			start = start.next; // get next
		}
		
		//unable to find
		System.out.println("Not found");
		return -1;
	}
	
	//helper method to print the hashTable
	public void printHashTable()
    {
        System.out.println();
        for (int i = 0; i < 17; i++) {
            System.out.print("At " + i + ":  ");
  
            StringNode start = hashTable[i];
  
            while (start != null) {
                System.out.print(start.string + ", ");
                start = start.next;
            }
  
            System.out.println();
        }
    }
	
	//TESTING
	public static void main(String[] args)
    {
        HashTableD hashTab = new HashTableD(17);
      System.out.println(hashCodeDivision("youtube"));
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
        hashTab.insert("you tube");

  
        hashTab.printHashTable();
        //hashTab.delete("instagram");
        //hashTab.printHashTable();
        //hashTab.search("dog");
        
    }
}
