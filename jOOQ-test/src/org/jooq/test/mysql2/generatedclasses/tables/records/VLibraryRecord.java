/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "v_library", schema = "test2")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 209226463;

	/**
	 * An uncommented item
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AUTHOR")
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE, value);
	}

	/**
	 * The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
