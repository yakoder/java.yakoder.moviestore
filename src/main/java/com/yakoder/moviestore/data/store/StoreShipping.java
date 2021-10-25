// Generated with g9.

package com.yakoder.moviestore.data.store;

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
@Table(name="store_shipping", indexes={@Index(name="storeShippingStoreShippingStoreSiteIdCodeAddlcredIdx", columnList="store_site_id,store_ship_code,additional_credit"), @Index(name="storeShippingStoreShippingStoreSiteIdEnabledIdx", columnList="store_site_id,is_enabled"), @Index(name="storeShippingStoreShippingStoreSiteIdShipCodeIdx", columnList="store_site_id,store_ship_code"), @Index(name="storeShippingStoreShippingStoreSiteIdShipNameIdx", columnList="store_site_id,store_ship_name"), @Index(name="storeShippingStoreShippingStoreSiteIdCodeInitcredIdx", columnList="store_site_id,store_ship_code,initial_credit")})
public class StoreShipping implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8361774147336961238L;

	/** Primary key. */
    protected static final String PK = "storeShippingId";

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
    @Column(name="store_ship_id", unique=true, nullable=false, precision=10)
    private int storeShippingId;
    @Column(name="store_ship_code", length=1)
    private String storeShippingCode;
    @Column(name="store_ship_name", nullable=false, length=100)
    private String storeShippingName;
    @Column(name="initial_credit", nullable=false, precision=15, scale=2)
    private BigDecimal initialCredit;
    @Column(name="additional_credit", nullable=false, precision=15, scale=2)
    private BigDecimal additionalCredit;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @Column(length=255)
    private String notes;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    @OneToMany(mappedBy="storeShipping")
    private Set<Orders> orders;
    @OneToMany(mappedBy="storeShipping")
    private Set<StoreShippingMethods> storeShipMethods;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_site_id", nullable=false)
    private StoreSites storeSites;

    /** Default constructor. */
    public StoreShipping() {
        super();
    }

    /**
     * Access method for storeShippingId.
     *
     * @return the current value of storeShippingId
     */
    public int getStoreShippingId() {
        return storeShippingId;
    }

    /**
     * Setter method for storeShippingId.
     *
     * @param aStoreShippingId the new value for storeShippingId
     */
    public void setStoreShippingId(int aStoreShippingId) {
        storeShippingId = aStoreShippingId;
    }

    /**
     * Access method for storeShippingCode.
     *
     * @return the current value of storeShippingCode
     */
    public String getStoreShippingCode() {
        return storeShippingCode;
    }

    /**
     * Setter method for storeShippingCode.
     *
     * @param aStoreShippingCode the new value for storeShippingCode
     */
    public void setStoreShippingCode(String aStoreShippingCode) {
        storeShippingCode = aStoreShippingCode;
    }

    /**
     * Access method for storeShippingName.
     *
     * @return the current value of storeShippingName
     */
    public String getStoreShippingName() {
        return storeShippingName;
    }

    /**
     * Setter method for storeShippingName.
     *
     * @param aStoreShippingName the new value for storeShippingName
     */
    public void setStoreShippingName(String aStoreShippingName) {
        storeShippingName = aStoreShippingName;
    }

    /**
     * Access method for initialCredit.
     *
     * @return the current value of initialCredit
     */
    public BigDecimal getInitialCredit() {
        return initialCredit;
    }

    /**
     * Setter method for initialCredit.
     *
     * @param aInitialCredit the new value for initialCredit
     */
    public void setInitialCredit(BigDecimal aInitialCredit) {
        initialCredit = aInitialCredit;
    }

    /**
     * Access method for additionalCredit.
     *
     * @return the current value of additionalCredit
     */
    public BigDecimal getAdditionalCredit() {
        return additionalCredit;
    }

    /**
     * Setter method for additionalCredit.
     *
     * @param aAdditionalCredit the new value for additionalCredit
     */
    public void setAdditionalCredit(BigDecimal aAdditionalCredit) {
        additionalCredit = aAdditionalCredit;
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
     * Access method for notes.
     *
     * @return the current value of notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for notes.
     *
     * @param aNotes the new value for notes
     */
    public void setNotes(String aNotes) {
        notes = aNotes;
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
     * Gets the group fragment storeSiteId for member storeSites.
     *
     * @return Current value of the group fragment
     * @see StoreSites
     */
    public int getStoreSitesStoreSiteId() {
        return (getStoreSites() == null ? null : getStoreSites().getStoreSiteId());
    }

    /**
     * Sets the group fragment storeSiteId from member storeSites.
     *
     * @param aStoreSiteId New value for the group fragment
     * @see StoreSites
     */
    public void setStoreSitesStoreSiteId(int aStoreSiteId) {
        if (getStoreSites() != null) {
            getStoreSites().setStoreSiteId(aStoreSiteId);
        }
    }

    /**
     * Compares the key for this instance with another StoreShipping.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreShipping and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreShipping)) {
            return false;
        }
        StoreShipping that = (StoreShipping) other;
        if (this.getStoreShippingId() != that.getStoreShippingId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreShipping.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreShipping)) return false;
        return this.equalKeys(other) && ((StoreShipping)other).equalKeys(this);
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
        i = getStoreShippingId();
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
        StringBuffer sb = new StringBuffer("[StoreShipping |");
        sb.append(" storeShippingId=").append(getStoreShippingId());
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
        ret.put("storeShippingId", Integer.valueOf(getStoreShippingId()));
        return ret;
    }

}
