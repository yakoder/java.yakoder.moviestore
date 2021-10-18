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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="inventory")
public class Inventory implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4657528220177311161L;

	/** Primary key. */
    protected static final String PK = "invId";

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
    @Column(name="inv_id", unique=true, nullable=false, precision=10)
    private int invId;
    @Column(length=255)
    private String notes;
    @Column(nullable=false, precision=10)
    private int quantity;
    @Column(name="for_sale", nullable=false, length=3)
    private boolean forSale;
    @Column(name="num_discs", nullable=false, precision=10)
    private int numDiscs;
    @Column(name="have_case_art", nullable=false, length=3)
    private boolean haveCaseArt;
    @Column(name="is_dual_sided", nullable=false, length=3)
    private boolean isDualSided;
    @OneToMany(mappedBy="inventory")
    private Set<ExternalIds> externalIds;
    @OneToMany(mappedBy="inventory")
    private Set<InvDigitization> invDigitization;
    @ManyToOne
    @JoinColumn(name="cond_id")
    private Conditions conditions;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movies;
    @OneToMany(mappedBy="inventory")
    private Set<OrderMovies> orderMovies;
    @OneToMany(mappedBy="inventory")
    private Set<StoreInventory> storeInventory;

    /** Default constructor. */
    public Inventory() {
        super();
    }

    /**
     * Access method for invId.
     *
     * @return the current value of invId
     */
    public int getInvId() {
        return invId;
    }

    /**
     * Setter method for invId.
     *
     * @param aInvId the new value for invId
     */
    public void setInvId(int aInvId) {
        invId = aInvId;
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
     * Access method for forSale.
     *
     * @return true if and only if forSale is currently true
     */
    public boolean isForSale() {
        return forSale;
    }

    /**
     * Setter method for forSale.
     *
     * @param aForSale the new value for forSale
     */
    public void setForSale(boolean aForSale) {
        forSale = aForSale;
    }

    /**
     * Access method for numDiscs.
     *
     * @return the current value of numDiscs
     */
    public int getNumDiscs() {
        return numDiscs;
    }

    /**
     * Setter method for numDiscs.
     *
     * @param aNumDiscs the new value for numDiscs
     */
    public void setNumDiscs(int aNumDiscs) {
        numDiscs = aNumDiscs;
    }

    /**
     * Access method for haveCaseArt.
     *
     * @return true if and only if haveCaseArt is currently true
     */
    public boolean isHaveCaseArt() {
        return haveCaseArt;
    }

    /**
     * Setter method for haveCaseArt.
     *
     * @param aHaveCaseArt the new value for haveCaseArt
     */
    public void setHaveCaseArt(boolean aHaveCaseArt) {
        haveCaseArt = aHaveCaseArt;
    }

    /**
     * Access method for isDualSided.
     *
     * @return true if and only if isDualSided is currently true
     */
    public boolean isIsDualSided() {
        return isDualSided;
    }

    /**
     * Setter method for isDualSided.
     *
     * @param aIsDualSided the new value for isDualSided
     */
    public void setIsDualSided(boolean aIsDualSided) {
        isDualSided = aIsDualSided;
    }

    /**
     * Access method for externalIds.
     *
     * @return the current value of externalIds
     */
    public Set<ExternalIds> getExternalIds() {
        return externalIds;
    }

    /**
     * Setter method for externalIds.
     *
     * @param aExternalIds the new value for externalIds
     */
    public void setExternalIds(Set<ExternalIds> aExternalIds) {
        externalIds = aExternalIds;
    }

    /**
     * Access method for invDigitization.
     *
     * @return the current value of invDigitization
     */
    public Set<InvDigitization> getInvDigitization() {
        return invDigitization;
    }

    /**
     * Setter method for invDigitization.
     *
     * @param aInvDigitization the new value for invDigitization
     */
    public void setInvDigitization(Set<InvDigitization> aInvDigitization) {
        invDigitization = aInvDigitization;
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
     * Access method for orderMovies.
     *
     * @return the current value of orderMovies
     */
    public Set<OrderMovies> getOrderMovies() {
        return orderMovies;
    }

    /**
     * Setter method for orderMovies.
     *
     * @param aOrderMovies the new value for orderMovies
     */
    public void setOrderMovies(Set<OrderMovies> aOrderMovies) {
        orderMovies = aOrderMovies;
    }

    /**
     * Access method for storeInventory.
     *
     * @return the current value of storeInventory
     */
    public Set<StoreInventory> getStoreInventory() {
        return storeInventory;
    }

    /**
     * Setter method for storeInventory.
     *
     * @param aStoreInventory the new value for storeInventory
     */
    public void setStoreInventory(Set<StoreInventory> aStoreInventory) {
        storeInventory = aStoreInventory;
    }

    /**
     * Compares the key for this instance with another Inventory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Inventory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Inventory)) {
            return false;
        }
        Inventory that = (Inventory) other;
        if (this.getInvId() != that.getInvId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Inventory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Inventory)) return false;
        return this.equalKeys(other) && ((Inventory)other).equalKeys(this);
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
        i = getInvId();
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
        StringBuffer sb = new StringBuffer("[Inventory |");
        sb.append(" invId=").append(getInvId());
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
        ret.put("invId", Integer.valueOf(getInvId()));
        return ret;
    }

}
