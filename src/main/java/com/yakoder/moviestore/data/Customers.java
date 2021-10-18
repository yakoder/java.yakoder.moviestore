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
    protected static final String PK = "custId";

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
    private int custId;
    @Column(name="cust_email", nullable=false, length=255)
    private String custEmail;
    @Column(name="cust_name_first", length=100)
    private String custNameFirst;
    @Column(name="cust_name_last", length=100)
    private String custNameLast;
    @Column(name="cust_addr_1", length=100)
    private String custAddr1;
    @Column(name="cust_addr_2", length=100)
    private String custAddr2;
    @Column(name="cust_city", length=100)
    private String custCity;
    @Column(name="cust_state", length=2)
    private String custState;
    @Column(name="cust_zip", length=10)
    private String custZip;
    @Column(name="cust_country", length=2)
    private String custCountry;
    @OneToMany(mappedBy="customers")
    private Set<Orders> orders;
    @OneToMany(mappedBy="customers")
    private Set<StoreCustomers> storeCustomers;

    /** Default constructor. */
    public Customers() {
        super();
    }

    /**
     * Access method for custId.
     *
     * @return the current value of custId
     */
    public int getCustId() {
        return custId;
    }

    /**
     * Setter method for custId.
     *
     * @param aCustId the new value for custId
     */
    public void setCustId(int aCustId) {
        custId = aCustId;
    }

    /**
     * Access method for custEmail.
     *
     * @return the current value of custEmail
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * Setter method for custEmail.
     *
     * @param aCustEmail the new value for custEmail
     */
    public void setCustEmail(String aCustEmail) {
        custEmail = aCustEmail;
    }

    /**
     * Access method for custNameFirst.
     *
     * @return the current value of custNameFirst
     */
    public String getCustNameFirst() {
        return custNameFirst;
    }

    /**
     * Setter method for custNameFirst.
     *
     * @param aCustNameFirst the new value for custNameFirst
     */
    public void setCustNameFirst(String aCustNameFirst) {
        custNameFirst = aCustNameFirst;
    }

    /**
     * Access method for custNameLast.
     *
     * @return the current value of custNameLast
     */
    public String getCustNameLast() {
        return custNameLast;
    }

    /**
     * Setter method for custNameLast.
     *
     * @param aCustNameLast the new value for custNameLast
     */
    public void setCustNameLast(String aCustNameLast) {
        custNameLast = aCustNameLast;
    }

    /**
     * Access method for custAddr1.
     *
     * @return the current value of custAddr1
     */
    public String getCustAddr1() {
        return custAddr1;
    }

    /**
     * Setter method for custAddr1.
     *
     * @param aCustAddr1 the new value for custAddr1
     */
    public void setCustAddr1(String aCustAddr1) {
        custAddr1 = aCustAddr1;
    }

    /**
     * Access method for custAddr2.
     *
     * @return the current value of custAddr2
     */
    public String getCustAddr2() {
        return custAddr2;
    }

    /**
     * Setter method for custAddr2.
     *
     * @param aCustAddr2 the new value for custAddr2
     */
    public void setCustAddr2(String aCustAddr2) {
        custAddr2 = aCustAddr2;
    }

    /**
     * Access method for custCity.
     *
     * @return the current value of custCity
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * Setter method for custCity.
     *
     * @param aCustCity the new value for custCity
     */
    public void setCustCity(String aCustCity) {
        custCity = aCustCity;
    }

    /**
     * Access method for custState.
     *
     * @return the current value of custState
     */
    public String getCustState() {
        return custState;
    }

    /**
     * Setter method for custState.
     *
     * @param aCustState the new value for custState
     */
    public void setCustState(String aCustState) {
        custState = aCustState;
    }

    /**
     * Access method for custZip.
     *
     * @return the current value of custZip
     */
    public String getCustZip() {
        return custZip;
    }

    /**
     * Setter method for custZip.
     *
     * @param aCustZip the new value for custZip
     */
    public void setCustZip(String aCustZip) {
        custZip = aCustZip;
    }

    /**
     * Access method for custCountry.
     *
     * @return the current value of custCountry
     */
    public String getCustCountry() {
        return custCountry;
    }

    /**
     * Setter method for custCountry.
     *
     * @param aCustCountry the new value for custCountry
     */
    public void setCustCountry(String aCustCountry) {
        custCountry = aCustCountry;
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
        if (this.getCustId() != that.getCustId()) {
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
        i = getCustId();
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
        sb.append(" custId=").append(getCustId());
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
        ret.put("custId", Integer.valueOf(getCustId()));
        return ret;
    }

}
