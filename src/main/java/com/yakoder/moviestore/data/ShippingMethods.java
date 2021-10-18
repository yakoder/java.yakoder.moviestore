// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="shipping_methods", indexes={@Index(name="shippingMethodsShippingMethodsShipSvcIdEnabledIdx", columnList="ship_svc_id,is_enabled")})
public class ShippingMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8774260132151515444L;

	/** Primary key. */
    protected static final String PK = "shipMethId";

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
    @Column(name="ship_meth_id", unique=true, nullable=false, precision=10)
    private int shipMethId;
    @Column(name="ship_meth_name", nullable=false, length=100)
    private String shipMethName;
    @Column(name="ship_base_cost", precision=15, scale=2)
    private BigDecimal shipBaseCost;
    @Column(name="ship_ins_base_cost", precision=15, scale=2)
    private BigDecimal shipInsBaseCost;
    @Column(name="has_tracking", nullable=false, length=3)
    private boolean hasTracking;
    @Column(name="ins_allowed", nullable=false, length=3)
    private boolean insAllowed;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    @OneToMany(mappedBy="shippingMethods")
    private Set<ExpShipping> expShipping;
    @OneToMany(mappedBy="shippingMethods")
    private Set<OrderShipments> orderShipments;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_svc_id", nullable=false)
    private ShippingServices shippingServices;
    @OneToMany(mappedBy="shippingMethods")
    private Set<StoreShipMethods> storeShipMethods;

    /** Default constructor. */
    public ShippingMethods() {
        super();
    }

    /**
     * Access method for shipMethId.
     *
     * @return the current value of shipMethId
     */
    public int getShipMethId() {
        return shipMethId;
    }

    /**
     * Setter method for shipMethId.
     *
     * @param aShipMethId the new value for shipMethId
     */
    public void setShipMethId(int aShipMethId) {
        shipMethId = aShipMethId;
    }

    /**
     * Access method for shipMethName.
     *
     * @return the current value of shipMethName
     */
    public String getShipMethName() {
        return shipMethName;
    }

    /**
     * Setter method for shipMethName.
     *
     * @param aShipMethName the new value for shipMethName
     */
    public void setShipMethName(String aShipMethName) {
        shipMethName = aShipMethName;
    }

    /**
     * Access method for shipBaseCost.
     *
     * @return the current value of shipBaseCost
     */
    public BigDecimal getShipBaseCost() {
        return shipBaseCost;
    }

    /**
     * Setter method for shipBaseCost.
     *
     * @param aShipBaseCost the new value for shipBaseCost
     */
    public void setShipBaseCost(BigDecimal aShipBaseCost) {
        shipBaseCost = aShipBaseCost;
    }

    /**
     * Access method for shipInsBaseCost.
     *
     * @return the current value of shipInsBaseCost
     */
    public BigDecimal getShipInsBaseCost() {
        return shipInsBaseCost;
    }

    /**
     * Setter method for shipInsBaseCost.
     *
     * @param aShipInsBaseCost the new value for shipInsBaseCost
     */
    public void setShipInsBaseCost(BigDecimal aShipInsBaseCost) {
        shipInsBaseCost = aShipInsBaseCost;
    }

    /**
     * Access method for hasTracking.
     *
     * @return true if and only if hasTracking is currently true
     */
    public boolean isHasTracking() {
        return hasTracking;
    }

    /**
     * Setter method for hasTracking.
     *
     * @param aHasTracking the new value for hasTracking
     */
    public void setHasTracking(boolean aHasTracking) {
        hasTracking = aHasTracking;
    }

    /**
     * Access method for insAllowed.
     *
     * @return true if and only if insAllowed is currently true
     */
    public boolean isInsAllowed() {
        return insAllowed;
    }

    /**
     * Setter method for insAllowed.
     *
     * @param aInsAllowed the new value for insAllowed
     */
    public void setInsAllowed(boolean aInsAllowed) {
        insAllowed = aInsAllowed;
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
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(LocalDate aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(LocalDate aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for expShipping.
     *
     * @return the current value of expShipping
     */
    public Set<ExpShipping> getExpShipping() {
        return expShipping;
    }

    /**
     * Setter method for expShipping.
     *
     * @param aExpShipping the new value for expShipping
     */
    public void setExpShipping(Set<ExpShipping> aExpShipping) {
        expShipping = aExpShipping;
    }

    /**
     * Access method for orderShipments.
     *
     * @return the current value of orderShipments
     */
    public Set<OrderShipments> getOrderShipments() {
        return orderShipments;
    }

    /**
     * Setter method for orderShipments.
     *
     * @param aOrderShipments the new value for orderShipments
     */
    public void setOrderShipments(Set<OrderShipments> aOrderShipments) {
        orderShipments = aOrderShipments;
    }

    /**
     * Access method for shippingServices.
     *
     * @return the current value of shippingServices
     */
    public ShippingServices getShippingServices() {
        return shippingServices;
    }

    /**
     * Setter method for shippingServices.
     *
     * @param aShippingServices the new value for shippingServices
     */
    public void setShippingServices(ShippingServices aShippingServices) {
        shippingServices = aShippingServices;
    }

    /**
     * Access method for storeShipMethods.
     *
     * @return the current value of storeShipMethods
     */
    public Set<StoreShipMethods> getStoreShipMethods() {
        return storeShipMethods;
    }

    /**
     * Setter method for storeShipMethods.
     *
     * @param aStoreShipMethods the new value for storeShipMethods
     */
    public void setStoreShipMethods(Set<StoreShipMethods> aStoreShipMethods) {
        storeShipMethods = aStoreShipMethods;
    }

    /**
     * Gets the group fragment shipSvcId for member shippingServices.
     *
     * @return Current value of the group fragment
     * @see ShippingServices
     */
    public int getShippingServicesShipSvcId() {
        return (getShippingServices() == null ? null : getShippingServices().getShipSvcId());
    }

    /**
     * Sets the group fragment shipSvcId from member shippingServices.
     *
     * @param aShipSvcId New value for the group fragment
     * @see ShippingServices
     */
    public void setShippingServicesShipSvcId(int aShipSvcId) {
        if (getShippingServices() != null) {
            getShippingServices().setShipSvcId(aShipSvcId);
        }
    }

    /**
     * Compares the key for this instance with another ShippingMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ShippingMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ShippingMethods)) {
            return false;
        }
        ShippingMethods that = (ShippingMethods) other;
        if (this.getShipMethId() != that.getShipMethId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ShippingMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ShippingMethods)) return false;
        return this.equalKeys(other) && ((ShippingMethods)other).equalKeys(this);
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
        i = getShipMethId();
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
        StringBuffer sb = new StringBuffer("[ShippingMethods |");
        sb.append(" shipMethId=").append(getShipMethId());
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
        ret.put("shipMethId", Integer.valueOf(getShipMethId()));
        return ret;
    }

}
