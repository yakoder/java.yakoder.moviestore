// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="exp_supplies")
public class ExpenseSupplies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6291461266292819987L;

	/** Primary key. */
    protected static final String PK = "expenseDetailId";

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
    @Column(name="exp_detail_id", unique=true, nullable=false, precision=10)
    private int expenseDetailId;
    @Column(name="store_name", length=100)
    private String storeName;
    @Column(name="exp_subtotal", precision=15, scale=2)
    private BigDecimal expenseSubtotal;
    @Column(name="exp_tax", precision=15, scale=2)
    private BigDecimal expenseTax;
    @OneToMany(mappedBy="expSupplies")
    private Set<Expenses> expenses;
    @ManyToOne(optional=false)
    @JoinColumn(name="supply_type_id", nullable=false)
    private SupplyTypes supplyTypes;

    /** Default constructor. */
    public ExpenseSupplies() {
        super();
    }

    /**
     * Access method for expenseDetailId.
     *
     * @return the current value of expenseDetailId
     */
    public int getExpenseDetailId() {
        return expenseDetailId;
    }

    /**
     * Setter method for expenseDetailId.
     *
     * @param aExpenseDetailId the new value for expenseDetailId
     */
    public void setExpenseDetailId(int aExpenseDetailId) {
        expenseDetailId = aExpenseDetailId;
    }

    /**
     * Access method for storeName.
     *
     * @return the current value of storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Setter method for storeName.
     *
     * @param aStoreName the new value for storeName
     */
    public void setStoreName(String aStoreName) {
        storeName = aStoreName;
    }

    /**
     * Access method for expenseSubtotal.
     *
     * @return the current value of expenseSubtotal
     */
    public BigDecimal getExpenseSubtotal() {
        return expenseSubtotal;
    }

    /**
     * Setter method for expenseSubtotal.
     *
     * @param aExpenseSubtotal the new value for expenseSubtotal
     */
    public void setExpenseSubtotal(BigDecimal aExpenseSubtotal) {
        expenseSubtotal = aExpenseSubtotal;
    }

    /**
     * Access method for expenseTax.
     *
     * @return the current value of expenseTax
     */
    public BigDecimal getExpenseTax() {
        return expenseTax;
    }

    /**
     * Setter method for expenseTax.
     *
     * @param aExpenseTax the new value for expenseTax
     */
    public void setExpenseTax(BigDecimal aExpenseTax) {
        expenseTax = aExpenseTax;
    }

    /**
     * Access method for expenses.
     *
     * @return the current value of expenses
     */
    public Set<Expenses> getExpenses() {
        return expenses;
    }

    /**
     * Setter method for expenses.
     *
     * @param aExpenses the new value for expenses
     */
    public void setExpenses(Set<Expenses> aExpenses) {
        expenses = aExpenses;
    }

    /**
     * Access method for supplyTypes.
     *
     * @return the current value of supplyTypes
     */
    public SupplyTypes getSupplyTypes() {
        return supplyTypes;
    }

    /**
     * Setter method for supplyTypes.
     *
     * @param aSupplyTypes the new value for supplyTypes
     */
    public void setSupplyTypes(SupplyTypes aSupplyTypes) {
        supplyTypes = aSupplyTypes;
    }

    /**
     * Compares the key for this instance with another ExpenseSupplies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpenseSupplies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpenseSupplies)) {
            return false;
        }
        ExpenseSupplies that = (ExpenseSupplies) other;
        if (this.getExpenseDetailId() != that.getExpenseDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpenseSupplies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpenseSupplies)) return false;
        return this.equalKeys(other) && ((ExpenseSupplies)other).equalKeys(this);
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
        i = getExpenseDetailId();
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
        StringBuffer sb = new StringBuffer("[ExpenseSupplies |");
        sb.append(" expenseDetailId=").append(getExpenseDetailId());
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
        ret.put("expenseDetailId", Integer.valueOf(getExpenseDetailId()));
        return ret;
    }

}
