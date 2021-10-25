// Generated with g9.

package com.yakoder.moviestore.data.movie;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;

@Entity(name = "prod_co_types")
public class ProductionCompanyType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 862320906976945662L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_co_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "prod_co_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "prod_co_type_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "prodCoTypes")
	private Set<MovieProductionCompany> movieProductionCompanies;

	/** Default constructor. */
	public ProductionCompanyType() {
		super();
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
	 * Compares the key for this instance with another ProdCoTypes.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ProdCoTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductionCompanyType)) {
			return false;
		}
		ProductionCompanyType that = (ProductionCompanyType) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof ProductionCompanyType))
			return false;
		return this.equalKeys(other) && ((ProductionCompanyType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ProductionCompanyTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
