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
@Table(name="reimb_detail_tables", indexes={@Index(name="reimb_detail_tables_reimb_detail_table_name_IX", columnList="reimb_detail_table_name", unique=true)})
public class ReimbursementDetailTable implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2377697732556276893L;

	/** Primary key. */
    protected static final String PK = "reimbursementDetailTableId";

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
    @Column(name="reimb_detail_table_id", unique=true, nullable=false, precision=10)
    private int reimbursementDetailTableId;
    @Column(name="reimb_detail_table_name", unique=true, nullable=false, length=100)
    private String reimbursementDetailTableName;

    /** Default constructor. */
    public ReimbursementDetailTable() {
        super();
    }

    /**
     * Access method for reimbursementDetailTableId.
     *
     * @return the current value of reimbursementDetailTableId
     */
    public int getReimbursementDetailTableId() {
        return reimbursementDetailTableId;
    }

    /**
     * Setter method for reimbursementDetailTableId.
     *
     * @param aReimbursementDetailTableId the new value for reimbursementDetailTableId
     */
    public void setReimbursementDetailTableId(int aReimbursementDetailTableId) {
        reimbursementDetailTableId = aReimbursementDetailTableId;
    }

    /**
     * Access method for reimbursementDetailTableName.
     *
     * @return the current value of reimbursementDetailTableName
     */
    public String getReimbursementDetailTableName() {
        return reimbursementDetailTableName;
    }

    /**
     * Setter method for reimbursementDetailTableName.
     *
     * @param aReimbursementDetailTableName the new value for reimbursementDetailTableName
     */
    public void setReimbursementDetailTableName(String aReimbursementDetailTableName) {
        reimbursementDetailTableName = aReimbursementDetailTableName;
    }

    /**
     * Compares the key for this instance with another ReimbursementDetailTables.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbursementDetailTables and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbursementDetailTable)) {
            return false;
        }
        ReimbursementDetailTable that = (ReimbursementDetailTable) other;
        if (this.getReimbursementDetailTableId() != that.getReimbursementDetailTableId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbursementDetailTables.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbursementDetailTable)) return false;
        return this.equalKeys(other) && ((ReimbursementDetailTable)other).equalKeys(this);
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
        i = getReimbursementDetailTableId();
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
        StringBuffer sb = new StringBuffer("[ReimbursementDetailTables |");
        sb.append(" reimbursementDetailTableId=").append(getReimbursementDetailTableId());
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
        ret.put("reimbursementDetailTableId", Integer.valueOf(getReimbursementDetailTableId()));
        return ret;
    }

}
