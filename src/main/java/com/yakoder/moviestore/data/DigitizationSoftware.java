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
    protected static final String PK = "digitizationSoftwareId";

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
    private int digitizationSoftwareId;
    @Column(name="digit_sw_name", nullable=false, length=100)
    private String digitizationSoftwareName;
    @Column(name="digit_sw_desc", length=255)
    private String digitizationSoftwareDesc;
    @Column(name="digit_sw_version", length=100)
    private String digitizationSoftwareVersion;
    @Column(name="digit_sw_is_enabled", nullable=false, length=3)
    private boolean digitizationSoftwareIsEnabled;
    @Column(name="digit_sw_config")
    private byte[] digitizationSoftwareConfig;
    @Column(name="digit_sw_preset")
    private byte[] digitizationSoftwarePreset;
    @Column(name="digit_sw_config_filename", length=100)
    private String digitizationSoftwareConfigFilename;
    @Column(name="digit_sw_preset_filename", length=100)
    private String digitizationSoftwarePresetFilename;
    @OneToMany(mappedBy="digitizationSoftware")
    private Set<InventoryDigitization> inventoryDigitization;

    /** Default constructor. */
    public DigitizationSoftware() {
        super();
    }

    /**
     * Access method for digitizationSoftwareId.
     *
     * @return the current value of digitizationSoftwareId
     */
    public int getDigitizationSoftwareId() {
        return digitizationSoftwareId;
    }

    /**
     * Setter method for digitizationSoftwareId.
     *
     * @param aDigitizationSoftwareId the new value for digitizationSoftwareId
     */
    public void setDigitizationSoftwareId(int aDigitizationSoftwareId) {
        digitizationSoftwareId = aDigitizationSoftwareId;
    }

    /**
     * Access method for digitizationSoftwareName.
     *
     * @return the current value of digitizationSoftwareName
     */
    public String getDigitizationSoftwareName() {
        return digitizationSoftwareName;
    }

    /**
     * Setter method for digitizationSoftwareName.
     *
     * @param aDigitizationSoftwareName the new value for digitizationSoftwareName
     */
    public void setDigitizationSoftwareName(String aDigitizationSoftwareName) {
        digitizationSoftwareName = aDigitizationSoftwareName;
    }

    /**
     * Access method for digitizationSoftwareDesc.
     *
     * @return the current value of digitizationSoftwareDesc
     */
    public String getDigitizationSoftwareDesc() {
        return digitizationSoftwareDesc;
    }

    /**
     * Setter method for digitizationSoftwareDesc.
     *
     * @param aDigitizationSoftwareDesc the new value for digitizationSoftwareDesc
     */
    public void setDigitizationSoftwareDesc(String aDigitizationSoftwareDesc) {
        digitizationSoftwareDesc = aDigitizationSoftwareDesc;
    }

    /**
     * Access method for digitizationSoftwareVersion.
     *
     * @return the current value of digitizationSoftwareVersion
     */
    public String getDigitizationSoftwareVersion() {
        return digitizationSoftwareVersion;
    }

    /**
     * Setter method for digitizationSoftwareVersion.
     *
     * @param aDigitizationSoftwareVersion the new value for digitizationSoftwareVersion
     */
    public void setDigitizationSoftwareVersion(String aDigitizationSoftwareVersion) {
        digitizationSoftwareVersion = aDigitizationSoftwareVersion;
    }

    /**
     * Access method for digitizationSoftwareIsEnabled.
     *
     * @return true if and only if digitizationSoftwareIsEnabled is currently true
     */
    public boolean isDigitizationSoftwareIsEnabled() {
        return digitizationSoftwareIsEnabled;
    }

    /**
     * Setter method for digitizationSoftwareIsEnabled.
     *
     * @param aDigitizationSoftwareIsEnabled the new value for digitizationSoftwareIsEnabled
     */
    public void setDigitizationSoftwareIsEnabled(boolean aDigitizationSoftwareIsEnabled) {
        digitizationSoftwareIsEnabled = aDigitizationSoftwareIsEnabled;
    }

    /**
     * Access method for digitizationSoftwareConfig.
     *
     * @return the current value of digitizationSoftwareConfig
     */
    public byte[] getDigitizationSoftwareConfig() {
        return digitizationSoftwareConfig;
    }

    /**
     * Setter method for digitizationSoftwareConfig.
     *
     * @param aDigitizationSoftwareConfig the new value for digitizationSoftwareConfig
     */
    public void setDigitizationSoftwareConfig(byte[] aDigitizationSoftwareConfig) {
        digitizationSoftwareConfig = aDigitizationSoftwareConfig;
    }

    /**
     * Access method for digitizationSoftwarePreset.
     *
     * @return the current value of digitizationSoftwarePreset
     */
    public byte[] getDigitizationSoftwarePreset() {
        return digitizationSoftwarePreset;
    }

    /**
     * Setter method for digitizationSoftwarePreset.
     *
     * @param aDigitizationSoftwarePreset the new value for digitizationSoftwarePreset
     */
    public void setDigitizationSoftwarePreset(byte[] aDigitizationSoftwarePreset) {
        digitizationSoftwarePreset = aDigitizationSoftwarePreset;
    }

    /**
     * Access method for digitizationSoftwareConfigFilename.
     *
     * @return the current value of digitizationSoftwareConfigFilename
     */
    public String getDigitizationSoftwareConfigFilename() {
        return digitizationSoftwareConfigFilename;
    }

    /**
     * Setter method for digitizationSoftwareConfigFilename.
     *
     * @param aDigitizationSoftwareConfigFilename the new value for digitizationSoftwareConfigFilename
     */
    public void setDigitizationSoftwareConfigFilename(String aDigitizationSoftwareConfigFilename) {
        digitizationSoftwareConfigFilename = aDigitizationSoftwareConfigFilename;
    }

    /**
     * Access method for digitizationSoftwarePresetFilename.
     *
     * @return the current value of digitizationSoftwarePresetFilename
     */
    public String getDigitizationSoftwarePresetFilename() {
        return digitizationSoftwarePresetFilename;
    }

    /**
     * Setter method for digitizationSoftwarePresetFilename.
     *
     * @param aDigitizationSoftwarePresetFilename the new value for digitizationSoftwarePresetFilename
     */
    public void setDigitizationSoftwarePresetFilename(String aDigitizationSoftwarePresetFilename) {
        digitizationSoftwarePresetFilename = aDigitizationSoftwarePresetFilename;
    }

    /**
     * Access method for inventoryDigitization.
     *
     * @return the current value of inventoryDigitization
     */
    public Set<InventoryDigitization> getInventoryDigitization() {
        return inventoryDigitization;
    }

    /**
     * Setter method for inventoryDigitization.
     *
     * @param aInventoryDigitization the new value for inventoryDigitization
     */
    public void setInventoryDigitization(Set<InventoryDigitization> aInventoryDigitization) {
        inventoryDigitization = aInventoryDigitization;
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
        if (this.getDigitizationSoftwareId() != that.getDigitizationSoftwareId()) {
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
        i = getDigitizationSoftwareId();
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
        sb.append(" digitizationSoftwareId=").append(getDigitizationSoftwareId());
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
        ret.put("digitizationSoftwareId", Integer.valueOf(getDigitizationSoftwareId()));
        return ret;
    }

}
