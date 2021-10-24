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
@Table(name="store_ship_methods", indexes={@Index(name="storeShipMethodsStoreShipMethodsAllIdx", columnList="store_ship_meth_id,store_ship_id,ship_meth_id")})
public class StoreShipMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2747623458933375440L;

	/** Primary key. */
    protected static final String PK = "storeShipMethId";

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
    private int storeShipMethId;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_meth_id", nullable=false)
    private ShippingMethods shippingMethods;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_ship_id", nullable=false)
    private StoreShipping storeShipping;

    /** Default constructor. */
    public StoreShipMethods() {
        super();
    }

    /**
     * Access method for storeShipMethId.
     *
     * @return the current value of storeShipMethId
     */
    public int getStoreShipMethId() {
        return storeShipMethId;
    }

    /**
     * Setter method for storeShipMethId.
     *
     * @param aStoreShipMethId the new value for storeShipMethId
     */
    public void setStoreShipMethId(int aStoreShipMethId) {
        storeShipMethId = aStoreShipMethId;
    }

    /**
     * Access method for shippingMethods.
     *
     * @return the current value of shippingMethods
     */
    public ShippingMethods getShippingMethods() {
        return shippingMethods;
    }

    /**
     * Setter method for shippingMethods.
     *
     * @param aShippingMethods the new value for shippingMethods
     */
    public void setShippingMethods(ShippingMethods aShippingMethods) {
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
        return (getStoreShipping() == null ? null : getStoreShipping().getStoreShipId());
    }

    /**
     * Sets the group fragment storeShipId from member storeShipping.
     *
     * @param aStoreShipId New value for the group fragment
     * @see StoreShipping
     */
    public void setStoreShippingStoreShipId(int aStoreShipId) {
        if (getStoreShipping() != null) {
            getStoreShipping().setStoreShipId(aStoreShipId);
        }
    }

    /**
     * Gets the group fragment shipMethId for member shippingMethods.
     *
     * @return Current value of the group fragment
     * @see ShippingMethods
     */
    public int getShippingMethodsShipMethId() {
        return (getShippingMethods() == null ? null : getShippingMethods().getShipMethId());
    }

    /**
     * Sets the group fragment shipMethId from member shippingMethods.
     *
     * @param aShipMethId New value for the group fragment
     * @see ShippingMethods
     */
    public void setShippingMethodsShipMethId(int aShipMethId) {
        if (getShippingMethods() != null) {
            getShippingMethods().setShipMethId(aShipMethId);
        }
    }

    /**
     * Compares the key for this instance with another StoreShipMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreShipMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreShipMethods)) {
            return false;
        }
        StoreShipMethods that = (StoreShipMethods) other;
        if (this.getStoreShipMethId() != that.getStoreShipMethId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreShipMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreShipMethods)) return false;
        return this.equalKeys(other) && ((StoreShipMethods)other).equalKeys(this);
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
        i = getStoreShipMethId();
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
        StringBuffer sb = new StringBuffer("[StoreShipMethods |");
        sb.append(" storeShipMethId=").append(getStoreShipMethId());
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
        ret.put("storeShipMethId", Integer.valueOf(getStoreShipMethId()));
        return ret;
    }

}
