package example;

public class Model {

	private String text = null;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Model [text=" + (text == null ? "<null>" : text.isEmpty() ? "<empty>" : text) + "]";
	}
	
}
