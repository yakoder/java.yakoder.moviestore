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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.inventory.DataFormats;

@Entity
@Table(name="apis", indexes={@Index(name="apisApisSiteIdTemplateIdx", columnList="site_id,is_template"), @Index(name="apisApisSiteIdNameUrlIdx", columnList="site_id,api_name,api_url")})
public class Apis implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5933924708801803254L;

	/** Primary key. */
    protected static final String PK = "apiId";

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
    @Column(name="api_id", unique=true, nullable=false, precision=10)
    private int apiId;
    @Column(name="api_name", nullable=false, length=100)
    private String apiName;
    @Column(name="api_desc", length=255)
    private String apiDesc;
    @Column(name="api_url", nullable=false, length=255)
    private String apiUrl;
    @Column(name="is_template", nullable=false, length=3)
    private boolean isTemplate;
    @Column(name="api_docs")
    private byte[] apiDocs;
    @OneToMany(mappedBy="apis")
    private Set<ApiCalls> apiCalls;
    @OneToMany(mappedBy="apis")
    private Set<ApiLimits> apiLimits;
    @OneToMany(mappedBy="apis")
    private Set<ApiResponses> apiResponses;
    @OneToMany(mappedBy="apis")
    private Set<ApiUsers> apiUsers;
    @ManyToOne
    @JoinColumn(name="api_base_url_id")
    private ApiBaseUrls apiBaseUrls;
    @ManyToOne(optional=false)
    @JoinColumn(name="in_meth_id", nullable=false)
    private ApiMethods apiMethods;
    @ManyToOne(optional=false)
    @JoinColumn(name="out_fmt_id", nullable=false)
    private DataFormats dataFormats;
    @ManyToOne(optional=false)
    @JoinColumn(name="site_id", nullable=false)
    private Sites sites;

    /** Default constructor. */
    public Apis() {
        super();
    }

    /**
     * Access method for apiId.
     *
     * @return the current value of apiId
     */
    public int getApiId() {
        return apiId;
    }

    /**
     * Setter method for apiId.
     *
     * @param aApiId the new value for apiId
     */
    public void setApiId(int aApiId) {
        apiId = aApiId;
    }

    /**
     * Access method for apiName.
     *
     * @return the current value of apiName
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * Setter method for apiName.
     *
     * @param aApiName the new value for apiName
     */
    public void setApiName(String aApiName) {
        apiName = aApiName;
    }

    /**
     * Access method for apiDesc.
     *
     * @return the current value of apiDesc
     */
    public String getApiDesc() {
        return apiDesc;
    }

    /**
     * Setter method for apiDesc.
     *
     * @param aApiDesc the new value for apiDesc
     */
    public void setApiDesc(String aApiDesc) {
        apiDesc = aApiDesc;
    }

    /**
     * Access method for apiUrl.
     *
     * @return the current value of apiUrl
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * Setter method for apiUrl.
     *
     * @param aApiUrl the new value for apiUrl
     */
    public void setApiUrl(String aApiUrl) {
        apiUrl = aApiUrl;
    }

    /**
     * Access method for isTemplate.
     *
     * @return true if and only if isTemplate is currently true
     */
    public boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * Setter method for isTemplate.
     *
     * @param aIsTemplate the new value for isTemplate
     */
    public void setIsTemplate(boolean aIsTemplate) {
        isTemplate = aIsTemplate;
    }

    /**
     * Access method for apiDocs.
     *
     * @return the current value of apiDocs
     */
    public byte[] getApiDocs() {
        return apiDocs;
    }

    /**
     * Setter method for apiDocs.
     *
     * @param aApiDocs the new value for apiDocs
     */
    public void setApiDocs(byte[] aApiDocs) {
        apiDocs = aApiDocs;
    }

    /**
     * Access method for apiCalls.
     *
     * @return the current value of apiCalls
     */
    public Set<ApiCalls> getApiCalls() {
        return apiCalls;
    }

    /**
     * Setter method for apiCalls.
     *
     * @param aApiCalls the new value for apiCalls
     */
    public void setApiCalls(Set<ApiCalls> aApiCalls) {
        apiCalls = aApiCalls;
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
     * Access method for apiResponses.
     *
     * @return the current value of apiResponses
     */
    public Set<ApiResponses> getApiResponses() {
        return apiResponses;
    }

    /**
     * Setter method for apiResponses.
     *
     * @param aApiResponses the new value for apiResponses
     */
    public void setApiResponses(Set<ApiResponses> aApiResponses) {
        apiResponses = aApiResponses;
    }

    /**
     * Access method for apiUsers.
     *
     * @return the current value of apiUsers
     */
    public Set<ApiUsers> getApiUsers() {
        return apiUsers;
    }

    /**
     * Setter method for apiUsers.
     *
     * @param aApiUsers the new value for apiUsers
     */
    public void setApiUsers(Set<ApiUsers> aApiUsers) {
        apiUsers = aApiUsers;
    }

    /**
     * Access method for apiBaseUrls.
     *
     * @return the current value of apiBaseUrls
     */
    public ApiBaseUrls getApiBaseUrls() {
        return apiBaseUrls;
    }

    /**
     * Setter method for apiBaseUrls.
     *
     * @param aApiBaseUrls the new value for apiBaseUrls
     */
    public void setApiBaseUrls(ApiBaseUrls aApiBaseUrls) {
        apiBaseUrls = aApiBaseUrls;
    }

    /**
     * Access method for apiMethods.
     *
     * @return the current value of apiMethods
     */
    public ApiMethods getApiMethods() {
        return apiMethods;
    }

    /**
     * Setter method for apiMethods.
     *
     * @param aApiMethods the new value for apiMethods
     */
    public void setApiMethods(ApiMethods aApiMethods) {
        apiMethods = aApiMethods;
    }

    /**
     * Access method for dataFormats.
     *
     * @return the current value of dataFormats
     */
    public DataFormats getDataFormats() {
        return dataFormats;
    }

    /**
     * Setter method for dataFormats.
     *
     * @param aDataFormats the new value for dataFormats
     */
    public void setDataFormats(DataFormats aDataFormats) {
        dataFormats = aDataFormats;
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
     * Gets the group fragment siteId for member sites.
     *
     * @return Current value of the group fragment
     * @see Sites
     */
    public int getSitesSiteId() {
        return (getSites() == null ? null : getSites().getSiteId());
    }

    /**
     * Sets the group fragment siteId from member sites.
     *
     * @param aSiteId New value for the group fragment
     * @see Sites
     */
    public void setSitesSiteId(int aSiteId) {
        if (getSites() != null) {
            getSites().setSiteId(aSiteId);
        }
    }

    /**
     * Compares the key for this instance with another Apis.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Apis and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Apis)) {
            return false;
        }
        Apis that = (Apis) other;
        if (this.getApiId() != that.getApiId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Apis.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Apis)) return false;
        return this.equalKeys(other) && ((Apis)other).equalKeys(this);
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
        i = getApiId();
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
        StringBuffer sb = new StringBuffer("[Apis |");
        sb.append(" apiId=").append(getApiId());
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
        ret.put("apiId", Integer.valueOf(getApiId()));
        return ret;
    }

}
