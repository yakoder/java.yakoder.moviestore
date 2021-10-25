// Generated with g9.

package com.yakoder.moviestore.data.store;

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

import com.yakoder.moviestore.data.movie.Movies;

@Entity(name="site_movies")
public class SiteMovies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 231818197790495580L;

	/** Primary key. */
    protected static final String PK = "siteMovieId";

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
    @Column(name="site_movie_id", unique=true, nullable=false, precision=10)
    private int siteMovieId;
    @Column(name="site_movie_num", length=100)
    private String siteMovieNum;
    @Column(name="site_movie_url", length=255)
    private String siteMovieUrl;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movie;
    @ManyToOne(optional=false)
    @JoinColumn(name="site_id", nullable=false)
    private Sites site;

    /** Default constructor. */
    public SiteMovies() {
        super();
    }

    /**
     * Access method for siteMovieId.
     *
     * @return the current value of siteMovieId
     */
    public int getSiteMovieId() {
        return siteMovieId;
    }

    /**
     * Setter method for siteMovieId.
     *
     * @param aSiteMovieId the new value for siteMovieId
     */
    public void setSiteMovieId(int aSiteMovieId) {
        siteMovieId = aSiteMovieId;
    }

    /**
     * Access method for siteMovieNum.
     *
     * @return the current value of siteMovieNum
     */
    public String getSiteMovieNum() {
        return siteMovieNum;
    }

    /**
     * Setter method for siteMovieNum.
     *
     * @param aSiteMovieNum the new value for siteMovieNum
     */
    public void setSiteMovieNum(String aSiteMovieNum) {
        siteMovieNum = aSiteMovieNum;
    }

    /**
     * Access method for siteMovieUrl.
     *
     * @return the current value of siteMovieUrl
     */
    public String getSiteMovieUrl() {
        return siteMovieUrl;
    }

    /**
     * Setter method for siteMovieUrl.
     *
     * @param aSiteMovieUrl the new value for siteMovieUrl
     */
    public void setSiteMovieUrl(String aSiteMovieUrl) {
        siteMovieUrl = aSiteMovieUrl;
    }

    /**
     * Access method for movie.
     *
     * @return the current value of movie
     */
    public Movies getMovie() {
        return movie;
    }

    /**
     * Setter method for movie.
     *
     * @param aMovie the new value for movie
     */
    public void setMovie(Movies aMovie) {
        movie = aMovie;
    }

    /**
     * Access method for site.
     *
     * @return the current value of site
     */
    public Sites getSite() {
        return site;
    }

    /**
     * Setter method for site.
     *
     * @param aSite the new value for site
     */
    public void setSite(Sites aSite) {
        site = aSite;
    }

    /**
     * Compares the key for this instance with another SiteMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SiteMovies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SiteMovies)) {
            return false;
        }
        SiteMovies that = (SiteMovies) other;
        if (this.getSiteMovieId() != that.getSiteMovieId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SiteMovies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SiteMovies)) return false;
        return this.equalKeys(other) && ((SiteMovies)other).equalKeys(this);
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
        i = getSiteMovieId();
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
        StringBuffer sb = new StringBuffer("[SiteMovies |");
        sb.append(" siteMovieId=").append(getSiteMovieId());
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
        ret.put("siteMovieId", Integer.valueOf(getSiteMovieId()));
        return ret;
    }

}
