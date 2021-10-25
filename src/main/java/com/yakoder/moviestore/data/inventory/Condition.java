// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.store.ExpenseMovies;

@Entity(name="conditions")
public class Conditions implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8840233815483811019L;

	/** Primary key. */
    protected static final String PK = "conditionId";

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
    @Column(name="cond_id", unique=true, nullable=false, precision=10)
    private int conditionId;
    @Column(name="cond_name", nullable=false, length=100)
    private String conditionName;
    @Column(name="cond_value", nullable=false, precision=10)
    private int conditionValue;
    @Column(name="pct_retail", precision=15, scale=10)
    private BigDecimal percentRetail;
    @OneToMany(mappedBy="conditions")
    private Set<ExpenseMovies> expenseMovies;
    @OneToMany(mappedBy="conditions")
    private Set<Inventory> inventory;

    /** Default constructor. */
    public Conditions() {
        super();
    }

    /**
     * Access method for conditionId.
     *
     * @return the current value of conditionId
     */
    public int getConditionId() {
        return conditionId;
    }

    /**
     * Setter method for conditionId.
     *
     * @param aCondId the new value for conditionId
     */
    public void setConditionId(int aConditionId) {
        conditionId = aConditionId;
    }

    /**
     * Access method for conditionName.
     *
     * @return the current value of conditionName
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * Setter method for condName.
     *
     * @param aConditionName the new value for conditionName
     */
    public void setConditionName(String aConditionName) {
        conditionName = aConditionName;
    }

    /**
     * Access method for conditionValue.
     *
     * @return the current value of conditionValue
     */
    public int getConditionValue() {
        return conditionValue;
    }

    /**
     * Setter method for conditionValue.
     *
     * @param aCondValue the new value for conditionValue
     */
    public void setConditionValue(int aConditionValue) {
        conditionValue = aConditionValue;
    }

    /**
     * Access method for percentRetail.
     *
     * @return the current value of percentRetail
     */
    public BigDecimal getPercentRetail() {
        return percentRetail;
    }

    /**
     * Setter method for percentRetail.
     *
     * @param aPercentRetail the new value for percentRetail
     */
    public void setPercentRetail(BigDecimal aPercentRetail) {
        percentRetail = aPercentRetail;
    }

    /**
     * Access method for expenseMovies.
     *
     * @return the current value of expenseMovies
     */
    public Set<ExpenseMovies> getExpenseMovies() {
        return expenseMovies;
    }

    /**
     * Setter method for expenseMovies.
     *
     * @param aExpenseMovies the new value for expenseMovies
     */
    public void setExpMovies(Set<ExpenseMovies> aExpenseMovies) {
        expenseMovies = aExpenseMovies;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Set<Inventory> getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Set<Inventory> aInventory) {
        inventory = aInventory;
    }

    /**
     * Compares the key for this instance with another Conditions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Conditions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Conditions)) {
            return false;
        }
        Conditions that = (Conditions) other;
        if (this.getConditionId() != that.getConditionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Conditions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Conditions)) return false;
        return this.equalKeys(other) && ((Conditions)other).equalKeys(this);
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
        i = getConditionId();
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
        StringBuffer sb = new StringBuffer("[Conditions |");
        sb.append(" conditionId=").append(getConditionId());
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
        ret.put("conditionId", Integer.valueOf(getConditionId()));
        return ret;
    }

}
