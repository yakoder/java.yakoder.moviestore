// Generated with g9.

package com.yakoder.moviestore.data;

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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="conditions")
public class Conditions implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8840233815483811019L;

	/** Primary key. */
    protected static final String PK = "condId";

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
    @Column(name="cond_id", unique=true, nullable=false, precision=10)
    private int condId;
    @Column(name="cond_name", nullable=false, length=100)
    private String condName;
    @Column(name="cond_value", nullable=false, precision=10)
    private int condValue;
    @Column(name="pct_retail", precision=15, scale=10)
    private BigDecimal pctRetail;
    @OneToMany(mappedBy="conditions")
    private Set<ExpMovies> expMovies;
    @OneToMany(mappedBy="conditions")
    private Set<Inventory> inventory;

    /** Default constructor. */
    public Conditions() {
        super();
    }

    /**
     * Access method for condId.
     *
     * @return the current value of condId
     */
    public int getCondId() {
        return condId;
    }

    /**
     * Setter method for condId.
     *
     * @param aCondId the new value for condId
     */
    public void setCondId(int aCondId) {
        condId = aCondId;
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
     * Access method for condValue.
     *
     * @return the current value of condValue
     */
    public int getCondValue() {
        return condValue;
    }

    /**
     * Setter method for condValue.
     *
     * @param aCondValue the new value for condValue
     */
    public void setCondValue(int aCondValue) {
        condValue = aCondValue;
    }

    /**
     * Access method for pctRetail.
     *
     * @return the current value of pctRetail
     */
    public BigDecimal getPctRetail() {
        return pctRetail;
    }

    /**
     * Setter method for pctRetail.
     *
     * @param aPctRetail the new value for pctRetail
     */
    public void setPctRetail(BigDecimal aPctRetail) {
        pctRetail = aPctRetail;
    }

    /**
     * Access method for expMovies.
     *
     * @return the current value of expMovies
     */
    public Set<ExpMovies> getExpMovies() {
        return expMovies;
    }

    /**
     * Setter method for expMovies.
     *
     * @param aExpMovies the new value for expMovies
     */
    public void setExpMovies(Set<ExpMovies> aExpMovies) {
        expMovies = aExpMovies;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Set<Inventory> getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Set<Inventory> aInventory) {
        inventory = aInventory;
    }

    /**
     * Compares the key for this instance with another Conditions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Conditions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Conditions)) {
            return false;
        }
        Conditions that = (Conditions) other;
        if (this.getCondId() != that.getCondId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Conditions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Conditions)) return false;
        return this.equalKeys(other) && ((Conditions)other).equalKeys(this);
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
        i = getCondId();
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
        StringBuffer sb = new StringBuffer("[Conditions |");
        sb.append(" condId=").append(getCondId());
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
        ret.put("condId", Integer.valueOf(getCondId()));
        return ret;
    }

}
