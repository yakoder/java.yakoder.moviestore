// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="store_customers", indexes={@Index(name="storeCustomersStoreCustomersStoreSiteIdEnabledIdx", columnList="store_site_id,is_enabled")})
public class StoreCustomers implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1048246908452923147L;

	/** Primary key. */
    protected static final String PK = "storeCustId";

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
    @Column(name="store_cust_id", unique=true, nullable=false, precision=10)
    private int storeCustId;
    @Column(name="cust_username", length=100)
    private String custUsername;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @ManyToOne(optional=false)
    @JoinColumn(name="cust_id", nullable=false)
    private Customers customers;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_site_id", nullable=false)
    private StoreSites storeSites;

    /** Default constructor. */
    public StoreCustomers() {
        super();
    }

    /**
     * Access method for storeCustId.
     *
     * @return the current value of storeCustId
     */
    public int getStoreCustId() {
        return storeCustId;
    }

    /**
     * Setter method for storeCustId.
     *
     * @param aStoreCustId the new value for storeCustId
     */
    public void setStoreCustId(int aStoreCustId) {
        storeCustId = aStoreCustId;
    }

    /**
     * Access method for custUsername.
     *
     * @return the current value of custUsername
     */
    public String getCustUsername() {
        return custUsername;
    }

    /**
     * Setter method for custUsername.
     *
     * @param aCustUsername the new value for custUsername
     */
    public void setCustUsername(String aCustUsername) {
        custUsername = aCustUsername;
    }

    /**
     * Access method for isEnabled.
     *
     * @return true if and only if isEnabled is currently true
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Setter method for isEnabled.
     *
     * @param aIsEnabled the new value for isEnabled
     */
    public void setIsEnabled(boolean aIsEnabled) {
        isEnabled = aIsEnabled;
    }

    /**
     * Access method for customers.
     *
     * @return the current value of customers
     */
    public Customers getCustomers() {
        return customers;
    }

    /**
     * Setter method for customers.
     *
     * @param aCustomers the new value for customers
     */
    public void setCustomers(Customers aCustomers) {
        customers = aCustomers;
    }

    /**
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public StoreSites getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(StoreSites aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Gets the group fragment storeSiteId for member storeSites.
     *
     * @return Current value of the group fragment
     * @see StoreSites
     */
    public int getStoreSitesStoreSiteId() {
        return (getStoreSites() == null ? null : getStoreSites().getStoreSiteId());
    }

    /**
     * Sets the group fragment storeSiteId from member storeSites.
     *
     * @param aStoreSiteId New value for the group fragment
     * @see StoreSites
     */
    public void setStoreSitesStoreSiteId(int aStoreSiteId) {
        if (getStoreSites() != null) {
            getStoreSites().setStoreSiteId(aStoreSiteId);
        }
    }

    /**
     * Compares the key for this instance with another StoreCustomers.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreCustomers and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreCustomers)) {
            return false;
        }
        StoreCustomers that = (StoreCustomers) other;
        if (this.getStoreCustId() != that.getStoreCustId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreCustomers.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreCustomers)) return false;
        return this.equalKeys(other) && ((StoreCustomers)other).equalKeys(this);
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
        i = getStoreCustId();
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
        StringBuffer sb = new StringBuffer("[StoreCustomers |");
        sb.append(" storeCustId=").append(getStoreCustId());
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
        ret.put("storeCustId", Integer.valueOf(getStoreCustId()));
        return ret;
    }

}
