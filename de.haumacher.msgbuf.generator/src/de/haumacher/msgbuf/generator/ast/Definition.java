package de.haumacher.msgbuf.generator.ast;

public abstract class Definition {

	/** Visitor interface for the {@link Definition} hierarchy.*/
	public interface Visitor<R,A> {

		/** Visit case for {@link EnumDef}.*/
		R visit(EnumDef self, A arg);

		/** Visit case for {@link MessageDef}.*/
		R visit(MessageDef self, A arg);

	}

	/**
	 * Creates a {@link Definition} instance.
	 *
	 * @see #definition()
	 */
	protected Definition() {
		super();
	}

	private String _name;

	private DefinitionFile _file;

	public final String getName() {
		return _name;
	}

	/**
	 * @see #getName()
	 */
	public final Definition setName(String value) {
		_name = value;
		return this;
	}

	public final DefinitionFile getFile() {
		return _file;
	}

	/**
	 * @see #getFile()
	 */
	public final Definition setFile(DefinitionFile value) {
		_file = value;
		return this;
	}

	private static final int[] FIELDS = {0, 0, };

	/** Reads a new instance from the given reader. */
	public static Definition readDefinition(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		Definition result;
		in.beginArray();
		String type = in.nextString();
		switch (type) {
			case "EnumDef": result = EnumDef.readEnumDef(in); break;
			case "MessageDef": result = MessageDef.readMessageDef(in); break;
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
			case "name": return getName();
			case "file": return getFile();
			default: return null;
		}
	}

	/** Sets the value of the field with the given index. */
	public void set(String field, Object value) {
		switch (field) {
			case "name": setName((String) value); break;
			case "file": setFile((DefinitionFile) value); break;
		}
	}

	/** Writes all fields of this instance to the given output. */
	protected void writeContent(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		out.name("name");
		out.value(getName());
		out.name("file");
		getFile().writeTo(out);
	}

	/** Reads the given field from the given input. */
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case "name": setName(in.nextString()); break;
			case "file": setFile(DefinitionFile.readDefinitionFile(in)); break;
			default: in.skipValue();
		}
	}

	/** Accepts the given visitor. */
	public abstract <R,A> R visit(Visitor<R,A> v, A arg);


}
