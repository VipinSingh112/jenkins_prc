/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCOathRequestException;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc oath request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestUtil
 * @generated
 */
@ProviderType
public interface JADSCOathRequestPersistence
	extends BasePersistence<JADSCOathRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCOathRequestUtil} to access the jadsc oath request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public JADSCOathRequest[] findByUuid_PrevAndNext(
			long jadscOathRequestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc oath requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc oath request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc oath request that was removed
	 */
	public JADSCOathRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc oath requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public JADSCOathRequest[] findByUuid_C_PrevAndNext(
			long jadscOathRequestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
				orderByComparator)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc oath requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public JADSCOathRequest fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc oath request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc oath request that was removed
	 */
	public JADSCOathRequest removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the number of jadsc oath requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc oath requests
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc oath request in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequest the jadsc oath request
	 */
	public void cacheResult(JADSCOathRequest jadscOathRequest);

	/**
	 * Caches the jadsc oath requests in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequests the jadsc oath requests
	 */
	public void cacheResult(java.util.List<JADSCOathRequest> jadscOathRequests);

	/**
	 * Creates a new jadsc oath request with the primary key. Does not add the jadsc oath request to the database.
	 *
	 * @param jadscOathRequestId the primary key for the new jadsc oath request
	 * @return the new jadsc oath request
	 */
	public JADSCOathRequest create(long jadscOathRequestId);

	/**
	 * Removes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public JADSCOathRequest remove(long jadscOathRequestId)
		throws NoSuchJADSCOathRequestException;

	public JADSCOathRequest updateImpl(JADSCOathRequest jadscOathRequest);

	/**
	 * Returns the jadsc oath request with the primary key or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public JADSCOathRequest findByPrimaryKey(long jadscOathRequestId)
		throws NoSuchJADSCOathRequestException;

	/**
	 * Returns the jadsc oath request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request, or <code>null</code> if a jadsc oath request with the primary key could not be found
	 */
	public JADSCOathRequest fetchByPrimaryKey(long jadscOathRequestId);

	/**
	 * Returns all the jadsc oath requests.
	 *
	 * @return the jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findAll();

	/**
	 * Returns a range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc oath requests
	 */
	public java.util.List<JADSCOathRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCOathRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc oath requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc oath requests.
	 *
	 * @return the number of jadsc oath requests
	 */
	public int countAll();

}