
public class Count {
	// Split String instance Method
	public static void main(String[] args) {
		String text = " Lorem Ipsum is simply dummy text of the printing "
				+ "and typesetting industry. Lorem Ipsum has been the industry's "
				+ "standard dummy text ever since the 1500s, when an unknown "
				+ "printer took a galley of type and scrambled it to "
				+ "make a type specimen book. It has survived not only five "
				+ "centuries, but also the leap into electronic typesetting, " + "remaining essentially unchanged.";

		// replace
		String fishText = text.replace("Lorem", "Angular");
		System.out.println(fishText);

		// How many sentences?
		String[] sentences = text.split("\\.");
		System.out.println("The text has " + sentences.length + " sentences.");

		// How many words
		String[] words = text.split("\\.");
		System.out.println("The text has " + words.length + " words");

		// How many Character
		System.out.println(text.length());
	}

}
