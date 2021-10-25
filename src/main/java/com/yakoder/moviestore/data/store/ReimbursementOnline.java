// Generated with g9.

package com.yakoder.moviestore.data.store;

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
public class ReimbursementOnline implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3286212208684702383L;

	/** Primary key. */
    protected static final String PK = "reimbursementDetailId";

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
    private int reimbursementDetailId;
    @ManyToOne(optional=false)
    @JoinColumn(name="ol_pymt_site_id", nullable=false)
    private OnlinePaymentSite onlinePaymentSites;
    @ManyToOne(optional=false)
    @JoinColumn(name="payee_id", nullable=false)
    private TransactionParty transactionPayee;
    @ManyToOne(optional=false)
    @JoinColumn(name="payor_id", nullable=false)
    private TransactionParty transactionPayor;
    @OneToMany(mappedBy="reimbOnline")
    private Set<Reimbursement> reimbursements;

    /** Default constructor. */
    public ReimbursementOnline() {
        super();
    }

    /**
     * Access method for reimbursementDetailId.
     *
     * @return the current value of reimbursementDetailId
     */
    public int getReimbursementDetailId() {
        return reimbursementDetailId;
    }

    /**
     * Setter method for reimbursementDetailId.
     *
     * @param aReimbursementDetailId the new value for reimbursementDetailId
     */
    public void setReimbursementDetailId(int aReimbursementDetailId) {
        reimbursementDetailId = aReimbursementDetailId;
    }

    /**
     * Access method for onlinePaymentSites.
     *
     * @return the current value of onlinePaymentSites
     */
    public OnlinePaymentSite getOnlinePaymentSites() {
        return onlinePaymentSites;
    }

    /**
     * Setter method for onlinePaymentSites.
     *
     * @param aOnlinePaymentSites the new value for onlinePaymentSites
     */
    public void setOnlinePaymentSites(OnlinePaymentSite aOnlinePaymentSites) {
        onlinePaymentSites = aOnlinePaymentSites;
    }

    /**
     * Access method for transactionPayee.
     *
     * @return the current value of transactionPayee
     */
    public TransactionParty getTransactionPayee() {
        return transactionPayee;
    }

    /**
     * Setter method for transactionPayee.
     *
     * @param aTransactionPayee the new value for transactionPayee
     */
    public void setTransactionPayee(TransactionParty aTransactionPayee) {
        transactionPayee = aTransactionPayee;
    }

    /**
     * Access method for transactionPayor.
     *
     * @return the current value of transactionPayor
     */
    public TransactionParty getTransactionPayor() {
        return transactionPayor;
    }

    /**
     * Setter method for transactionPayor.
     *
     * @param aTransactionPayor the new value for transactionPayor
     */
    public void setTransactionPayor(TransactionParty aTransactionPayor) {
        transactionPayor = aTransactionPayor;
    }

    /**
     * Access method for reimbursements.
     *
     * @return the current value of reimbursements
     */
    public Set<Reimbursement> getReimbursements() {
        return reimbursements;
    }

    /**
     * Setter method for reimbursements.
     *
     * @param aReimbursements the new value for reimbursements
     */
    public void setReimbursements(Set<Reimbursement> aReimbursements) {
        reimbursements = aReimbursements;
    }

    /**
     * Compares the key for this instance with another ReimbursementOnline.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbursementOnline and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbursementOnline)) {
            return false;
        }
        ReimbursementOnline that = (ReimbursementOnline) other;
        if (this.getReimbursementDetailId() != that.getReimbursementDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbursementOnline.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbursementOnline)) return false;
        return this.equalKeys(other) && ((ReimbursementOnline)other).equalKeys(this);
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
        i = getReimbursementDetailId();
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
        StringBuffer sb = new StringBuffer("[ReimbursementOnline |");
        sb.append(" reimbursementDetailId=").append(getReimbursementDetailId());
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
        ret.put("reimbursementDetailId", Integer.valueOf(getReimbursementDetailId()));
        return ret;
    }

}
