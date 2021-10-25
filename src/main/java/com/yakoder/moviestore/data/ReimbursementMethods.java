// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="reimb_methods", indexes={@Index(name="reimbMethodsReimbursementMethodsReimbMethIdTableIdx", columnList="reimb_meth_id,reimb_detail_table_id"), @Index(name="reimbMethodsReimbursementMethodsReimbMethNameTableIdx", columnList="reimb_meth_name,reimb_detail_table_id")})
public class ReimbursementMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2709191631267125113L;

	/** Primary key. */
    protected static final String PK = "reimbursementMethodId";

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
    @Column(name="reimb_meth_id", unique=true, nullable=false, precision=10)
    private int reimbursementMethodId;
    @Column(name="reimb_meth_name", nullable=false, length=100)
    private String reimbursementMethodName;
    @Column(name="reimb_meth_desc", length=255)
    private String reimbursementMethodDesc;
    @Column(name="reimb_detail_table_id", nullable=false, precision=10)
    private int reimbursementDetailTableId;
    @OneToMany(mappedBy="reimbMethods")
    private Set<Reimbursements> reimbursements;

    /** Default constructor. */
    public ReimbursementMethods() {
        super();
    }

    /**
     * Access method for reimbursementMethodId.
     *
     * @return the current value of reimbursementMethodId
     */
    public int getReimbursementMethodId() {
        return reimbursementMethodId;
    }

    /**
     * Setter method for reimbursementMethodId.
     *
     * @param aReimbursementMethodId the new value for reimbursementMethodId
     */
    public void setReimbursementMethodId(int aReimbursementMethodId) {
        reimbursementMethodId = aReimbursementMethodId;
    }

    /**
     * Access method for reimbursementMethodName.
     *
     * @return the current value of reimbursementMethodName
     */
    public String getReimbursementMethodName() {
        return reimbursementMethodName;
    }

    /**
     * Setter method for reimbursementMethodName.
     *
     * @param aReimbursementMethodName the new value for reimbursementMethodName
     */
    public void setReimbursementMethodName(String aReimbursementMethodName) {
        reimbursementMethodName = aReimbursementMethodName;
    }

    /**
     * Access method for reimbursementMethodDesc.
     *
     * @return the current value of reimbursementMethodDesc
     */
    public String getReimbursementMethodDesc() {
        return reimbursementMethodDesc;
    }

    /**
     * Setter method for reimbursementMethodDesc.
     *
     * @param aReimbursementMethodDesc the new value for reimbursementMethodDesc
     */
    public void setReimbursementMethodDesc(String aReimbursementMethodDesc) {
        reimbursementMethodDesc = aReimbursementMethodDesc;
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
     * Access method for reimbursements.
     *
     * @return the current value of reimbursements
     */
    public Set<Reimbursements> getReimbursements() {
        return reimbursements;
    }

    /**
     * Setter method for reimbursements.
     *
     * @param aReimbursements the new value for reimbursements
     */
    public void setReimbursements(Set<Reimbursements> aReimbursements) {
        reimbursements = aReimbursements;
    }

    /**
     * Compares the key for this instance with another ReimbursementMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbursementMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbursementMethods)) {
            return false;
        }
        ReimbursementMethods that = (ReimbursementMethods) other;
        if (this.getReimbursementMethodId() != that.getReimbursementMethodId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbursementMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbursementMethods)) return false;
        return this.equalKeys(other) && ((ReimbursementMethods)other).equalKeys(this);
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
        i = getReimbursementMethodId();
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
        StringBuffer sb = new StringBuffer("[ReimbursementMethods |");
        sb.append(" reimbursementMethodId=").append(getReimbursementMethodId());
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
        ret.put("reimbursementMethodId", Integer.valueOf(getReimbursementMethodId()));
        return ret;
    }

}
