package interfaces;

public class SqliteDal implements ICustomerDal{

		@Override
		public void add() {
			System.out.println("SQLITE eklendi");
		}
}
