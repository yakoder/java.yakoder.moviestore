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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="info_sites")
public class InfoSites implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 125647512128457838L;

	/** Primary key. */
    protected static final String PK = "infoSiteId";

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
    @Column(name="info_site_id", unique=true, nullable=false, precision=10)
    private int infoSiteId;
    @ManyToOne(optional=false)
    @JoinColumn(name="site_id", nullable=false)
    private Sites sites;

    /** Default constructor. */
    public InfoSites() {
        super();
    }

    /**
     * Access method for infoSiteId.
     *
     * @return the current value of infoSiteId
     */
    public int getInfoSiteId() {
        return infoSiteId;
    }

    /**
     * Setter method for infoSiteId.
     *
     * @param aInfoSiteId the new value for infoSiteId
     */
    public void setInfoSiteId(int aInfoSiteId) {
        infoSiteId = aInfoSiteId;
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
     * Compares the key for this instance with another InfoSites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InfoSites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InfoSites)) {
            return false;
        }
        InfoSites that = (InfoSites) other;
        if (this.getInfoSiteId() != that.getInfoSiteId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InfoSites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InfoSites)) return false;
        return this.equalKeys(other) && ((InfoSites)other).equalKeys(this);
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
        i = getInfoSiteId();
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
        StringBuffer sb = new StringBuffer("[InfoSites |");
        sb.append(" infoSiteId=").append(getInfoSiteId());
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
        ret.put("infoSiteId", Integer.valueOf(getInfoSiteId()));
        return ret;
    }

}
