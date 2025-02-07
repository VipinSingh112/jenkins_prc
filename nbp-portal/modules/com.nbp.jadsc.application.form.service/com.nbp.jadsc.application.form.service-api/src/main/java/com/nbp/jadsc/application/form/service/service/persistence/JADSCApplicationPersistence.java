/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCApplicationException;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplicationUtil
 * @generated
 */
@ProviderType
public interface JADSCApplicationPersistence
	extends BasePersistence<JADSCApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCApplicationUtil} to access the jadsc application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findByUuid_PrevAndNext(
			long jadscApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findByUuid_C_PrevAndNext(
			long jadscApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc application where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findBygetJADSCByS_U_PrevAndNext(
			long jadscApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetJADSCByS_U(int status, long userId);

	/**
	 * Returns the number of jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByS_U(int status, long userId);

	/**
	 * Returns the jadsc application where caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByCaseId(String caseId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByCaseId(String caseId);

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeBygetJADSCByCaseId(String caseId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByCaseId(String caseId);

	/**
	 * Returns all the jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByStatus(int status);

	/**
	 * Returns a range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findBygetJADSCByStatus_PrevAndNext(
			long jadscApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetJADSCByStatus(int status);

	/**
	 * Returns the number of jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByStatus(int status);

	/**
	 * Returns all the jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId);

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findBygetJADSCByEntityId_PrevAndNext(
			long jadscApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetJADSCByEntityId(String entityId);

	/**
	 * Returns the number of jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByEntityId(String entityId);

	/**
	 * Returns all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public java.util.List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication[] findBygetJADSCByEntityId_Status_PrevAndNext(
			long jadscApplicationId, String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
				orderByComparator)
		throws NoSuchJADSCApplicationException;

	/**
	 * Removes all the jadsc applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetJADSCByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByEntityId_Status(String entityId, int status);

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByEI_CI(String entityId, String caseId);

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCByAppNo(String applicationNumber)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByAppNo(String applicationNumber);

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the jadsc application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeBygetJADSCByAppNo(String applicationNumber)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCByAppNo(String applicationNumber);

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public JADSCApplication findBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber);

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jadsc application that was removed
	 */
	public JADSCApplication removeBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the number of jadsc applications where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jadsc applications
	 */
	public int countBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber);

	/**
	 * Caches the jadsc application in the entity cache if it is enabled.
	 *
	 * @param jadscApplication the jadsc application
	 */
	public void cacheResult(JADSCApplication jadscApplication);

	/**
	 * Caches the jadsc applications in the entity cache if it is enabled.
	 *
	 * @param jadscApplications the jadsc applications
	 */
	public void cacheResult(java.util.List<JADSCApplication> jadscApplications);

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	public JADSCApplication create(long jadscApplicationId);

	/**
	 * Removes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication remove(long jadscApplicationId)
		throws NoSuchJADSCApplicationException;

	public JADSCApplication updateImpl(JADSCApplication jadscApplication);

	/**
	 * Returns the jadsc application with the primary key or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication findByPrimaryKey(long jadscApplicationId)
		throws NoSuchJADSCApplicationException;

	/**
	 * Returns the jadsc application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application, or <code>null</code> if a jadsc application with the primary key could not be found
	 */
	public JADSCApplication fetchByPrimaryKey(long jadscApplicationId);

	/**
	 * Returns all the jadsc applications.
	 *
	 * @return the jadsc applications
	 */
	public java.util.List<JADSCApplication> findAll();

	/**
	 * Returns a range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of jadsc applications
	 */
	public java.util.List<JADSCApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc applications
	 */
	public java.util.List<JADSCApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc applications
	 */
	public java.util.List<JADSCApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	public int countAll();

}