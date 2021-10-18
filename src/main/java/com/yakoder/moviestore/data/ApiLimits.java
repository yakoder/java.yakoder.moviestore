// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="api_limits", indexes={@Index(name="apiLimitsApiLimitsApiIdLimitTypeIdx", columnList="api_id,api_limit_type_id")})
public class ApiLimits implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2257923941308938328L;

	/** Primary key. */
    protected static final String PK = "apiLimitId";

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
    @Column(name="api_limit_id", unique=true, nullable=false, precision=10)
    private int apiLimitId;
    @Column(name="api_type_value", nullable=false, precision=10)
    private int apiTypeValue;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_id", nullable=false)
    private Apis apis;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_limit_type_id", nullable=false)
    private ApiLimitTypes apiLimitTypes;

    /** Default constructor. */
    public ApiLimits() {
        super();
    }

    /**
     * Access method for apiLimitId.
     *
     * @return the current value of apiLimitId
     */
    public int getApiLimitId() {
        return apiLimitId;
    }

    /**
     * Setter method for apiLimitId.
     *
     * @param aApiLimitId the new value for apiLimitId
     */
    public void setApiLimitId(int aApiLimitId) {
        apiLimitId = aApiLimitId;
    }

    /**
     * Access method for apiTypeValue.
     *
     * @return the current value of apiTypeValue
     */
    public int getApiTypeValue() {
        return apiTypeValue;
    }

    /**
     * Setter method for apiTypeValue.
     *
     * @param aApiTypeValue the new value for apiTypeValue
     */
    public void setApiTypeValue(int aApiTypeValue) {
        apiTypeValue = aApiTypeValue;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Apis getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Apis aApis) {
        apis = aApis;
    }

    /**
     * Access method for apiLimitTypes.
     *
     * @return the current value of apiLimitTypes
     */
    public ApiLimitTypes getApiLimitTypes() {
        return apiLimitTypes;
    }

    /**
     * Setter method for apiLimitTypes.
     *
     * @param aApiLimitTypes the new value for apiLimitTypes
     */
    public void setApiLimitTypes(ApiLimitTypes aApiLimitTypes) {
        apiLimitTypes = aApiLimitTypes;
    }

    /**
     * Gets the group fragment apiId for member apis.
     *
     * @return Current value of the group fragment
     * @see Apis
     */
    public int getApisApiId() {
        return (getApis() == null ? null : getApis().getApiId());
    }

    /**
     * Sets the group fragment apiId from member apis.
     *
     * @param aApiId New value for the group fragment
     * @see Apis
     */
    public void setApisApiId(int aApiId) {
        if (getApis() != null) {
            getApis().setApiId(aApiId);
        }
    }

    /**
     * Gets the group fragment apiLimitTypeId for member apiLimitTypes.
     *
     * @return Current value of the group fragment
     * @see ApiLimitTypes
     */
    public int getApiLimitTypesApiLimitTypeId() {
        return (getApiLimitTypes() == null ? null : getApiLimitTypes().getApiLimitTypeId());
    }

    /**
     * Sets the group fragment apiLimitTypeId from member apiLimitTypes.
     *
     * @param aApiLimitTypeId New value for the group fragment
     * @see ApiLimitTypes
     */
    public void setApiLimitTypesApiLimitTypeId(int aApiLimitTypeId) {
        if (getApiLimitTypes() != null) {
            getApiLimitTypes().setApiLimitTypeId(aApiLimitTypeId);
        }
    }

    /**
     * Compares the key for this instance with another ApiLimits.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiLimits and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiLimits)) {
            return false;
        }
        ApiLimits that = (ApiLimits) other;
        if (this.getApiLimitId() != that.getApiLimitId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiLimits.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiLimits)) return false;
        return this.equalKeys(other) && ((ApiLimits)other).equalKeys(this);
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
        i = getApiLimitId();
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
        StringBuffer sb = new StringBuffer("[ApiLimits |");
        sb.append(" apiLimitId=").append(getApiLimitId());
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
        ret.put("apiLimitId", Integer.valueOf(getApiLimitId()));
        return ret;
    }

}
