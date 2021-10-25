// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="reimb_checks")
public class ReimbursementCheck implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5020419411756924980L;

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
    @Column(length=100)
    private String memo;
    @Column(name="ck_number", length=100)
    private String checkNumber;
    @Column(name="ck_is_cancelled", nullable=false, length=3)
    private boolean checkIsCancelled;
    @Column(name="ck_cx_date")
    private LocalDate checkCancelledDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="payee_id", nullable=false)
    private TransactionParty transactionPayee;
    @ManyToOne(optional=false)
    @JoinColumn(name="payor_id", nullable=false)
    private TransactionParty transactionPayor;

    /** Default constructor. */
    public ReimbursementCheck() {
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
     * Access method for memo.
     *
     * @return the current value of memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Setter method for memo.
     *
     * @param aMemo the new value for memo
     */
    public void setMemo(String aMemo) {
        memo = aMemo;
    }

    /**
     * Access method for checkNumber.
     *
     * @return the current value of checkNumber
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Setter method for checkNumber.
     *
     * @param aCheckNumber the new value for checkNumber
     */
    public void setCheckNumber(String aCheckNumber) {
        checkNumber = aCheckNumber;
    }

    /**
     * Access method for checkIsCancelled.
     *
     * @return true if and only if checkIsCancelled is currently true
     */
    public boolean isCheckIsCancelled() {
        return checkIsCancelled;
    }

    /**
     * Setter method for checkIsCancelled.
     *
     * @param aCheckIsCancelled the new value for checkIsCancelled
     */
    public void setCheckIsCancelled(boolean aCheckIsCancelled) {
        checkIsCancelled = aCheckIsCancelled;
    }

    /**
     * Access method for checkCancelledDate.
     *
     * @return the current value of checkCancelledDate
     */
    public LocalDate getCheckCancelledDate() {
        return checkCancelledDate;
    }

    /**
     * Setter method for checkCancelledDate.
     *
     * @param aCheckCancelledDate the new value for checkCancelledDate
     */
    public void setCheckCancelledDate(LocalDate aCheckCancelledDate) {
        checkCancelledDate = aCheckCancelledDate;
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
     * Compares the key for this instance with another ReimbursementChecks.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbursementChecks and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbursementCheck)) {
            return false;
        }
        ReimbursementCheck that = (ReimbursementCheck) other;
        if (this.getReimbursementDetailId() != that.getReimbursementDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ReimbursementChecks.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ReimbursementCheck)) return false;
        return this.equalKeys(other) && ((ReimbursementCheck)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[ReimbursementChecks |");
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
