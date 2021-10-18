// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="reimb_online")
public class ReimbOnline implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3286212208684702383L;

	/** Primary key. */
    protected static final String PK = "reimbDetailId";

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
    @Column(name="reimb_detail_id", unique=true, nullable=false, precision=10)
    private int reimbDetailId;
    @ManyToOne(optional=false)
    @JoinColumn(name="ol_pymt_site_id", nullable=false)
    private OnlinePymtSites onlinePymtSites;
    @ManyToOne(optional=false)
    @JoinColumn(name="payee_id", nullable=false)
    private TxnParties txnParties2;
    @ManyToOne(optional=false)
    @JoinColumn(name="payor_id", nullable=false)
    private TxnParties txnParties;
    @OneToMany(mappedBy="reimbOnline")
    private Set<Reimbursements> reimbursements;

    /** Default constructor. */
    public ReimbOnline() {
        super();
    }

    /**
     * Access method for reimbDetailId.
     *
     * @return the current value of reimbDetailId
     */
    public int getReimbDetailId() {
        return reimbDetailId;
    }

    /**
     * Setter method for reimbDetailId.
     *
     * @param aReimbDetailId the new value for reimbDetailId
     */
    public void setReimbDetailId(int aReimbDetailId) {
        reimbDetailId = aReimbDetailId;
    }

    /**
     * Access method for onlinePymtSites.
     *
     * @return the current value of onlinePymtSites
     */
    public OnlinePymtSites getOnlinePymtSites() {
        return onlinePymtSites;
    }

    /**
     * Setter method for onlinePymtSites.
     *
     * @param aOnlinePymtSites the new value for onlinePymtSites
     */
    public void setOnlinePymtSites(OnlinePymtSites aOnlinePymtSites) {
        onlinePymtSites = aOnlinePymtSites;
    }

    /**
     * Access method for txnParties2.
     *
     * @return the current value of txnParties2
     */
    public TxnParties getTxnParties2() {
        return txnParties2;
    }

    /**
     * Setter method for txnParties2.
     *
     * @param aTxnParties2 the new value for txnParties2
     */
    public void setTxnParties2(TxnParties aTxnParties2) {
        txnParties2 = aTxnParties2;
    }

    /**
     * Access method for txnParties.
     *
     * @return the current value of txnParties
     */
    public TxnParties getTxnParties() {
        return txnParties;
    }

    /**
     * Setter method for txnParties.
     *
     * @param aTxnParties the new value for txnParties
     */
    public void setTxnParties(TxnParties aTxnParties) {
        txnParties = aTxnParties;
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
     * Compares the key for this instance with another ReimbOnline.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbOnline and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbOnline)) {
            return false;
        }
        ReimbOnline that = (ReimbOnline) other;
        if (this.getReimbDetailId() != that.getReimbDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbOnline.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbOnline)) return false;
        return this.equalKeys(other) && ((ReimbOnline)other).equalKeys(this);
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
        i = getReimbDetailId();
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
        StringBuffer sb = new StringBuffer("[ReimbOnline |");
        sb.append(" reimbDetailId=").append(getReimbDetailId());
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
        ret.put("reimbDetailId", Integer.valueOf(getReimbDetailId()));
        return ret;
    }

}
