/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthcareEquipHeadingListException;
import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the healthcare equip heading list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListUtil
 * @generated
 */
@ProviderType
public interface HealthcareEquipHeadingListPersistence
	extends BasePersistence<HealthcareEquipHeadingList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthcareEquipHeadingListUtil} to access the healthcare equip heading list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a matching healthcare equip heading list could not be found
	 */
	public HealthcareEquipHeadingList findByget_HL_HD(
			String healthcareDescription)
		throws NoSuchHealthcareEquipHeadingListException;

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	public HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription);

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	public HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription, boolean useFinderCache);

	/**
	 * Removes the healthcare equip heading list where healthcareDescription = &#63; from the database.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the healthcare equip heading list that was removed
	 */
	public HealthcareEquipHeadingList removeByget_HL_HD(
			String healthcareDescription)
		throws NoSuchHealthcareEquipHeadingListException;

	/**
	 * Returns the number of healthcare equip heading lists where healthcareDescription = &#63;.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the number of matching healthcare equip heading lists
	 */
	public int countByget_HL_HD(String healthcareDescription);

	/**
	 * Caches the healthcare equip heading list in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 */
	public void cacheResult(
		HealthcareEquipHeadingList healthcareEquipHeadingList);

	/**
	 * Caches the healthcare equip heading lists in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingLists the healthcare equip heading lists
	 */
	public void cacheResult(
		java.util.List<HealthcareEquipHeadingList> healthcareEquipHeadingLists);

	/**
	 * Creates a new healthcare equip heading list with the primary key. Does not add the healthcare equip heading list to the database.
	 *
	 * @param healthcareEquipHeadingListId the primary key for the new healthcare equip heading list
	 * @return the new healthcare equip heading list
	 */
	public HealthcareEquipHeadingList create(long healthcareEquipHeadingListId);

	/**
	 * Removes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	public HealthcareEquipHeadingList remove(long healthcareEquipHeadingListId)
		throws NoSuchHealthcareEquipHeadingListException;

	public HealthcareEquipHeadingList updateImpl(
		HealthcareEquipHeadingList healthcareEquipHeadingList);

	/**
	 * Returns the healthcare equip heading list with the primary key or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	public HealthcareEquipHeadingList findByPrimaryKey(
			long healthcareEquipHeadingListId)
		throws NoSuchHealthcareEquipHeadingListException;

	/**
	 * Returns the healthcare equip heading list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list, or <code>null</code> if a healthcare equip heading list with the primary key could not be found
	 */
	public HealthcareEquipHeadingList fetchByPrimaryKey(
		long healthcareEquipHeadingListId);

	/**
	 * Returns all the healthcare equip heading lists.
	 *
	 * @return the healthcare equip heading lists
	 */
	public java.util.List<HealthcareEquipHeadingList> findAll();

	/**
	 * Returns a range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @return the range of healthcare equip heading lists
	 */
	public java.util.List<HealthcareEquipHeadingList> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of healthcare equip heading lists
	 */
	public java.util.List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthcareEquipHeadingList> orderByComparator);

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of healthcare equip heading lists
	 */
	public java.util.List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthcareEquipHeadingList> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the healthcare equip heading lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of healthcare equip heading lists.
	 *
	 * @return the number of healthcare equip heading lists
	 */
	public int countAll();

}