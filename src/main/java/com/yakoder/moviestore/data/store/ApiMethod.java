// Generated with g9.

package com.yakoder.moviestore.data.store;

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

@Entity(name="api_methods")
public class ApiMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -613279797965595224L;

	/** Primary key. */
    protected static final String PK = "apiMethodId";

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
    @Column(name="api_meth_id", unique=true, nullable=false, precision=10)
    private int apiMethodId;
    @Column(name="api_meth_name", nullable=false, length=100)
    private String apiMethodName;
    @Column(name="api_meth_desc", length=255)
    private String apiMethodDesc;
    @OneToMany(mappedBy="apiMethods")
    private Set<Apis> apis;

    /** Default constructor. */
    public ApiMethods() {
        super();
    }

    /**
     * Access method for apiMethodId.
     *
     * @return the current value of apiMethodId
     */
    public int getApiMethodId() {
        return apiMethodId;
    }

    /**
     * Setter method for apiMethodId.
     *
     * @param aApiMethodId the new value for apiMethodId
     */
    public void setApiMethodId(int aApiMethodId) {
        apiMethodId = aApiMethodId;
    }

    /**
     * Access method for apiMethodName.
     *
     * @return the current value of apiMethodName
     */
    public String getApiMethodName() {
        return apiMethodName;
    }

    /**
     * Setter method for apiMethodName.
     *
     * @param aApiMethodName the new value for apiMethodName
     */
    public void setApiMethodName(String aApiMethodName) {
        apiMethodName = aApiMethodName;
    }

    /**
     * Access method for apiMethodDesc.
     *
     * @return the current value of apiMethodDesc
     */
    public String getApiMethodDesc() {
        return apiMethodDesc;
    }

    /**
     * Setter method for apiMethodDesc.
     *
     * @param aApiMethodDesc the new value for apiMethodDesc
     */
    public void setApiMethodDesc(String aApiMethodDesc) {
        apiMethodDesc = aApiMethodDesc;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Set<Apis> getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Set<Apis> aApis) {
        apis = aApis;
    }

    /**
     * Compares the key for this instance with another ApiMethods.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiMethods and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiMethods)) {
            return false;
        }
        ApiMethods that = (ApiMethods) other;
        if (this.getApiMethodId() != that.getApiMethodId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiMethods.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiMethods)) return false;
        return this.equalKeys(other) && ((ApiMethods)other).equalKeys(this);
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
        i = getApiMethodId();
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
        StringBuffer sb = new StringBuffer("[ApiMethods |");
        sb.append(" apiMethodId=").append(getApiMethodId());
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
        ret.put("apiMethodId", Integer.valueOf(getApiMethodId()));
        return ret;
    }

}
