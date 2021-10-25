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

@Entity
@Table(name = "digitization_software", indexes = {
		@Index(name = "digitizationSoftwareDigitizationSoftwareDigitSwNameEnabledIdx", columnList = "digit_sw_name,digit_sw_is_enabled"),
		@Index(name = "digitizationSoftwareDigitizationSoftwareDigitSwNameVersionIdx", columnList = "digit_sw_name,digit_sw_version") })
public class DigitizationSoftware extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2913187139036570641L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "digit_sw_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "digit_sw_name", nullable = false, length = 100)
	private String name;
	@Column(name = "digit_sw_desc", length = 255)
	private String description;
	@Column(name = "digit_sw_version", length = 100)
	private String version;
	@Column(name = "digit_sw_is_enabled", nullable = false, length = 3)
	private boolean enabled;
	@Column(name = "digit_sw_config")
	private byte[] config;
	@Column(name = "digit_sw_preset")
	private byte[] preset;
	@Column(name = "digit_sw_config_filename", length = 100)
	private String configFilename;
	@Column(name = "digit_sw_preset_filename", length = 100)
	private String presetFilename;
	@OneToMany(mappedBy = "digitizationSoftware")
	private Set<InventoryDigitization> inventoryDigitization;

	/** Default constructor. */
	public DigitizationSoftware() {
		super();
	}

	/**
	 * Access method for version.
	 *
	 * @return the current value of version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Setter method for version.
	 *
	 * @param aVersion the new value for version
	 */
	public void setVersion(String aVersion) {
		version = aVersion;
	}

	/**
	 * Access method for enabled.
	 *
	 * @return true if and only if enabled is currently true
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Setter method for enabled.
	 *
	 * @param aEnabled the new value for enabled
	 */
	public void setEnabled(boolean aEnabled) {
		enabled = aEnabled;
	}

	/**
	 * Access method for config.
	 *
	 * @return the current value of config
	 */
	public byte[] getConfig() {
		return config;
	}

	/**
	 * Setter method for config.
	 *
	 * @param aConfig the new value for config
	 */
	public void setConfig(byte[] aConfig) {
		config = aConfig;
	}

	/**
	 * Access method for preset.
	 *
	 * @return the current value of preset
	 */
	public byte[] getPreset() {
		return preset;
	}

	/**
	 * Setter method for preset.
	 *
	 * @param aPreset the new value for preset
	 */
	public void setPreset(byte[] aPreset) {
		preset = aPreset;
	}

	/**
	 * Access method for configFilename.
	 *
	 * @return the current value of configFilename
	 */
	public String getDigitizationSoftwareConfigFilename() {
		return configFilename;
	}

	/**
	 * Setter method for configFilename.
	 *
	 * @param aConfigFilename the new value for configFilename
	 */
	public void setConfigFilename(String aConfigFilename) {
		configFilename = aConfigFilename;
	}

	/**
	 * Access method for presetFilename.
	 *
	 * @return the current value of presetFilename
	 */
	public String getPresetFilename() {
		return presetFilename;
	}

	/**
	 * Setter method for presetFilename.
	 *
	 * @param aPresetFilename the new value for presetFilename
	 */
	public void setPresetFilename(String aPresetFilename) {
		presetFilename = aPresetFilename;
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
	 * @return True if other object is instance of class DigitizationSoftware and
	 *         the key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DigitizationSoftware)) {
			return false;
		}
		DigitizationSoftware that = (DigitizationSoftware) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof DigitizationSoftware))
			return false;
		return this.equalKeys(other) && ((DigitizationSoftware) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[DigitizationSoftware |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
