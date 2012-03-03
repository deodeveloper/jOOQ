/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "TEST")
public class T_BOOK implements java.io.Serializable {

	private static final long serialVersionUID = -1571317636;

	private java.lang.Integer                                       ID;
	private java.lang.Integer                                       AUTHOR_ID;
	private java.lang.Integer                                       CO_AUTHOR_ID;
	private java.lang.Integer                                       DETAILS_ID;
	private java.lang.String                                        TITLE;
	private java.lang.Integer                                       PUBLISHED_IN;
	private org.jooq.test.oracle3.generatedclasses.enums.T_LANGUAGE LANGUAGE_ID;
	private java.lang.String                                        CONTENT_TEXT;
	private byte[]                                                  CONTENT_PDF;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false)
	public java.lang.Integer getAUTHOR_ID() {
		return this.AUTHOR_ID;
	}

	public void setAUTHOR_ID(java.lang.Integer AUTHOR_ID) {
		this.AUTHOR_ID = AUTHOR_ID;
	}

	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Integer getCO_AUTHOR_ID() {
		return this.CO_AUTHOR_ID;
	}

	public void setCO_AUTHOR_ID(java.lang.Integer CO_AUTHOR_ID) {
		this.CO_AUTHOR_ID = CO_AUTHOR_ID;
	}

	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Integer getDETAILS_ID() {
		return this.DETAILS_ID;
	}

	public void setDETAILS_ID(java.lang.Integer DETAILS_ID) {
		this.DETAILS_ID = DETAILS_ID;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false)
	public java.lang.String getTITLE() {
		return this.TITLE;
	}

	public void setTITLE(java.lang.String TITLE) {
		this.TITLE = TITLE;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false)
	public java.lang.Integer getPUBLISHED_IN() {
		return this.PUBLISHED_IN;
	}

	public void setPUBLISHED_IN(java.lang.Integer PUBLISHED_IN) {
		this.PUBLISHED_IN = PUBLISHED_IN;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false)
	public org.jooq.test.oracle3.generatedclasses.enums.T_LANGUAGE getLANGUAGE_ID() {
		return this.LANGUAGE_ID;
	}

	public void setLANGUAGE_ID(org.jooq.test.oracle3.generatedclasses.enums.T_LANGUAGE LANGUAGE_ID) {
		this.LANGUAGE_ID = LANGUAGE_ID;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getCONTENT_TEXT() {
		return this.CONTENT_TEXT;
	}

	public void setCONTENT_TEXT(java.lang.String CONTENT_TEXT) {
		this.CONTENT_TEXT = CONTENT_TEXT;
	}

	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getCONTENT_PDF() {
		return this.CONTENT_PDF;
	}

	public void setCONTENT_PDF(byte[] CONTENT_PDF) {
		this.CONTENT_PDF = CONTENT_PDF;
	}
}
