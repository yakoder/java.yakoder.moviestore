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
@Table(name="digitization_software", indexes={@Index(name="digitizationSoftwareDigitizationSoftwareDigitSwNameEnabledIdx", columnList="digit_sw_name,digit_sw_is_enabled"), @Index(name="digitizationSoftwareDigitizationSoftwareDigitSwNameVersionIdx", columnList="digit_sw_name,digit_sw_version")})
public class DigitizationSoftware implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2913187139036570641L;

	/** Primary key. */
    protected static final String PK = "digitSwId";

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
    @Column(name="digit_sw_id", unique=true, nullable=false, precision=10)
    private int digitSwId;
    @Column(name="digit_sw_name", nullable=false, length=100)
    private String digitSwName;
    @Column(name="digit_sw_desc", length=255)
    private String digitSwDesc;
    @Column(name="digit_sw_version", length=100)
    private String digitSwVersion;
    @Column(name="digit_sw_is_enabled", nullable=false, length=3)
    private boolean digitSwIsEnabled;
    @Column(name="digit_sw_config")
    private byte[] digitSwConfig;
    @Column(name="digit_sw_preset")
    private byte[] digitSwPreset;
    @Column(name="digit_sw_config_filename", length=100)
    private String digitSwConfigFilename;
    @Column(name="digit_sw_preset_filename", length=100)
    private String digitSwPresetFilename;
    @OneToMany(mappedBy="digitizationSoftware")
    private Set<InvDigitization> invDigitization;

    /** Default constructor. */
    public DigitizationSoftware() {
        super();
    }

    /**
     * Access method for digitSwId.
     *
     * @return the current value of digitSwId
     */
    public int getDigitSwId() {
        return digitSwId;
    }

    /**
     * Setter method for digitSwId.
     *
     * @param aDigitSwId the new value for digitSwId
     */
    public void setDigitSwId(int aDigitSwId) {
        digitSwId = aDigitSwId;
    }

    /**
     * Access method for digitSwName.
     *
     * @return the current value of digitSwName
     */
    public String getDigitSwName() {
        return digitSwName;
    }

    /**
     * Setter method for digitSwName.
     *
     * @param aDigitSwName the new value for digitSwName
     */
    public void setDigitSwName(String aDigitSwName) {
        digitSwName = aDigitSwName;
    }

    /**
     * Access method for digitSwDesc.
     *
     * @return the current value of digitSwDesc
     */
    public String getDigitSwDesc() {
        return digitSwDesc;
    }

    /**
     * Setter method for digitSwDesc.
     *
     * @param aDigitSwDesc the new value for digitSwDesc
     */
    public void setDigitSwDesc(String aDigitSwDesc) {
        digitSwDesc = aDigitSwDesc;
    }

    /**
     * Access method for digitSwVersion.
     *
     * @return the current value of digitSwVersion
     */
    public String getDigitSwVersion() {
        return digitSwVersion;
    }

    /**
     * Setter method for digitSwVersion.
     *
     * @param aDigitSwVersion the new value for digitSwVersion
     */
    public void setDigitSwVersion(String aDigitSwVersion) {
        digitSwVersion = aDigitSwVersion;
    }

    /**
     * Access method for digitSwIsEnabled.
     *
     * @return true if and only if digitSwIsEnabled is currently true
     */
    public boolean isDigitSwIsEnabled() {
        return digitSwIsEnabled;
    }

    /**
     * Setter method for digitSwIsEnabled.
     *
     * @param aDigitSwIsEnabled the new value for digitSwIsEnabled
     */
    public void setDigitSwIsEnabled(boolean aDigitSwIsEnabled) {
        digitSwIsEnabled = aDigitSwIsEnabled;
    }

    /**
     * Access method for digitSwConfig.
     *
     * @return the current value of digitSwConfig
     */
    public byte[] getDigitSwConfig() {
        return digitSwConfig;
    }

    /**
     * Setter method for digitSwConfig.
     *
     * @param aDigitSwConfig the new value for digitSwConfig
     */
    public void setDigitSwConfig(byte[] aDigitSwConfig) {
        digitSwConfig = aDigitSwConfig;
    }

    /**
     * Access method for digitSwPreset.
     *
     * @return the current value of digitSwPreset
     */
    public byte[] getDigitSwPreset() {
        return digitSwPreset;
    }

    /**
     * Setter method for digitSwPreset.
     *
     * @param aDigitSwPreset the new value for digitSwPreset
     */
    public void setDigitSwPreset(byte[] aDigitSwPreset) {
        digitSwPreset = aDigitSwPreset;
    }

    /**
     * Access method for digitSwConfigFilename.
     *
     * @return the current value of digitSwConfigFilename
     */
    public String getDigitSwConfigFilename() {
        return digitSwConfigFilename;
    }

    /**
     * Setter method for digitSwConfigFilename.
     *
     * @param aDigitSwConfigFilename the new value for digitSwConfigFilename
     */
    public void setDigitSwConfigFilename(String aDigitSwConfigFilename) {
        digitSwConfigFilename = aDigitSwConfigFilename;
    }

    /**
     * Access method for digitSwPresetFilename.
     *
     * @return the current value of digitSwPresetFilename
     */
    public String getDigitSwPresetFilename() {
        return digitSwPresetFilename;
    }

    /**
     * Setter method for digitSwPresetFilename.
     *
     * @param aDigitSwPresetFilename the new value for digitSwPresetFilename
     */
    public void setDigitSwPresetFilename(String aDigitSwPresetFilename) {
        digitSwPresetFilename = aDigitSwPresetFilename;
    }

    /**
     * Access method for invDigitization.
     *
     * @return the current value of invDigitization
     */
    public Set<InvDigitization> getInvDigitization() {
        return invDigitization;
    }

    /**
     * Setter method for invDigitization.
     *
     * @param aInvDigitization the new value for invDigitization
     */
    public void setInvDigitization(Set<InvDigitization> aInvDigitization) {
        invDigitization = aInvDigitization;
    }

    /**
     * Compares the key for this instance with another DigitizationSoftware.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DigitizationSoftware and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DigitizationSoftware)) {
            return false;
        }
        DigitizationSoftware that = (DigitizationSoftware) other;
        if (this.getDigitSwId() != that.getDigitSwId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DigitizationSoftware.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DigitizationSoftware)) return false;
        return this.equalKeys(other) && ((DigitizationSoftware)other).equalKeys(this);
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
        i = getDigitSwId();
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
        StringBuffer sb = new StringBuffer("[DigitizationSoftware |");
        sb.append(" digitSwId=").append(getDigitSwId());
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
        ret.put("digitSwId", Integer.valueOf(getDigitSwId()));
        return ret;
    }

}
