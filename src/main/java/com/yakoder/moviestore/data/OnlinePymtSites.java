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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="online_pymt_sites", indexes={@Index(name="onlinePymtSitesOnlinePymtSitesOlPymtSiteNameUrlIdx", columnList="ol_pymt_site_name,ol_pymt_site_url")})
public class OnlinePymtSites implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1518757951056140461L;

	/** Primary key. */
    protected static final String PK = "olPymtSiteId";

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
    @Column(name="ol_pymt_site_id", unique=true, nullable=false, precision=10)
    private int olPymtSiteId;
    @Column(name="ol_pymt_site_name", nullable=false, length=100)
    private String olPymtSiteName;
    @Column(name="ol_pymt_site_url", nullable=false, length=255)
    private String olPymtSiteUrl;
    @OneToMany(mappedBy="onlinePymtSites")
    private Set<ReimbOnline> reimbOnline;

    /** Default constructor. */
    public OnlinePymtSites() {
        super();
    }

    /**
     * Access method for olPymtSiteId.
     *
     * @return the current value of olPymtSiteId
     */
    public int getOlPymtSiteId() {
        return olPymtSiteId;
    }

    /**
     * Setter method for olPymtSiteId.
     *
     * @param aOlPymtSiteId the new value for olPymtSiteId
     */
    public void setOlPymtSiteId(int aOlPymtSiteId) {
        olPymtSiteId = aOlPymtSiteId;
    }

    /**
     * Access method for olPymtSiteName.
     *
     * @return the current value of olPymtSiteName
     */
    public String getOlPymtSiteName() {
        return olPymtSiteName;
    }

    /**
     * Setter method for olPymtSiteName.
     *
     * @param aOlPymtSiteName the new value for olPymtSiteName
     */
    public void setOlPymtSiteName(String aOlPymtSiteName) {
        olPymtSiteName = aOlPymtSiteName;
    }

    /**
     * Access method for olPymtSiteUrl.
     *
     * @return the current value of olPymtSiteUrl
     */
    public String getOlPymtSiteUrl() {
        return olPymtSiteUrl;
    }

    /**
     * Setter method for olPymtSiteUrl.
     *
     * @param aOlPymtSiteUrl the new value for olPymtSiteUrl
     */
    public void setOlPymtSiteUrl(String aOlPymtSiteUrl) {
        olPymtSiteUrl = aOlPymtSiteUrl;
    }

    /**
     * Access method for reimbOnline.
     *
     * @return the current value of reimbOnline
     */
    public Set<ReimbOnline> getReimbOnline() {
        return reimbOnline;
    }

    /**
     * Setter method for reimbOnline.
     *
     * @param aReimbOnline the new value for reimbOnline
     */
    public void setReimbOnline(Set<ReimbOnline> aReimbOnline) {
        reimbOnline = aReimbOnline;
    }

    /**
     * Compares the key for this instance with another OnlinePymtSites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OnlinePymtSites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OnlinePymtSites)) {
            return false;
        }
        OnlinePymtSites that = (OnlinePymtSites) other;
        if (this.getOlPymtSiteId() != that.getOlPymtSiteId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OnlinePymtSites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OnlinePymtSites)) return false;
        return this.equalKeys(other) && ((OnlinePymtSites)other).equalKeys(this);
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
        i = getOlPymtSiteId();
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
        StringBuffer sb = new StringBuffer("[OnlinePymtSites |");
        sb.append(" olPymtSiteId=").append(getOlPymtSiteId());
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
        ret.put("olPymtSiteId", Integer.valueOf(getOlPymtSiteId()));
        return ret;
    }

}
