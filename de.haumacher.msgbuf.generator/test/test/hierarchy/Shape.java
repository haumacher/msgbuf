package test.hierarchy;

/**
 * An abstract base class for all shapes
 */
public abstract class Shape {

	/** Visitor interface for the {@link Shape} hierarchy.*/
	public interface Visitor<R,A> {

		/** Visit case for {@link Circle}.*/
		R visit(Circle self, A arg);

		/** Visit case for {@link Rectangle}.*/
		R visit(Rectangle self, A arg);

		/** Visit case for {@link Group}.*/
		R visit(Group self, A arg);

	}

	/**
	 * Creates a {@link Shape} instance.
	 *
	 * @see #shape()
	 */
	protected Shape() {
		super();
	}

	private int _xCoordinate = 0;

	private int _yCoordinate = 0;

	public final int getXCoordinate() {
		return _xCoordinate;
	}

	/**
	 * @see #getXCoordinate()
	 */
	public final Shape setXCoordinate(int value) {
		_xCoordinate = value;
		return this;
	}

	public final int getYCoordinate() {
		return _yCoordinate;
	}

	/**
	 * @see #getYCoordinate()
	 */
	public final Shape setYCoordinate(int value) {
		_yCoordinate = value;
		return this;
	}

	private static final int[] FIELDS = {0, 0, };

	/** Reads a new instance from the given reader. */
	public static Shape readShape(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		Shape result;
		in.beginArray();
		String type = in.nextString();
		switch (type) {
			case "Circle": result = Circle.readCircle(in); break;
			case "Rectangle": result = Rectangle.readRectangle(in); break;
			case "Group": result = Group.readGroup(in); break;
			default: in.skipValue(); result = null; break;
		}
		in.endArray();
		return result;
	}

	/** Writes this instance to the given output. */
	public final void writeTo(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.beginObject();
		writeContent(out);
		out.endObject();
	}

	/** Reads all fields of this instance from the given input. */
	protected final void readContent(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		while (in.hasNext()) {
			String field = in.nextName();
			readField(in, field);
		}
	}

	/** Retrieves value of the field with the given index. */
	public Object get(String field) {
		switch (field) {
			case "xCoordinate": return getXCoordinate();
			case "yCoordinate": return getYCoordinate();
			default: return null;
		}
	}

	/** Sets the value of the field with the given index. */
	public void set(String field, Object value) {
		switch (field) {
			case "xCoordinate": setXCoordinate((int) value); break;
			case "yCoordinate": setYCoordinate((int) value); break;
		}
	}

	/** Writes all fields of this instance to the given output. */
	protected void writeContent(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.name("xCoordinate");
		out.value(getXCoordinate());
		out.name("yCoordinate");
		out.value(getYCoordinate());
	}

	/** Reads the given field from the given input. */
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case "xCoordinate": setXCoordinate(in.nextInt()); break;
			case "yCoordinate": setYCoordinate(in.nextInt()); break;
			default: in.skipValue();
		}
	}

	/** Accepts the given visitor. */
	public abstract <R,A> R visit(Visitor<R,A> v, A arg);


}
