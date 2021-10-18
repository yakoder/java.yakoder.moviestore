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

@Entity(name="api_limit_types")
public class ApiLimitTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1248805752241193996L;

	/** Primary key. */
    protected static final String PK = "apiLimitTypeId";

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
    @Column(name="api_limit_type_id", unique=true, nullable=false, precision=10)
    private int apiLimitTypeId;
    @Column(name="api_limit_type_name", nullable=false, length=100)
    private String apiLimitTypeName;
    @Column(name="api_limit_type_desc", length=255)
    private String apiLimitTypeDesc;
    @OneToMany(mappedBy="apiLimitTypes")
    private Set<ApiLimits> apiLimits;

    /** Default constructor. */
    public ApiLimitTypes() {
        super();
    }

    /**
     * Access method for apiLimitTypeId.
     *
     * @return the current value of apiLimitTypeId
     */
    public int getApiLimitTypeId() {
        return apiLimitTypeId;
    }

    /**
     * Setter method for apiLimitTypeId.
     *
     * @param aApiLimitTypeId the new value for apiLimitTypeId
     */
    public void setApiLimitTypeId(int aApiLimitTypeId) {
        apiLimitTypeId = aApiLimitTypeId;
    }

    /**
     * Access method for apiLimitTypeName.
     *
     * @return the current value of apiLimitTypeName
     */
    public String getApiLimitTypeName() {
        return apiLimitTypeName;
    }

    /**
     * Setter method for apiLimitTypeName.
     *
     * @param aApiLimitTypeName the new value for apiLimitTypeName
     */
    public void setApiLimitTypeName(String aApiLimitTypeName) {
        apiLimitTypeName = aApiLimitTypeName;
    }

    /**
     * Access method for apiLimitTypeDesc.
     *
     * @return the current value of apiLimitTypeDesc
     */
    public String getApiLimitTypeDesc() {
        return apiLimitTypeDesc;
    }

    /**
     * Setter method for apiLimitTypeDesc.
     *
     * @param aApiLimitTypeDesc the new value for apiLimitTypeDesc
     */
    public void setApiLimitTypeDesc(String aApiLimitTypeDesc) {
        apiLimitTypeDesc = aApiLimitTypeDesc;
    }

    /**
     * Access method for apiLimits.
     *
     * @return the current value of apiLimits
     */
    public Set<ApiLimits> getApiLimits() {
        return apiLimits;
    }

    /**
     * Setter method for apiLimits.
     *
     * @param aApiLimits the new value for apiLimits
     */
    public void setApiLimits(Set<ApiLimits> aApiLimits) {
        apiLimits = aApiLimits;
    }

    /**
     * Compares the key for this instance with another ApiLimitTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiLimitTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiLimitTypes)) {
            return false;
        }
        ApiLimitTypes that = (ApiLimitTypes) other;
        if (this.getApiLimitTypeId() != that.getApiLimitTypeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiLimitTypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiLimitTypes)) return false;
        return this.equalKeys(other) && ((ApiLimitTypes)other).equalKeys(this);
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
        i = getApiLimitTypeId();
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
        StringBuffer sb = new StringBuffer("[ApiLimitTypes |");
        sb.append(" apiLimitTypeId=").append(getApiLimitTypeId());
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
        ret.put("apiLimitTypeId", Integer.valueOf(getApiLimitTypeId()));
        return ret;
    }

}
