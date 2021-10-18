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

@Entity(name="expenses")
public class Expenses implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4822353855327609376L;

	/** Primary key. */
    protected static final String PK = "expId";

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
    @Column(name="exp_id", unique=true, nullable=false, precision=10)
    private int expId;
    @Column(name="exp_date", nullable=false)
    private LocalDate expDate;
    @Column(name="exp_amount", nullable=false, precision=15, scale=2)
    private BigDecimal expAmount;
    @Column(name="exp_notes", length=255)
    private String expNotes;
    @ManyToOne(optional=false)
    @JoinColumn(name="exp_detail_id", nullable=false)
    private ExpSupplies expSupplies;
    @ManyToOne(optional=false)
    @JoinColumn(name="exp_type_id", nullable=false)
    private ExpTypes expTypes;

    /** Default constructor. */
    public Expenses() {
        super();
    }

    /**
     * Access method for expId.
     *
     * @return the current value of expId
     */
    public int getExpId() {
        return expId;
    }

    /**
     * Setter method for expId.
     *
     * @param aExpId the new value for expId
     */
    public void setExpId(int aExpId) {
        expId = aExpId;
    }

    /**
     * Access method for expDate.
     *
     * @return the current value of expDate
     */
    public LocalDate getExpDate() {
        return expDate;
    }

    /**
     * Setter method for expDate.
     *
     * @param aExpDate the new value for expDate
     */
    public void setExpDate(LocalDate aExpDate) {
        expDate = aExpDate;
    }

    /**
     * Access method for expAmount.
     *
     * @return the current value of expAmount
     */
    public BigDecimal getExpAmount() {
        return expAmount;
    }

    /**
     * Setter method for expAmount.
     *
     * @param aExpAmount the new value for expAmount
     */
    public void setExpAmount(BigDecimal aExpAmount) {
        expAmount = aExpAmount;
    }

    /**
     * Access method for expNotes.
     *
     * @return the current value of expNotes
     */
    public String getExpNotes() {
        return expNotes;
    }

    /**
     * Setter method for expNotes.
     *
     * @param aExpNotes the new value for expNotes
     */
    public void setExpNotes(String aExpNotes) {
        expNotes = aExpNotes;
    }

    /**
     * Access method for expSupplies.
     *
     * @return the current value of expSupplies
     */
    public ExpSupplies getExpSupplies() {
        return expSupplies;
    }

    /**
     * Setter method for expSupplies.
     *
     * @param aExpSupplies the new value for expSupplies
     */
    public void setExpSupplies(ExpSupplies aExpSupplies) {
        expSupplies = aExpSupplies;
    }

    /**
     * Access method for expTypes.
     *
     * @return the current value of expTypes
     */
    public ExpTypes getExpTypes() {
        return expTypes;
    }

    /**
     * Setter method for expTypes.
     *
     * @param aExpTypes the new value for expTypes
     */
    public void setExpTypes(ExpTypes aExpTypes) {
        expTypes = aExpTypes;
    }

    /**
     * Compares the key for this instance with another Expenses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Expenses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Expenses)) {
            return false;
        }
        Expenses that = (Expenses) other;
        if (this.getExpId() != that.getExpId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Expenses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Expenses)) return false;
        return this.equalKeys(other) && ((Expenses)other).equalKeys(this);
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
        i = getExpId();
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
        StringBuffer sb = new StringBuffer("[Expenses |");
        sb.append(" expId=").append(getExpId());
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
        ret.put("expId", Integer.valueOf(getExpId()));
        return ret;
    }

}
