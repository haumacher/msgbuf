package de.haumacher.msgbuf.generator.ast;

/**
 * {@link Definition} of an enumeration.
 */
public class EnumDef extends Definition {

	/**
	 * Creates a {@link EnumDef} instance.
	 */
	public static EnumDef enumDef() {
		return new EnumDef();
	}

	/**
	 * Creates a {@link EnumDef} instance.
	 *
	 * @see #enumDef()
	 */
	protected EnumDef() {
		super();
	}

	private final java.util.List<Constant> _constants = new java.util.ArrayList<>();

	/**
	 * All enum constants of this enumeration
	 */
	public final java.util.List<Constant> getConstants() {
		return _constants;
	}

	/**
	 * @see #getConstants()
	 */
	public final EnumDef setConstants(java.util.List<Constant> value) {
		_constants.clear();
		_constants.addAll(value);
		return this;
	}

	/**
	 * Adds a value to the {@link #getConstants()} list.
	 */
	public final EnumDef addConstant(Constant value) {
		_constants.add(value);
		return this;
	}

	/** Reads a new instance from the given reader. */
	public static EnumDef readEnumDef(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		EnumDef result = new EnumDef();
		in.beginObject();
		result.readFields(in);
		in.endObject();
		return result;
	}

	@Override
	protected String jsonType() {
		return "EnumDef";
	}

	@Override
	public Object get(String field) {
		switch (field) {
			case "constants": return getConstants();
			default: return super.get(field);
		}
	}

	@Override
	public void set(String field, Object value) {
		switch (field) {
			case "constants": setConstants((java.util.List<Constant>) value); break;
			default: super.set(field, value); break;
		}
	}

	@Override
	protected void writeFields(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		super.writeFields(out);
		out.name("constants");
		out.beginArray();
		for (Constant x : getConstants()) {
			x.writeTo(out);
		}
		out.endArray();
	}

	@Override
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case "constants": {
				in.beginArray();
				while (in.hasNext()) {
					addConstant(Constant.readConstant(in));
				}
				in.endArray();
			}
			break;
			default: super.readField(in, field);
		}
	}

	@Override
	protected int typeId() {
		return 1;
	}

	@Override
	protected void writeFields(de.haumacher.msgbuf.binary.DataWriter out) throws java.io.IOException {
		super.writeFields(out);
		out.name(6);
		{
			java.util.List<Constant> values = getConstants();
			out.beginArray(de.haumacher.msgbuf.binary.DataType.OBJECT, values.size());
			for (Constant x : values) {
				x.writeTo(out);
			}
			out.endArray();
		}
	}

	/** Reads a new instance from the given reader. */
	public static EnumDef readEnumDef(de.haumacher.msgbuf.binary.DataReader in) throws java.io.IOException {
		in.beginObject();
		EnumDef result = new EnumDef();
		while (in.hasNext()) {
			int field = in.nextName();
			result.readField(in, field);
		}
		in.endObject();
		return result;
	}

	@Override
	protected void readField(de.haumacher.msgbuf.binary.DataReader in, int field) throws java.io.IOException {
		switch (field) {
			case 6: {
				in.beginArray();
				while (in.hasNext()) {
					addConstant(Constant.readConstant(in));
				}
				in.endArray();
			}
			break;
			default: super.readField(in, field);
		}
	}

	@Override
	public <R,A> R visit(Definition.Visitor<R,A> v, A arg) {
		return v.visit(this, arg);
	}

}
