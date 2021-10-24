// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="exp_detail_tables", indexes={@Index(name="exp_detail_tables_exp_detail_table_name_IX", columnList="exp_detail_table_name", unique=true)})
public class ExpenseDetailTables implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1569875507047152853L;

	/** Primary key. */
    protected static final String PK = "expDetailTableId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="exp_detail_table_id", unique=true, nullable=false, precision=10)
    private int expDetailTableId;
    @Column(name="exp_detail_table_name", unique=true, nullable=false, length=100)
    private String expDetailTableName;

    /** Default constructor. */
    public ExpenseDetailTables() {
        super();
    }

    /**
     * Access method for expDetailTableId.
     *
     * @return the current value of expDetailTableId
     */
    public int getExpDetailTableId() {
        return expDetailTableId;
    }

    /**
     * Setter method for expDetailTableId.
     *
     * @param aExpDetailTableId the new value for expDetailTableId
     */
    public void setExpDetailTableId(int aExpDetailTableId) {
        expDetailTableId = aExpDetailTableId;
    }

    /**
     * Access method for expDetailTableName.
     *
     * @return the current value of expDetailTableName
     */
    public String getExpDetailTableName() {
        return expDetailTableName;
    }

    /**
     * Setter method for expDetailTableName.
     *
     * @param aExpDetailTableName the new value for expDetailTableName
     */
    public void setExpDetailTableName(String aExpDetailTableName) {
        expDetailTableName = aExpDetailTableName;
    }

    /**
     * Compares the key for this instance with another ExpenseDetailTables.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpenseDetailTables and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpenseDetailTables)) {
            return false;
        }
        ExpenseDetailTables that = (ExpenseDetailTables) other;
        if (this.getExpDetailTableId() != that.getExpDetailTableId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpenseDetailTables.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpenseDetailTables)) return false;
        return this.equalKeys(other) && ((ExpenseDetailTables)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getExpDetailTableId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ExpenseDetailTables |");
        sb.append(" expDetailTableId=").append(getExpDetailTableId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("expDetailTableId", Integer.valueOf(getExpDetailTableId()));
        return ret;
    }

}
