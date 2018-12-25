 public class Schedule {

	private char[][] Schedule = new char[4][3];

	public Schedule()
	{
		Schedule = new char[4][3];
	}

	//Making the Schedule

	public void addBlock(char block, char free, char building)
	{
		if(block == 'a')
		{
			Schedule[0][0] = block;
			Schedule[0][1] = free;
			Schedule[0][2] = building;

		}
		if(block == 'b')
		{
			Schedule[1][0] = block;
			Schedule[1][1] = free;
			Schedule[1][2] = building;
		}
		if(block == 'c')
		{
			Schedule[2][0] = block;
			Schedule[2][1] = free;
			Schedule[2][2] = building;
		}
		if(block == 'd')
		{
			Schedule[3][0] = block;
			Schedule[3][1] = free;
			Schedule[3][2] = building;
		}
	}

	public boolean isFree(Calendar c)
	{
      char block = c.getBlock();
      int i=0;
		if(block == 'a')
			i=0;
		
		if(block == 'b')
			i=1;
		
		if(block == 'c')
			i=2;
		
		if(block == 'd')
			i=3;
		
      return (Schedule[i][1] == 'Y');
		
	}
}