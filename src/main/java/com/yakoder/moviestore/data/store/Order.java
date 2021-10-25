// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
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
@Table(name="orders", indexes={@Index(name="orders_store_order_num_IX", columnList="store_order_num", unique=true)})
public class Order implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8355458475337600265L;

	/** Primary key. */
    protected static final String PK = "orderId";

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
    @Column(name="order_id", unique=true, nullable=false, precision=10)
    private int orderId;
    @Column(name="store_order_num", unique=true, nullable=false, length=100)
    private String storeOrderNum;
    @Column(name="order_date")
    private LocalDate orderDate;
    @OneToMany(mappedBy="orders")
    private Set<CustomerFeedback> customerFeedback;
    @OneToMany(mappedBy="orders")
    private Set<ExpenseShipping> expShipping;
    @OneToMany(mappedBy="orders")
    private Set<OrderAdjustment> orderAdjustments;
    @OneToMany(mappedBy="orders")
    private Set<OrderMovie> orderMovies;
    @ManyToOne
    @JoinColumn(name="cust_id")
    private Customer customers;
    @ManyToOne
    @JoinColumn(name="order_ship_id")
    private OrderShipment orderShipments;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_ship_id", nullable=false)
    private StoreShipping storeShipping;
    @ManyToOne
    @JoinColumn(name="store_site_id")
    private StoreSite storeSites;

    /** Default constructor. */
    public Order() {
        super();
    }

    /**
     * Access method for orderId.
     *
     * @return the current value of orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Setter method for orderId.
     *
     * @param aOrderId the new value for orderId
     */
    public void setOrderId(int aOrderId) {
        orderId = aOrderId;
    }

    /**
     * Access method for storeOrderNum.
     *
     * @return the current value of storeOrderNum
     */
    public String getStoreOrderNum() {
        return storeOrderNum;
    }

    /**
     * Setter method for storeOrderNum.
     *
     * @param aStoreOrderNum the new value for storeOrderNum
     */
    public void setStoreOrderNum(String aStoreOrderNum) {
        storeOrderNum = aStoreOrderNum;
    }

    /**
     * Access method for orderDate.
     *
     * @return the current value of orderDate
     */
    public LocalDate getOrderDate() {
        return orderDate;
    }

    /**
     * Setter method for orderDate.
     *
     * @param aOrderDate the new value for orderDate
     */
    public void setOrderDate(LocalDate aOrderDate) {
        orderDate = aOrderDate;
    }

    /**
     * Access method for customerFeedback.
     *
     * @return the current value of customerFeedback
     */
    public Set<CustomerFeedback> getCustomerFeedback() {
        return customerFeedback;
    }

    /**
     * Setter method for customerFeedback.
     *
     * @param aCustomerFeedback the new value for customerFeedback
     */
    public void setCustomerFeedback(Set<CustomerFeedback> aCustomerFeedback) {
        customerFeedback = aCustomerFeedback;
    }

    /**
     * Access method for expShipping.
     *
     * @return the current value of expShipping
     */
    public Set<ExpenseShipping> getExpShipping() {
        return expShipping;
    }

    /**
     * Setter method for expShipping.
     *
     * @param aExpShipping the new value for expShipping
     */
    public void setExpShipping(Set<ExpenseShipping> aExpShipping) {
        expShipping = aExpShipping;
    }

    /**
     * Access method for orderAdjustments.
     *
     * @return the current value of orderAdjustments
     */
    public Set<OrderAdjustment> getOrderAdjustments() {
        return orderAdjustments;
    }

    /**
     * Setter method for orderAdjustments.
     *
     * @param aOrderAdjustments the new value for orderAdjustments
     */
    public void setOrderAdjustments(Set<OrderAdjustment> aOrderAdjustments) {
        orderAdjustments = aOrderAdjustments;
    }

    /**
     * Access method for orderMovies.
     *
     * @return the current value of orderMovies
     */
    public Set<OrderMovie> getOrderMovies() {
        return orderMovies;
    }

    /**
     * Setter method for orderMovies.
     *
     * @param aOrderMovies the new value for orderMovies
     */
    public void setOrderMovies(Set<OrderMovie> aOrderMovies) {
        orderMovies = aOrderMovies;
    }

    /**
     * Access method for customers.
     *
     * @return the current value of customers
     */
    public Customer getCustomers() {
        return customers;
    }

    /**
     * Setter method for customers.
     *
     * @param aCustomers the new value for customers
     */
    public void setCustomers(Customer aCustomers) {
        customers = aCustomers;
    }

    /**
     * Access method for orderShipments.
     *
     * @return the current value of orderShipments
     */
    public OrderShipment getOrderShipments() {
        return orderShipments;
    }

    /**
     * Setter method for orderShipments.
     *
     * @param aOrderShipments the new value for orderShipments
     */
    public void setOrderShipments(OrderShipment aOrderShipments) {
        orderShipments = aOrderShipments;
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
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public StoreSite getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(StoreSite aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Compares the key for this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Orders and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order that = (Order) other;
        if (this.getOrderId() != that.getOrderId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Order)) return false;
        return this.equalKeys(other) && ((Order)other).equalKeys(this);
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
        i = getOrderId();
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
        StringBuffer sb = new StringBuffer("[Orders |");
        sb.append(" orderId=").append(getOrderId());
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
        ret.put("orderId", Integer.valueOf(getOrderId()));
        return ret;
    }

}
