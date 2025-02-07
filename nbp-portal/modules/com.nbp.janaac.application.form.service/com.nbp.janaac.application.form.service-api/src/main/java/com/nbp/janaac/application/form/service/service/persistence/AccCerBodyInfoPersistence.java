/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyInfoException;
import com.nbp.janaac.application.form.service.model.AccCerBodyInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyInfoUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyInfoPersistence
	extends BasePersistence<AccCerBodyInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyInfoUtil} to access the acc cer body info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @return the range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the first acc cer body info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns the last acc cer body info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the last acc cer body info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns the acc cer body infos before and after the current acc cer body info in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyInfoId the primary key of the current acc cer body info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a acc cer body info with the primary key could not be found
	 */
	public AccCerBodyInfo[] findByUuid_PrevAndNext(
			long accCerBodyInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Removes all the acc cer body infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the acc cer body info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body info that was removed
	 */
	public AccCerBodyInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the number of acc cer body infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @return the range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the first acc cer body info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns the last acc cer body info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the last acc cer body info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns the acc cer body infos before and after the current acc cer body info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyInfoId the primary key of the current acc cer body info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a acc cer body info with the primary key could not be found
	 */
	public AccCerBodyInfo[] findByUuid_C_PrevAndNext(
			long accCerBodyInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
				orderByComparator)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Removes all the acc cer body infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body info where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the acc cer body info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	public AccCerBodyInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body info that was removed
	 */
	public AccCerBodyInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the number of acc cer body infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body infos
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body info in the entity cache if it is enabled.
	 *
	 * @param accCerBodyInfo the acc cer body info
	 */
	public void cacheResult(AccCerBodyInfo accCerBodyInfo);

	/**
	 * Caches the acc cer body infos in the entity cache if it is enabled.
	 *
	 * @param accCerBodyInfos the acc cer body infos
	 */
	public void cacheResult(java.util.List<AccCerBodyInfo> accCerBodyInfos);

	/**
	 * Creates a new acc cer body info with the primary key. Does not add the acc cer body info to the database.
	 *
	 * @param accCerBodyInfoId the primary key for the new acc cer body info
	 * @return the new acc cer body info
	 */
	public AccCerBodyInfo create(long accCerBodyInfoId);

	/**
	 * Removes the acc cer body info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyInfoId the primary key of the acc cer body info
	 * @return the acc cer body info that was removed
	 * @throws NoSuchAccCerBodyInfoException if a acc cer body info with the primary key could not be found
	 */
	public AccCerBodyInfo remove(long accCerBodyInfoId)
		throws NoSuchAccCerBodyInfoException;

	public AccCerBodyInfo updateImpl(AccCerBodyInfo accCerBodyInfo);

	/**
	 * Returns the acc cer body info with the primary key or throws a <code>NoSuchAccCerBodyInfoException</code> if it could not be found.
	 *
	 * @param accCerBodyInfoId the primary key of the acc cer body info
	 * @return the acc cer body info
	 * @throws NoSuchAccCerBodyInfoException if a acc cer body info with the primary key could not be found
	 */
	public AccCerBodyInfo findByPrimaryKey(long accCerBodyInfoId)
		throws NoSuchAccCerBodyInfoException;

	/**
	 * Returns the acc cer body info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyInfoId the primary key of the acc cer body info
	 * @return the acc cer body info, or <code>null</code> if a acc cer body info with the primary key could not be found
	 */
	public AccCerBodyInfo fetchByPrimaryKey(long accCerBodyInfoId);

	/**
	 * Returns all the acc cer body infos.
	 *
	 * @return the acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findAll();

	/**
	 * Returns a range of all the acc cer body infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @return the range of acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body infos
	 */
	public java.util.List<AccCerBodyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body infos.
	 *
	 * @return the number of acc cer body infos
	 */
	public int countAll();

}