// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
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

@Entity(name="price_override_reasons")
public class PriceOverrideReasons implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1768021629361802686L;

	/** Primary key. */
    protected static final String PK = "overrideReasonId";

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
    @Column(name="override_reason_id", unique=true, nullable=false, precision=10)
    private int overrideReasonId;
    @Column(name="override_reason_name", nullable=false, length=100)
    private String overrideReasonName;
    @Column(name="override_reason_desc", length=255)
    private String overrideReasonDesc;
    @OneToMany(mappedBy="priceOverrideReasons")
    private Set<StoreInventoryHistory> storeInventoryHistory;

    /** Default constructor. */
    public PriceOverrideReasons() {
        super();
    }

    /**
     * Access method for overrideReasonId.
     *
     * @return the current value of overrideReasonId
     */
    public int getOverrideReasonId() {
        return overrideReasonId;
    }

    /**
     * Setter method for overrideReasonId.
     *
     * @param aOverrideReasonId the new value for overrideReasonId
     */
    public void setOverrideReasonId(int aOverrideReasonId) {
        overrideReasonId = aOverrideReasonId;
    }

    /**
     * Access method for overrideReasonName.
     *
     * @return the current value of overrideReasonName
     */
    public String getOverrideReasonName() {
        return overrideReasonName;
    }

    /**
     * Setter method for overrideReasonName.
     *
     * @param aOverrideReasonName the new value for overrideReasonName
     */
    public void setOverrideReasonName(String aOverrideReasonName) {
        overrideReasonName = aOverrideReasonName;
    }

    /**
     * Access method for overrideReasonDesc.
     *
     * @return the current value of overrideReasonDesc
     */
    public String getOverrideReasonDesc() {
        return overrideReasonDesc;
    }

    /**
     * Setter method for overrideReasonDesc.
     *
     * @param aOverrideReasonDesc the new value for overrideReasonDesc
     */
    public void setOverrideReasonDesc(String aOverrideReasonDesc) {
        overrideReasonDesc = aOverrideReasonDesc;
    }

    /**
     * Access method for storeInventoryHistory.
     *
     * @return the current value of storeInventoryHistory
     */
    public Set<StoreInventoryHistory> getStoreInventoryHistory() {
        return storeInventoryHistory;
    }

    /**
     * Setter method for storeInventoryHistory.
     *
     * @param aStoreInventoryHistory the new value for storeInventoryHistory
     */
    public void setStoreInventoryHistory(Set<StoreInventoryHistory> aStoreInventoryHistory) {
        storeInventoryHistory = aStoreInventoryHistory;
    }

    /**
     * Compares the key for this instance with another PriceOverrideReasons.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PriceOverrideReasons and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PriceOverrideReasons)) {
            return false;
        }
        PriceOverrideReasons that = (PriceOverrideReasons) other;
        if (this.getOverrideReasonId() != that.getOverrideReasonId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PriceOverrideReasons.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PriceOverrideReasons)) return false;
        return this.equalKeys(other) && ((PriceOverrideReasons)other).equalKeys(this);
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
        i = getOverrideReasonId();
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
        StringBuffer sb = new StringBuffer("[PriceOverrideReasons |");
        sb.append(" overrideReasonId=").append(getOverrideReasonId());
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
        ret.put("overrideReasonId", Integer.valueOf(getOverrideReasonId()));
        return ret;
    }

}