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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="sites", indexes={@Index(name="sites_site_name_abbr_IX", columnList="site_name_abbr", unique=true)})
public class Site implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2471504429260570050L;

	/** Primary key. */
    protected static final String PK = "siteId";

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
    @Column(name="site_id", unique=true, nullable=false, precision=10)
    private int siteId;
    @Column(name="site_name", nullable=false, length=100)
    private String siteName;
    @Column(name="site_url", length=255)
    private String siteUrl;
    @Column(name="site_priority", nullable=false, precision=10)
    private int sitePriority;
    @Column(name="site_name_abbr", unique=true, nullable=false, length=10)
    private String siteNameAbbr;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @OneToMany(mappedBy="sites")
    private Set<ApiBaseUrl> apiBaseUrls;
    @OneToMany(mappedBy="sites")
    private Set<InfoSite> infoSites;
    @OneToMany(mappedBy="sites")
    private Set<Api> apis;
    @OneToMany(mappedBy="sites")
    private Set<SiteMovie> siteMovies;
    @OneToMany(mappedBy="sites")
    private Set<StoreSite> storeSites;

    /** Default constructor. */
    public Site() {
        super();
    }

    /**
     * Access method for siteId.
     *
     * @return the current value of siteId
     */
    public int getSiteId() {
        return siteId;
    }

    /**
     * Setter method for siteId.
     *
     * @param aSiteId the new value for siteId
     */
    public void setSiteId(int aSiteId) {
        siteId = aSiteId;
    }

    /**
     * Access method for siteName.
     *
     * @return the current value of siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Setter method for siteName.
     *
     * @param aSiteName the new value for siteName
     */
    public void setSiteName(String aSiteName) {
        siteName = aSiteName;
    }

    /**
     * Access method for siteUrl.
     *
     * @return the current value of siteUrl
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Setter method for siteUrl.
     *
     * @param aSiteUrl the new value for siteUrl
     */
    public void setSiteUrl(String aSiteUrl) {
        siteUrl = aSiteUrl;
    }

    /**
     * Access method for sitePriority.
     *
     * @return the current value of sitePriority
     */
    public int getSitePriority() {
        return sitePriority;
    }

    /**
     * Setter method for sitePriority.
     *
     * @param aSitePriority the new value for sitePriority
     */
    public void setSitePriority(int aSitePriority) {
        sitePriority = aSitePriority;
    }

    /**
     * Access method for siteNameAbbr.
     *
     * @return the current value of siteNameAbbr
     */
    public String getSiteNameAbbr() {
        return siteNameAbbr;
    }

    /**
     * Setter method for siteNameAbbr.
     *
     * @param aSiteNameAbbr the new value for siteNameAbbr
     */
    public void setSiteNameAbbr(String aSiteNameAbbr) {
        siteNameAbbr = aSiteNameAbbr;
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
     * Access method for apiBaseUrls.
     *
     * @return the current value of apiBaseUrls
     */
    public Set<ApiBaseUrl> getApiBaseUrls() {
        return apiBaseUrls;
    }

    /**
     * Setter method for apiBaseUrls.
     *
     * @param aApiBaseUrls the new value for apiBaseUrls
     */
    public void setApiBaseUrls(Set<ApiBaseUrl> aApiBaseUrls) {
        apiBaseUrls = aApiBaseUrls;
    }

    /**
     * Access method for infoSites.
     *
     * @return the current value of infoSites
     */
    public Set<InfoSite> getInfoSites() {
        return infoSites;
    }

    /**
     * Setter method for infoSites.
     *
     * @param aInfoSites the new value for infoSites
     */
    public void setInfoSites(Set<InfoSite> aInfoSites) {
        infoSites = aInfoSites;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Set<Api> getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Set<Api> aApis) {
        apis = aApis;
    }

    /**
     * Access method for siteMovies.
     *
     * @return the current value of siteMovies
     */
    public Set<SiteMovie> getSiteMovies() {
        return siteMovies;
    }

    /**
     * Setter method for siteMovies.
     *
     * @param aSiteMovies the new value for siteMovies
     */
    public void setSiteMovies(Set<SiteMovie> aSiteMovies) {
        siteMovies = aSiteMovies;
    }

    /**
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public Set<StoreSite> getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(Set<StoreSite> aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Compares the key for this instance with another Sites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Site)) {
            return false;
        }
        Site that = (Site) other;
        if (this.getSiteId() != that.getSiteId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Site)) return false;
        return this.equalKeys(other) && ((Site)other).equalKeys(this);
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
        i = getSiteId();
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
        StringBuffer sb = new StringBuffer("[Sites |");
        sb.append(" siteId=").append(getSiteId());
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
        ret.put("siteId", Integer.valueOf(getSiteId()));
        return ret;
    }

}
