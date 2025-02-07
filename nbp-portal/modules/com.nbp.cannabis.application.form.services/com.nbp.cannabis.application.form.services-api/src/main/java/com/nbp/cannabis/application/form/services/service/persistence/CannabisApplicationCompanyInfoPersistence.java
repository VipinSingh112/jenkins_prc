/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyInfoException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfoUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationCompanyInfoPersistence
	extends BasePersistence<CannabisApplicationCompanyInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationCompanyInfoUtil} to access the cannabis application company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application company infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns the cannabis application company infos before and after the current cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param companyInformationId the primary key of the current cannabis application company info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	public CannabisApplicationCompanyInfo[] findByUuid_PrevAndNext(
			long companyInformationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Removes all the cannabis application company infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company info that was removed
	 */
	public CannabisApplicationCompanyInfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns the cannabis application company infos before and after the current cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param companyInformationId the primary key of the current cannabis application company info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	public CannabisApplicationCompanyInfo[] findByUuid_C_PrevAndNext(
			long companyInformationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Removes all the cannabis application company infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findBygetCA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppNo(
		String applicationNumber);

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the cannabis application company info where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis application company info that was removed
	 */
	public CannabisApplicationCompanyInfo removeBygetCA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the number of cannabis application company infos where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis application company infos
	 */
	public int countBygetCA_CI_by_AppNo(String applicationNumber);

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo findBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company info where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application company info that was removed
	 */
	public CannabisApplicationCompanyInfo removeBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the number of cannabis application company infos where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application company infos
	 */
	public int countBygetCA_CI_by_AppId(long cannabisApplicationId);

	/**
	 * Caches the cannabis application company info in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 */
	public void cacheResult(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo);

	/**
	 * Caches the cannabis application company infos in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyInfos the cannabis application company infos
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationCompanyInfo>
			cannabisApplicationCompanyInfos);

	/**
	 * Creates a new cannabis application company info with the primary key. Does not add the cannabis application company info to the database.
	 *
	 * @param companyInformationId the primary key for the new cannabis application company info
	 * @return the new cannabis application company info
	 */
	public CannabisApplicationCompanyInfo create(long companyInformationId);

	/**
	 * Removes the cannabis application company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info that was removed
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	public CannabisApplicationCompanyInfo remove(long companyInformationId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	public CannabisApplicationCompanyInfo updateImpl(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo);

	/**
	 * Returns the cannabis application company info with the primary key or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	public CannabisApplicationCompanyInfo findByPrimaryKey(
			long companyInformationId)
		throws NoSuchCannabisApplicationCompanyInfoException;

	/**
	 * Returns the cannabis application company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info, or <code>null</code> if a cannabis application company info with the primary key could not be found
	 */
	public CannabisApplicationCompanyInfo fetchByPrimaryKey(
		long companyInformationId);

	/**
	 * Returns all the cannabis application company infos.
	 *
	 * @return the cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findAll();

	/**
	 * Returns a range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company infos
	 */
	public java.util.List<CannabisApplicationCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application company infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application company infos.
	 *
	 * @return the number of cannabis application company infos
	 */
	public int countAll();

}