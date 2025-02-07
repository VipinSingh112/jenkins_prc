/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesAppPersistence
	extends BasePersistence<MedicalFacilitiesApp> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesAppUtil} to access the medical facilities app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Removes all the medical facilities apps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities apps
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities app where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities app that was removed
	 */
	public MedicalFacilitiesApp removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities apps
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Removes all the medical facilities apps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities apps
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilities app where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities app that was removed
	 */
	public MedicalFacilitiesApp removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the number of medical facilities apps where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_S_U(int status, long userId);

	/**
	 * Returns a range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_S_U(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_S_U(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_S_U(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp[] findBygetMedicalFacilitiesBy_S_U_PrevAndNext(
			long medicalFacilitiesAppId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Removes all the medical facilities apps where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetMedicalFacilitiesBy_S_U(int status, long userId);

	/**
	 * Returns the number of medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalFacilitiesBy_S_U(int status, long userId);

	/**
	 * Returns all the medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(int status);

	/**
	 * Returns a range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(int status, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_Status_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_Status_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalFacilitiesBy_Status_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_Status_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp[]
			findBygetMedicalFacilitiesBy_Status_PrevAndNext(
				long medicalFacilitiesAppId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesApp> orderByComparator)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Removes all the medical facilities apps where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMedicalFacilitiesBy_Status(int status);

	/**
	 * Returns the number of medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalFacilitiesBy_Status(int status);

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalByAppNo(
			String applicationNumber)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber);

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the medical facilities app where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the medical facilities app that was removed
	 */
	public MedicalFacilitiesApp removeBygetMedicalByAppNo(
			String applicationNumber)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the number of medical facilities apps where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalByAppNo(String applicationNumber);

	/**
	 * Returns the medical facilities app where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalByCaseID(String caseId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByCaseID(String caseId);

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByCaseID(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the medical facilities app where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities app that was removed
	 */
	public MedicalFacilitiesApp removeBygetMedicalByCaseID(String caseId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the number of medical facilities apps where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalByCaseID(String caseId);

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp findBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber);

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber, boolean useFinderCache);

	/**
	 * Removes the medical facilities app where expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the medical facilities app that was removed
	 */
	public MedicalFacilitiesApp removeBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the number of medical facilities apps where expiredLicenseAppNumber = &#63;.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching medical facilities apps
	 */
	public int countBygetMedicalByExpiredLicNum(String expiredLicenseAppNumber);

	/**
	 * Caches the medical facilities app in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 */
	public void cacheResult(MedicalFacilitiesApp medicalFacilitiesApp);

	/**
	 * Caches the medical facilities apps in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApps the medical facilities apps
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesApp> medicalFacilitiesApps);

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	public MedicalFacilitiesApp create(long medicalFacilitiesAppId);

	/**
	 * Removes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp remove(long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException;

	public MedicalFacilitiesApp updateImpl(
		MedicalFacilitiesApp medicalFacilitiesApp);

	/**
	 * Returns the medical facilities app with the primary key or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp findByPrimaryKey(long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesAppException;

	/**
	 * Returns the medical facilities app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app, or <code>null</code> if a medical facilities app with the primary key could not be found
	 */
	public MedicalFacilitiesApp fetchByPrimaryKey(long medicalFacilitiesAppId);

	/**
	 * Returns all the medical facilities apps.
	 *
	 * @return the medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findAll();

	/**
	 * Returns a range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities apps
	 */
	public java.util.List<MedicalFacilitiesApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalFacilitiesApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities apps from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	public int countAll();

}