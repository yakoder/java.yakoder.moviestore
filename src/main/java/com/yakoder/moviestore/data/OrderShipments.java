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
@Table(name="order_shipments", indexes={@Index(name="order_shipments_tracking_number_IX", columnList="tracking_number", unique=true)})
public class OrderShipments implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 937559668869978850L;

	/** Primary key. */
    protected static final String PK = "orderShipmentId";

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
    @Column(name="order_ship_id", unique=true, nullable=false, precision=10)
    private int orderShipmentId;
    @Column(name="shipped_on", length=100)
    private String shippedOn;
    @Column(name="postage_cost", nullable=false, precision=15, scale=2)
    private BigDecimal postageCost;
    @Column(name="has_insurance", nullable=false, length=3)
    private boolean hasInsurance;
    @Column(name="insurance_cost", nullable=false, precision=15, scale=2)
    private BigDecimal insuranceCost;
    @Column(name="insured_value", precision=15, scale=2)
    private BigDecimal insuredValue;
    @Column(name="tracking_number", unique=true, length=100)
    private String trackingNumber;
    @Column(name="estimated_delivery")
    private LocalDate estimatedDelivery;
    @Column(name="late_delivery", length=3)
    private boolean lateDelivery;
    @Column(name="delivered_on")
    private LocalDate deliveredOn;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_meth_id", nullable=false)
    private ShippingMethods shippingMethods;
    @OneToMany(mappedBy="orderShipments")
    private Set<Orders> orders;

    /** Default constructor. */
    public OrderShipments() {
        super();
    }

    /**
     * Access method for orderShipmentId.
     *
     * @return the current value of orderShipmentId
     */
    public int getOrderShipmentId() {
        return orderShipmentId;
    }

    /**
     * Setter method for orderShipmentId.
     *
     * @param aOrderShipmentId the new value for orderShipmentId
     */
    public void setOrderShipmentId(int aOrderShipmentId) {
        orderShipmentId = aOrderShipmentId;
    }

    /**
     * Access method for shippedOn.
     *
     * @return the current value of shippedOn
     */
    public String getShippedOn() {
        return shippedOn;
    }

    /**
     * Setter method for shippedOn.
     *
     * @param aShippedOn the new value for shippedOn
     */
    public void setShippedOn(String aShippedOn) {
        shippedOn = aShippedOn;
    }

    /**
     * Access method for postageCost.
     *
     * @return the current value of postageCost
     */
    public BigDecimal getPostageCost() {
        return postageCost;
    }

    /**
     * Setter method for postageCost.
     *
     * @param aPostageCost the new value for postageCost
     */
    public void setPostageCost(BigDecimal aPostageCost) {
        postageCost = aPostageCost;
    }

    /**
     * Access method for hasInsurance.
     *
     * @return true if and only if hasInsurance is currently true
     */
    public boolean isHasInsurance() {
        return hasInsurance;
    }

    /**
     * Setter method for hasInsurance.
     *
     * @param aHasInsurance the new value for hasInsurance
     */
    public void setHasInsurance(boolean aHasInsurance) {
        hasInsurance = aHasInsurance;
    }

    /**
     * Access method for insuranceCost.
     *
     * @return the current value of insuranceCost
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Setter method for insuranceCost.
     *
     * @param aInsuranceCost the new value for insuranceCost
     */
    public void setInsuranceCost(BigDecimal aInsuranceCost) {
        insuranceCost = aInsuranceCost;
    }

    /**
     * Access method for insuredValue.
     *
     * @return the current value of insuredValue
     */
    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    /**
     * Setter method for insuredValue.
     *
     * @param aInsuredValue the new value for insuredValue
     */
    public void setInsuredValue(BigDecimal aInsuredValue) {
        insuredValue = aInsuredValue;
    }

    /**
     * Access method for trackingNumber.
     *
     * @return the current value of trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Setter method for trackingNumber.
     *
     * @param aTrackingNumber the new value for trackingNumber
     */
    public void setTrackingNumber(String aTrackingNumber) {
        trackingNumber = aTrackingNumber;
    }

    /**
     * Access method for estimatedDelivery.
     *
     * @return the current value of estimatedDelivery
     */
    public LocalDate getEstimatedDelivery() {
        return estimatedDelivery;
    }

    /**
     * Setter method for estimatedDelivery.
     *
     * @param aEstimatedDelivery the new value for estimatedDelivery
     */
    public void setEstimatedDelivery(LocalDate aEstimatedDelivery) {
        estimatedDelivery = aEstimatedDelivery;
    }

    /**
     * Access method for lateDelivery.
     *
     * @return true if and only if lateDelivery is currently true
     */
    public boolean isLateDelivery() {
        return lateDelivery;
    }

    /**
     * Setter method for lateDelivery.
     *
     * @param aLateDelivery the new value for lateDelivery
     */
    public void setLateDelivery(boolean aLateDelivery) {
        lateDelivery = aLateDelivery;
    }

    /**
     * Access method for deliveredOn.
     *
     * @return the current value of deliveredOn
     */
    public LocalDate getDeliveredOn() {
        return deliveredOn;
    }

    /**
     * Setter method for deliveredOn.
     *
     * @param aDeliveredOn the new value for deliveredOn
     */
    public void setDeliveredOn(LocalDate aDeliveredOn) {
        deliveredOn = aDeliveredOn;
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
     * Compares the key for this instance with another OrderShipments.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderShipments and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderShipments)) {
            return false;
        }
        OrderShipments that = (OrderShipments) other;
        if (this.getOrderShipmentId() != that.getOrderShipmentId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderShipments.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderShipments)) return false;
        return this.equalKeys(other) && ((OrderShipments)other).equalKeys(this);
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
        i = getOrderShipmentId();
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
        StringBuffer sb = new StringBuffer("[OrderShipments |");
        sb.append(" orderShipmentId=").append(getOrderShipmentId());
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
        ret.put("orderShipmentId", Integer.valueOf(getOrderShipmentId()));
        return ret;
    }

}
