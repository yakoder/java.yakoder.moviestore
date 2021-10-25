// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="customers", indexes={@Index(name="customersCustomersCustCityStateIdx", columnList="cust_city,cust_state"), @Index(name="customersCustomersCustNameFirstLastIdx", columnList="cust_name_first,cust_name_last")})
public class Customers implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6980817929799829094L;

	/** Primary key. */
    protected static final String PK = "customerId";

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
    @Column(name="cust_id", unique=true, nullable=false, precision=10)
    private int customerId;
    @Column(name="cust_email", nullable=false, length=255)
    private String customerEmail;
    @Column(name="cust_name_first", length=100)
    private String customerNameFirst;
    @Column(name="cust_name_last", length=100)
    private String customerNameLast;
    @Column(name="cust_addr_1", length=100)
    private String customerAddr1;
    @Column(name="cust_addr_2", length=100)
    private String customerAddr2;
    @Column(name="cust_city", length=100)
    private String customerCity;
    @Column(name="cust_state", length=2)
    private String customerState;
    @Column(name="cust_zip", length=10)
    private String customerZip;
    @Column(name="cust_country", length=2)
    private String customerCountry;
    @OneToMany(mappedBy="customers")
    private Set<Orders> orders;
    @OneToMany(mappedBy="customers")
    private Set<StoreCustomers> storeCustomers;

    /** Default constructor. */
    public Customers() {
        super();
    }

    /**
     * Access method for customerId.
     *
     * @return the current value of customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Setter method for customerId.
     *
     * @param aCustomerId the new value for customerId
     */
    public void setCustomerId(int aCustomerId) {
        customerId = aCustomerId;
    }

    /**
     * Access method for customerEmail.
     *
     * @return the current value of customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Setter method for customerEmail.
     *
     * @param aCustomerEmail the new value for customerEmail
     */
    public void setCustomerEmail(String aCustomerEmail) {
        customerEmail = aCustomerEmail;
    }

    /**
     * Access method for customerNameFirst.
     *
     * @return the current value of customerNameFirst
     */
    public String getCustomerNameFirst() {
        return customerNameFirst;
    }

    /**
     * Setter method for customerNameFirst.
     *
     * @param aCustomerNameFirst the new value for customerNameFirst
     */
    public void setCustomerNameFirst(String aCustomerNameFirst) {
        customerNameFirst = aCustomerNameFirst;
    }

    /**
     * Access method for customerNameLast.
     *
     * @return the current value of customerNameLast
     */
    public String getCustomerNameLast() {
        return customerNameLast;
    }

    /**
     * Setter method for customerNameLast.
     *
     * @param aCustomerNameLast the new value for customerNameLast
     */
    public void setCustomerNameLast(String aCustomerNameLast) {
        customerNameLast = aCustomerNameLast;
    }

    /**
     * Access method for customerAddr1.
     *
     * @return the current value of customerAddr1
     */
    public String getCustomerAddr1() {
        return customerAddr1;
    }

    /**
     * Setter method for customerAddr1.
     *
     * @param aCustomerAddr1 the new value for customerAddr1
     */
    public void setCustomerAddr1(String aCustomerAddr1) {
        customerAddr1 = aCustomerAddr1;
    }

    /**
     * Access method for customerAddr2.
     *
     * @return the current value of customerAddr2
     */
    public String getCustomerAddr2() {
        return customerAddr2;
    }

    /**
     * Setter method for customerAddr2.
     *
     * @param aCustomerAddr2 the new value for customerAddr2
     */
    public void setCustomerAddr2(String aCustomerAddr2) {
        customerAddr2 = aCustomerAddr2;
    }

    /**
     * Access method for customerCity.
     *
     * @return the current value of customerCity
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Setter method for customerCity.
     *
     * @param aCustomerCity the new value for customerCity
     */
    public void setCustomerCity(String aCustomerCity) {
        customerCity = aCustomerCity;
    }

    /**
     * Access method for customerState.
     *
     * @return the current value of customerState
     */
    public String getCustomerState() {
        return customerState;
    }

    /**
     * Setter method for customerState.
     *
     * @param aCustomerState the new value for customerState
     */
    public void setCustomerState(String aCustomerState) {
        customerState = aCustomerState;
    }

    /**
     * Access method for customerZip.
     *
     * @return the current value of customerZip
     */
    public String getCustomerZip() {
        return customerZip;
    }

    /**
     * Setter method for customerZip.
     *
     * @param aCustomerZip the new value for customerZip
     */
    public void setCustomerZip(String aCustomerZip) {
        customerZip = aCustomerZip;
    }

    /**
     * Access method for customerCountry.
     *
     * @return the current value of customerCountry
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Setter method for customerCountry.
     *
     * @param aCustomerCountry the new value for customerCountry
     */
    public void setCustomerCountry(String aCustomerCountry) {
        customerCountry = aCustomerCountry;
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
     * Compares the key for this instance with another Customers.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Customers and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Customers)) {
            return false;
        }
        Customers that = (Customers) other;
        if (this.getCustomerId() != that.getCustomerId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Customers.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Customers)) return false;
        return this.equalKeys(other) && ((Customers)other).equalKeys(this);
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
        i = getCustomerId();
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
        StringBuffer sb = new StringBuffer("[Customers |");
        sb.append(" customerId=").append(getCustomerId());
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
        ret.put("customerId", Integer.valueOf(getCustomerId()));
        return ret;
    }

}
