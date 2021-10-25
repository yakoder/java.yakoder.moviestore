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

@Entity(name="exp_movies")
public class ExpenseMovies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8720429085115299000L;

	/** Primary key. */
    protected static final String PK = "expenseDetailId";

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
    private int expenseDetailId;
    @Column(name="store_order_num", length=100)
    private String storeOrderNumber;
    @Column(name="store_txn_num", length=100)
    private String storeTransactionNumber;
    @Column(name="store_seller", length=100)
    private String storeSeller;
    @Column(name="item_price", precision=15, scale=2)
    private BigDecimal itemPrice;
    @Column(name="ship_cost", precision=15, scale=2)
    private BigDecimal shippingCost;
    @Column(name="had_case_art", nullable=false, length=3)
    private boolean hadCaseAndArt;
    @ManyToOne
    @JoinColumn(name="cond_id")
    private Conditions conditions;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movies;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_site_id", nullable=false)
    private StoreSites storeSites;

    /** Default constructor. */
    public ExpenseMovies() {
        super();
    }

    /**
     * Access method for expenseDetailId.
     *
     * @return the current value of expenseDetailId
     */
    public int getExpenseDetailId() {
        return expenseDetailId;
    }

    /**
     * Setter method for expenseDetailId.
     *
     * @param aExpenseDetailId the new value for expenseDetailId
     */
    public void setExpenseDetailId(int aExpenseDetailId) {
        expenseDetailId = aExpenseDetailId;
    }

    /**
     * Access method for storeOrderNumber.
     *
     * @return the current value of storeOrderNumber
     */
    public String getStoreOrderNumber() {
        return storeOrderNumber;
    }

    /**
     * Setter method for storeOrderNumber.
     *
     * @param aStoreOrderNumber the new value for storeOrderNumber
     */
    public void setStoreOrderNumber(String aStoreOrderNumber) {
        storeOrderNumber = aStoreOrderNumber;
    }

    /**
     * Access method for storeTransactionNumber.
     *
     * @return the current value of storeTransactionNumber
     */
    public String getStoreTransactionNumber() {
        return storeTransactionNumber;
    }

    /**
     * Setter method for storeTransactionNumber.
     *
     * @param aStoreTransactionNumber the new value for storeTransactionNumber
     */
    public void setStoreTransactionNumber(String aStoreTransactionNumber) {
        storeTransactionNumber = aStoreTransactionNumber;
    }

    /**
     * Access method for storeSeller.
     *
     * @return the current value of storeSeller
     */
    public String getStoreSeller() {
        return storeSeller;
    }

    /**
     * Setter method for storeSeller.
     *
     * @param aStoreSeller the new value for storeSeller
     */
    public void setStoreSeller(String aStoreSeller) {
        storeSeller = aStoreSeller;
    }

    /**
     * Access method for itemPrice.
     *
     * @return the current value of itemPrice
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * Setter method for itemPrice.
     *
     * @param aItemPrice the new value for itemPrice
     */
    public void setItemPrice(BigDecimal aItemPrice) {
        itemPrice = aItemPrice;
    }

    /**
     * Access method for shippingCost.
     *
     * @return the current value of shippingCost
     */
    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    /**
     * Setter method for shippingCost.
     *
     * @param aShippingCost the new value for shippingCost
     */
    public void setShippingCost(BigDecimal aShippingCost) {
        shippingCost = aShippingCost;
    }

    /**
     * Access method for hadCaseAndArt.
     *
     * @return true if and only if hadCaseAndArt is currently true
     */
    public boolean isHadCaseAndArt() {
        return hadCaseAndArt;
    }

    /**
     * Setter method for hadCaseAndArt.
     *
     * @param aHadCaseAndArt the new value for hadCaseAndArt
     */
    public void setHadCaseAndArt(boolean aHadCaseAndArt) {
        hadCaseAndArt = aHadCaseAndArt;
    }

    /**
     * Access method for conditions.
     *
     * @return the current value of conditions
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * Setter method for conditions.
     *
     * @param aConditions the new value for conditions
     */
    public void setConditions(Conditions aConditions) {
        conditions = aConditions;
    }

    /**
     * Access method for movies.
     *
     * @return the current value of movies
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * Setter method for movies.
     *
     * @param aMovies the new value for movies
     */
    public void setMovies(Movies aMovies) {
        movies = aMovies;
    }

    /**
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public StoreSites getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(StoreSites aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Compares the key for this instance with another ExpenseMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpenseMovies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpenseMovies)) {
            return false;
        }
        ExpenseMovies that = (ExpenseMovies) other;
        if (this.getExpenseDetailId() != that.getExpenseDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpenseMovies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpenseMovies)) return false;
        return this.equalKeys(other) && ((ExpenseMovies)other).equalKeys(this);
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
        i = getExpenseDetailId();
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
        StringBuffer sb = new StringBuffer("[ExpenseMovies |");
        sb.append(" expenseDetailId=").append(getExpenseDetailId());
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
        ret.put("expenseDetailId", Integer.valueOf(getExpenseDetailId()));
        return ret;
    }

}
