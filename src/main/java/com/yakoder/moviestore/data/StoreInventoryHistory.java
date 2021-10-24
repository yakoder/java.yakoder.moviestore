// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="store_inv_history")
public class StoreInventoryHistory implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3445458426987158411L;

	/** Primary key. */
    protected static final String PK = "storeInvHistId";

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
    @Column(name="store_inv_hist_id", unique=true, nullable=false, precision=10)
    private int storeInvHistId;
    @Column(name="listed_date", nullable=false)
    private LocalDate listedDate;
    @Column(name="unlisted_date")
    private LocalDate unlistedDate;
    @Column(name="listed_price", nullable=false, precision=15, scale=2)
    private BigDecimal listedPrice;
    @Column(name="retail_price_store", precision=15, scale=2)
    private BigDecimal retailPriceStore;
    @Column(name="retail_price_other", precision=15, scale=2)
    private BigDecimal retailPriceOther;
    @Column(name="download_price", precision=15, scale=2)
    private BigDecimal downloadPrice;
    @Column(name="used_price", precision=15, scale=2)
    private BigDecimal usedPrice;
    @Column(name="base_price", nullable=false, precision=15, scale=2)
    private BigDecimal basePrice;
    @Column(name="price_adjustment", nullable=false, precision=15, scale=2)
    private BigDecimal priceAdjustment;
    @Column(name="calcd_price", nullable=false, precision=15, scale=2)
    private BigDecimal calcdPrice;
    @Column(name="price_override", precision=15, scale=2)
    private BigDecimal priceOverride;
    @Column(name="calcd_fees", nullable=false, precision=15, scale=2)
    private BigDecimal calcdFees;
    @Column(name="calcd_net", precision=15, scale=2)
    private BigDecimal calcdNet;
    @Column(name="listing_comments", nullable=false, length=255)
    private String listingComments;
    @ManyToOne
    @JoinColumn(name="override_reason_id")
    private PriceOverrideReasons priceOverrideReasons;
    @ManyToOne
    @JoinColumn(name="store_bonus_id")
    private StoreBonuses storeBonuses;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_inv_id", nullable=false)
    private StoreInventory storeInventory;
    @ManyToOne
    @JoinColumn(name="unlisted_reason_id")
    private UnlistedReasons unlistedReasons;

    /** Default constructor. */
    public StoreInventoryHistory() {
        super();
    }

    /**
     * Access method for storeInvHistId.
     *
     * @return the current value of storeInvHistId
     */
    public int getStoreInvHistId() {
        return storeInvHistId;
    }

    /**
     * Setter method for storeInvHistId.
     *
     * @param aStoreInvHistId the new value for storeInvHistId
     */
    public void setStoreInvHistId(int aStoreInvHistId) {
        storeInvHistId = aStoreInvHistId;
    }

    /**
     * Access method for listedDate.
     *
     * @return the current value of listedDate
     */
    public LocalDate getListedDate() {
        return listedDate;
    }

    /**
     * Setter method for listedDate.
     *
     * @param aListedDate the new value for listedDate
     */
    public void setListedDate(LocalDate aListedDate) {
        listedDate = aListedDate;
    }

    /**
     * Access method for unlistedDate.
     *
     * @return the current value of unlistedDate
     */
    public LocalDate getUnlistedDate() {
        return unlistedDate;
    }

    /**
     * Setter method for unlistedDate.
     *
     * @param aUnlistedDate the new value for unlistedDate
     */
    public void setUnlistedDate(LocalDate aUnlistedDate) {
        unlistedDate = aUnlistedDate;
    }

    /**
     * Access method for listedPrice.
     *
     * @return the current value of listedPrice
     */
    public BigDecimal getListedPrice() {
        return listedPrice;
    }

    /**
     * Setter method for listedPrice.
     *
     * @param aListedPrice the new value for listedPrice
     */
    public void setListedPrice(BigDecimal aListedPrice) {
        listedPrice = aListedPrice;
    }

    /**
     * Access method for retailPriceStore.
     *
     * @return the current value of retailPriceStore
     */
    public BigDecimal getRetailPriceStore() {
        return retailPriceStore;
    }

    /**
     * Setter method for retailPriceStore.
     *
     * @param aRetailPriceStore the new value for retailPriceStore
     */
    public void setRetailPriceStore(BigDecimal aRetailPriceStore) {
        retailPriceStore = aRetailPriceStore;
    }

    /**
     * Access method for retailPriceOther.
     *
     * @return the current value of retailPriceOther
     */
    public BigDecimal getRetailPriceOther() {
        return retailPriceOther;
    }

    /**
     * Setter method for retailPriceOther.
     *
     * @param aRetailPriceOther the new value for retailPriceOther
     */
    public void setRetailPriceOther(BigDecimal aRetailPriceOther) {
        retailPriceOther = aRetailPriceOther;
    }

    /**
     * Access method for downloadPrice.
     *
     * @return the current value of downloadPrice
     */
    public BigDecimal getDownloadPrice() {
        return downloadPrice;
    }

    /**
     * Setter method for downloadPrice.
     *
     * @param aDownloadPrice the new value for downloadPrice
     */
    public void setDownloadPrice(BigDecimal aDownloadPrice) {
        downloadPrice = aDownloadPrice;
    }

    /**
     * Access method for usedPrice.
     *
     * @return the current value of usedPrice
     */
    public BigDecimal getUsedPrice() {
        return usedPrice;
    }

    /**
     * Setter method for usedPrice.
     *
     * @param aUsedPrice the new value for usedPrice
     */
    public void setUsedPrice(BigDecimal aUsedPrice) {
        usedPrice = aUsedPrice;
    }

    /**
     * Access method for basePrice.
     *
     * @return the current value of basePrice
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Setter method for basePrice.
     *
     * @param aBasePrice the new value for basePrice
     */
    public void setBasePrice(BigDecimal aBasePrice) {
        basePrice = aBasePrice;
    }

    /**
     * Access method for priceAdjustment.
     *
     * @return the current value of priceAdjustment
     */
    public BigDecimal getPriceAdjustment() {
        return priceAdjustment;
    }

    /**
     * Setter method for priceAdjustment.
     *
     * @param aPriceAdjustment the new value for priceAdjustment
     */
    public void setPriceAdjustment(BigDecimal aPriceAdjustment) {
        priceAdjustment = aPriceAdjustment;
    }

    /**
     * Access method for calcdPrice.
     *
     * @return the current value of calcdPrice
     */
    public BigDecimal getCalcdPrice() {
        return calcdPrice;
    }

    /**
     * Setter method for calcdPrice.
     *
     * @param aCalcdPrice the new value for calcdPrice
     */
    public void setCalcdPrice(BigDecimal aCalcdPrice) {
        calcdPrice = aCalcdPrice;
    }

    /**
     * Access method for priceOverride.
     *
     * @return the current value of priceOverride
     */
    public BigDecimal getPriceOverride() {
        return priceOverride;
    }

    /**
     * Setter method for priceOverride.
     *
     * @param aPriceOverride the new value for priceOverride
     */
    public void setPriceOverride(BigDecimal aPriceOverride) {
        priceOverride = aPriceOverride;
    }

    /**
     * Access method for calcdFees.
     *
     * @return the current value of calcdFees
     */
    public BigDecimal getCalcdFees() {
        return calcdFees;
    }

    /**
     * Setter method for calcdFees.
     *
     * @param aCalcdFees the new value for calcdFees
     */
    public void setCalcdFees(BigDecimal aCalcdFees) {
        calcdFees = aCalcdFees;
    }

    /**
     * Access method for calcdNet.
     *
     * @return the current value of calcdNet
     */
    public BigDecimal getCalcdNet() {
        return calcdNet;
    }

    /**
     * Setter method for calcdNet.
     *
     * @param aCalcdNet the new value for calcdNet
     */
    public void setCalcdNet(BigDecimal aCalcdNet) {
        calcdNet = aCalcdNet;
    }

    /**
     * Access method for listingComments.
     *
     * @return the current value of listingComments
     */
    public String getListingComments() {
        return listingComments;
    }

    /**
     * Setter method for listingComments.
     *
     * @param aListingComments the new value for listingComments
     */
    public void setListingComments(String aListingComments) {
        listingComments = aListingComments;
    }

    /**
     * Access method for priceOverrideReasons.
     *
     * @return the current value of priceOverrideReasons
     */
    public PriceOverrideReasons getPriceOverrideReasons() {
        return priceOverrideReasons;
    }

    /**
     * Setter method for priceOverrideReasons.
     *
     * @param aPriceOverrideReasons the new value for priceOverrideReasons
     */
    public void setPriceOverrideReasons(PriceOverrideReasons aPriceOverrideReasons) {
        priceOverrideReasons = aPriceOverrideReasons;
    }

    /**
     * Access method for storeBonuses.
     *
     * @return the current value of storeBonuses
     */
    public StoreBonuses getStoreBonuses() {
        return storeBonuses;
    }

    /**
     * Setter method for storeBonuses.
     *
     * @param aStoreBonuses the new value for storeBonuses
     */
    public void setStoreBonuses(StoreBonuses aStoreBonuses) {
        storeBonuses = aStoreBonuses;
    }

    /**
     * Access method for storeInventory.
     *
     * @return the current value of storeInventory
     */
    public StoreInventory getStoreInventory() {
        return storeInventory;
    }

    /**
     * Setter method for storeInventory.
     *
     * @param aStoreInventory the new value for storeInventory
     */
    public void setStoreInventory(StoreInventory aStoreInventory) {
        storeInventory = aStoreInventory;
    }

    /**
     * Access method for unlistedReasons.
     *
     * @return the current value of unlistedReasons
     */
    public UnlistedReasons getUnlistedReasons() {
        return unlistedReasons;
    }

    /**
     * Setter method for unlistedReasons.
     *
     * @param aUnlistedReasons the new value for unlistedReasons
     */
    public void setUnlistedReasons(UnlistedReasons aUnlistedReasons) {
        unlistedReasons = aUnlistedReasons;
    }

    /**
     * Compares the key for this instance with another StoreInventoryHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreInventoryHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreInventoryHistory)) {
            return false;
        }
        StoreInventoryHistory that = (StoreInventoryHistory) other;
        if (this.getStoreInvHistId() != that.getStoreInvHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreInventoryHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreInventoryHistory)) return false;
        return this.equalKeys(other) && ((StoreInventoryHistory)other).equalKeys(this);
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
        i = getStoreInvHistId();
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
        StringBuffer sb = new StringBuffer("[StoreInventoryHistory |");
        sb.append(" storeInvHistId=").append(getStoreInvHistId());
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
        ret.put("storeInvHistId", Integer.valueOf(getStoreInvHistId()));
        return ret;
    }

}
