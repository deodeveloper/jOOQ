/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69", schema = "TEST")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -637467525;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValueAsShort(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "UNUSED_ID")
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
