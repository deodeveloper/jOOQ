/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_71", schema = "test2")
public class XTestCase_71 implements java.io.Serializable {

	private static final long serialVersionUID = 1723842943;

	private java.lang.Integer id;
	private java.lang.Integer testCase_64_69Id;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "TEST_CASE_64_69_ID")
	public java.lang.Integer getTestCase_64_69Id() {
		return this.testCase_64_69Id;
	}

	public void setTestCase_64_69Id(java.lang.Integer testCase_64_69Id) {
		this.testCase_64_69Id = testCase_64_69Id;
	}
}
