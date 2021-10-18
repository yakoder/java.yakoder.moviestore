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
    protected static final String PK = "shipSvcId";

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
    private int shipSvcId;
    @Column(name="ship_svc_name", nullable=false, length=100)
    private String shipSvcName;
    @Column(name="ship_svc_name_long", length=100)
    private String shipSvcNameLong;
    @Column(name="ship_svc_url", length=255)
    private String shipSvcUrl;
    @Column(name="ship_svc_trk_url", length=255)
    private String shipSvcTrkUrl;
    @Column(name="ship_svc_notes", length=255)
    private String shipSvcNotes;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @OneToMany(mappedBy="shippingServices")
    private Set<ShippingMethods> shippingMethods;

    /** Default constructor. */
    public ShippingServices() {
        super();
    }

    /**
     * Access method for shipSvcId.
     *
     * @return the current value of shipSvcId
     */
    public int getShipSvcId() {
        return shipSvcId;
    }

    /**
     * Setter method for shipSvcId.
     *
     * @param aShipSvcId the new value for shipSvcId
     */
    public void setShipSvcId(int aShipSvcId) {
        shipSvcId = aShipSvcId;
    }

    /**
     * Access method for shipSvcName.
     *
     * @return the current value of shipSvcName
     */
    public String getShipSvcName() {
        return shipSvcName;
    }

    /**
     * Setter method for shipSvcName.
     *
     * @param aShipSvcName the new value for shipSvcName
     */
    public void setShipSvcName(String aShipSvcName) {
        shipSvcName = aShipSvcName;
    }

    /**
     * Access method for shipSvcNameLong.
     *
     * @return the current value of shipSvcNameLong
     */
    public String getShipSvcNameLong() {
        return shipSvcNameLong;
    }

    /**
     * Setter method for shipSvcNameLong.
     *
     * @param aShipSvcNameLong the new value for shipSvcNameLong
     */
    public void setShipSvcNameLong(String aShipSvcNameLong) {
        shipSvcNameLong = aShipSvcNameLong;
    }

    /**
     * Access method for shipSvcUrl.
     *
     * @return the current value of shipSvcUrl
     */
    public String getShipSvcUrl() {
        return shipSvcUrl;
    }

    /**
     * Setter method for shipSvcUrl.
     *
     * @param aShipSvcUrl the new value for shipSvcUrl
     */
    public void setShipSvcUrl(String aShipSvcUrl) {
        shipSvcUrl = aShipSvcUrl;
    }

    /**
     * Access method for shipSvcTrkUrl.
     *
     * @return the current value of shipSvcTrkUrl
     */
    public String getShipSvcTrkUrl() {
        return shipSvcTrkUrl;
    }

    /**
     * Setter method for shipSvcTrkUrl.
     *
     * @param aShipSvcTrkUrl the new value for shipSvcTrkUrl
     */
    public void setShipSvcTrkUrl(String aShipSvcTrkUrl) {
        shipSvcTrkUrl = aShipSvcTrkUrl;
    }

    /**
     * Access method for shipSvcNotes.
     *
     * @return the current value of shipSvcNotes
     */
    public String getShipSvcNotes() {
        return shipSvcNotes;
    }

    /**
     * Setter method for shipSvcNotes.
     *
     * @param aShipSvcNotes the new value for shipSvcNotes
     */
    public void setShipSvcNotes(String aShipSvcNotes) {
        shipSvcNotes = aShipSvcNotes;
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
        if (this.getShipSvcId() != that.getShipSvcId()) {
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
        i = getShipSvcId();
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
        sb.append(" shipSvcId=").append(getShipSvcId());
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
        ret.put("shipSvcId", Integer.valueOf(getShipSvcId()));
        return ret;
    }

}
