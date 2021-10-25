// Generated with g9.

package com.yakoder.moviestore.data.store;

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
@Table(name="store_ship_methods", indexes={@Index(name="storeShipMethodsStoreShippingMethodsAllIdx", columnList="store_ship_meth_id,store_ship_id,ship_meth_id")})
public class StoreShippingMethod implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2747623458933375440L;

	/** Primary key. */
    protected static final String PK = "storeShippingMethodId";

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
    @Column(name="store_ship_meth_id", unique=true, nullable=false, precision=10)
    private int storeShippingMethodId;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_meth_id", nullable=false)
    private ShippingMethod shippingMethods;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_ship_id", nullable=false)
    private StoreShipping storeShipping;

    /** Default constructor. */
    public StoreShippingMethod() {
        super();
    }

    /**
     * Access method for storeShippingMethodId.
     *
     * @return the current value of storeShippingMethodId
     */
    public int getStoreShippingMethodId() {
        return storeShippingMethodId;
    }

    /**
     * Setter method for storeShippingMethodId.
     *
     * @param aStoreShippingMethodId the new value for storeShippingMethodId
     */
    public void setStoreShippingMethodId(int aStoreShippingMethodId) {
        storeShippingMethodId = aStoreShippingMethodId;
    }

    /**
     * Access method for shippingMethods.
     *
     * @return the current value of shippingMethods
     */
    public ShippingMethod getShippingMethods() {
        return shippingMethods;
    }

    /**
     * Setter method for shippingMethods.
     *
     * @param aShippingMethods the new value for shippingMethods
     */
    public void setShippingMethods(ShippingMethod aShippingMethods) {
        shippingMethods = aShippingMethods;
    }

    /**
     * Access method for storeShipping.
     *
     * @return the current value of storeShipping
     */
    public StoreShipping getStoreShipping() {
        return storeShipping;
    }

    /**
     * Setter method for storeShipping.
     *
     * @param aStoreShipping the new value for storeShipping
     */
    public void setStoreShipping(StoreShipping aStoreShipping) {
        storeShipping = aStoreShipping;
    }

    /**
     * Gets the group fragment storeShipId for member storeShipping.
     *
     * @return Current value of the group fragment
     * @see StoreShipping
     */
    public int getStoreShippingStoreShipId() {
        return (getStoreShipping() == null ? null : getStoreShipping().getStoreShippingId());
    }

    /**
     * Sets the group fragment storeShipId from member storeShipping.
     *
     * @param aStoreShipId New value for the group fragment
     * @see StoreShipping
     */
    public void setStoreShippingStoreShipId(int aStoreShipId) {
        if (getStoreShipping() != null) {
            getStoreShipping().setStoreShippingId(aStoreShipId);
        }
    }

    /**
     * Gets the group fragment shipMethId for member shippingMethods.
     *
     * @return Current value of the group fragment
     * @see ShippingMethod
     */
    public int getShippingMethodsShipMethId() {
        return (getShippingMethods() == null ? null : getShippingMethods().getShippingMethodId());
    }

    /**
     * Sets the group fragment shipMethId from member shippingMethods.
     *
     * @param aShipMethId New value for the group fragment
     * @see ShippingMethod
     */
    public void setShippingMethodsShipMethId(int aShipMethId) {
        if (getShippingMethods() != null) {
            getShippingMethods().setShippingMethodId(aShipMethId);
        }
    }

    /**
     * Compares the key for this instance with another StoreShippingMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreShippingMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreShippingMethod)) {
            return false;
        }
        StoreShippingMethod that = (StoreShippingMethod) other;
        if (this.getStoreShippingMethodId() != that.getStoreShippingMethodId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreShippingMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreShippingMethod)) return false;
        return this.equalKeys(other) && ((StoreShippingMethod)other).equalKeys(this);
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
        i = getStoreShippingMethodId();
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
        StringBuffer sb = new StringBuffer("[StoreShippingMethods |");
        sb.append(" storeShippingMethodId=").append(getStoreShippingMethodId());
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
        ret.put("storeShippingMethodId", Integer.valueOf(getStoreShippingMethodId()));
        return ret;
    }

}
