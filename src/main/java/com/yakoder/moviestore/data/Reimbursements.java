// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="reimbursements")
public class Reimbursements implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1747841485826957010L;

	/** Primary key. */
    protected static final String PK = "reimbursementId";

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
    @Column(name="reimb_id", unique=true, nullable=false, precision=10)
    private int reimbursementId;
    @Column(name="reimb_date", nullable=false)
    private LocalDate reimbursementDate;
    @Column(name="reimb_amount", nullable=false, precision=15, scale=2)
    private BigDecimal reimbursementAmount;
    @Column(name="reimb_notes", length=255)
    private String reimbursementNotes;
    @ManyToOne(optional=false)
    @JoinColumn(name="reimb_detail_id", nullable=false)
    private ReimbursementOnline reimbursementOnline;
    @ManyToOne(optional=false)
    @JoinColumn(name="reimb_meth_id", nullable=false)
    private ReimbursementMethods reimbursementMethods;

    /** Default constructor. */
    public Reimbursements() {
        super();
    }

    /**
     * Access method for reimbursementId.
     *
     * @return the current value of reimbursementId
     */
    public int getReimbursementId() {
        return reimbursementId;
    }

    /**
     * Setter method for reimbursementId.
     *
     * @param aReimbursementId the new value for reimbursementId
     */
    public void setReimbursementId(int aReimbursementId) {
        reimbursementId = aReimbursementId;
    }

    /**
     * Access method for reimbursementDate.
     *
     * @return the current value of reimbursementDate
     */
    public LocalDate getReimbursementDate() {
        return reimbursementDate;
    }

    /**
     * Setter method for reimbursementDate.
     *
     * @param aReimbursementDate the new value for reimbursementDate
     */
    public void setReimbursementDate(LocalDate aReimbursementDate) {
        reimbursementDate = aReimbursementDate;
    }

    /**
     * Access method for reimbursementAmount.
     *
     * @return the current value of reimbursementAmount
     */
    public BigDecimal getReimbursementAmount() {
        return reimbursementAmount;
    }

    /**
     * Setter method for reimbursementAmount.
     *
     * @param aReimbursementAmount the new value for reimbursementAmount
     */
    public void setReimbursementAmount(BigDecimal aReimbursementAmount) {
        reimbursementAmount = aReimbursementAmount;
    }

    /**
     * Access method for reimbursementNotes.
     *
     * @return the current value of reimbursementNotes
     */
    public String getReimbursementNotes() {
        return reimbursementNotes;
    }

    /**
     * Setter method for reimbursementNotes.
     *
     * @param aReimbursementNotes the new value for reimbursementNotes
     */
    public void setReimbursementNotes(String aReimbursementNotes) {
        reimbursementNotes = aReimbursementNotes;
    }

    /**
     * Access method for reimbursementOnline.
     *
     * @return the current value of reimbursementOnline
     */
    public ReimbursementOnline getReimbursementOnline() {
        return reimbursementOnline;
    }

    /**
     * Setter method for reimbursementOnline.
     *
     * @param aReimbursementOnline the new value for reimbursementOnline
     */
    public void setReimbursementOnline(ReimbursementOnline aReimbursementOnline) {
        reimbursementOnline = aReimbursementOnline;
    }

    /**
     * Access method for reimbursementMethods.
     *
     * @return the current value of reimbursementMethods
     */
    public ReimbursementMethods getReimbursementMethods() {
        return reimbursementMethods;
    }

    /**
     * Setter method for reimbursementMethods.
     *
     * @param aReimbursementMethods the new value for reimbursementMethods
     */
    public void setReimbursementMethods(ReimbursementMethods aReimbursementMethods) {
        reimbursementMethods = aReimbursementMethods;
    }

    /**
     * Compares the key for this instance with another Reimbursements.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reimbursements and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reimbursements)) {
            return false;
        }
        Reimbursements that = (Reimbursements) other;
        if (this.getReimbursementId() != that.getReimbursementId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reimbursements.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reimbursements)) return false;
        return this.equalKeys(other) && ((Reimbursements)other).equalKeys(this);
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
        i = getReimbursementId();
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
        StringBuffer sb = new StringBuffer("[Reimbursements |");
        sb.append(" reimbursementId=").append(getReimbursementId());
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
        ret.put("reimbursementId", Integer.valueOf(getReimbursementId()));
        return ret;
    }

}
