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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="supply_types")
public class SupplyTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1080387065439911232L;

	/** Primary key. */
    protected static final String PK = "supplyTypeId";

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
    @Column(name="supply_type_id", unique=true, nullable=false, precision=10)
    private int supplyTypeId;
    @Column(name="supply_type_name", nullable=false, length=100)
    private String supplyTypeName;
    @Column(name="supply_type_desc", length=255)
    private String supplyTypeDesc;
    @OneToMany(mappedBy="supplyTypes")
    private Set<ExpSupplies> expSupplies;

    /** Default constructor. */
    public SupplyTypes() {
        super();
    }

    /**
     * Access method for supplyTypeId.
     *
     * @return the current value of supplyTypeId
     */
    public int getSupplyTypeId() {
        return supplyTypeId;
    }

    /**
     * Setter method for supplyTypeId.
     *
     * @param aSupplyTypeId the new value for supplyTypeId
     */
    public void setSupplyTypeId(int aSupplyTypeId) {
        supplyTypeId = aSupplyTypeId;
    }

    /**
     * Access method for supplyTypeName.
     *
     * @return the current value of supplyTypeName
     */
    public String getSupplyTypeName() {
        return supplyTypeName;
    }

    /**
     * Setter method for supplyTypeName.
     *
     * @param aSupplyTypeName the new value for supplyTypeName
     */
    public void setSupplyTypeName(String aSupplyTypeName) {
        supplyTypeName = aSupplyTypeName;
    }

    /**
     * Access method for supplyTypeDesc.
     *
     * @return the current value of supplyTypeDesc
     */
    public String getSupplyTypeDesc() {
        return supplyTypeDesc;
    }

    /**
     * Setter method for supplyTypeDesc.
     *
     * @param aSupplyTypeDesc the new value for supplyTypeDesc
     */
    public void setSupplyTypeDesc(String aSupplyTypeDesc) {
        supplyTypeDesc = aSupplyTypeDesc;
    }

    /**
     * Access method for expSupplies.
     *
     * @return the current value of expSupplies
     */
    public Set<ExpSupplies> getExpSupplies() {
        return expSupplies;
    }

    /**
     * Setter method for expSupplies.
     *
     * @param aExpSupplies the new value for expSupplies
     */
    public void setExpSupplies(Set<ExpSupplies> aExpSupplies) {
        expSupplies = aExpSupplies;
    }

    /**
     * Compares the key for this instance with another SupplyTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SupplyTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SupplyTypes)) {
            return false;
        }
        SupplyTypes that = (SupplyTypes) other;
        if (this.getSupplyTypeId() != that.getSupplyTypeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SupplyTypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SupplyTypes)) return false;
        return this.equalKeys(other) && ((SupplyTypes)other).equalKeys(this);
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
        i = getSupplyTypeId();
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
        StringBuffer sb = new StringBuffer("[SupplyTypes |");
        sb.append(" supplyTypeId=").append(getSupplyTypeId());
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
        ret.put("supplyTypeId", Integer.valueOf(getSupplyTypeId()));
        return ret;
    }

}
