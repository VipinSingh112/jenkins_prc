/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicationException;
import com.nbp.miic.application.form.services.model.MiicApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationUtil
 * @generated
 */
@ProviderType
public interface MiicApplicationPersistence
	extends BasePersistence<MiicApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicApplicationUtil} to access the miic application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findByUuid_PrevAndNext(
			long miicApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the miic application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application that was removed
	 */
	public MiicApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findByUuid_C_PrevAndNext(
			long miicApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the miic application where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICById(long miicApplicationId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICById(long miicApplicationId);

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICById(
		long miicApplicationId, boolean useFinderCache);

	/**
	 * Removes the miic application where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application that was removed
	 */
	public MiicApplication removeBygetMIICById(long miicApplicationId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICById(long miicApplicationId);

	/**
	 * Returns all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findBygetMIICByS_U_PrevAndNext(
			long miicApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetMIICByS_U(int status, long userId);

	/**
	 * Returns the number of miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByS_U(int status, long userId);

	/**
	 * Returns the miic application where caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByCaseId(String caseId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByCaseId(String caseId);

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the miic application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	public MiicApplication removeBygetMIICByCaseId(String caseId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByCaseId(String caseId);

	/**
	 * Returns all the miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByStatus(int status);

	/**
	 * Returns a range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findBygetMIICByStatus_PrevAndNext(
			long miicApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMIICByStatus(int status);

	/**
	 * Returns the number of miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByStatus(int status);

	/**
	 * Returns all the miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId(
		String entityId);

	/**
	 * Returns a range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findBygetMIICByEntityId_PrevAndNext(
			long miicApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetMIICByEntityId(String entityId);

	/**
	 * Returns the number of miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByEntityId(String entityId);

	/**
	 * Returns all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns a range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public java.util.List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication[] findBygetMIICByEntityId_Status_PrevAndNext(
			long miicApplicationId, String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
				orderByComparator)
		throws NoSuchMiicApplicationException;

	/**
	 * Removes all the miic applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetMIICByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByEntityId_Status(String entityId, int status);

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByEI_CI(String entityId, String caseId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the miic application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	public MiicApplication removeBygetMIICByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByEI_CI(String entityId, String caseId);

	/**
	 * Returns the miic application where applicationNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByAppNo(String applicationNumber)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByAppNo(String applicationNumber);

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the miic application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the miic application that was removed
	 */
	public MiicApplication removeBygetMIICByAppNo(String applicationNumber)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByAppNo(String applicationNumber);

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public MiicApplication findBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public MiicApplication fetchBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the miic application that was removed
	 */
	public MiicApplication removeBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the number of miic applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching miic applications
	 */
	public int countBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the miic application in the entity cache if it is enabled.
	 *
	 * @param miicApplication the miic application
	 */
	public void cacheResult(MiicApplication miicApplication);

	/**
	 * Caches the miic applications in the entity cache if it is enabled.
	 *
	 * @param miicApplications the miic applications
	 */
	public void cacheResult(java.util.List<MiicApplication> miicApplications);

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	public MiicApplication create(long miicApplicationId);

	/**
	 * Removes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication remove(long miicApplicationId)
		throws NoSuchMiicApplicationException;

	public MiicApplication updateImpl(MiicApplication miicApplication);

	/**
	 * Returns the miic application with the primary key or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public MiicApplication findByPrimaryKey(long miicApplicationId)
		throws NoSuchMiicApplicationException;

	/**
	 * Returns the miic application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application, or <code>null</code> if a miic application with the primary key could not be found
	 */
	public MiicApplication fetchByPrimaryKey(long miicApplicationId);

	/**
	 * Returns all the miic applications.
	 *
	 * @return the miic applications
	 */
	public java.util.List<MiicApplication> findAll();

	/**
	 * Returns a range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of miic applications
	 */
	public java.util.List<MiicApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applications
	 */
	public java.util.List<MiicApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applications
	 */
	public java.util.List<MiicApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	public int countAll();

}