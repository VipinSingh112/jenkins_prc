/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccThirdPartyAppliInfoException;
import com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc third party appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfoUtil
 * @generated
 */
@ProviderType
public interface AccThirdPartyAppliInfoPersistence
	extends BasePersistence<AccThirdPartyAppliInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccThirdPartyAppliInfoUtil} to access the acc third party appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc third party appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns the acc third party appli infos before and after the current acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the current acc third party appli info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public AccThirdPartyAppliInfo[] findByUuid_PrevAndNext(
			long accThirdPartyAppliInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Removes all the acc third party appli infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc third party appli infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc third party appli info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc third party appli info that was removed
	 */
	public AccThirdPartyAppliInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc third party appli infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns the acc third party appli infos before and after the current acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the current acc third party appli info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public AccThirdPartyAppliInfo[] findByUuid_C_PrevAndNext(
			long accThirdPartyAppliInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccThirdPartyAppliInfo> orderByComparator)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Removes all the acc third party appli infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc third party appli infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public AccThirdPartyAppliInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc third party appli info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc third party appli info that was removed
	 */
	public AccThirdPartyAppliInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the number of acc third party appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc third party appli infos
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc third party appli info in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyAppliInfo the acc third party appli info
	 */
	public void cacheResult(AccThirdPartyAppliInfo accThirdPartyAppliInfo);

	/**
	 * Caches the acc third party appli infos in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyAppliInfos the acc third party appli infos
	 */
	public void cacheResult(
		java.util.List<AccThirdPartyAppliInfo> accThirdPartyAppliInfos);

	/**
	 * Creates a new acc third party appli info with the primary key. Does not add the acc third party appli info to the database.
	 *
	 * @param accThirdPartyAppliInfoId the primary key for the new acc third party appli info
	 * @return the new acc third party appli info
	 */
	public AccThirdPartyAppliInfo create(long accThirdPartyAppliInfoId);

	/**
	 * Removes the acc third party appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info that was removed
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public AccThirdPartyAppliInfo remove(long accThirdPartyAppliInfoId)
		throws NoSuchAccThirdPartyAppliInfoException;

	public AccThirdPartyAppliInfo updateImpl(
		AccThirdPartyAppliInfo accThirdPartyAppliInfo);

	/**
	 * Returns the acc third party appli info with the primary key or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public AccThirdPartyAppliInfo findByPrimaryKey(
			long accThirdPartyAppliInfoId)
		throws NoSuchAccThirdPartyAppliInfoException;

	/**
	 * Returns the acc third party appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info, or <code>null</code> if a acc third party appli info with the primary key could not be found
	 */
	public AccThirdPartyAppliInfo fetchByPrimaryKey(
		long accThirdPartyAppliInfoId);

	/**
	 * Returns all the acc third party appli infos.
	 *
	 * @return the acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findAll();

	/**
	 * Returns a range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc third party appli infos
	 */
	public java.util.List<AccThirdPartyAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc third party appli infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc third party appli infos.
	 *
	 * @return the number of acc third party appli infos
	 */
	public int countAll();

}