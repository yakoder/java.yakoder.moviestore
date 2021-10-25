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
    protected static final String PK = "expenseId";

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
    private int expenseId;
    @Column(name="exp_date", nullable=false)
    private LocalDate expenseDate;
    @Column(name="exp_amount", nullable=false, precision=15, scale=2)
    private BigDecimal expenseAmount;
    @Column(name="exp_notes", length=255)
    private String expenseNotes;
    @ManyToOne(optional=false)
    @JoinColumn(name="exp_detail_id", nullable=false)
    private ExpenseSupplies expenseSupplies;
    @ManyToOne(optional=false)
    @JoinColumn(name="exp_type_id", nullable=false)
    private ExpenseTypes expenseTypes;

    /** Default constructor. */
    public Expenses() {
        super();
    }

    /**
     * Access method for expenseId.
     *
     * @return the current value of expenseId
     */
    public int getExpenseId() {
        return expenseId;
    }

    /**
     * Setter method for expenseId.
     *
     * @param aExpenseId the new value for expenseId
     */
    public void setExpenseId(int aExpenseId) {
        expenseId = aExpenseId;
    }

    /**
     * Access method for expenseDate.
     *
     * @return the current value of expenseDate
     */
    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    /**
     * Setter method for expenseDate.
     *
     * @param aExpenseDate the new value for expenseDate
     */
    public void setExpenseDate(LocalDate aExpenseDate) {
        expenseDate = aExpenseDate;
    }

    /**
     * Access method for expenseAmount.
     *
     * @return the current value of expenseAmount
     */
    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    /**
     * Setter method for expenseAmount.
     *
     * @param aExpenseAmount the new value for expenseAmount
     */
    public void setExpenseAmount(BigDecimal aExpenseAmount) {
        expenseAmount = aExpenseAmount;
    }

    /**
     * Access method for expenseNotes.
     *
     * @return the current value of expenseNotes
     */
    public String getExpenseNotes() {
        return expenseNotes;
    }

    /**
     * Setter method for expenseNotes.
     *
     * @param aExpenseNotes the new value for expenseNotes
     */
    public void setExpenseNotes(String aExpenseNotes) {
        expenseNotes = aExpenseNotes;
    }

    /**
     * Access method for expenseSupplies.
     *
     * @return the current value of expenseSupplies
     */
    public ExpenseSupplies getExpenseSupplies() {
        return expenseSupplies;
    }

    /**
     * Setter method for expenseSupplies.
     *
     * @param aExpenseSupplies the new value for expenseSupplies
     */
    public void setExpenseSupplies(ExpenseSupplies aExpenseSupplies) {
        expenseSupplies = aExpenseSupplies;
    }

    /**
     * Access method for expenseTypes.
     *
     * @return the current value of expenseTypes
     */
    public ExpenseTypes getExpenseTypes() {
        return expenseTypes;
    }

    /**
     * Setter method for expenseTypes.
     *
     * @param aExpenseTypes the new value for expenseTypes
     */
    public void setExpenseTypes(ExpenseTypes aExpenseTypes) {
        expenseTypes = aExpenseTypes;
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
        if (this.getExpenseId() != that.getExpenseId()) {
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
        i = getExpenseId();
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
        sb.append(" expenseId=").append(getExpenseId());
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
        ret.put("expenseId", Integer.valueOf(getExpenseId()));
        return ret;
    }

}
