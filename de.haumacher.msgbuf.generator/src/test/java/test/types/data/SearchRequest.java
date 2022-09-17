package test.types.data;

public interface SearchRequest extends de.haumacher.msgbuf.data.DataObject, de.haumacher.msgbuf.binary.BinaryDataObject, de.haumacher.msgbuf.observer.Observable {

	/**
	 * Creates a {@link SearchRequest} instance.
	 */
	static SearchRequest create() {
		return new test.types.data.SearchRequest_Impl();
	}

	/** Identifier for the {@link SearchRequest} type in JSON format. */
	static final String SEARCH_REQUEST__TYPE = "SearchRequest";

	/** @see #getQuery() */
	static final String QUERY = "query";

	/** @see #getPageNumber() */
	static final String PAGE_NUMBER = "page_number";

	/** @see #getResultPerPage() */
	static final String RESULT_PER_PAGE = "result_per_page";

	/** Identifier for the property {@link #getQuery()} in binary format. */
	static final int QUERY__ID = 1;

	/** Identifier for the property {@link #getPageNumber()} in binary format. */
	static final int PAGE_NUMBER__ID = 2;

	/** Identifier for the property {@link #getResultPerPage()} in binary format. */
	static final int RESULT_PER_PAGE__ID = 3;

	String getQuery();

	/**
	 * @see #getQuery()
	 */
	SearchRequest setQuery(String value);

	int getPageNumber();

	/**
	 * @see #getPageNumber()
	 */
	SearchRequest setPageNumber(int value);

	int getResultPerPage();

	/**
	 * @see #getResultPerPage()
	 */
	SearchRequest setResultPerPage(int value);

	@Override
	public SearchRequest registerListener(de.haumacher.msgbuf.observer.Listener l);

	@Override
	public SearchRequest unregisterListener(de.haumacher.msgbuf.observer.Listener l);


	/** Reads a new instance from the given reader. */
	static SearchRequest readSearchRequest(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		test.types.data.SearchRequest_Impl result = new test.types.data.SearchRequest_Impl();
		result.readContent(in);
		return result;
	}

	/** Reads a new instance from the given reader. */
	static SearchRequest readSearchRequest(de.haumacher.msgbuf.binary.DataReader in) throws java.io.IOException {
		in.beginObject();
		SearchRequest result = test.types.data.SearchRequest_Impl.readSearchRequest_Content(in);
		in.endObject();
		return result;
	}

}
