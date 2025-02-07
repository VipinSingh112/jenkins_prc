/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationIndividualInfoException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application individual info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfoUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationIndividualInfoPersistence
	extends BasePersistence<CannabisApplicationIndividualInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationIndividualInfoUtil} to access the cannabis application individual info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application individual infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns the cannabis application individual infos before and after the current cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param individualInformationId the primary key of the current cannabis application individual info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public CannabisApplicationIndividualInfo[] findByUuid_PrevAndNext(
			long individualInformationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Removes all the cannabis application individual infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application individual infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application individual info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application individual info that was removed
	 */
	public CannabisApplicationIndividualInfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application individual infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns the cannabis application individual infos before and after the current cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param individualInformationId the primary key of the current cannabis application individual info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public CannabisApplicationIndividualInfo[] findByUuid_C_PrevAndNext(
			long individualInformationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualInfo> orderByComparator)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Removes all the cannabis application individual infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application individual infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findBygetIA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchBygetIA_CI_by_AppNo(
		String applicationNumber);

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchBygetIA_CI_by_AppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the cannabis application individual info where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis application individual info that was removed
	 */
	public CannabisApplicationIndividualInfo removeBygetIA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the number of cannabis application individual infos where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis application individual infos
	 */
	public int countBygetIA_CI_by_AppNo(String applicationNumber);

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo findBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public CannabisApplicationIndividualInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application individual info where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application individual info that was removed
	 */
	public CannabisApplicationIndividualInfo removeBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the number of cannabis application individual infos where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application individual infos
	 */
	public int countBygetCA_CI_by_AppId(long cannabisApplicationId);

	/**
	 * Caches the cannabis application individual info in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 */
	public void cacheResult(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo);

	/**
	 * Caches the cannabis application individual infos in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualInfos the cannabis application individual infos
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationIndividualInfo>
			cannabisApplicationIndividualInfos);

	/**
	 * Creates a new cannabis application individual info with the primary key. Does not add the cannabis application individual info to the database.
	 *
	 * @param individualInformationId the primary key for the new cannabis application individual info
	 * @return the new cannabis application individual info
	 */
	public CannabisApplicationIndividualInfo create(
		long individualInformationId);

	/**
	 * Removes the cannabis application individual info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public CannabisApplicationIndividualInfo remove(
			long individualInformationId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	public CannabisApplicationIndividualInfo updateImpl(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo);

	/**
	 * Returns the cannabis application individual info with the primary key or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public CannabisApplicationIndividualInfo findByPrimaryKey(
			long individualInformationId)
		throws NoSuchCannabisApplicationIndividualInfoException;

	/**
	 * Returns the cannabis application individual info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info, or <code>null</code> if a cannabis application individual info with the primary key could not be found
	 */
	public CannabisApplicationIndividualInfo fetchByPrimaryKey(
		long individualInformationId);

	/**
	 * Returns all the cannabis application individual infos.
	 *
	 * @return the cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findAll();

	/**
	 * Returns a range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application individual infos
	 */
	public java.util.List<CannabisApplicationIndividualInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application individual infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application individual infos.
	 *
	 * @return the number of cannabis application individual infos
	 */
	public int countAll();

}