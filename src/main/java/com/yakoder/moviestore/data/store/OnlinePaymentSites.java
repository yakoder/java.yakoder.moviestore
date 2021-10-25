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
@Table(name="online_pymt_sites", indexes={@Index(name="onlinePymtSitesOnlinePaymentSitesOlPymtSiteNameUrlIdx", columnList="ol_pymt_site_name,ol_pymt_site_url")})
public class OnlinePaymentSites implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1518757951056140461L;

	/** Primary key. */
    protected static final String PK = "onlinePaymentSiteId";

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
    private int onlinePaymentSiteId;
    @Column(name="ol_pymt_site_name", nullable=false, length=100)
    private String onlinePaymentSiteName;
    @Column(name="ol_pymt_site_url", nullable=false, length=255)
    private String onlinePaymentSiteUrl;
    @OneToMany(mappedBy="onlinePymtSites")
    private Set<ReimbursementOnline> reimbursementOnline;

    /** Default constructor. */
    public OnlinePaymentSites() {
        super();
    }

    /**
     * Access method for onlinePaymentSiteId.
     *
     * @return the current value of onlinePaymentSiteId
     */
    public int getOnlinePaymentSiteId() {
        return onlinePaymentSiteId;
    }

    /**
     * Setter method for onlinePaymentSiteId.
     *
     * @param aOnlinePaymentSiteId the new value for onlinePaymentSiteId
     */
    public void setOnlinePaymentSiteId(int aOnlinePaymentSiteId) {
        onlinePaymentSiteId = aOnlinePaymentSiteId;
    }

    /**
     * Access method for onlinePaymentSiteName.
     *
     * @return the current value of onlinePaymentSiteName
     */
    public String getOnlinePaymentSiteName() {
        return onlinePaymentSiteName;
    }

    /**
     * Setter method for onlinePaymentSiteName.
     *
     * @param aOnlinePaymentSiteName the new value for onlinePaymentSiteName
     */
    public void setOnlinePaymentSiteName(String aOnlinePaymentSiteName) {
        onlinePaymentSiteName = aOnlinePaymentSiteName;
    }

    /**
     * Access method for onlinePaymentSiteUrl.
     *
     * @return the current value of onlinePaymentSiteUrl
     */
    public String getOnlinePaymentSiteUrl() {
        return onlinePaymentSiteUrl;
    }

    /**
     * Setter method for onlinePaymentSiteUrl.
     *
     * @param aOnlinePaymentSiteUrl the new value for onlinePaymentSiteUrl
     */
    public void setOnlinePaymentSiteUrl(String aOnlinePaymentSiteUrl) {
        onlinePaymentSiteUrl = aOnlinePaymentSiteUrl;
    }

    /**
     * Access method for reimbursementOnline.
     *
     * @return the current value of reimbursementOnline
     */
    public Set<ReimbursementOnline> getReimbursementOnline() {
        return reimbursementOnline;
    }

    /**
     * Setter method for reimbursementOnline.
     *
     * @param aReimbursementOnline the new value for reimbursementOnline
     */
    public void setReimbursementOnline(Set<ReimbursementOnline> aReimbursementOnline) {
        reimbursementOnline = aReimbursementOnline;
    }

    /**
     * Compares the key for this instance with another OnlinePaymentSites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OnlinePaymentSites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OnlinePaymentSites)) {
            return false;
        }
        OnlinePaymentSites that = (OnlinePaymentSites) other;
        if (this.getOnlinePaymentSiteId() != that.getOnlinePaymentSiteId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OnlinePaymentSites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OnlinePaymentSites)) return false;
        return this.equalKeys(other) && ((OnlinePaymentSites)other).equalKeys(this);
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
        i = getOnlinePaymentSiteId();
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
        StringBuffer sb = new StringBuffer("[OnlinePaymentSites |");
        sb.append(" onlinePaymentSiteId=").append(getOnlinePaymentSiteId());
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
        ret.put("onlinePaymentSiteId", Integer.valueOf(getOnlinePaymentSiteId()));
        return ret;
    }

}
