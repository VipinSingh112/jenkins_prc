/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabApplicationInfoException;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab application info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfoUtil
 * @generated
 */
@ProviderType
public interface AccMediLabApplicationInfoPersistence
	extends BasePersistence<AccMediLabApplicationInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabApplicationInfoUtil} to access the acc medi lab application info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab application infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns the acc medi lab application infos before and after the current acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the current acc medi lab application info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public AccMediLabApplicationInfo[] findByUuid_PrevAndNext(
			long accMediLabApplicationInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Removes all the acc medi lab application infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab application infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab application info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab application info that was removed
	 */
	public AccMediLabApplicationInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab application infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns the acc medi lab application infos before and after the current acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the current acc medi lab application info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public AccMediLabApplicationInfo[] findByUuid_C_PrevAndNext(
			long accMediLabApplicationInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabApplicationInfo> orderByComparator)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Removes all the acc medi lab application infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab application infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public AccMediLabApplicationInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab application info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab application info that was removed
	 */
	public AccMediLabApplicationInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the number of acc medi lab application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab application infos
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab application info in the entity cache if it is enabled.
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 */
	public void cacheResult(
		AccMediLabApplicationInfo accMediLabApplicationInfo);

	/**
	 * Caches the acc medi lab application infos in the entity cache if it is enabled.
	 *
	 * @param accMediLabApplicationInfos the acc medi lab application infos
	 */
	public void cacheResult(
		java.util.List<AccMediLabApplicationInfo> accMediLabApplicationInfos);

	/**
	 * Creates a new acc medi lab application info with the primary key. Does not add the acc medi lab application info to the database.
	 *
	 * @param accMediLabApplicationInfoId the primary key for the new acc medi lab application info
	 * @return the new acc medi lab application info
	 */
	public AccMediLabApplicationInfo create(long accMediLabApplicationInfoId);

	/**
	 * Removes the acc medi lab application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public AccMediLabApplicationInfo remove(long accMediLabApplicationInfoId)
		throws NoSuchAccMediLabApplicationInfoException;

	public AccMediLabApplicationInfo updateImpl(
		AccMediLabApplicationInfo accMediLabApplicationInfo);

	/**
	 * Returns the acc medi lab application info with the primary key or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public AccMediLabApplicationInfo findByPrimaryKey(
			long accMediLabApplicationInfoId)
		throws NoSuchAccMediLabApplicationInfoException;

	/**
	 * Returns the acc medi lab application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info, or <code>null</code> if a acc medi lab application info with the primary key could not be found
	 */
	public AccMediLabApplicationInfo fetchByPrimaryKey(
		long accMediLabApplicationInfoId);

	/**
	 * Returns all the acc medi lab application infos.
	 *
	 * @return the acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findAll();

	/**
	 * Returns a range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab application infos
	 */
	public java.util.List<AccMediLabApplicationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab application infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab application infos.
	 *
	 * @return the number of acc medi lab application infos
	 */
	public int countAll();

}