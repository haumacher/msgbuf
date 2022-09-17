package de.haumacher.msgbuf.generator.ast;

/**
 * Container for temporary collecting annotations without further semantics.
 */
public class OptionContainer extends WithOptions {

	/**
	 * Creates a {@link OptionContainer} instance.
	 */
	public static OptionContainer create() {
		return new de.haumacher.msgbuf.generator.ast.OptionContainer();
	}

	/** Identifier for the {@link OptionContainer} type in JSON format. */
	public static final String OPTION_CONTAINER__TYPE = "OptionContainer";

	/**
	 * Creates a {@link OptionContainer} instance.
	 *
	 * @see OptionContainer#create()
	 */
	protected OptionContainer() {
		super();
	}

	@Override
	public TypeKind kind() {
		return TypeKind.OPTION_CONTAINER;
	}

	@Override
	public OptionContainer setOptions(java.util.Map<String, Option> value) {
		internalSetOptions(value);
		return this;
	}

	@Override
	public OptionContainer putOption(String key, Option value) {
		internalPutOption(key, value);
		return this;
	}

	@Override
	public String jsonType() {
		return OPTION_CONTAINER__TYPE;
	}

	/** Reads a new instance from the given reader. */
	public static OptionContainer readOptionContainer(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		de.haumacher.msgbuf.generator.ast.OptionContainer result = new de.haumacher.msgbuf.generator.ast.OptionContainer();
		result.readContent(in);
		return result;
	}

	@Override
	public <R,A> R visit(WithOptions.Visitor<R,A> v, A arg) {
		return v.visit(this, arg);
	}

}
