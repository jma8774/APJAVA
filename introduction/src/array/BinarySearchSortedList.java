package array;

public class BinarySearchSortedList {
	public static void main(String[] args) {
	 	int searchValue=992;
		int[] arr={1000,999,998,997,996,995,994,993,992,991,900,899,888,877,777,776,666,555,333,111,44};
		System.out.println("Searching for "+searchValue+" from a descending sorted array.");
		System.out.println("The index of searchValue "+searchValue+" is at "+searchSorted(arr,searchValue)+".");
    }
	public static int searchSorted(int[] sortedArrayToSearch, int key){
		    	int index=-1;
		    	if(sortedArrayToSearch[sortedArrayToSearch.length-1]==key){
		            index=sortedArrayToSearch.length-1;
		        }
		    	else if(sortedArrayToSearch[0]==key){
		    		index=0;
		    	}
		    	else{
		    		int begin=0;
		    		int end=sortedArrayToSearch.length-1;
		    		boolean inLoop=true;
		    		while(inLoop){
		    			if(sortedArrayToSearch[(int) Math.floor((begin+end)/2)]==key){
		    				inLoop=false;
		    				System.out.println("The middle value of index "+begin+" and index "+end+" is "+sortedArrayToSearch[(int) Math.floor((begin+end)/2)]+", which is index "+(int) Math.floor((begin+end)/2)+".");
		    				index=(int) Math.floor((begin+end)/2);
		    			}
		    			else if(sortedArrayToSearch[(int) Math.floor((begin+end)/2)]<key){
		    				System.out.println("The middle value of index "+begin+" and index "+end+" is "+sortedArrayToSearch[(int) Math.floor((begin+end)/2)]+", which is index "+(int) Math.floor((begin+end)/2)+".");
		    				System.out.println(sortedArrayToSearch[(int) Math.floor((begin+end)/2)]+" is smaller than the searchValue "+key+".");
		    				end=(int) Math.floor((begin+end)/2);
		    				System.out.println("The beginning index is now "+begin+" and the end index is now "+end+".");
		    			}
		    			else if(sortedArrayToSearch[(int) Math.floor((begin+end)/2)]>key){
		    				System.out.println("The middle value of index "+begin+" and index "+end+" is "+sortedArrayToSearch[(int) Math.floor((begin+end)/2)]+", which is index "+(int) Math.floor((begin+end)/2)+".");
		    				System.out.println(sortedArrayToSearch[(int) Math.floor((begin+end)/2)]+" is bigger than the searchValue "+key+".");
		    				begin=(int) Math.floor((begin+end)/2);
		    				System.out.println("The beginning index is now "+begin+" and the end index is now "+end+".");
		    			}
		    		}
		    	}
		    	return index;
		    }
}
