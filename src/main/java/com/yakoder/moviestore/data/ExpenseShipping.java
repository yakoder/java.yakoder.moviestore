// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="exp_shipping")
public class ExpShipping implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3253605039341342983L;

	/** Primary key. */
    protected static final String PK = "expDetailId";

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
    @Column(name="exp_detail_id", unique=true, nullable=false, precision=10)
    private int expDetailId;
    @Column(name="postage_cost", precision=15, scale=2)
    private BigDecimal postageCost;
    @Column(name="insurance_cost", precision=15, scale=2)
    private BigDecimal insuranceCost;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_id", nullable=false)
    private Orders orders;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_meth_id", nullable=false)
    private ShippingMethods shippingMethods;

    /** Default constructor. */
    public ExpShipping() {
        super();
    }

    /**
     * Access method for expDetailId.
     *
     * @return the current value of expDetailId
     */
    public int getExpDetailId() {
        return expDetailId;
    }

    /**
     * Setter method for expDetailId.
     *
     * @param aExpDetailId the new value for expDetailId
     */
    public void setExpDetailId(int aExpDetailId) {
        expDetailId = aExpDetailId;
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
     * Access method for orders.
     *
     * @return the current value of orders
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Setter method for orders.
     *
     * @param aOrders the new value for orders
     */
    public void setOrders(Orders aOrders) {
        orders = aOrders;
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
     * Compares the key for this instance with another ExpShipping.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpShipping and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpShipping)) {
            return false;
        }
        ExpShipping that = (ExpShipping) other;
        if (this.getExpDetailId() != that.getExpDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpShipping.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpShipping)) return false;
        return this.equalKeys(other) && ((ExpShipping)other).equalKeys(this);
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
        i = getExpDetailId();
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
        StringBuffer sb = new StringBuffer("[ExpShipping |");
        sb.append(" expDetailId=").append(getExpDetailId());
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
        ret.put("expDetailId", Integer.valueOf(getExpDetailId()));
        return ret;
    }

}
