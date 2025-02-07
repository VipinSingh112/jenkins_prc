/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicationException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicationUtil
 * @generated
 */
@ProviderType
public interface OsiServicesApplicationPersistence
	extends BasePersistence<OsiServicesApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesApplicationUtil} to access the osi services application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[] findByUuid_PrevAndNext(
			long osiServicesApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[] findByUuid_C_PrevAndNext(
			long osiServicesApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services application where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services applications
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Returns all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[] findBygetOSIServicesByS_U_PrevAndNext(
			long osiServicesApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetOSIServicesByS_U(int status, long userId);

	/**
	 * Returns the number of osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByS_U(int status, long userId);

	/**
	 * Returns the osi services application where caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByCaseId(String caseId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByCaseId(String caseId);

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi services application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeBygetOSIServicesByCaseId(String caseId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByCaseId(String caseId);

	/**
	 * Returns all the osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status);

	/**
	 * Returns a range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[] findBygetOSIServicesByStatus_PrevAndNext(
			long osiServicesApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetOSIServicesByStatus(int status);

	/**
	 * Returns the number of osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByStatus(int status);

	/**
	 * Returns all the osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId(long entityId);

	/**
	 * Returns a range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId(long entityId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId(
			long entityId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId(
			long entityId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByEntityId_First(
			long entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_First(
		long entityId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByEntityId_Last(
			long entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Last(
		long entityId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[] findBygetOSIServicesByEntityId_PrevAndNext(
			long osiServicesApplicationId, long entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetOSIServicesByEntityId(long entityId);

	/**
	 * Returns the number of osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByEntityId(long entityId);

	/**
	 * Returns all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(long entityId, int status);

	/**
	 * Returns a range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public java.util.List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByEntityId_Status_First(
			long entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Status_First(
		long entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByEntityId_Status_Last(
			long entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Status_Last(
		long entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication[]
			findBygetOSIServicesByEntityId_Status_PrevAndNext(
				long osiServicesApplicationId, long entityId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Removes all the osi services applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetOSIServicesByEntityId_Status(
		long entityId, int status);

	/**
	 * Returns the number of osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByEntityId_Status(
		long entityId, int status);

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId);

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the osi services application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByEI_CI(long entityId, String caseId);

	/**
	 * Returns the osi services application where applicationNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOSIServicesByAppNo(
			String applicationNumber)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber);

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the osi services application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeBygetOSIServicesByAppNo(
			String applicationNumber)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi services applications
	 */
	public int countBygetOSIServicesByAppNo(String applicationNumber);

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public OsiServicesApplication findBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi services application that was removed
	 */
	public OsiServicesApplication removeBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the number of osi services applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi services applications
	 */
	public int countBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the osi services application in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplication the osi services application
	 */
	public void cacheResult(OsiServicesApplication osiServicesApplication);

	/**
	 * Caches the osi services applications in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplications the osi services applications
	 */
	public void cacheResult(
		java.util.List<OsiServicesApplication> osiServicesApplications);

	/**
	 * Creates a new osi services application with the primary key. Does not add the osi services application to the database.
	 *
	 * @param osiServicesApplicationId the primary key for the new osi services application
	 * @return the new osi services application
	 */
	public OsiServicesApplication create(long osiServicesApplicationId);

	/**
	 * Removes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication remove(long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException;

	public OsiServicesApplication updateImpl(
		OsiServicesApplication osiServicesApplication);

	/**
	 * Returns the osi services application with the primary key or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication findByPrimaryKey(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException;

	/**
	 * Returns the osi services application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application, or <code>null</code> if a osi services application with the primary key could not be found
	 */
	public OsiServicesApplication fetchByPrimaryKey(
		long osiServicesApplicationId);

	/**
	 * Returns all the osi services applications.
	 *
	 * @return the osi services applications
	 */
	public java.util.List<OsiServicesApplication> findAll();

	/**
	 * Returns a range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of osi services applications
	 */
	public java.util.List<OsiServicesApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services applications
	 */
	public java.util.List<OsiServicesApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services applications
	 */
	public java.util.List<OsiServicesApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services applications.
	 *
	 * @return the number of osi services applications
	 */
	public int countAll();

}