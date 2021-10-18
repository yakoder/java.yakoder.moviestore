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
public class ExpSupplies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6291461266292819987L;

	/** Primary key. */
    protected static final String PK = "expDetailId";

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
    private int expDetailId;
    @Column(name="store_name", length=100)
    private String storeName;
    @Column(name="exp_subtotal", precision=15, scale=2)
    private BigDecimal expSubtotal;
    @Column(name="exp_tax", precision=15, scale=2)
    private BigDecimal expTax;
    @OneToMany(mappedBy="expSupplies")
    private Set<Expenses> expenses;
    @ManyToOne(optional=false)
    @JoinColumn(name="supply_type_id", nullable=false)
    private SupplyTypes supplyTypes;

    /** Default constructor. */
    public ExpSupplies() {
        super();
    }

    /**
     * Access method for expDetailId.
     *
     * @return the current value of expDetailId
     */
    public int getExpDetailId() {
        return expDetailId;
    }

    /**
     * Setter method for expDetailId.
     *
     * @param aExpDetailId the new value for expDetailId
     */
    public void setExpDetailId(int aExpDetailId) {
        expDetailId = aExpDetailId;
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
     * Access method for expSubtotal.
     *
     * @return the current value of expSubtotal
     */
    public BigDecimal getExpSubtotal() {
        return expSubtotal;
    }

    /**
     * Setter method for expSubtotal.
     *
     * @param aExpSubtotal the new value for expSubtotal
     */
    public void setExpSubtotal(BigDecimal aExpSubtotal) {
        expSubtotal = aExpSubtotal;
    }

    /**
     * Access method for expTax.
     *
     * @return the current value of expTax
     */
    public BigDecimal getExpTax() {
        return expTax;
    }

    /**
     * Setter method for expTax.
     *
     * @param aExpTax the new value for expTax
     */
    public void setExpTax(BigDecimal aExpTax) {
        expTax = aExpTax;
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
     * Compares the key for this instance with another ExpSupplies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpSupplies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpSupplies)) {
            return false;
        }
        ExpSupplies that = (ExpSupplies) other;
        if (this.getExpDetailId() != that.getExpDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpSupplies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpSupplies)) return false;
        return this.equalKeys(other) && ((ExpSupplies)other).equalKeys(this);
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
        i = getExpDetailId();
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
        StringBuffer sb = new StringBuffer("[ExpSupplies |");
        sb.append(" expDetailId=").append(getExpDetailId());
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
        ret.put("expDetailId", Integer.valueOf(getExpDetailId()));
        return ret;
    }

}
