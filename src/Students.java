public class Students {
	
	private int numberOfStudents;

	 
	public Students() {
	
	

	}
	int partition(Student[] arr, int left, int right)
	{
	      int i = left, j = right;
	      Student tmp;
	      Student pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i].getDickeys() < pivot.getDickeys())
	                  i++;
	            while (arr[j].getDickeys() > pivot.getDickeys())
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}

	
	 
	public void quickSort(Student[] arr, int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
}
