// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.inventory.Inventory;

@Entity(name="order_movies")
public class OrderMovies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2442036991621160193L;

	/** Primary key. */
    protected static final String PK = "orderMovieId";

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
    @Column(name="order_movie_id", unique=true, nullable=false, precision=10)
    private int orderMovieId;
    @Column(name="price_paid", precision=15, scale=2)
    private BigDecimal pricePaid;
    @Column(name="shipping_credit", precision=15, scale=2)
    private BigDecimal shippingCredit;
    @Column(name="is_bonus", length=3)
    private boolean isBonus;
    @Column(name="store_fees", length=100)
    private String storeFees;
    @Column(name="total_due", precision=15, scale=2)
    private BigDecimal totalDue;
    @OneToMany(mappedBy="orderMovies")
    private Set<AdjustmentMovies> adjustmentMovies;
    @ManyToOne(optional=false)
    @JoinColumn(name="inv_id", nullable=false)
    private Inventory inventory;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_id", nullable=false)
    private Orders orders;

    /** Default constructor. */
    public OrderMovies() {
        super();
    }

    /**
     * Access method for orderMovieId.
     *
     * @return the current value of orderMovieId
     */
    public int getOrderMovieId() {
        return orderMovieId;
    }

    /**
     * Setter method for orderMovieId.
     *
     * @param aOrderMovieId the new value for orderMovieId
     */
    public void setOrderMovieId(int aOrderMovieId) {
        orderMovieId = aOrderMovieId;
    }

    /**
     * Access method for pricePaid.
     *
     * @return the current value of pricePaid
     */
    public BigDecimal getPricePaid() {
        return pricePaid;
    }

    /**
     * Setter method for pricePaid.
     *
     * @param aPricePaid the new value for pricePaid
     */
    public void setPricePaid(BigDecimal aPricePaid) {
        pricePaid = aPricePaid;
    }

    /**
     * Access method for shippingCredit.
     *
     * @return the current value of shippingCredit
     */
    public BigDecimal getShippingCredit() {
        return shippingCredit;
    }

    /**
     * Setter method for shippingCredit.
     *
     * @param aShippingCredit the new value for shippingCredit
     */
    public void setShippingCredit(BigDecimal aShippingCredit) {
        shippingCredit = aShippingCredit;
    }

    /**
     * Access method for isBonus.
     *
     * @return true if and only if isBonus is currently true
     */
    public boolean isIsBonus() {
        return isBonus;
    }

    /**
     * Setter method for isBonus.
     *
     * @param aIsBonus the new value for isBonus
     */
    public void setIsBonus(boolean aIsBonus) {
        isBonus = aIsBonus;
    }

    /**
     * Access method for storeFees.
     *
     * @return the current value of storeFees
     */
    public String getStoreFees() {
        return storeFees;
    }

    /**
     * Setter method for storeFees.
     *
     * @param aStoreFees the new value for storeFees
     */
    public void setStoreFees(String aStoreFees) {
        storeFees = aStoreFees;
    }

    /**
     * Access method for totalDue.
     *
     * @return the current value of totalDue
     */
    public BigDecimal getTotalDue() {
        return totalDue;
    }

    /**
     * Setter method for totalDue.
     *
     * @param aTotalDue the new value for totalDue
     */
    public void setTotalDue(BigDecimal aTotalDue) {
        totalDue = aTotalDue;
    }

    /**
     * Access method for adjustmentMovies.
     *
     * @return the current value of adjustmentMovies
     */
    public Set<AdjustmentMovies> getAdjustmentMovies() {
        return adjustmentMovies;
    }

    /**
     * Setter method for adjustmentMovies.
     *
     * @param aAdjustmentMovies the new value for adjustmentMovies
     */
    public void setAdjustmentMovies(Set<AdjustmentMovies> aAdjustmentMovies) {
        adjustmentMovies = aAdjustmentMovies;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Inventory aInventory) {
        inventory = aInventory;
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
     * Compares the key for this instance with another OrderMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderMovies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderMovies)) {
            return false;
        }
        OrderMovies that = (OrderMovies) other;
        if (this.getOrderMovieId() != that.getOrderMovieId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderMovies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderMovies)) return false;
        return this.equalKeys(other) && ((OrderMovies)other).equalKeys(this);
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
        i = getOrderMovieId();
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
        StringBuffer sb = new StringBuffer("[OrderMovies |");
        sb.append(" orderMovieId=").append(getOrderMovieId());
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
        ret.put("orderMovieId", Integer.valueOf(getOrderMovieId()));
        return ret;
    }

}
