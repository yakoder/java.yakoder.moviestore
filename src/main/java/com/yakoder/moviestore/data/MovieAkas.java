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
    private Movies movies2;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movies;

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
     * Access method for movies2.
     *
     * @return the current value of movies2
     */
    public Movies getMovies2() {
        return movies2;
    }

    /**
     * Setter method for movies2.
     *
     * @param aMovies2 the new value for movies2
     */
    public void setMovies2(Movies aMovies2) {
        movies2 = aMovies2;
    }

    /**
     * Access method for movies.
     *
     * @return the current value of movies
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * Setter method for movies.
     *
     * @param aMovies the new value for movies
     */
    public void setMovies(Movies aMovies) {
        movies = aMovies;
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
