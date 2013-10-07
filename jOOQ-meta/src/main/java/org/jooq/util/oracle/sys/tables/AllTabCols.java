/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Columns of user's tables, views and clusters
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllTabCols extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1747218590;

	/**
	 * The singleton instance of <code>SYS.ALL_TAB_COLS</code>
	 */
	public static final org.jooq.util.oracle.sys.tables.AllTabCols ALL_TAB_COLS = new org.jooq.util.oracle.sys.tables.AllTabCols();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.ALL_TAB_COLS.OWNER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.TABLE_NAME</code>. Table, view or cluster name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.COLUMN_NAME</code>. Column name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_TYPE</code>. Datatype of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_TYPE_MOD</code>. Datatype modifier of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE_MOD = createField("DATA_TYPE_MOD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_TYPE_OWNER</code>. Owner of the datatype of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE_OWNER = createField("DATA_TYPE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_LENGTH</code>. Length of the column in bytes
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_PRECISION</code>. Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> DATA_PRECISION = createField("DATA_PRECISION", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_SCALE</code>. Digits to right of decimal point in a number
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> DATA_SCALE = createField("DATA_SCALE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.NULLABLE</code>. Does column allow NULL values?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.COLUMN_ID</code>. Sequence number of the column as created
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> COLUMN_ID = createField("COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DEFAULT_LENGTH</code>. Length of default value for the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> DEFAULT_LENGTH = createField("DEFAULT_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_DEFAULT</code>. Default value for the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_DEFAULT = createField("DATA_DEFAULT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.NUM_DISTINCT</code>. The number of distinct values in the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> NUM_DISTINCT = createField("NUM_DISTINCT", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.LOW_VALUE</code>. The low value in the column
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> LOW_VALUE = createField("LOW_VALUE", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.HIGH_VALUE</code>. The high value in the column
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> HIGH_VALUE = createField("HIGH_VALUE", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DENSITY</code>. The density of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> DENSITY = createField("DENSITY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.NUM_NULLS</code>. The number of nulls in the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> NUM_NULLS = createField("NUM_NULLS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.NUM_BUCKETS</code>. The number of buckets in histogram for the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> NUM_BUCKETS = createField("NUM_BUCKETS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.LAST_ANALYZED</code>. The date of the most recent time this column was analyzed
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> LAST_ANALYZED = createField("LAST_ANALYZED", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.SAMPLE_SIZE</code>. The sample size used in analyzing this column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SAMPLE_SIZE = createField("SAMPLE_SIZE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.CHARACTER_SET_NAME</code>. Character set name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.CHAR_COL_DECL_LENGTH</code>. Declaration length of character type column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> CHAR_COL_DECL_LENGTH = createField("CHAR_COL_DECL_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.GLOBAL_STATS</code>. Are the statistics calculated without merging underlying partitions?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> GLOBAL_STATS = createField("GLOBAL_STATS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.USER_STATS</code>. Were the statistics entered directly by the user?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_STATS = createField("USER_STATS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.AVG_COL_LEN</code>. The average length of the column in bytes
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> AVG_COL_LEN = createField("AVG_COL_LEN", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.CHAR_LENGTH</code>. The maximum length of the column in characters
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> CHAR_LENGTH = createField("CHAR_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.CHAR_USED</code>. C if maximum length is specified in characters, B if in bytes
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHAR_USED = createField("CHAR_USED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.V80_FMT_IMAGE</code>. Is column data in 8.0 image format?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> V80_FMT_IMAGE = createField("V80_FMT_IMAGE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.DATA_UPGRADED</code>. Has column data been upgraded to the latest type version format?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_UPGRADED = createField("DATA_UPGRADED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.HIDDEN_COLUMN</code>. Is this a hidden column?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> HIDDEN_COLUMN = createField("HIDDEN_COLUMN", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.VIRTUAL_COLUMN</code>. Is this a virtual column?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VIRTUAL_COLUMN = createField("VIRTUAL_COLUMN", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.SEGMENT_COLUMN_ID</code>. Sequence number of the column in the segment
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SEGMENT_COLUMN_ID = createField("SEGMENT_COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.INTERNAL_COLUMN_ID</code>. Internal sequence number of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> INTERNAL_COLUMN_ID = createField("INTERNAL_COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.HISTOGRAM</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> HISTOGRAM = createField("HISTOGRAM", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TAB_COLS.QUALIFIED_COL_NAME</code>. Qualified column name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> QUALIFIED_COL_NAME = createField("QUALIFIED_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>SYS.ALL_TAB_COLS</code> table reference
	 */
	public AllTabCols() {
		super("ALL_TAB_COLS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.ALL_TAB_COLS</code> table reference
	 */
	public AllTabCols(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.oracle.sys.tables.AllTabCols as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllTabCols(alias);
	}
}
