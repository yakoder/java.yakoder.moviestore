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
    protected static final String PK = "reimbId";

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
    private int reimbId;
    @Column(name="reimb_date", nullable=false)
    private LocalDate reimbDate;
    @Column(name="reimb_amount", nullable=false, precision=15, scale=2)
    private BigDecimal reimbAmount;
    @Column(name="reimb_notes", length=255)
    private String reimbNotes;
    @ManyToOne(optional=false)
    @JoinColumn(name="reimb_detail_id", nullable=false)
    private ReimbOnline reimbOnline;
    @ManyToOne(optional=false)
    @JoinColumn(name="reimb_meth_id", nullable=false)
    private ReimbMethods reimbMethods;

    /** Default constructor. */
    public Reimbursements() {
        super();
    }

    /**
     * Access method for reimbId.
     *
     * @return the current value of reimbId
     */
    public int getReimbId() {
        return reimbId;
    }

    /**
     * Setter method for reimbId.
     *
     * @param aReimbId the new value for reimbId
     */
    public void setReimbId(int aReimbId) {
        reimbId = aReimbId;
    }

    /**
     * Access method for reimbDate.
     *
     * @return the current value of reimbDate
     */
    public LocalDate getReimbDate() {
        return reimbDate;
    }

    /**
     * Setter method for reimbDate.
     *
     * @param aReimbDate the new value for reimbDate
     */
    public void setReimbDate(LocalDate aReimbDate) {
        reimbDate = aReimbDate;
    }

    /**
     * Access method for reimbAmount.
     *
     * @return the current value of reimbAmount
     */
    public BigDecimal getReimbAmount() {
        return reimbAmount;
    }

    /**
     * Setter method for reimbAmount.
     *
     * @param aReimbAmount the new value for reimbAmount
     */
    public void setReimbAmount(BigDecimal aReimbAmount) {
        reimbAmount = aReimbAmount;
    }

    /**
     * Access method for reimbNotes.
     *
     * @return the current value of reimbNotes
     */
    public String getReimbNotes() {
        return reimbNotes;
    }

    /**
     * Setter method for reimbNotes.
     *
     * @param aReimbNotes the new value for reimbNotes
     */
    public void setReimbNotes(String aReimbNotes) {
        reimbNotes = aReimbNotes;
    }

    /**
     * Access method for reimbOnline.
     *
     * @return the current value of reimbOnline
     */
    public ReimbOnline getReimbOnline() {
        return reimbOnline;
    }

    /**
     * Setter method for reimbOnline.
     *
     * @param aReimbOnline the new value for reimbOnline
     */
    public void setReimbOnline(ReimbOnline aReimbOnline) {
        reimbOnline = aReimbOnline;
    }

    /**
     * Access method for reimbMethods.
     *
     * @return the current value of reimbMethods
     */
    public ReimbMethods getReimbMethods() {
        return reimbMethods;
    }

    /**
     * Setter method for reimbMethods.
     *
     * @param aReimbMethods the new value for reimbMethods
     */
    public void setReimbMethods(ReimbMethods aReimbMethods) {
        reimbMethods = aReimbMethods;
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
        if (this.getReimbId() != that.getReimbId()) {
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
        i = getReimbId();
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
        sb.append(" reimbId=").append(getReimbId());
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
        ret.put("reimbId", Integer.valueOf(getReimbId()));
        return ret;
    }

}
