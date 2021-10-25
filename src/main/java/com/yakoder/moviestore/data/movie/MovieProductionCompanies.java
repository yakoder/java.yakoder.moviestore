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

@Entity(name="movie_prod_cos")
public class MovieProductionCompanies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2992477004739053626L;

	/** Primary key. */
    protected static final String PK = "movieProductionCompanyId";

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
    private int movieProductionCompanyId;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movie;
    @ManyToOne(optional=false)
    @JoinColumn(name="prod_co_id", nullable=false)
    private ProductionCompanies prodCos;
    @ManyToOne(optional=false)
    @JoinColumn(name="prod_co_type_id", nullable=false)
    private ProductionCompanyTypes productionCompanyTypes;

    /** Default constructor. */
    public MovieProductionCompanies() {
        super();
    }

    /**
     * Access method for movieProductionCompanyId.
     *
     * @return the current value of movieProductionCompanyId
     */
    public int getMovieProductionCompanyId() {
        return movieProductionCompanyId;
    }

    /**
     * Setter method for movieProductionCompanyId.
     *
     * @param aMovieProductionCompanyId the new value for movieProductionCompanyId
     */
    public void setMovieProductionCompanyId(int aMovieProductionCompanyId) {
        movieProductionCompanyId = aMovieProductionCompanyId;
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
     * Access method for prodCos.
     *
     * @return the current value of prodCos
     */
    public ProductionCompanies getProductionCompanies() {
        return prodCos;
    }

    /**
     * Setter method for prodCos.
     *
     * @param aProductionCompanies the new value for prodCos
     */
    public void setProductionCompanies(ProductionCompanies aProductionCompanies) {
        prodCos = aProductionCompanies;
    }

    /**
     * Access method for productionCompanyTypes.
     *
     * @return the current value of productionCompanyTypes
     */
    public ProductionCompanyTypes getProductionCompanyTypes() {
        return productionCompanyTypes;
    }

    /**
     * Setter method for productionCompanyTypes.
     *
     * @param aProductionCompanyTypes the new value for productionCompanyTypes
     */
    public void setProductionCompanyTypes(ProductionCompanyTypes aProductionCompanyTypes) {
        productionCompanyTypes = aProductionCompanyTypes;
    }

    /**
     * Compares the key for this instance with another MovieProductionCompanies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MovieProductionCompanies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MovieProductionCompanies)) {
            return false;
        }
        MovieProductionCompanies that = (MovieProductionCompanies) other;
        if (this.getMovieProductionCompanyId() != that.getMovieProductionCompanyId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MovieProductionCompanies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MovieProductionCompanies)) return false;
        return this.equalKeys(other) && ((MovieProductionCompanies)other).equalKeys(this);
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
        i = getMovieProductionCompanyId();
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
        StringBuffer sb = new StringBuffer("[MovieProductionCompanies |");
        sb.append(" movieProductionCompanyId=").append(getMovieProductionCompanyId());
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
        ret.put("movieProductionCompanyId", Integer.valueOf(getMovieProductionCompanyId()));
        return ret;
    }

}
