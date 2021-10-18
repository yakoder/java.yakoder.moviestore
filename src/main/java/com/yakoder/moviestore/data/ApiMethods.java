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

@Entity(name="api_methods")
public class ApiMethods implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -613279797965595224L;

	/** Primary key. */
    protected static final String PK = "apiMethId";

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
    private int apiMethId;
    @Column(name="api_meth_name", nullable=false, length=100)
    private String apiMethName;
    @Column(name="api_meth_desc", length=255)
    private String apiMethDesc;
    @OneToMany(mappedBy="apiMethods")
    private Set<Apis> apis;

    /** Default constructor. */
    public ApiMethods() {
        super();
    }

    /**
     * Access method for apiMethId.
     *
     * @return the current value of apiMethId
     */
    public int getApiMethId() {
        return apiMethId;
    }

    /**
     * Setter method for apiMethId.
     *
     * @param aApiMethId the new value for apiMethId
     */
    public void setApiMethId(int aApiMethId) {
        apiMethId = aApiMethId;
    }

    /**
     * Access method for apiMethName.
     *
     * @return the current value of apiMethName
     */
    public String getApiMethName() {
        return apiMethName;
    }

    /**
     * Setter method for apiMethName.
     *
     * @param aApiMethName the new value for apiMethName
     */
    public void setApiMethName(String aApiMethName) {
        apiMethName = aApiMethName;
    }

    /**
     * Access method for apiMethDesc.
     *
     * @return the current value of apiMethDesc
     */
    public String getApiMethDesc() {
        return apiMethDesc;
    }

    /**
     * Setter method for apiMethDesc.
     *
     * @param aApiMethDesc the new value for apiMethDesc
     */
    public void setApiMethDesc(String aApiMethDesc) {
        apiMethDesc = aApiMethDesc;
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
        if (this.getApiMethId() != that.getApiMethId()) {
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
        i = getApiMethId();
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
        sb.append(" apiMethId=").append(getApiMethId());
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
        ret.put("apiMethId", Integer.valueOf(getApiMethId()));
        return ret;
    }

}
