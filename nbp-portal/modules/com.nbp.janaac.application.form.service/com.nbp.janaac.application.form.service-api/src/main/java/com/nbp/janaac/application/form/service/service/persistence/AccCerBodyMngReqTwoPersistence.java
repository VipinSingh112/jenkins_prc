/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyMngReqTwoException;
import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body mng req two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyMngReqTwoPersistence
	extends BasePersistence<AccCerBodyMngReqTwo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyMngReqTwoUtil} to access the acc cer body mng req two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body mng req twos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body mng req twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @return the range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body mng req two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the first acc cer body mng req two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns the last acc cer body mng req two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the last acc cer body mng req two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns the acc cer body mng req twos before and after the current acc cer body mng req two in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the current acc cer body mng req two
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a acc cer body mng req two with the primary key could not be found
	 */
	public AccCerBodyMngReqTwo[] findByUuid_PrevAndNext(
			long accCerBodyMngReqTwoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Removes all the acc cer body mng req twos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body mng req twos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body mng req twos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body mng req two where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyMngReqTwoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the acc cer body mng req two where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body mng req two where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body mng req two where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body mng req two that was removed
	 */
	public AccCerBodyMngReqTwo removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the number of acc cer body mng req twos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body mng req twos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body mng req twos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body mng req twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @return the range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body mng req two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the first acc cer body mng req two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns the last acc cer body mng req two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the last acc cer body mng req two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns the acc cer body mng req twos before and after the current acc cer body mng req two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the current acc cer body mng req two
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a acc cer body mng req two with the primary key could not be found
	 */
	public AccCerBodyMngReqTwo[] findByUuid_C_PrevAndNext(
			long accCerBodyMngReqTwoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyMngReqTwo> orderByComparator)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Removes all the acc cer body mng req twos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body mng req twos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body mng req twos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body mng req two where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyMngReqTwoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the acc cer body mng req two where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body mng req two where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public AccCerBodyMngReqTwo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body mng req two where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body mng req two that was removed
	 */
	public AccCerBodyMngReqTwo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the number of acc cer body mng req twos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body mng req twos
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body mng req two in the entity cache if it is enabled.
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 */
	public void cacheResult(AccCerBodyMngReqTwo accCerBodyMngReqTwo);

	/**
	 * Caches the acc cer body mng req twos in the entity cache if it is enabled.
	 *
	 * @param accCerBodyMngReqTwos the acc cer body mng req twos
	 */
	public void cacheResult(
		java.util.List<AccCerBodyMngReqTwo> accCerBodyMngReqTwos);

	/**
	 * Creates a new acc cer body mng req two with the primary key. Does not add the acc cer body mng req two to the database.
	 *
	 * @param accCerBodyMngReqTwoId the primary key for the new acc cer body mng req two
	 * @return the new acc cer body mng req two
	 */
	public AccCerBodyMngReqTwo create(long accCerBodyMngReqTwoId);

	/**
	 * Removes the acc cer body mng req two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two that was removed
	 * @throws NoSuchAccCerBodyMngReqTwoException if a acc cer body mng req two with the primary key could not be found
	 */
	public AccCerBodyMngReqTwo remove(long accCerBodyMngReqTwoId)
		throws NoSuchAccCerBodyMngReqTwoException;

	public AccCerBodyMngReqTwo updateImpl(
		AccCerBodyMngReqTwo accCerBodyMngReqTwo);

	/**
	 * Returns the acc cer body mng req two with the primary key or throws a <code>NoSuchAccCerBodyMngReqTwoException</code> if it could not be found.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two
	 * @throws NoSuchAccCerBodyMngReqTwoException if a acc cer body mng req two with the primary key could not be found
	 */
	public AccCerBodyMngReqTwo findByPrimaryKey(long accCerBodyMngReqTwoId)
		throws NoSuchAccCerBodyMngReqTwoException;

	/**
	 * Returns the acc cer body mng req two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two, or <code>null</code> if a acc cer body mng req two with the primary key could not be found
	 */
	public AccCerBodyMngReqTwo fetchByPrimaryKey(long accCerBodyMngReqTwoId);

	/**
	 * Returns all the acc cer body mng req twos.
	 *
	 * @return the acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findAll();

	/**
	 * Returns a range of all the acc cer body mng req twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @return the range of acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body mng req twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body mng req twos
	 */
	public java.util.List<AccCerBodyMngReqTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyMngReqTwo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body mng req twos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body mng req twos.
	 *
	 * @return the number of acc cer body mng req twos
	 */
	public int countAll();

}