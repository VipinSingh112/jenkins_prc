/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyPersonnelException;
import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body personnel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnelUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyPersonnelPersistence
	extends BasePersistence<AccCerBodyPersonnel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyPersonnelUtil} to access the acc cer body personnel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body personnels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns the acc cer body personnels before and after the current acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyPersonnelId the primary key of the current acc cer body personnel
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public AccCerBodyPersonnel[] findByUuid_PrevAndNext(
			long accCerBodyPersonnelId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Removes all the acc cer body personnels where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body personnels
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body personnel where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body personnel that was removed
	 */
	public AccCerBodyPersonnel removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body personnels
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns the acc cer body personnels before and after the current acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyPersonnelId the primary key of the current acc cer body personnel
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public AccCerBodyPersonnel[] findByUuid_C_PrevAndNext(
			long accCerBodyPersonnelId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyPersonnel> orderByComparator)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Removes all the acc cer body personnels where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body personnels
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public AccCerBodyPersonnel fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body personnel where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body personnel that was removed
	 */
	public AccCerBodyPersonnel removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the number of acc cer body personnels where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body personnels
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body personnel in the entity cache if it is enabled.
	 *
	 * @param accCerBodyPersonnel the acc cer body personnel
	 */
	public void cacheResult(AccCerBodyPersonnel accCerBodyPersonnel);

	/**
	 * Caches the acc cer body personnels in the entity cache if it is enabled.
	 *
	 * @param accCerBodyPersonnels the acc cer body personnels
	 */
	public void cacheResult(
		java.util.List<AccCerBodyPersonnel> accCerBodyPersonnels);

	/**
	 * Creates a new acc cer body personnel with the primary key. Does not add the acc cer body personnel to the database.
	 *
	 * @param accCerBodyPersonnelId the primary key for the new acc cer body personnel
	 * @return the new acc cer body personnel
	 */
	public AccCerBodyPersonnel create(long accCerBodyPersonnelId);

	/**
	 * Removes the acc cer body personnel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel that was removed
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public AccCerBodyPersonnel remove(long accCerBodyPersonnelId)
		throws NoSuchAccCerBodyPersonnelException;

	public AccCerBodyPersonnel updateImpl(
		AccCerBodyPersonnel accCerBodyPersonnel);

	/**
	 * Returns the acc cer body personnel with the primary key or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public AccCerBodyPersonnel findByPrimaryKey(long accCerBodyPersonnelId)
		throws NoSuchAccCerBodyPersonnelException;

	/**
	 * Returns the acc cer body personnel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel, or <code>null</code> if a acc cer body personnel with the primary key could not be found
	 */
	public AccCerBodyPersonnel fetchByPrimaryKey(long accCerBodyPersonnelId);

	/**
	 * Returns all the acc cer body personnels.
	 *
	 * @return the acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findAll();

	/**
	 * Returns a range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body personnels
	 */
	public java.util.List<AccCerBodyPersonnel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyPersonnel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body personnels from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body personnels.
	 *
	 * @return the number of acc cer body personnels
	 */
	public int countAll();

}