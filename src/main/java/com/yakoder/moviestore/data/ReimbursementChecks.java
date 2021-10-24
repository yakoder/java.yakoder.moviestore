// Generated with g9.

package com.yakoder.moviestore.data;

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
public class ReimbursementChecks implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5020419411756924980L;

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
    @Column(length=100)
    private String memo;
    @Column(name="ck_number", length=100)
    private String ckNumber;
    @Column(name="ck_is_cancelled", nullable=false, length=3)
    private boolean ckIsCancelled;
    @Column(name="ck_cx_date")
    private LocalDate ckCxDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="payee_id", nullable=false)
    private TxnParties txnParties2;
    @ManyToOne(optional=false)
    @JoinColumn(name="payor_id", nullable=false)
    private TxnParties txnParties;

    /** Default constructor. */
    public ReimbursementChecks() {
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
     * Access method for ckNumber.
     *
     * @return the current value of ckNumber
     */
    public String getCkNumber() {
        return ckNumber;
    }

    /**
     * Setter method for ckNumber.
     *
     * @param aCkNumber the new value for ckNumber
     */
    public void setCkNumber(String aCkNumber) {
        ckNumber = aCkNumber;
    }

    /**
     * Access method for ckIsCancelled.
     *
     * @return true if and only if ckIsCancelled is currently true
     */
    public boolean isCkIsCancelled() {
        return ckIsCancelled;
    }

    /**
     * Setter method for ckIsCancelled.
     *
     * @param aCkIsCancelled the new value for ckIsCancelled
     */
    public void setCkIsCancelled(boolean aCkIsCancelled) {
        ckIsCancelled = aCkIsCancelled;
    }

    /**
     * Access method for ckCxDate.
     *
     * @return the current value of ckCxDate
     */
    public LocalDate getCkCxDate() {
        return ckCxDate;
    }

    /**
     * Setter method for ckCxDate.
     *
     * @param aCkCxDate the new value for ckCxDate
     */
    public void setCkCxDate(LocalDate aCkCxDate) {
        ckCxDate = aCkCxDate;
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
     * Compares the key for this instance with another ReimbursementChecks.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ReimbursementChecks and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ReimbursementChecks)) {
            return false;
        }
        ReimbursementChecks that = (ReimbursementChecks) other;
        if (this.getReimbDetailId() != that.getReimbDetailId()) {
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
        if (!(other instanceof ReimbursementChecks)) return false;
        return this.equalKeys(other) && ((ReimbursementChecks)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[ReimbursementChecks |");
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
