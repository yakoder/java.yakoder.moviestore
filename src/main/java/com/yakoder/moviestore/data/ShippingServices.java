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

@Entity(name="shipping_services")
public class ShippingServices implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2905191552803182038L;

	/** Primary key. */
    protected static final String PK = "shippingServiceId";

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
    @Column(name="ship_svc_id", unique=true, nullable=false, precision=10)
    private int shippingServiceId;
    @Column(name="ship_svc_name", nullable=false, length=100)
    private String shippingServiceName;
    @Column(name="ship_svc_name_long", length=100)
    private String shippingServiceNameLong;
    @Column(name="ship_svc_url", length=255)
    private String shippingServiceUrl;
    @Column(name="ship_svc_trk_url", length=255)
    private String shippingServiceTrackingUrl;
    @Column(name="ship_svc_notes", length=255)
    private String shippingServiceNotes;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @OneToMany(mappedBy="shippingServices")
    private Set<ShippingMethods> shippingMethods;

    /** Default constructor. */
    public ShippingServices() {
        super();
    }

    /**
     * Access method for shippingServiceId.
     *
     * @return the current value of shippingServiceId
     */
    public int getShippingServiceId() {
        return shippingServiceId;
    }

    /**
     * Setter method for shippingServiceId.
     *
     * @param aShippingServiceId the new value for shippingServiceId
     */
    public void setShippingServiceId(int aShippingServiceId) {
        shippingServiceId = aShippingServiceId;
    }

    /**
     * Access method for shippingServiceName.
     *
     * @return the current value of shippingServiceName
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * Setter method for shippingServiceName.
     *
     * @param aShippingServiceName the new value for shippingServiceName
     */
    public void setShippingServiceName(String aShippingServiceName) {
        shippingServiceName = aShippingServiceName;
    }

    /**
     * Access method for shippingServiceNameLong.
     *
     * @return the current value of shippingServiceNameLong
     */
    public String getShippingServiceNameLong() {
        return shippingServiceNameLong;
    }

    /**
     * Setter method for shippingServiceNameLong.
     *
     * @param aShippingServiceNameLong the new value for shippingServiceNameLong
     */
    public void setShippingServiceNameLong(String aShippingServiceNameLong) {
        shippingServiceNameLong = aShippingServiceNameLong;
    }

    /**
     * Access method for shippingServiceUrl.
     *
     * @return the current value of shippingServiceUrl
     */
    public String getShippingServiceUrl() {
        return shippingServiceUrl;
    }

    /**
     * Setter method for shippingServiceUrl.
     *
     * @param aShippingServiceUrl the new value for shippingServiceUrl
     */
    public void setShippingServiceUrl(String aShippingServiceUrl) {
        shippingServiceUrl = aShippingServiceUrl;
    }

    /**
     * Access method for shippingServiceTrackingUrl.
     *
     * @return the current value of shippingServiceTrackingUrl
     */
    public String getShippingServiceTrackingUrl() {
        return shippingServiceTrackingUrl;
    }

    /**
     * Setter method for shippingServiceTrackingUrl.
     *
     * @param aShippingServiceTrackingUrl the new value for shippingServiceTrackingUrl
     */
    public void setShippingServiceTrackingUrl(String aShippingServiceTrackingUrl) {
        shippingServiceTrackingUrl = aShippingServiceTrackingUrl;
    }

    /**
     * Access method for shippingServiceNotes.
     *
     * @return the current value of shippingServiceNotes
     */
    public String getShippingServiceNotes() {
        return shippingServiceNotes;
    }

    /**
     * Setter method for shippingServiceNotes.
     *
     * @param aShippingServiceNotes the new value for shippingServiceNotes
     */
    public void setShippingServiceNotes(String aShippingServiceNotes) {
        shippingServiceNotes = aShippingServiceNotes;
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
     * Access method for shippingMethods.
     *
     * @return the current value of shippingMethods
     */
    public Set<ShippingMethods> getShippingMethods() {
        return shippingMethods;
    }

    /**
     * Setter method for shippingMethods.
     *
     * @param aShippingMethods the new value for shippingMethods
     */
    public void setShippingMethods(Set<ShippingMethods> aShippingMethods) {
        shippingMethods = aShippingMethods;
    }

    /**
     * Compares the key for this instance with another ShippingServices.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ShippingServices and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ShippingServices)) {
            return false;
        }
        ShippingServices that = (ShippingServices) other;
        if (this.getShippingServiceId() != that.getShippingServiceId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ShippingServices.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ShippingServices)) return false;
        return this.equalKeys(other) && ((ShippingServices)other).equalKeys(this);
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
        i = getShippingServiceId();
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
        StringBuffer sb = new StringBuffer("[ShippingServices |");
        sb.append(" shippingServiceId=").append(getShippingServiceId());
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
        ret.put("shippingServiceId", Integer.valueOf(getShippingServiceId()));
        return ret;
    }

}
