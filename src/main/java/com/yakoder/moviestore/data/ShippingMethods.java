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
    protected static final String PK = "shippingMethodId";

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
    private int shippingMethodId;
    @Column(name="ship_meth_name", nullable=false, length=100)
    private String shippingMethodName;
    @Column(name="ship_base_cost", precision=15, scale=2)
    private BigDecimal shippingBaseCost;
    @Column(name="ship_ins_base_cost", precision=15, scale=2)
    private BigDecimal shippingInsuranceBaseCost;
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
    private Set<ExpenseShipping> expenseShipping;
    @OneToMany(mappedBy="shippingMethods")
    private Set<OrderShipments> orderShipments;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_svc_id", nullable=false)
    private ShippingServices shippingServices;
    @OneToMany(mappedBy="shippingMethods")
    private Set<StoreShippingMethods> storeShipMethods;

    /** Default constructor. */
    public ShippingMethods() {
        super();
    }

    /**
     * Access method for shippingMethodId.
     *
     * @return the current value of shippingMethodId
     */
    public int getShippingMethodId() {
        return shippingMethodId;
    }

    /**
     * Setter method for shippingMethodId.
     *
     * @param aShippingMethodId the new value for shippingMethodId
     */
    public void setShippingMethodId(int aShippingMethodId) {
        shippingMethodId = aShippingMethodId;
    }

    /**
     * Access method for shippingMethodName.
     *
     * @return the current value of shippingMethodName
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * Setter method for shippingMethodName.
     *
     * @param aShippingMethodName the new value for shippingMethodName
     */
    public void setShippingMethodName(String aShippingMethodName) {
        shippingMethodName = aShippingMethodName;
    }

    /**
     * Access method for shippingBaseCost.
     *
     * @return the current value of shippingBaseCost
     */
    public BigDecimal getShippingBaseCost() {
        return shippingBaseCost;
    }

    /**
     * Setter method for shippingBaseCost.
     *
     * @param aShippingBaseCost the new value for shippingBaseCost
     */
    public void setShippingBaseCost(BigDecimal aShippingBaseCost) {
        shippingBaseCost = aShippingBaseCost;
    }

    /**
     * Access method for shippingInsuranceBaseCost.
     *
     * @return the current value of shippingInsuranceBaseCost
     */
    public BigDecimal getShippingInsuranceBaseCost() {
        return shippingInsuranceBaseCost;
    }

    /**
     * Setter method for shippingInsuranceBaseCost.
     *
     * @param aShippingInsuranceBaseCost the new value for shippingInsuranceBaseCost
     */
    public void setShippingInsuranceBaseCost(BigDecimal aShippingInsuranceBaseCost) {
        shippingInsuranceBaseCost = aShippingInsuranceBaseCost;
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
     * Access method for insuranceAllowed.
     *
     * @return true if and only if insuranceAllowed is currently true
     */
    public boolean isInsuranceAllowed() {
        return insAllowed;
    }

    /**
     * Setter method for insuranceAllowed.
     *
     * @param aInsuranceAllowed the new value for insuranceAllowed
     */
    public void setInsuranceAllowed(boolean aInsuranceAllowed) {
        insAllowed = aInsuranceAllowed;
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
     * Access method for expenseShipping.
     *
     * @return the current value of expenseShipping
     */
    public Set<ExpenseShipping> getExpenseShipping() {
        return expenseShipping;
    }

    /**
     * Setter method for expenseShipping.
     *
     * @param aExpenseShipping the new value for expenseShipping
     */
    public void setExpenseShipping(Set<ExpenseShipping> aExpenseShipping) {
        expenseShipping = aExpenseShipping;
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
    public Set<StoreShippingMethods> getStoreShipMethods() {
        return storeShipMethods;
    }

    /**
     * Setter method for storeShipMethods.
     *
     * @param aStoreShipMethods the new value for storeShipMethods
     */
    public void setStoreShipMethods(Set<StoreShippingMethods> aStoreShipMethods) {
        storeShipMethods = aStoreShipMethods;
    }

    /**
     * Gets the group fragment shippingServiceId for member shippingServices.
     *
     * @return Current value of the group fragment
     * @see ShippingServices
     */
    public int getShippingServicesShippingServiceId() {
        return (getShippingServices() == null ? null : getShippingServices().getShippingServiceId());
    }

    /**
     * Sets the group fragment shippingServiceId from member shippingServices.
     *
     * @param aShippingServiceId New value for the group fragment
     * @see ShippingServices
     */
    public void setShippingServicesShippingServiceId(int aShippingServiceId) {
        if (getShippingServices() != null) {
            getShippingServices().setShippingServiceId(aShippingServiceId);
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
        if (this.getShippingMethodId() != that.getShippingMethodId()) {
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
        i = getShippingMethodId();
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
        sb.append(" shippingMethodId=").append(getShippingMethodId());
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
        ret.put("shippingMethodId", Integer.valueOf(getShippingMethodId()));
        return ret;
    }

}
