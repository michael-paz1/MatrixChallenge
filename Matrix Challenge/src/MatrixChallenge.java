
public class MatrixChallenge
	{
		static int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8}, {6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 1}, {2, 5, 1, 2, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
		public static void main(String[] args)
			{
				System.out.println("Hello there");
				System.out.println("The largest number is: " + findLargestNumber(myArray));
				System.out.println("The smallest number is: " + findSmallestNumber(myArray));
				System.out.println("The average is: " + findAverage(myArray));
			}
		private static int findLargestNumber(int [][] myArray)
			{
				int largestNumber = myArray[0][0];
				for(int row = 0; row < myArray.length; row++)
					{
						for(int col = 0; col < myArray[0].length; col++)
							{
								if(myArray[row][col] > largestNumber)
									{
										largestNumber = myArray[row][col];
									}
							}
					}
				return largestNumber;
				
			}
		private static int findSmallestNumber(int [][] myArray)
			{
				int smallestNumber = myArray[0][0];
				for(int row = 0; row < myArray.length; row++)
					{
						for(int col = 0; col < myArray[0].length; col++)
							{
								if(myArray[row][col] < smallestNumber)
									{
										smallestNumber = myArray[row][col];
									}
							}
					}
				return smallestNumber;
			}

		private static int findAverage(int [][] myArray)
			{
				int total = 0;
				int counter = 0;
				for(int row = 0; row < myArray.length; row++)
					{
						for(int col = 0; col < myArray[0].length; col++)
							{
								total = total + myArray[row][col];
								counter++;
							}
					}
				return total/counter;
				
			}

	}
