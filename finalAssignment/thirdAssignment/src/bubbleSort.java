
public class bubbleSort {
	
	public student[] sortById(student list[], int listLength) //method to sort by ID
	{
		student temp;
		int counter, index;
		
		for (counter = 0; counter < listLength - 1; counter ++)
		{
			for (index = 0; index < listLength - 1 - counter; index++)
				if (list[index].studentId > list [index + 1].studentId)
				{
					temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;
					
				}
		}
		
		return list;
	}
	
	public student[] sortBySurname(student list[], int listLength) //method to sort by Surname
	{
		student temp;
		int counter, index;
		
		for (counter = 0; counter < listLength - 1; counter ++)
		{
			for (index = 0; index < listLength - 1 - counter; index++)
				if (list[index].surname.charAt(0) > list [index + 1].surname.charAt(0))
				{
					temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;
					
				}
		}
		
		return list;
	}

}
