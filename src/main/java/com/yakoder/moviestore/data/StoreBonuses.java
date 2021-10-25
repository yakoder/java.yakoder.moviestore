// Generated with g9.

package com.yakoder.moviestore.data;

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

@Entity(name="store_bonuses")
public class StoreBonuses implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 9222441630201517051L;

	/** Primary key. */
    protected static final String PK = "storeBonusId";

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
    @Column(name="store_bonus_id", unique=true, nullable=false, precision=10)
    private int storeBonusId;
    @Column(name="store_bonus_name", nullable=false, length=100)
    private String storeBonusName;
    @Column(name="store_bonus_desc", length=255)
    private String storeBonusDesc;
    @OneToMany(mappedBy="storeBonuses")
    private Set<StoreInventoryHistory> storeInventoryHistory;

    /** Default constructor. */
    public StoreBonuses() {
        super();
    }

    /**
     * Access method for storeBonusId.
     *
     * @return the current value of storeBonusId
     */
    public int getStoreBonusId() {
        return storeBonusId;
    }

    /**
     * Setter method for storeBonusId.
     *
     * @param aStoreBonusId the new value for storeBonusId
     */
    public void setStoreBonusId(int aStoreBonusId) {
        storeBonusId = aStoreBonusId;
    }

    /**
     * Access method for storeBonusName.
     *
     * @return the current value of storeBonusName
     */
    public String getStoreBonusName() {
        return storeBonusName;
    }

    /**
     * Setter method for storeBonusName.
     *
     * @param aStoreBonusName the new value for storeBonusName
     */
    public void setStoreBonusName(String aStoreBonusName) {
        storeBonusName = aStoreBonusName;
    }

    /**
     * Access method for storeBonusDesc.
     *
     * @return the current value of storeBonusDesc
     */
    public String getStoreBonusDesc() {
        return storeBonusDesc;
    }

    /**
     * Setter method for storeBonusDesc.
     *
     * @param aStoreBonusDesc the new value for storeBonusDesc
     */
    public void setStoreBonusDesc(String aStoreBonusDesc) {
        storeBonusDesc = aStoreBonusDesc;
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
     * Compares the key for this instance with another StoreBonuses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreBonuses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreBonuses)) {
            return false;
        }
        StoreBonuses that = (StoreBonuses) other;
        if (this.getStoreBonusId() != that.getStoreBonusId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreBonuses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreBonuses)) return false;
        return this.equalKeys(other) && ((StoreBonuses)other).equalKeys(this);
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
        i = getStoreBonusId();
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
        StringBuffer sb = new StringBuffer("[StoreBonuses |");
        sb.append(" storeBonusId=").append(getStoreBonusId());
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
        ret.put("storeBonusId", Integer.valueOf(getStoreBonusId()));
        return ret;
    }

}
