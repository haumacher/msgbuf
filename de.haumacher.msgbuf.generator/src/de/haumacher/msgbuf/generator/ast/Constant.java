package de.haumacher.msgbuf.generator.ast;

/**
 * A constant of an {@link EnumDef}.
 *
 * @see EnumDef#getConstants()
 */
public class Constant implements de.haumacher.msgbuf.data.DataObject {

	/**
	 * Creates a {@link Constant} instance.
	 */
	public static Constant constant() {
		return new Constant();
	}

	/**
	 * Creates a {@link Constant} instance.
	 *
	 * @see #constant()
	 */
	protected Constant() {
		super();
	}

	private String _comment = "";

	private String _name = "";

	private int _index = 0;

	/**
	 * The documentation comment for this constant.
	 */
	public final String getComment() {
		return _comment;
	}

	/**
	 * @see #getComment()
	 */
	public final Constant setComment(String value) {
		_comment = value;
		return this;
	}

	/**
	 * The name of this constant.
	 */
	public final String getName() {
		return _name;
	}

	/**
	 * @see #getName()
	 */
	public final Constant setName(String value) {
		_name = value;
		return this;
	}

	/**
	 * The numeric identifier for this constant.
	 */
	public final int getIndex() {
		return _index;
	}

	/**
	 * @see #getIndex()
	 */
	public final Constant setIndex(int value) {
		_index = value;
		return this;
	}

	/** Reads a new instance from the given reader. */
	public static Constant readConstant(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		Constant result = new Constant();
		result.readContent(in);
		return result;
	}

	@Override
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

	@Override
	public Object get(String field) {
		switch (field) {
			case "comment": return getComment();
			case "name": return getName();
			case "index": return getIndex();
			default: return null;
		}
	}

	@Override
	public void set(String field, Object value) {
		switch (field) {
			case "comment": setComment((String) value); break;
			case "name": setName((String) value); break;
			case "index": setIndex((int) value); break;
		}
	}

	/** Writes all fields of this instance to the given output. */
	protected void writeContent(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.name("comment");
		out.value(getComment());
		out.name("name");
		out.value(getName());
		out.name("index");
		out.value(getIndex());
	}

	/** Reads the given field from the given input. */
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case "comment": setComment(in.nextString()); break;
			case "name": setName(in.nextString()); break;
			case "index": setIndex(in.nextInt()); break;
			default: in.skipValue();
		}
	}

}
