package array;

public class homework {

	 public static void main(String[] args) {
		 	int[] arr={5,4,3,2,1};
		 	int[] subArr={3,2};
		 	printArray(populateWithoutRepeat(arr));
	    }
	 	public static void printArray(int[] arr){
	 		for(int i=0;i<arr.length;i++){
	 			System.out.println(arr[i]);
	 		}
	 	}
	    public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
		    int index=-1;
		    for(int i=0;i<arrayToSearch.length;i++){
			    if(arrayToSearch[i]==key){
			    		index=i;
			    }
		    }
		    return index;
	    }
	    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	    		int begin=0;
	    		int end=sortedArrayToSearch.length-1;
	    		int middleIndex=(begin+end)/2;
	    		while(begin<=end){
	    			if(sortedArrayToSearch[middleIndex]==key){
	    				return middleIndex;
	    			}
	    			else if(sortedArrayToSearch[middleIndex]<key){
	    				end=middleIndex-1;
	    			}
	    			else if(sortedArrayToSearch[middleIndex]>key){
	    				begin=middleIndex+1;
	    			}
	    			middleIndex=(begin+end)/2;
	    			}
	    		return -1;
	    }
	    public static void selectionSort(double[] array){
	    	for (int i = 0; i < array.length - 1; i++){
	    	    int tempLowIndex = i;
	    	    for (int j = i + 1; j < array.length; j++){
	    	        if (array[j] < array[tempLowIndex]){
	    	            tempLowIndex = j;
	    	        }
	    	    }
	    	    if(tempLowIndex!=i){
	    	        double placeholder=array[i];
	 		 		array[i]=array[tempLowIndex];
	 		 		array[tempLowIndex]=placeholder;
	    	    } 
	    	  }
	    }
	    public static boolean isSorted(int[] array){
	        /**
	         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
	         * */
	    	for(int i=0;i<array.length-1;i++){
	    		if(array[i]<array[i+1]){
	    			return false;
	    		}
	    	}
	        return true;
	    }
	    
	    public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
	    	int[] subArray=new int[endIndex-startIndex+1];
	    	for(int i=0;i<subArray.length;i++){
	    		subArray[i]=arr[startIndex+i];
	    	}
	    	return subArray;
	    }
	    public static boolean contains(int[]arr,int[]subArray){
	    	int i=0;
	    	while(getSubArray(arr,i,i+(subArray.length-1)).equals(subArray)==false && i<=arr.length-1){
		    	for(i=0;i<arr.length;i++){
		    		if(arr[i]==subArray[0]){
		    			break;
		    		}
		    		if(i==arr.length-1){
		    			break;
		    		}
		    	}
	    	}
	    	return getSubArray(arr,i,i+(subArray.length-1)).equals(subArray);
	    }
	    public static double[] getStats(double[] array){
	        /** 
	         * This method return a double[] contain a WHOLE BUNCH of stats
	         * The double array must keep the following stats about the array parameter:
	         * index 0 = the mean
	         * index 1 = the max
	         * index 2 = the min
	         * index 3 = the median
	         * index 4 = the number of values greater than or equal to the mean
	         * index 5 = the number of values below the mean
	         * */
	    	double[] stats = new double[6];
	    	selectionSort(array);
	        for(double item: array){ //mean
	        	stats[0]=stats[0]+item;
	        }
	        stats[0]=stats[0]/array.length;
	        stats[1]=array[0]; //max
	        stats[2]=array[array.length-1];//min
	        int middleIndex=array.length/2;
	        if((array.length % 2)==0){//median
	        	stats[3]=(array[middleIndex]+array[middleIndex-1])/2;
	        }
	        else{
	        	stats[3]=array[(int)(Math.ceil(middleIndex/2))];
	        }
	        for(int i=0;i<array.length;i++){//values greater than mean
	        	if(array[i]>=stats[0]){
	        		stats[4]++;
	        	}
	        }
	        for(int i=0;i<array.length;i++){//values below
	        	if(array[i]<=stats[0]){
	        		stats[5]++;
	        	}
	        }
	        return stats;
	    }
	    
	    public static void reverseOrder(int[] array){
	        /**
	         * this method reverses the order of the array passed to it.
	         * Not that this method does not have a return type. You do not need to copy the array first
	         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
	         * in a random order, though you still need to reverse whatever order it is in
	         * 
	         * Example:
	         * array = {5, 1, 9, 10, 16, -6}
	         * after calling this method
	         * array = {-6, 16, 10, 9, 1, 5}
	         * 
	         * */
	    	int tempIndex=0;
	    	for(int i=array.length-1;i!=(int)(Math.ceil((array.length-1)/2));i--){
	    		int placeholder=array[i];
		 		array[i]=array[tempIndex];
		 		array[tempIndex]=placeholder;
		 		tempIndex++;
	    	}
	    }
	    
	    public static int countDifferences(int[] array1, int[] array2){
	        /**Here, you will write an method that returns the number of values in two arrays 
	         * that are NOT the same (either in value OR location).
	         * The arrays ALWAYS have the same length
	         * Examples:
	         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
	         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
	         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
	         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
	         * 
	         * */
	    	int counter=0;
	    	for(int i=0;i<array1.length;i++){
	    		if(array1[i]!=array2[i]){
	    			counter++;
	    		}
	    	}
	        return counter;
	    }
	    

	    public static int longestConsecutiveSequence(int[] array1){
	        /**This method counts the longest consequtive sequence in an array.
	         * It does not matter where the sequence begins
	         * If there are no consecutive numbers, the method should return '1'
	         * 
	         * Examples:
	         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
	         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
	         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
	         * */
	        
	        return 0;
	    }

	    public static int longestSharedSequence(int[] array1, int[] array2){
	        /**This method counts the longest unbroken, shared sequence in TWO arrays.
	         * The sequence does NOT have to be a consecutive sequence
	         * It does NOT matter where the sequence begins, the arrays might not be the same length
	         * 
	         * Examples:
	         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
	         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
	         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
	         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
	         * */
	        
	        return 0;
	    }

	    public static int[] generateDistinctItemsList(int n){
	        /**
	         * This method needs to generate an int[] of length n that contains distinct, random integers
	         * between 1 and 2n 
	         * The method will be tested by verifying that the array you return is n items long,
	         * contains only entries between 1 and 2n (inclusive) and has no duplicates
	         * 
	         * */
	    	int[] distinctItemList=new int[n];
	    	boolean[] isUsedAlready=new boolean[2*n];
	    	for(int i=0;i<n;i++){
	    		boolean inLoop=true;
	    		while(inLoop){
	    			int random = (int) (Math.random()*n)+1;
	    			if(isUsedAlready[random-1]==false){
	    				inLoop=false;
	    				distinctItemList[i]=random;
	    				isUsedAlready[random-1]=true;
	    			}
	    		}
	    	}
	    	return distinctItemList; 
	    }
	    
	    public static int countUnderBound(double[] arr, double d){
	    	int counter=0;
	    	for(int i=0;i<arr.length;i++){
	    		if(arr[i]<d)counter++;
	    	}
			return counter;
	    	
	    }
	    public static int[] populateWithoutRepeat(int[]arr){
	    	int[] subArr=new int[arr.length-1];
	    	for(int i=0;i<subArr.length;i++){
	    		int randNum=(int)(Math.random()*(arr.length));
	    		while(searchUnsorted(subArr,randNum)>-1){
	    			randNum=(int)(Math.random()*(arr.length));
	    		}
	    		subArr[i]=randNum;
	    	}
	    	return subArr;
	    }
	    public static void cycleThrough(int[] array, int n){
	        /** This problem represents people moving through a line.
	         * Once they get to the front of the line, they get what they've been waiting for, then they 
	         * immediately go to the end of the line and "cycle through" again.
	         * 
	         * This method reorders the array so that it represents what the array would look like
	         * after it had been cycled through an n number of times.
	         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
	         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
	         * 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
	         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
	         * 
	         * Likewise,
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
	         * and the most interesting case, 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
	         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
	         * was able to go through one more time than anyone else
	         * 
	         * CHALLENGE
	         * For extra credit, make your method handle NEGATIVE n
	         * */
	    	int inLoop=n;
	    	while(inLoop>0){
		    	for(int i=array.length-1;i>-1;i--){
		    		int placeholder=array[i];
			 		array[i]=array[0];
			 		array[0]=placeholder;
		    	}
		    	inLoop--;
	    	}
	    }

	
}
