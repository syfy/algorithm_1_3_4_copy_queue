
public class TestClient {
	public static void main(String[] args) throws IllegalAccessException{
		// TODO Auto-generated method stub
				SingleSideQueue sq = new SingleSideQueue(1);
				sq.enqueue(2);
				sq.enqueue(3);
				sq.enqueue(4);
				System.out.println(sq.toString());
	
				
		

				 
				 //System.out.println(sq.booleanIsEmpty());
				 
					SingleSideQueue sqc = new SingleSideQueue(sq);
					System.out.println(sq.toString());

					System.out.println(sqc.toString());



	}
}
