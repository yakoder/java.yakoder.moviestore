// Generated with g9.

package com.yakoder.moviestore.data.movie;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="prod_cos")
public class ProductionCompany implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5068396319082401320L;

	/** Primary key. */
    protected static final String PK = "productionCompanyId";

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
    @Column(name="prod_co_id", unique=true, nullable=false, precision=10)
    private int productionCompanyId;
    @Column(name="prod_co_name", nullable=false, length=100)
    private String productionCompanyName;
    @Column(name="prod_co_url", length=255)
    private String productionCompanyUrl;
    @OneToMany(mappedBy="prodCos")
    private Set<MovieProductionCompany> movieProductionCompanies;

    /** Default constructor. */
    public ProductionCompany() {
        super();
    }

    /**
     * Access method for productionCompanyId.
     *
     * @return the current value of productionCompanyId
     */
    public int getProductionCompanyId() {
        return productionCompanyId;
    }

    /**
     * Setter method for productionCompanyId.
     *
     * @param aProductionCompanyId the new value for productionCompanyId
     */
    public void setProductionCompanyId(int aProductionCompanyId) {
        productionCompanyId = aProductionCompanyId;
    }

    /**
     * Access method for productionCompanyName.
     *
     * @return the current value of productionCompanyName
     */
    public String getProductionCompanyName() {
        return productionCompanyName;
    }

    /**
     * Setter method for productionCompanyName.
     *
     * @param aProductionCompanyName the new value for productionCompanyName
     */
    public void setProductionCompanyName(String aProductionCompanyName) {
        productionCompanyName = aProductionCompanyName;
    }

    /**
     * Access method for productionCompanyUrl.
     *
     * @return the current value of productionCompanyUrl
     */
    public String getProductionCompanyUrl() {
        return productionCompanyUrl;
    }

    /**
     * Setter method for productionCompanyUrl.
     *
     * @param aProductionCompanyUrl the new value for productionCompanyUrl
     */
    public void setProductionCompanyUrl(String aProductionCompanyUrl) {
        productionCompanyUrl = aProductionCompanyUrl;
    }

    /**
     * Access method for movieProductionCompanies.
     *
     * @return the current value of movieProductionCompanies
     */
    public Set<MovieProductionCompany> getMovieProductionCompanies() {
        return movieProductionCompanies;
    }

    /**
     * Setter method for movieProductionCompanies.
     *
     * @param aMovieProductionCompanies the new value for movieProductionCompanies
     */
    public void setMovieProductionCompanies(Set<MovieProductionCompany> aMovieProductionCompanies) {
        movieProductionCompanies = aMovieProductionCompanies;
    }

    /**
     * Compares the key for this instance with another ProductionCompanies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProductionCompanies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductionCompany)) {
            return false;
        }
        ProductionCompany that = (ProductionCompany) other;
        if (this.getProductionCompanyId() != that.getProductionCompanyId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProductionCompanies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductionCompany)) return false;
        return this.equalKeys(other) && ((ProductionCompany)other).equalKeys(this);
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
        i = getProductionCompanyId();
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
        StringBuffer sb = new StringBuffer("[ProductionCompanies |");
        sb.append(" productionCompanyId=").append(getProductionCompanyId());
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
        ret.put("productionCompanyId", Integer.valueOf(getProductionCompanyId()));
        return ret;
    }

}
