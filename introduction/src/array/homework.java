package array;

public class homework {

	 public static void main(String[] args) {
		 	int searchValue=30;
		 	int[] arr={1215, 1210, 1208, 1202, 1197, 1195, 1192, 1189, 1184, 1178, 1173, 1169, 1163, 1158, 1157, 1153, 1150, 1149, 1144, 1138, 1135, 1132, 1130, 1129, 1125, 1123, 1121, 1115, 1109, 1107, 1106, 1101, 1095, 1090, 1084, 1081, 1075, 1073, 1070, 1067, 1065, 1064, 1060, 1054, 1053, 1048, 1045, 1042, 1039, 1037, 1031, 1026, 1022, 1016, 1013, 1010, 1009, 1004, 1003, 1000, 998, 993, 989, 983, 978, 976, 970, 969, 963, 962, 958, 955, 954, 952, 949, 946, 942, 938, 933, 928, 927, 925, 923, 922, 919, 914, 909, 903, 897, 895, 892, 886, 884, 881, 876, 870, 868, 867, 865, 860, 854, 848, 843, 841, 835, 832, 826, 822, 818, 816, 810, 805, 802, 796, 792, 787, 781, 778, 777, 774, 770, 764, 759, 754, 748, 745, 742, 740, 736, 730, 728, 727, 726, 721, 715, 714, 708, 703, 697, 691, 685, 682, 681, 678, 673, 667, 665, 662, 657, 656, 650, 645, 644, 638, 636, 635, 634, 628, 626, 623, 620, 618, 615, 612, 606, 604, 599, 597, 595, 594, 592, 589, 588, 587, 586, 580, 574, 570, 568, 563, 560, 557, 551, 549, 548, 542, 536, 530, 525, 524, 522, 518, 512, 508, 507, 501, 496, 495, 491, 490, 484, 483, 481, 475, 474, 471, 466, 464, 462, 461, 459, 456, 455, 449, 448, 442, 436, 433, 427, 421, 415, 412, 409, 404, 399, 396, 395, 389, 387, 385, 382, 381, 378, 373, 367, 364, 358, 354, 349, 344, 340, 337, 335, 330, 329, 325, 323, 319, 315, 310, 309, 307, 302, 300, 298, 293, 289, 288, 282, 281, 277, 272, 271, 265, 259, 253, 247, 242, 237, 235, 233, 230, 228, 226, 222, 219, 218, 217, 216, 215, 209, 204, 202, 198, 193, 192, 186, 185, 179, 173, 167, 161, 156, 153, 150, 148, 147, 142, 141, 140, 139, 138, 135, 129, 124, 122, 119, 113, 108, 103, 97, 94, 91, 85, 81, 80, 76, 71, 65, 62, 58, 55, 51, 46, 43, 38, 32, 28, 25, 21, 19, 14, 9, 4, 0, -3, -6, -8, -9, -12, -13, -15, -20, -25, -31, -36, -41, -46, -49, -55, -61, -66, -69, -75, -81, -82, -87, -88, -90, -92, -96, -100, -104, -109, -114, -116, -117, -120, -121, -124, -127, -131, -135, -140, -145, -149, -154, -157, -163, -166, -171, -175, -176, -179, -185, -186, -189, -194, -196, -201, -204, -209, -211, -215, -221, -227, -231, -236, -237, -242, -245, -250, -253, -255, -259, -262, -268, -272, -275, -280, -286, -287, -289, -293, -296, -298, -304, -309, -311, -314, -320, -324, -327, -329, -335, -336, -338, -342, -344, -349, -355, -356, -358, -359, -363, -364, -368, -371, -372, -375, -376, -377, -380, -385, -391, -392, -393, -395, -400, -401, -405, -409, -410, -416, -417, -420, -422, -423, -429, -435, -440, -446, -448, -451, -453, -457, -458, -463, -465, -466, -470, -475, -481, -482, -487, -488, -491, -495, -501, -502, -505, -511, -517, -523, -526, -528, -530, -536, -541, -542, -543, -547, -550, -555, -561, -565, -569, -573, -576, -582};
		 	long startTime = System.nanoTime();
		 	System.out.println(searchSorted(arr,-582));
		 	long endTime = System.nanoTime();
		 	System.out.println("Took "+(endTime - startTime) + " ns"); 
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
	        if((array.length % 2)==0){//median
	        	stats[3]=(array[array.length/2]+array[(array.length/2)-1])/2;
	        }
	        else{
	        	stats[3]=array[(int)(Math.ceil((array.length)/2))];
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
	    	for(int i=0;i<distinctItemList.length;i++){
	    		boolean inLoop=true;
	    		while(inLoop){
	    			int random = (int) (Math.random()*isUsedAlready.length)+1;
	    			if(isUsedAlready[random-1]==false){
	    				inLoop=false;
	    				distinctItemList[i]=random;
	    				isUsedAlready[random-1]=true;
	    			}
	    		}
	    	}
	    	return distinctItemList; 
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
