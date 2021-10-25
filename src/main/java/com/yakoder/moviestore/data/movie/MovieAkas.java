// Generated with g9.

package com.yakoder.moviestore.data.movie;

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

@Entity(name="movie_akas")
public class MovieAkas implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4277453959463879216L;

	/** Primary key. */
    protected static final String PK = "movieAkaId";

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
    @Column(name="movie_aka_id", unique=true, nullable=false, precision=10)
    private int movieAkaId;
    @ManyToOne(optional=false)
    @JoinColumn(name="aka_id", nullable=false)
    private Movies aka;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies primary;

    /** Default constructor. */
    public MovieAkas() {
        super();
    }

    /**
     * Access method for movieAkaId.
     *
     * @return the current value of movieAkaId
     */
    public int getMovieAkaId() {
        return movieAkaId;
    }

    /**
     * Setter method for movieAkaId.
     *
     * @param aMovieAkaId the new value for movieAkaId
     */
    public void setMovieAkaId(int aMovieAkaId) {
        movieAkaId = aMovieAkaId;
    }

    /**
     * Access method for aka.
     *
     * @return the current value of aka
     */
    public Movies getAka() {
        return aka;
    }

    /**
     * Setter method for aka.
     *
     * @param aAka the new value for aka
     */
    public void setAka(Movies aAka) {
        aka = aAka;
    }

    /**
     * Access method for primary.
     *
     * @return the current value of primary
     */
    public Movies getPrimary() {
        return primary;
    }

    /**
     * Setter method for primary.
     *
     * @param aPrimary the new value for primary
     */
    public void setPrimary(Movies aPrimary) {
        primary = aPrimary;
    }

    /**
     * Compares the key for this instance with another MovieAkas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MovieAkas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MovieAkas)) {
            return false;
        }
        MovieAkas that = (MovieAkas) other;
        if (this.getMovieAkaId() != that.getMovieAkaId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MovieAkas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MovieAkas)) return false;
        return this.equalKeys(other) && ((MovieAkas)other).equalKeys(this);
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
        i = getMovieAkaId();
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
        StringBuffer sb = new StringBuffer("[MovieAkas |");
        sb.append(" movieAkaId=").append(getMovieAkaId());
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
        ret.put("movieAkaId", Integer.valueOf(getMovieAkaId()));
        return ret;
    }

}
