package test.nointerfaces;

/**
 * A concrete type without abstract super type.
 */
public class SimpleType extends de.haumacher.msgbuf.data.AbstractDataObject implements de.haumacher.msgbuf.binary.BinaryDataObject, de.haumacher.msgbuf.observer.Observable, de.haumacher.msgbuf.xml.XmlSerializable {

	/**
	 * Creates a {@link SimpleType} instance.
	 */
	public static SimpleType create() {
		return new test.nointerfaces.SimpleType();
	}

	/** Identifier for the {@link SimpleType} type in JSON format. */
	public static final String SIMPLE_TYPE__TYPE = "SimpleType";

	/** @see #getStr() */
	public static final String STR__PROP = "str";

	/** @see #getX() */
	public static final String X__PROP = "x";

	/** Identifier for the property {@link #getStr()} in binary format. */
	static final int STR__ID = 1;

	/** Identifier for the property {@link #getX()} in binary format. */
	static final int X__ID = 2;

	private String _str = "";

	private int _x = 0;

	/**
	 * Creates a {@link SimpleType} instance.
	 *
	 * @see SimpleType#create()
	 */
	protected SimpleType() {
		super();
	}

	/**
	 * A string property
	 */
	public final String getStr() {
		return _str;
	}

	/**
	 * @see #getStr()
	 */
	public SimpleType setStr(String value) {
		internalSetStr(value);
		return this;
	}

	/** Internal setter for {@link #getStr()} without chain call utility. */
	protected final void internalSetStr(String value) {
		_listener.beforeSet(this, STR__PROP, value);
		_str = value;
	}

	/**
	 * An int property
	 */
	public final int getX() {
		return _x;
	}

	/**
	 * @see #getX()
	 */
	public SimpleType setX(int value) {
		internalSetX(value);
		return this;
	}

	/** Internal setter for {@link #getX()} without chain call utility. */
	protected final void internalSetX(int value) {
		_listener.beforeSet(this, X__PROP, value);
		_x = value;
	}

	protected de.haumacher.msgbuf.observer.Listener _listener = de.haumacher.msgbuf.observer.Listener.NONE;

	@Override
	public SimpleType registerListener(de.haumacher.msgbuf.observer.Listener l) {
		internalRegisterListener(l);
		return this;
	}

	protected final void internalRegisterListener(de.haumacher.msgbuf.observer.Listener l) {
		_listener = de.haumacher.msgbuf.observer.Listener.register(_listener, l);
	}

	@Override
	public SimpleType unregisterListener(de.haumacher.msgbuf.observer.Listener l) {
		internalUnregisterListener(l);
		return this;
	}

	protected final void internalUnregisterListener(de.haumacher.msgbuf.observer.Listener l) {
		_listener = de.haumacher.msgbuf.observer.Listener.unregister(_listener, l);
	}

	@Override
	public String jsonType() {
		return SIMPLE_TYPE__TYPE;
	}

	private static java.util.List<String> PROPERTIES = java.util.Collections.unmodifiableList(
		java.util.Arrays.asList(
			STR__PROP, 
			X__PROP));

	@Override
	public java.util.List<String> properties() {
		return PROPERTIES;
	}

	@Override
	public Object get(String field) {
		switch (field) {
			case STR__PROP: return getStr();
			case X__PROP: return getX();
			default: return null;
		}
	}

	@Override
	public void set(String field, Object value) {
		switch (field) {
			case STR__PROP: internalSetStr((String) value); break;
			case X__PROP: internalSetX((int) value); break;
		}
	}

	/** Reads a new instance from the given reader. */
	public static SimpleType readSimpleType(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		test.nointerfaces.SimpleType result = new test.nointerfaces.SimpleType();
		result.readContent(in);
		return result;
	}

	@Override
	public final void writeTo(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		writeContent(out);
	}

	@Override
	protected void writeFields(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		super.writeFields(out);
		out.name(STR__PROP);
		out.value(getStr());
		out.name(X__PROP);
		out.value(getX());
	}

	@Override
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case STR__PROP: setStr(de.haumacher.msgbuf.json.JsonUtil.nextStringOptional(in)); break;
			case X__PROP: setX(in.nextInt()); break;
			default: super.readField(in, field);
		}
	}

	@Override
	public final void writeTo(de.haumacher.msgbuf.binary.DataWriter out) throws java.io.IOException {
		out.beginObject();
		writeFields(out);
		out.endObject();
	}

	/**
	 * Serializes all fields of this instance to the given binary output.
	 *
	 * @param out
	 *        The binary output to write to.
	 * @throws java.io.IOException If writing fails.
	 */
	protected void writeFields(de.haumacher.msgbuf.binary.DataWriter out) throws java.io.IOException {
		out.name(STR__ID);
		out.value(getStr());
		out.name(X__ID);
		out.value(getX());
	}

	/** Reads a new instance from the given reader. */
	public static SimpleType readSimpleType(de.haumacher.msgbuf.binary.DataReader in) throws java.io.IOException {
		in.beginObject();
		SimpleType result = test.nointerfaces.SimpleType.readSimpleType_Content(in);
		in.endObject();
		return result;
	}

	/** Helper for creating an object of type {@link SimpleType} from a polymorphic composition. */
	public static SimpleType readSimpleType_Content(de.haumacher.msgbuf.binary.DataReader in) throws java.io.IOException {
		test.nointerfaces.SimpleType result = new SimpleType();
		result.readContent(in);
		return result;
	}

	/** Helper for reading all fields of this instance. */
	protected final void readContent(de.haumacher.msgbuf.binary.DataReader in) throws java.io.IOException {
		while (in.hasNext()) {
			int field = in.nextName();
			readField(in, field);
		}
	}

	/** Consumes the value for the field with the given ID and assigns its value. */
	protected void readField(de.haumacher.msgbuf.binary.DataReader in, int field) throws java.io.IOException {
		switch (field) {
			case STR__ID: setStr(in.nextString()); break;
			case X__ID: setX(in.nextInt()); break;
			default: in.skipValue(); 
		}
	}

	/** XML element name representing a {@link SimpleType} type. */
	public static final String SIMPLE_TYPE__XML_ELEMENT = "simple-type";

	/** XML attribute or element name of a {@link #getStr} property. */
	private static final String STR__XML_ATTR = "str";

	/** XML attribute or element name of a {@link #getX} property. */
	private static final String X__XML_ATTR = "x";

	@Override
	public String getXmlTagName() {
		return SIMPLE_TYPE__XML_ELEMENT;
	}

	@Override
	public final void writeContent(javax.xml.stream.XMLStreamWriter out) throws javax.xml.stream.XMLStreamException {
		writeAttributes(out);
		writeElements(out);
	}

	/** Serializes all fields that are written as XML attributes. */
	protected void writeAttributes(javax.xml.stream.XMLStreamWriter out) throws javax.xml.stream.XMLStreamException {
		out.writeAttribute(STR__XML_ATTR, getStr());
		out.writeAttribute(X__XML_ATTR, Integer.toString(getX()));
	}

	/** Serializes all fields that are written as XML elements. */
	protected void writeElements(javax.xml.stream.XMLStreamWriter out) throws javax.xml.stream.XMLStreamException {
	}

	/** Creates a new {@link SimpleType} and reads properties from the content (attributes and inner tags) of the currently open element in the given {@link javax.xml.stream.XMLStreamReader}. */
	public static SimpleType readSimpleType_XmlContent(javax.xml.stream.XMLStreamReader in) throws javax.xml.stream.XMLStreamException {
		SimpleType result = new SimpleType();
		result.readContentXml(in);
		return result;
	}

	/** Reads properties from the content (attributes and inner tags) of the currently open element in the given {@link javax.xml.stream.XMLStreamReader}. */
	protected final void readContentXml(javax.xml.stream.XMLStreamReader in) throws javax.xml.stream.XMLStreamException {
		for (int n = 0, cnt = in.getAttributeCount(); n < cnt; n++) {
			String name = in.getAttributeLocalName(n);
			String value = in.getAttributeValue(n);

			readFieldXmlAttribute(name, value);
		}
		while (true) {
			int event = in.nextTag();
			if (event == javax.xml.stream.XMLStreamConstants.END_ELEMENT) {
				break;
			}
			assert event == javax.xml.stream.XMLStreamConstants.START_ELEMENT;

			String localName = in.getLocalName();
			readFieldXmlElement(in, localName);
		}
	}

	/** Parses the given attribute value and assigns it to the field with the given name. */
	protected void readFieldXmlAttribute(String name, String value) {
		switch (name) {
			case STR__XML_ATTR: {
				setStr(value);
				break;
			}
			case X__XML_ATTR: {
				setX(Integer.parseInt(value));
				break;
			}
			default: {
				// Skip unknown attribute.
			}
		}
	}

	/** Reads the element under the cursor and assigns its contents to the field with the given name. */
	protected void readFieldXmlElement(javax.xml.stream.XMLStreamReader in, String localName) throws javax.xml.stream.XMLStreamException {
		switch (localName) {
			case STR__XML_ATTR: {
				setStr(in.getElementText());
				break;
			}
			case X__XML_ATTR: {
				setX(Integer.parseInt(in.getElementText()));
				break;
			}
			default: {
				internalSkipUntilMatchingEndElement(in);
			}
		}
	}

	protected static final void internalSkipUntilMatchingEndElement(javax.xml.stream.XMLStreamReader in) throws javax.xml.stream.XMLStreamException {
		int level = 0;
		while (true) {
			switch (in.next()) {
				case javax.xml.stream.XMLStreamConstants.START_ELEMENT: level++; break;
				case javax.xml.stream.XMLStreamConstants.END_ELEMENT: if (level == 0) { return; } else { level--; break; }
			}
		}
	}

	/** Creates a new {@link SimpleType} and reads properties from the content (attributes and inner tags) of the currently open element in the given {@link javax.xml.stream.XMLStreamReader}. */
	public static SimpleType readSimpleType(javax.xml.stream.XMLStreamReader in) throws javax.xml.stream.XMLStreamException {
		in.nextTag();
		return test.nointerfaces.SimpleType.readSimpleType_XmlContent(in);
	}

}
