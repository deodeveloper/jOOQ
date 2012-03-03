/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES", schema = "TEST")
public class T_DATES implements java.io.Serializable {

	private static final long serialVersionUID = 993818644;

	private java.lang.Integer  ID;
	private java.sql.Date      D;
	private java.sql.Timestamp T;
	private java.sql.Timestamp TS;
	private java.lang.Integer  D_INT;
	private java.lang.Long     TS_BIGINT;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "D")
	public java.sql.Date getD() {
		return this.D;
	}

	public void setD(java.sql.Date D) {
		this.D = D;
	}

	@javax.persistence.Column(name = "T")
	public java.sql.Timestamp getT() {
		return this.T;
	}

	public void setT(java.sql.Timestamp T) {
		this.T = T;
	}

	@javax.persistence.Column(name = "TS")
	public java.sql.Timestamp getTS() {
		return this.TS;
	}

	public void setTS(java.sql.Timestamp TS) {
		this.TS = TS;
	}

	@javax.persistence.Column(name = "D_INT")
	public java.lang.Integer getD_INT() {
		return this.D_INT;
	}

	public void setD_INT(java.lang.Integer D_INT) {
		this.D_INT = D_INT;
	}

	@javax.persistence.Column(name = "TS_BIGINT")
	public java.lang.Long getTS_BIGINT() {
		return this.TS_BIGINT;
	}

	public void setTS_BIGINT(java.lang.Long TS_BIGINT) {
		this.TS_BIGINT = TS_BIGINT;
	}
}
