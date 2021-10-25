// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDataObject;
import com.yakoder.moviestore.data.store.StoreImportPrep;

@Entity
@Table(name = "external_ids", indexes = {
		@Index(name = "external_ids_ext_id_name_IX", columnList = "ext_id_name", unique = true),
		@Index(name = "externalIdsExternalIdsGrpMovieIdIdx", columnList = "grp_id,grp_movie_id") })
public class ExternalId extends SimpleDataObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5650413945957224854L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ext_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "ext_id_name", unique = true, nullable = false, length = 100)
	private String externalIdName;
	@ManyToOne(optional = false)
	@JoinColumn(name = "grp_id", nullable = false)
	private Group groups;
	@ManyToOne(optional = false)
	@JoinColumn(name = "grp_movie_id", nullable = false)
	private GroupMovie groupMovies;
	@ManyToOne(optional = false)
	@JoinColumn(name = "inv_id", nullable = false)
	private Inventory inventory;
	@OneToOne(mappedBy = "externalIds")
	private StoreImportPrep storeImportPrep;

	/** Default constructor. */
	public ExternalId() {
		super();
	}

	/**
	 * Access method for externalIdName.
	 *
	 * @return the current value of externalIdName
	 */
	public String getExternalIdName() {
		return externalIdName;
	}

	/**
	 * Setter method for externalIdName.
	 *
	 * @param aExternalIdName the new value for externalIdName
	 */
	public void setExternalIdName(String aExternalIdName) {
		externalIdName = aExternalIdName;
	}

	/**
	 * Access method for groups.
	 *
	 * @return the current value of groups
	 */
	public Group getGroups() {
		return groups;
	}

	/**
	 * Setter method for groups.
	 *
	 * @param aGroups the new value for groups
	 */
	public void setGroups(Group aGroups) {
		groups = aGroups;
	}

	/**
	 * Access method for groupMovies.
	 *
	 * @return the current value of groupMovies
	 */
	public GroupMovie getGroupMovies() {
		return groupMovies;
	}

	/**
	 * Setter method for groupMovies.
	 *
	 * @param aGroupMovies the new value for groupMovies
	 */
	public void setGroupMovies(GroupMovie aGroupMovies) {
		groupMovies = aGroupMovies;
	}

	/**
	 * Access method for inventory.
	 *
	 * @return the current value of inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * Setter method for inventory.
	 *
	 * @param aInventory the new value for inventory
	 */
	public void setInventory(Inventory aInventory) {
		inventory = aInventory;
	}

	/**
	 * Access method for storeImportPrep.
	 *
	 * @return the current value of storeImportPrep
	 */
	public StoreImportPrep getStoreImportPrep() {
		return storeImportPrep;
	}

	/**
	 * Setter method for storeImportPrep.
	 *
	 * @param aStoreImportPrep the new value for storeImportPrep
	 */
	public void setStoreImportPrep(StoreImportPrep aStoreImportPrep) {
		storeImportPrep = aStoreImportPrep;
	}

	/**
	 * Gets the group fragment groupId for member groups.
	 *
	 * @return Current value of the group fragment
	 * @see Group
	 */
	public int getGroupsGroupId() {
		return (getGroups() == null ? null : getGroups().getId());
	}

	/**
	 * Sets the group fragment groupId from member groups.
	 *
	 * @param aGroupId New value for the group fragment
	 * @see Group
	 */
	public void setGroupsGroupId(int aGroupId) {
		if (getGroups() != null) {
			getGroups().setId(aGroupId);
		}
	}

	/**
	 * Gets the group fragment groupMovieId for member groupMovies.
	 *
	 * @return Current value of the group fragment
	 * @see GroupMovie
	 */
	public int getGroupMoviesGroupMovieId() {
		return (getGroupMovies() == null ? null : getGroupMovies().getId());
	}

	/**
	 * Sets the group fragment groupMovieId from member groupMovies.
	 *
	 * @param aGroupMovieId New value for the group fragment
	 * @see GroupMovie
	 */
	public void setGroupMoviesGroupMovieId(int aGroupMovieId) {
		if (getGroupMovies() != null) {
			getGroupMovies().setId(aGroupMovieId);
		}
	}

	/**
	 * Compares the key for this instance with another ExternalIds.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ExternalIds and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExternalId)) {
			return false;
		}
		ExternalId that = (ExternalId) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ExternalIds.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ExternalId))
			return false;
		return this.equalKeys(other) && ((ExternalId) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ExternalIds |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
