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
public class ProdCoTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 862320906976945662L;

	/** Primary key. */
    protected static final String PK = "prodCoTypeId";

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
    private int prodCoTypeId;
    @Column(name="prod_co_type_name", nullable=false, length=100)
    private String prodCoTypeName;
    @Column(name="prod_co_type_desc", length=255)
    private String prodCoTypeDesc;
    @OneToMany(mappedBy="prodCoTypes")
    private Set<MovieProductionCompanies> movieProductionCompanies;

    /** Default constructor. */
    public ProdCoTypes() {
        super();
    }

    /**
     * Access method for prodCoTypeId.
     *
     * @return the current value of prodCoTypeId
     */
    public int getProdCoTypeId() {
        return prodCoTypeId;
    }

    /**
     * Setter method for prodCoTypeId.
     *
     * @param aProdCoTypeId the new value for prodCoTypeId
     */
    public void setProdCoTypeId(int aProdCoTypeId) {
        prodCoTypeId = aProdCoTypeId;
    }

    /**
     * Access method for prodCoTypeName.
     *
     * @return the current value of prodCoTypeName
     */
    public String getProdCoTypeName() {
        return prodCoTypeName;
    }

    /**
     * Setter method for prodCoTypeName.
     *
     * @param aProdCoTypeName the new value for prodCoTypeName
     */
    public void setProdCoTypeName(String aProdCoTypeName) {
        prodCoTypeName = aProdCoTypeName;
    }

    /**
     * Access method for prodCoTypeDesc.
     *
     * @return the current value of prodCoTypeDesc
     */
    public String getProdCoTypeDesc() {
        return prodCoTypeDesc;
    }

    /**
     * Setter method for prodCoTypeDesc.
     *
     * @param aProdCoTypeDesc the new value for prodCoTypeDesc
     */
    public void setProdCoTypeDesc(String aProdCoTypeDesc) {
        prodCoTypeDesc = aProdCoTypeDesc;
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
        if (!(other instanceof ProdCoTypes)) {
            return false;
        }
        ProdCoTypes that = (ProdCoTypes) other;
        if (this.getProdCoTypeId() != that.getProdCoTypeId()) {
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
        if (!(other instanceof ProdCoTypes)) return false;
        return this.equalKeys(other) && ((ProdCoTypes)other).equalKeys(this);
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
        i = getProdCoTypeId();
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
        StringBuffer sb = new StringBuffer("[ProdCoTypes |");
        sb.append(" prodCoTypeId=").append(getProdCoTypeId());
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
        ret.put("prodCoTypeId", Integer.valueOf(getProdCoTypeId()));
        return ret;
    }

}
