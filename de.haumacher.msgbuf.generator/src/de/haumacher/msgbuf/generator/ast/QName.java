package de.haumacher.msgbuf.generator.ast;

/**
 * A dot-separated qualified name.
 */
public class QName implements de.haumacher.msgbuf.data.DataObject {

	/**
	 * Creates a {@link QName} instance.
	 */
	public static QName qName() {
		return new QName();
	}

	/**
	 * Creates a {@link QName} instance.
	 *
	 * @see #qName()
	 */
	protected QName() {
		super();
	}

	private final java.util.List<String> _names = new java.util.ArrayList<>();

	/**
	 * The parts that compose this qualified name.
	 */
	public final java.util.List<String> getNames() {
		return _names;
	}

	/**
	 * @see #getNames()
	 */
	public final QName setNames(java.util.List<String> value) {
		_names.clear();
		_names.addAll(value);
		return this;
	}

	/**
	 * Adds a value to the {@link #getNames()} list.
	 */
	public final void addName(String value) {
		_names.add(value);
	}

	/** Reads a new instance from the given reader. */
	public static QName readQName(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		QName result = new QName();
		result.readFields(in);
		return result;
	}

	@Override
	public final void writeTo(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		writeContent(out);
	}

	/**
	 * Writes a JSON object containing keys for all fields of this object.
	 *
	 * @param out The writer to write to.
	 */
	protected final void writeContent(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.beginObject();
		writeFields(out);
		out.endObject();
	}

	/**
	 * Reads all fields of this instance from the given input.
	 *
	 * @param in The reader to take the input from.
	 */
	protected final void readFields(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		while (in.hasNext()) {
			String field = in.nextName();
			readField(in, field);
		}
	}

	@Override
	public Object get(String field) {
		switch (field) {
			case "names": return getNames();
			default: return null;
		}
	}

	@Override
	public void set(String field, Object value) {
		switch (field) {
			case "names": setNames((java.util.List<String>) value); break;
		}
	}

	/** Writes all fields of this instance to the given output. */
	protected void writeFields(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.name("names");
		out.beginArray();
		for (String x : getNames()) {
			out.value(x);
		}
		out.endArray();
	}

	/** Reads the given field from the given input. */
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case "names": {
				in.beginArray();
				while (in.hasNext()) {
					addName(in.nextString());
				}
				in.endArray();
			}
			break;
			default: in.skipValue();
		}
	}

}
