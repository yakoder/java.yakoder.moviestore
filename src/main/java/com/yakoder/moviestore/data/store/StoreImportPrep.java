// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.yakoder.moviestore.data.inventory.ExternalId;

@Entity(name="store_import_prep")
public class StoreImportPrep implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8309989582218160457L;

	/** Primary key. */
    protected static final String PK = "storeImportPrepId";

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
    @Column(name="store_import_prep_id", unique=true, nullable=false, precision=10)
    private int storeImportPrepId;
    @Column(name="cond_name", nullable=false, length=100)
    private String condName;
    @Column(name="listing_comments", nullable=false, length=255)
    private String listingComments;
    @Column(name="listed_price", nullable=false, precision=15, scale=2)
    private BigDecimal listedPrice;
    @Column(nullable=false, precision=10)
    private int quantity;
    @OneToOne(optional=false, mappedBy="storeImportPrep")
    @JoinColumn(name="ext_id_name", nullable=false)
    private ExternalId externalIds;
    @OneToOne(optional=false, mappedBy="storeImportPrep")
    @JoinColumn(name="store_movie_num", nullable=false)
    private StoreInventory storeInventory;

    /** Default constructor. */
    public StoreImportPrep() {
        super();
    }

    /**
     * Access method for storeImportPrepId.
     *
     * @return the current value of storeImportPrepId
     */
    public int getStoreImportPrepId() {
        return storeImportPrepId;
    }

    /**
     * Setter method for storeImportPrepId.
     *
     * @param aStoreImportPrepId the new value for storeImportPrepId
     */
    public void setStoreImportPrepId(int aStoreImportPrepId) {
        storeImportPrepId = aStoreImportPrepId;
    }

    /**
     * Access method for condName.
     *
     * @return the current value of condName
     */
    public String getCondName() {
        return condName;
    }

    /**
     * Setter method for condName.
     *
     * @param aCondName the new value for condName
     */
    public void setCondName(String aCondName) {
        condName = aCondName;
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
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * Access method for externalIds.
     *
     * @return the current value of externalIds
     */
    public ExternalId getExternalIds() {
        return externalIds;
    }

    /**
     * Setter method for externalIds.
     *
     * @param aExternalIds the new value for externalIds
     */
    public void setExternalIds(ExternalId aExternalIds) {
        externalIds = aExternalIds;
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
     * Compares the key for this instance with another StoreImportPrep.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreImportPrep and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreImportPrep)) {
            return false;
        }
        StoreImportPrep that = (StoreImportPrep) other;
        if (this.getStoreImportPrepId() != that.getStoreImportPrepId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreImportPrep.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreImportPrep)) return false;
        return this.equalKeys(other) && ((StoreImportPrep)other).equalKeys(this);
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
        i = getStoreImportPrepId();
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
        StringBuffer sb = new StringBuffer("[StoreImportPrep |");
        sb.append(" storeImportPrepId=").append(getStoreImportPrepId());
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
        ret.put("storeImportPrepId", Integer.valueOf(getStoreImportPrepId()));
        return ret;
    }

}
