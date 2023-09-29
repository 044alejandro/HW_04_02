public class Main {
	public static void main(String[] args) {
		Address address = new Address();
		address.setIndex(0);
		address.setCountry("Ukraine");
		address.setCity("Kyiv");
		address.setStreet("Chavdar");
		address.setHouse(8);
		address.setApartment(233);
		System.out.println(address.toString());
	}
}
