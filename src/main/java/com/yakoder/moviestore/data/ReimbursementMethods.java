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
@Table(name="reimb_methods", indexes={@Index(name="reimbMethodsReimbMethodsReimbMethIdTableIdx", columnList="reimb_meth_id,reimb_detail_table_id"), @Index(name="reimbMethodsReimbMethodsReimbMethNameTableIdx", columnList="reimb_meth_name,reimb_detail_table_id")})
public class ReimbMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2709191631267125113L;

	/** Primary key. */
    protected static final String PK = "reimbMethId";

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
    private int reimbMethId;
    @Column(name="reimb_meth_name", nullable=false, length=100)
    private String reimbMethName;
    @Column(name="reimb_meth_desc", length=255)
    private String reimbMethDesc;
    @Column(name="reimb_detail_table_id", nullable=false, precision=10)
    private int reimbDetailTableId;
    @OneToMany(mappedBy="reimbMethods")
    private Set<Reimbursements> reimbursements;

    /** Default constructor. */
    public ReimbMethods() {
        super();
    }

    /**
     * Access method for reimbMethId.
     *
     * @return the current value of reimbMethId
     */
    public int getReimbMethId() {
        return reimbMethId;
    }

    /**
     * Setter method for reimbMethId.
     *
     * @param aReimbMethId the new value for reimbMethId
     */
    public void setReimbMethId(int aReimbMethId) {
        reimbMethId = aReimbMethId;
    }

    /**
     * Access method for reimbMethName.
     *
     * @return the current value of reimbMethName
     */
    public String getReimbMethName() {
        return reimbMethName;
    }

    /**
     * Setter method for reimbMethName.
     *
     * @param aReimbMethName the new value for reimbMethName
     */
    public void setReimbMethName(String aReimbMethName) {
        reimbMethName = aReimbMethName;
    }

    /**
     * Access method for reimbMethDesc.
     *
     * @return the current value of reimbMethDesc
     */
    public String getReimbMethDesc() {
        return reimbMethDesc;
    }

    /**
     * Setter method for reimbMethDesc.
     *
     * @param aReimbMethDesc the new value for reimbMethDesc
     */
    public void setReimbMethDesc(String aReimbMethDesc) {
        reimbMethDesc = aReimbMethDesc;
    }

    /**
     * Access method for reimbDetailTableId.
     *
     * @return the current value of reimbDetailTableId
     */
    public int getReimbDetailTableId() {
        return reimbDetailTableId;
    }

    /**
     * Setter method for reimbDetailTableId.
     *
     * @param aReimbDetailTableId the new value for reimbDetailTableId
     */
    public void setReimbDetailTableId(int aReimbDetailTableId) {
        reimbDetailTableId = aReimbDetailTableId;
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
     * Compares the key for this instance with another ReimbMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbMethods)) {
            return false;
        }
        ReimbMethods that = (ReimbMethods) other;
        if (this.getReimbMethId() != that.getReimbMethId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbMethods)) return false;
        return this.equalKeys(other) && ((ReimbMethods)other).equalKeys(this);
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
        i = getReimbMethId();
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
        StringBuffer sb = new StringBuffer("[ReimbMethods |");
        sb.append(" reimbMethId=").append(getReimbMethId());
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
        ret.put("reimbMethId", Integer.valueOf(getReimbMethId()));
        return ret;
    }

}
