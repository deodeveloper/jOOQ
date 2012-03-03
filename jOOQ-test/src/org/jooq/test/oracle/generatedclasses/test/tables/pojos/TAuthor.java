/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_AUTHOR", schema = "TEST")
public class TAuthor implements java.io.Serializable {

	private static final long serialVersionUID = -1443427036;

	private java.lang.Integer                                                         id;
	private java.lang.String                                                          firstName;
	private java.lang.String                                                          lastName;
	private java.sql.Date                                                             dateOfBirth;
	private java.lang.Integer                                                         yearOfBirth;
	private org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord address;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "FIRST_NAME")
	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	@javax.persistence.Column(name = "LAST_NAME", nullable = false)
	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	@javax.persistence.Column(name = "DATE_OF_BIRTH")
	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@javax.persistence.Column(name = "YEAR_OF_BIRTH")
	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(java.lang.Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@javax.persistence.Column(name = "ADDRESS")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return this.address;
	}

	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord address) {
		this.address = address;
	}
}
