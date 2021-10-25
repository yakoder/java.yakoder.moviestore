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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="store_sites")
public class StoreSites implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4063271972450765840L;

	/** Primary key. */
    protected static final String PK = "storeSiteId";

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
    @Column(name="store_site_id", unique=true, nullable=false, precision=10)
    private int storeSiteId;
    @OneToMany(mappedBy="storeSites")
    private Set<ExpenseMovies> expenseMovies;
    @OneToMany(mappedBy="storeSites")
    private Set<Orders> orders;
    @OneToMany(mappedBy="storeSites")
    private Set<StoreCustomers> storeCustomers;
    @OneToMany(mappedBy="storeSites")
    private Set<StoreInventory> storeInventory;
    @OneToMany(mappedBy="storeSites")
    private Set<StoreSalesData> storeSalesData;
    @OneToMany(mappedBy="storeSites")
    private Set<StoreShipping> storeShipping;
    @ManyToOne(optional=false)
    @JoinColumn(name="site_id", nullable=false)
    private Sites sites;

    /** Default constructor. */
    public StoreSites() {
        super();
    }

    /**
     * Access method for storeSiteId.
     *
     * @return the current value of storeSiteId
     */
    public int getStoreSiteId() {
        return storeSiteId;
    }

    /**
     * Setter method for storeSiteId.
     *
     * @param aStoreSiteId the new value for storeSiteId
     */
    public void setStoreSiteId(int aStoreSiteId) {
        storeSiteId = aStoreSiteId;
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
    public void setExpenseMovies(Set<ExpenseMovies> aExpenseMovies) {
        expenseMovies = aExpenseMovies;
    }

    /**
     * Access method for orders.
     *
     * @return the current value of orders
     */
    public Set<Orders> getOrders() {
        return orders;
    }

    /**
     * Setter method for orders.
     *
     * @param aOrders the new value for orders
     */
    public void setOrders(Set<Orders> aOrders) {
        orders = aOrders;
    }

    /**
     * Access method for storeCustomers.
     *
     * @return the current value of storeCustomers
     */
    public Set<StoreCustomers> getStoreCustomers() {
        return storeCustomers;
    }

    /**
     * Setter method for storeCustomers.
     *
     * @param aStoreCustomers the new value for storeCustomers
     */
    public void setStoreCustomers(Set<StoreCustomers> aStoreCustomers) {
        storeCustomers = aStoreCustomers;
    }

    /**
     * Access method for storeInventory.
     *
     * @return the current value of storeInventory
     */
    public Set<StoreInventory> getStoreInventory() {
        return storeInventory;
    }

    /**
     * Setter method for storeInventory.
     *
     * @param aStoreInventory the new value for storeInventory
     */
    public void setStoreInventory(Set<StoreInventory> aStoreInventory) {
        storeInventory = aStoreInventory;
    }

    /**
     * Access method for storeSalesData.
     *
     * @return the current value of storeSalesData
     */
    public Set<StoreSalesData> getStoreSalesData() {
        return storeSalesData;
    }

    /**
     * Setter method for storeSalesData.
     *
     * @param aStoreSalesData the new value for storeSalesData
     */
    public void setStoreSalesData(Set<StoreSalesData> aStoreSalesData) {
        storeSalesData = aStoreSalesData;
    }

    /**
     * Access method for storeShipping.
     *
     * @return the current value of storeShipping
     */
    public Set<StoreShipping> getStoreShipping() {
        return storeShipping;
    }

    /**
     * Setter method for storeShipping.
     *
     * @param aStoreShipping the new value for storeShipping
     */
    public void setStoreShipping(Set<StoreShipping> aStoreShipping) {
        storeShipping = aStoreShipping;
    }

    /**
     * Access method for sites.
     *
     * @return the current value of sites
     */
    public Sites getSites() {
        return sites;
    }

    /**
     * Setter method for sites.
     *
     * @param aSites the new value for sites
     */
    public void setSites(Sites aSites) {
        sites = aSites;
    }

    /**
     * Compares the key for this instance with another StoreSites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreSites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreSites)) {
            return false;
        }
        StoreSites that = (StoreSites) other;
        if (this.getStoreSiteId() != that.getStoreSiteId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreSites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreSites)) return false;
        return this.equalKeys(other) && ((StoreSites)other).equalKeys(this);
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
        i = getStoreSiteId();
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
        StringBuffer sb = new StringBuffer("[StoreSites |");
        sb.append(" storeSiteId=").append(getStoreSiteId());
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
        ret.put("storeSiteId", Integer.valueOf(getStoreSiteId()));
        return ret;
    }

}
