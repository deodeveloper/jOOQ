/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Systabcol extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -30883553;

	/**
	 * The singleton instance of <code>SYS.SYSTABCOL</code>
	 */
	public static final org.jooq.util.sybase.sys.tables.Systabcol SYSTABCOL = new org.jooq.util.sybase.sys.tables.Systabcol();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.SYSTABCOL.table_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>SYS.SYSTABCOL.column_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> COLUMN_ID = createField("column_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>SYS.SYSTABCOL.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.nulls</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NULLS = createField("nulls", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>SYS.SYSTABCOL.width</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> WIDTH = createField("width", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.scale</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("scale", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.object_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.max_identity</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAX_IDENTITY = createField("max_identity", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.column_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>SYS.SYSTABCOL.default</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT = createField("default", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The column <code>SYS.SYSTABCOL.user_type</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> USER_TYPE = createField("user_type", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.column_type</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_TYPE = createField("column_type", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>SYS.SYSTABCOL.compressed</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> COMPRESSED = createField("compressed", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.collect_stats</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> COLLECT_STATS = createField("collect_stats", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.inline_max</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> INLINE_MAX = createField("inline_max", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.inline_long</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> INLINE_LONG = createField("inline_long", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.lob_index</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> LOB_INDEX = createField("lob_index", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>SYS.SYSTABCOL.base_type_str</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> BASE_TYPE_STR = createField("base_type_str", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>SYS.SYSTABCOL</code> table reference
	 */
	public Systabcol() {
		super("SYSTABCOL", org.jooq.util.sybase.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.SYSTABCOL</code> table reference
	 */
	public Systabcol(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Systabcol.SYSTABCOL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.sybase.sys.tables.Systabcol as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Systabcol(alias);
	}
}
