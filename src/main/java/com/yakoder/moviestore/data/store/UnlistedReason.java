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

@Entity(name="unlisted_reasons")
public class UnlistedReasons implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4676412118930428944L;

	/** Primary key. */
    protected static final String PK = "unlistedReasonId";

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
    @Column(name="unlisted_reason_id", unique=true, nullable=false, precision=10)
    private int unlistedReasonId;
    @Column(name="unlisted_reason_name", nullable=false, length=100)
    private String unlistedReasonName;
    @Column(name="unlisted_reason_desc", length=100)
    private String unlistedReasonDesc;
    @OneToMany(mappedBy="unlistedReasons")
    private Set<StoreInventoryHistory> storeInvHistory;

    /** Default constructor. */
    public UnlistedReasons() {
        super();
    }

    /**
     * Access method for unlistedReasonId.
     *
     * @return the current value of unlistedReasonId
     */
    public int getUnlistedReasonId() {
        return unlistedReasonId;
    }

    /**
     * Setter method for unlistedReasonId.
     *
     * @param aUnlistedReasonId the new value for unlistedReasonId
     */
    public void setUnlistedReasonId(int aUnlistedReasonId) {
        unlistedReasonId = aUnlistedReasonId;
    }

    /**
     * Access method for unlistedReasonName.
     *
     * @return the current value of unlistedReasonName
     */
    public String getUnlistedReasonName() {
        return unlistedReasonName;
    }

    /**
     * Setter method for unlistedReasonName.
     *
     * @param aUnlistedReasonName the new value for unlistedReasonName
     */
    public void setUnlistedReasonName(String aUnlistedReasonName) {
        unlistedReasonName = aUnlistedReasonName;
    }

    /**
     * Access method for unlistedReasonDesc.
     *
     * @return the current value of unlistedReasonDesc
     */
    public String getUnlistedReasonDesc() {
        return unlistedReasonDesc;
    }

    /**
     * Setter method for unlistedReasonDesc.
     *
     * @param aUnlistedReasonDesc the new value for unlistedReasonDesc
     */
    public void setUnlistedReasonDesc(String aUnlistedReasonDesc) {
        unlistedReasonDesc = aUnlistedReasonDesc;
    }

    /**
     * Access method for storeInvHistory.
     *
     * @return the current value of storeInvHistory
     */
    public Set<StoreInventoryHistory> getStoreInvHistory() {
        return storeInvHistory;
    }

    /**
     * Setter method for storeInvHistory.
     *
     * @param aStoreInvHistory the new value for storeInvHistory
     */
    public void setStoreInvHistory(Set<StoreInventoryHistory> aStoreInvHistory) {
        storeInvHistory = aStoreInvHistory;
    }

    /**
     * Compares the key for this instance with another UnlistedReasons.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UnlistedReasons and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UnlistedReasons)) {
            return false;
        }
        UnlistedReasons that = (UnlistedReasons) other;
        if (this.getUnlistedReasonId() != that.getUnlistedReasonId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UnlistedReasons.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UnlistedReasons)) return false;
        return this.equalKeys(other) && ((UnlistedReasons)other).equalKeys(this);
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
        i = getUnlistedReasonId();
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
        StringBuffer sb = new StringBuffer("[UnlistedReasons |");
        sb.append(" unlistedReasonId=").append(getUnlistedReasonId());
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
        ret.put("unlistedReasonId", Integer.valueOf(getUnlistedReasonId()));
        return ret;
    }

}
