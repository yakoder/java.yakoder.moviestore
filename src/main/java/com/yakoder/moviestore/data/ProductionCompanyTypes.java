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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="prod_co_types")
public class ProductionCompanyTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 862320906976945662L;

	/** Primary key. */
    protected static final String PK = "productionCompanyTypeId";

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
    @Column(name="prod_co_type_id", unique=true, nullable=false, precision=10)
    private int productionCompanyTypeId;
    @Column(name="prod_co_type_name", nullable=false, length=100)
    private String productionCompanyTypeName;
    @Column(name="prod_co_type_desc", length=255)
    private String productionCompanyTypeDesc;
    @OneToMany(mappedBy="prodCoTypes")
    private Set<MovieProductionCompanies> movieProductionCompanies;

    /** Default constructor. */
    public ProductionCompanyTypes() {
        super();
    }

    /**
     * Access method for productionCompanyTypeId.
     *
     * @return the current value of productionCompanyTypeId
     */
    public int getProductionCompanyTypeId() {
        return productionCompanyTypeId;
    }

    /**
     * Setter method for productionCompanyTypeId.
     *
     * @param aProductionCompanyTypeId the new value for productionCompanyTypeId
     */
    public void setProductionCompanyTypeId(int aProductionCompanyTypeId) {
        productionCompanyTypeId = aProductionCompanyTypeId;
    }

    /**
     * Access method for productionCompanyTypeName.
     *
     * @return the current value of productionCompanyTypeName
     */
    public String getProductionCompanyTypeName() {
        return productionCompanyTypeName;
    }

    /**
     * Setter method for productionCompanyTypeName.
     *
     * @param aProductionCompanyTypeName the new value for productionCompanyTypeName
     */
    public void setProductionCompanyTypeName(String aProductionCompanyTypeName) {
        productionCompanyTypeName = aProductionCompanyTypeName;
    }

    /**
     * Access method for productionCompanyTypeDesc.
     *
     * @return the current value of productionCompanyTypeDesc
     */
    public String getProductionCompanyTypeDesc() {
        return productionCompanyTypeDesc;
    }

    /**
     * Setter method for productionCompanyTypeDesc.
     *
     * @param aProductionCompanyTypeDesc the new value for productionCompanyTypeDesc
     */
    public void setProductionCompanyTypeDesc(String aProductionCompanyTypeDesc) {
        productionCompanyTypeDesc = aProductionCompanyTypeDesc;
    }

    /**
     * Access method for movieProductionCompanies.
     *
     * @return the current value of movieProductionCompanies
     */
    public Set<MovieProductionCompanies> getMovieProductionCompanies() {
        return movieProductionCompanies;
    }

    /**
     * Setter method for movieProductionCompanies.
     *
     * @param aMovieProductionCompanies the new value for movieProductionCompanies
     */
    public void setMovieProductionCompanies(Set<MovieProductionCompanies> aMovieProductionCompanies) {
        movieProductionCompanies = aMovieProductionCompanies;
    }

    /**
     * Compares the key for this instance with another ProdCoTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProdCoTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductionCompanyTypes)) {
            return false;
        }
        ProductionCompanyTypes that = (ProductionCompanyTypes) other;
        if (this.getProductionCompanyTypeId() != that.getProductionCompanyTypeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProdCoTypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductionCompanyTypes)) return false;
        return this.equalKeys(other) && ((ProductionCompanyTypes)other).equalKeys(this);
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
        i = getProductionCompanyTypeId();
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
        StringBuffer sb = new StringBuffer("[ProductionCompanyTypes |");
        sb.append(" productionCompanyTypeId=").append(getProductionCompanyTypeId());
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
        ret.put("productionCompanyTypeId", Integer.valueOf(getProductionCompanyTypeId()));
        return ret;
    }

}
