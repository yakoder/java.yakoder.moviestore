// Generated with g9.

package com.yakoder.moviestore.data.store;

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
    protected static final String PK = "expenseDetailTableId";

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
    private int expenseDetailTableId;
    @Column(name="exp_detail_table_name", unique=true, nullable=false, length=100)
    private String expenseDetailTableName;

    /** Default constructor. */
    public ExpenseDetailTables() {
        super();
    }

    /**
     * Access method for expenseDetailTableId.
     *
     * @return the current value of expenseDetailTableId
     */
    public int getExpenseDetailTableId() {
        return expenseDetailTableId;
    }

    /**
     * Setter method for expenseDetailTableId.
     *
     * @param aExpenseDetailTableId the new value for expenseDetailTableId
     */
    public void setExpenseDetailTableId(int aExpenseDetailTableId) {
        expenseDetailTableId = aExpenseDetailTableId;
    }

    /**
     * Access method for expenseDetailTableName.
     *
     * @return the current value of expenseDetailTableName
     */
    public String getExpenseDetailTableName() {
        return expenseDetailTableName;
    }

    /**
     * Setter method for expenseDetailTableName.
     *
     * @param aExpenseDetailTableName the new value for expenseDetailTableName
     */
    public void setExpenseDetailTableName(String aExpenseDetailTableName) {
        expenseDetailTableName = aExpenseDetailTableName;
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
        if (this.getExpenseDetailTableId() != that.getExpenseDetailTableId()) {
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
        i = getExpenseDetailTableId();
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
        sb.append(" expenseDetailTableId=").append(getExpenseDetailTableId());
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
        ret.put("expenseDetailTableId", Integer.valueOf(getExpenseDetailTableId()));
        return ret;
    }

}
