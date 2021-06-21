
public class FinalFieldMain {

	public static void main(String[] args) {
		FinalField ff1 = new FinalField();
		/*
		<<The final field FinalField.INCETIVE_RATE cannot be assigned>>
		ff1.INCETIVE_RATE=0.5;
		ff1.PORT_NUMBER=8080;
		*/
		
		/*
		<<The final field FinalField.EAST cannot be assigned>> 
		FinalField.EAST=90;
		FinalField.WEST=99;
		 */
		
		
		ff1.move(FinalField.NORTH);
		ff1.move(FinalField.NORTH);
		ff1.move(FinalField.EAST);
		ff1.move(FinalField.WEST);
		ff1.move(FinalField.SOUTH);
	}

}
