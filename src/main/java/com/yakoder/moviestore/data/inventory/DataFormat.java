// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;
import com.yakoder.moviestore.data.store.Api;

@Entity
@Table(name = "data_formats", indexes = {
		@Index(name = "dataFormatsDataFormatsDataFmtNameParserIdx", columnList = "data_fmt_name,data_fmt_parser") })
public class DataFormat extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5774368463908875420L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "data_fmt_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "data_fmt_name", nullable = false, length = 100)
	private String name;
	@Column(name = "data_fmt_desc", length = 255)
	private String description;
	@Column(name = "data_fmt_parser", length = 255)
	private String parser;
	@OneToMany(mappedBy = "dataFormats")
	private Set<Api> apis;

	/** Default constructor. */
	public DataFormat() {
		super();
	}

	/**
	 * Access method for parser.
	 *
	 * @return the current value of parser
	 */
	public String getParser() {
		return parser;
	}

	/**
	 * Setter method for parser.
	 *
	 * @param aParser the new value for parser
	 */
	public void setParser(String aParser) {
		parser = aParser;
	}

	/**
	 * Access method for apis.
	 *
	 * @return the current value of apis
	 */
	public Set<Api> getApis() {
		return apis;
	}

	/**
	 * Setter method for apis.
	 *
	 * @param aApis the new value for apis
	 */
	public void setApis(Set<Api> aApis) {
		apis = aApis;
	}

	/**
	 * Compares the key for this instance with another DataFormats.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DataFormats and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DataFormat)) {
			return false;
		}
		DataFormat that = (DataFormat) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DataFormats.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DataFormat))
			return false;
		return this.equalKeys(other) && ((DataFormat) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[DataFormats |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
