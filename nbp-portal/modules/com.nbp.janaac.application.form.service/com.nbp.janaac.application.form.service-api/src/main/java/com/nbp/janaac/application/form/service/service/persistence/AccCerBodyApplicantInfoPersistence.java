/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyApplicantInfoException;
import com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfoUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyApplicantInfoPersistence
	extends BasePersistence<AccCerBodyApplicantInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyApplicantInfoUtil} to access the acc cer body applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body applicant infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body applicant infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @return the range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body applicant info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the first acc cer body applicant info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns the last acc cer body applicant info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the last acc cer body applicant info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns the acc cer body applicant infos before and after the current acc cer body applicant info in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the current acc cer body applicant info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a acc cer body applicant info with the primary key could not be found
	 */
	public AccCerBodyApplicantInfo[] findByUuid_PrevAndNext(
			long accCerBodyApplicantInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Removes all the acc cer body applicant infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body applicant infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body applicant infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body applicant info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyApplicantInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the acc cer body applicant info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body applicant info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body applicant info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body applicant info that was removed
	 */
	public AccCerBodyApplicantInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the number of acc cer body applicant infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body applicant infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body applicant infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body applicant infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @return the range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body applicant info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the first acc cer body applicant info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns the last acc cer body applicant info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the last acc cer body applicant info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns the acc cer body applicant infos before and after the current acc cer body applicant info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the current acc cer body applicant info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a acc cer body applicant info with the primary key could not be found
	 */
	public AccCerBodyApplicantInfo[] findByUuid_C_PrevAndNext(
			long accCerBodyApplicantInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyApplicantInfo> orderByComparator)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Removes all the acc cer body applicant infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body applicant infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body applicant infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body applicant info where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyApplicantInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the acc cer body applicant info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body applicant info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	public AccCerBodyApplicantInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body applicant info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body applicant info that was removed
	 */
	public AccCerBodyApplicantInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the number of acc cer body applicant infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body applicant infos
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body applicant info in the entity cache if it is enabled.
	 *
	 * @param accCerBodyApplicantInfo the acc cer body applicant info
	 */
	public void cacheResult(AccCerBodyApplicantInfo accCerBodyApplicantInfo);

	/**
	 * Caches the acc cer body applicant infos in the entity cache if it is enabled.
	 *
	 * @param accCerBodyApplicantInfos the acc cer body applicant infos
	 */
	public void cacheResult(
		java.util.List<AccCerBodyApplicantInfo> accCerBodyApplicantInfos);

	/**
	 * Creates a new acc cer body applicant info with the primary key. Does not add the acc cer body applicant info to the database.
	 *
	 * @param accCerBodyApplicantInfoId the primary key for the new acc cer body applicant info
	 * @return the new acc cer body applicant info
	 */
	public AccCerBodyApplicantInfo create(long accCerBodyApplicantInfoId);

	/**
	 * Removes the acc cer body applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the acc cer body applicant info
	 * @return the acc cer body applicant info that was removed
	 * @throws NoSuchAccCerBodyApplicantInfoException if a acc cer body applicant info with the primary key could not be found
	 */
	public AccCerBodyApplicantInfo remove(long accCerBodyApplicantInfoId)
		throws NoSuchAccCerBodyApplicantInfoException;

	public AccCerBodyApplicantInfo updateImpl(
		AccCerBodyApplicantInfo accCerBodyApplicantInfo);

	/**
	 * Returns the acc cer body applicant info with the primary key or throws a <code>NoSuchAccCerBodyApplicantInfoException</code> if it could not be found.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the acc cer body applicant info
	 * @return the acc cer body applicant info
	 * @throws NoSuchAccCerBodyApplicantInfoException if a acc cer body applicant info with the primary key could not be found
	 */
	public AccCerBodyApplicantInfo findByPrimaryKey(
			long accCerBodyApplicantInfoId)
		throws NoSuchAccCerBodyApplicantInfoException;

	/**
	 * Returns the acc cer body applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the acc cer body applicant info
	 * @return the acc cer body applicant info, or <code>null</code> if a acc cer body applicant info with the primary key could not be found
	 */
	public AccCerBodyApplicantInfo fetchByPrimaryKey(
		long accCerBodyApplicantInfoId);

	/**
	 * Returns all the acc cer body applicant infos.
	 *
	 * @return the acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findAll();

	/**
	 * Returns a range of all the acc cer body applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @return the range of acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body applicant infos
	 */
	public java.util.List<AccCerBodyApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccCerBodyApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body applicant infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body applicant infos.
	 *
	 * @return the number of acc cer body applicant infos
	 */
	public int countAll();

}