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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="api_base_urls")
public class ApiBaseUrls implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 565817154351209517L;

	/** Primary key. */
    protected static final String PK = "apiBaseUrlId";

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
    @Column(name="api_base_url_id", unique=true, nullable=false, precision=10)
    private int apiBaseUrlId;
    @Column(name="api_base_url_name", nullable=false, length=100)
    private String apiBaseUrlName;
    @Column(name="api_base_url_url", nullable=false, length=255)
    private String apiBaseUrlUrl;
    @Column(name="api_base_url_desc", length=255)
    private String apiBaseUrlDesc;
    @ManyToOne(optional=false)
    @JoinColumn(name="site_id", nullable=false)
    private Sites sites;
    @OneToMany(mappedBy="apiBaseUrls")
    private Set<Apis> apis;

    /** Default constructor. */
    public ApiBaseUrls() {
        super();
    }

    /**
     * Access method for apiBaseUrlId.
     *
     * @return the current value of apiBaseUrlId
     */
    public int getApiBaseUrlId() {
        return apiBaseUrlId;
    }

    /**
     * Setter method for apiBaseUrlId.
     *
     * @param aApiBaseUrlId the new value for apiBaseUrlId
     */
    public void setApiBaseUrlId(int aApiBaseUrlId) {
        apiBaseUrlId = aApiBaseUrlId;
    }

    /**
     * Access method for apiBaseUrlName.
     *
     * @return the current value of apiBaseUrlName
     */
    public String getApiBaseUrlName() {
        return apiBaseUrlName;
    }

    /**
     * Setter method for apiBaseUrlName.
     *
     * @param aApiBaseUrlName the new value for apiBaseUrlName
     */
    public void setApiBaseUrlName(String aApiBaseUrlName) {
        apiBaseUrlName = aApiBaseUrlName;
    }

    /**
     * Access method for apiBaseUrlUrl.
     *
     * @return the current value of apiBaseUrlUrl
     */
    public String getApiBaseUrlUrl() {
        return apiBaseUrlUrl;
    }

    /**
     * Setter method for apiBaseUrlUrl.
     *
     * @param aApiBaseUrlUrl the new value for apiBaseUrlUrl
     */
    public void setApiBaseUrlUrl(String aApiBaseUrlUrl) {
        apiBaseUrlUrl = aApiBaseUrlUrl;
    }

    /**
     * Access method for apiBaseUrlDesc.
     *
     * @return the current value of apiBaseUrlDesc
     */
    public String getApiBaseUrlDesc() {
        return apiBaseUrlDesc;
    }

    /**
     * Setter method for apiBaseUrlDesc.
     *
     * @param aApiBaseUrlDesc the new value for apiBaseUrlDesc
     */
    public void setApiBaseUrlDesc(String aApiBaseUrlDesc) {
        apiBaseUrlDesc = aApiBaseUrlDesc;
    }

    /**
     * Access method for sites.
     *
     * @return the current value of sites
     */
    public Sites getSites() {
        return sites;
    }

    /**
     * Setter method for sites.
     *
     * @param aSites the new value for sites
     */
    public void setSites(Sites aSites) {
        sites = aSites;
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
     * Compares the key for this instance with another ApiBaseUrls.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiBaseUrls and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiBaseUrls)) {
            return false;
        }
        ApiBaseUrls that = (ApiBaseUrls) other;
        if (this.getApiBaseUrlId() != that.getApiBaseUrlId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiBaseUrls.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiBaseUrls)) return false;
        return this.equalKeys(other) && ((ApiBaseUrls)other).equalKeys(this);
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
        i = getApiBaseUrlId();
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
        StringBuffer sb = new StringBuffer("[ApiBaseUrls |");
        sb.append(" apiBaseUrlId=").append(getApiBaseUrlId());
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
        ret.put("apiBaseUrlId", Integer.valueOf(getApiBaseUrlId()));
        return ret;
    }

}
