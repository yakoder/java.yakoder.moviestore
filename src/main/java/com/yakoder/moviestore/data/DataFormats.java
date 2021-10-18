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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="data_formats", indexes={@Index(name="dataFormatsDataFormatsDataFmtNameParserIdx", columnList="data_fmt_name,data_fmt_parser")})
public class DataFormats implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5774368463908875420L;

	/** Primary key. */
    protected static final String PK = "dataFmtId";

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
    @Column(name="data_fmt_id", unique=true, nullable=false, precision=10)
    private int dataFmtId;
    @Column(name="data_fmt_name", nullable=false, length=100)
    private String dataFmtName;
    @Column(name="data_fmt_desc", length=255)
    private String dataFmtDesc;
    @Column(name="data_fmt_parser", length=255)
    private String dataFmtParser;
    @OneToMany(mappedBy="dataFormats")
    private Set<Apis> apis;

    /** Default constructor. */
    public DataFormats() {
        super();
    }

    /**
     * Access method for dataFmtId.
     *
     * @return the current value of dataFmtId
     */
    public int getDataFmtId() {
        return dataFmtId;
    }

    /**
     * Setter method for dataFmtId.
     *
     * @param aDataFmtId the new value for dataFmtId
     */
    public void setDataFmtId(int aDataFmtId) {
        dataFmtId = aDataFmtId;
    }

    /**
     * Access method for dataFmtName.
     *
     * @return the current value of dataFmtName
     */
    public String getDataFmtName() {
        return dataFmtName;
    }

    /**
     * Setter method for dataFmtName.
     *
     * @param aDataFmtName the new value for dataFmtName
     */
    public void setDataFmtName(String aDataFmtName) {
        dataFmtName = aDataFmtName;
    }

    /**
     * Access method for dataFmtDesc.
     *
     * @return the current value of dataFmtDesc
     */
    public String getDataFmtDesc() {
        return dataFmtDesc;
    }

    /**
     * Setter method for dataFmtDesc.
     *
     * @param aDataFmtDesc the new value for dataFmtDesc
     */
    public void setDataFmtDesc(String aDataFmtDesc) {
        dataFmtDesc = aDataFmtDesc;
    }

    /**
     * Access method for dataFmtParser.
     *
     * @return the current value of dataFmtParser
     */
    public String getDataFmtParser() {
        return dataFmtParser;
    }

    /**
     * Setter method for dataFmtParser.
     *
     * @param aDataFmtParser the new value for dataFmtParser
     */
    public void setDataFmtParser(String aDataFmtParser) {
        dataFmtParser = aDataFmtParser;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Set<Apis> getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Set<Apis> aApis) {
        apis = aApis;
    }

    /**
     * Compares the key for this instance with another DataFormats.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DataFormats and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DataFormats)) {
            return false;
        }
        DataFormats that = (DataFormats) other;
        if (this.getDataFmtId() != that.getDataFmtId()) {
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
        if (!(other instanceof DataFormats)) return false;
        return this.equalKeys(other) && ((DataFormats)other).equalKeys(this);
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
        i = getDataFmtId();
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
        StringBuffer sb = new StringBuffer("[DataFormats |");
        sb.append(" dataFmtId=").append(getDataFmtId());
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
        ret.put("dataFmtId", Integer.valueOf(getDataFmtId()));
        return ret;
    }

}
