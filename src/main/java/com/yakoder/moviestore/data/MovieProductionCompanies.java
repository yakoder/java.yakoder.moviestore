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

@Entity(name="movie_prod_cos")
public class MovieProdCos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2992477004739053626L;

	/** Primary key. */
    protected static final String PK = "movieProdCoId";

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
    @Column(name="movie_prod_co_id", unique=true, nullable=false, precision=10)
    private int movieProdCoId;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movies;
    @ManyToOne(optional=false)
    @JoinColumn(name="prod_co_id", nullable=false)
    private ProdCos prodCos;
    @ManyToOne(optional=false)
    @JoinColumn(name="prod_co_type_id", nullable=false)
    private ProdCoTypes prodCoTypes;

    /** Default constructor. */
    public MovieProdCos() {
        super();
    }

    /**
     * Access method for movieProdCoId.
     *
     * @return the current value of movieProdCoId
     */
    public int getMovieProdCoId() {
        return movieProdCoId;
    }

    /**
     * Setter method for movieProdCoId.
     *
     * @param aMovieProdCoId the new value for movieProdCoId
     */
    public void setMovieProdCoId(int aMovieProdCoId) {
        movieProdCoId = aMovieProdCoId;
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
     * Access method for prodCos.
     *
     * @return the current value of prodCos
     */
    public ProdCos getProdCos() {
        return prodCos;
    }

    /**
     * Setter method for prodCos.
     *
     * @param aProdCos the new value for prodCos
     */
    public void setProdCos(ProdCos aProdCos) {
        prodCos = aProdCos;
    }

    /**
     * Access method for prodCoTypes.
     *
     * @return the current value of prodCoTypes
     */
    public ProdCoTypes getProdCoTypes() {
        return prodCoTypes;
    }

    /**
     * Setter method for prodCoTypes.
     *
     * @param aProdCoTypes the new value for prodCoTypes
     */
    public void setProdCoTypes(ProdCoTypes aProdCoTypes) {
        prodCoTypes = aProdCoTypes;
    }

    /**
     * Compares the key for this instance with another MovieProdCos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MovieProdCos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MovieProdCos)) {
            return false;
        }
        MovieProdCos that = (MovieProdCos) other;
        if (this.getMovieProdCoId() != that.getMovieProdCoId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MovieProdCos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MovieProdCos)) return false;
        return this.equalKeys(other) && ((MovieProdCos)other).equalKeys(this);
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
        i = getMovieProdCoId();
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
        StringBuffer sb = new StringBuffer("[MovieProdCos |");
        sb.append(" movieProdCoId=").append(getMovieProdCoId());
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
        ret.put("movieProdCoId", Integer.valueOf(getMovieProdCoId()));
        return ret;
    }

}
