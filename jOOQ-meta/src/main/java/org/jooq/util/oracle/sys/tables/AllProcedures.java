/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Functions/procedures/packages/types/triggers available to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllProcedures extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 166508377;

	/**
	 * The singleton instance of <code>SYS.ALL_PROCEDURES</code>
	 */
	public static final org.jooq.util.oracle.sys.tables.AllProcedures ALL_PROCEDURES = new org.jooq.util.oracle.sys.tables.AllProcedures();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.ALL_PROCEDURES.OWNER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.OBJECT_NAME</code>. Name of the object: top level function/procedure/package/type/trigger name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.PROCEDURE_NAME</code>. Name of the package or type subprogram
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCEDURE_NAME = createField("PROCEDURE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.OBJECT_ID</code>. Object number of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> OBJECT_ID = createField("OBJECT_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.SUBPROGRAM_ID</code>. Unique sub-program identifier
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SUBPROGRAM_ID = createField("SUBPROGRAM_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.OVERLOAD</code>. Overload unique identifier
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OVERLOAD = createField("OVERLOAD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.OBJECT_TYPE</code>. The typename of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.AGGREGATE</code>. Is it an aggregate function ?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AGGREGATE = createField("AGGREGATE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.PIPELINED</code>. Is it a pipelined table function ?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PIPELINED = createField("PIPELINED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.IMPLTYPEOWNER</code>. Name of the owner of the implementation type (if any)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IMPLTYPEOWNER = createField("IMPLTYPEOWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.IMPLTYPENAME</code>. Name of the implementation type (if any)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IMPLTYPENAME = createField("IMPLTYPENAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.PARALLEL</code>. Is the procedure parallel enabled ?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARALLEL = createField("PARALLEL", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.INTERFACE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERFACE = createField("INTERFACE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.DETERMINISTIC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DETERMINISTIC = createField("DETERMINISTIC", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_PROCEDURES.AUTHID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AUTHID = createField("AUTHID", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>SYS.ALL_PROCEDURES</code> table reference
	 */
	public AllProcedures() {
		super("ALL_PROCEDURES", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.ALL_PROCEDURES</code> table reference
	 */
	public AllProcedures(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllProcedures.ALL_PROCEDURES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.oracle.sys.tables.AllProcedures as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllProcedures(alias);
	}
}
