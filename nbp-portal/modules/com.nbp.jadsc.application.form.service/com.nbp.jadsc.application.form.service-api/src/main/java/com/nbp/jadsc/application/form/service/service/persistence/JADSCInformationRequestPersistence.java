/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCInformationRequestException;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc information request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequestUtil
 * @generated
 */
@ProviderType
public interface JADSCInformationRequestPersistence
	extends BasePersistence<JADSCInformationRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCInformationRequestUtil} to access the jadsc information request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public JADSCInformationRequest[] findByUuid_PrevAndNext(
			long jadscInfoRequestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Removes all the jadsc information requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc information requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc information request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc information request that was removed
	 */
	public JADSCInformationRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc information requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public JADSCInformationRequest[] findByUuid_C_PrevAndNext(
			long jadscInfoRequestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Removes all the jadsc information requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc information requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public JADSCInformationRequest fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc information request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc information request that was removed
	 */
	public JADSCInformationRequest removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the number of jadsc information requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc information requests
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc information request in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequest the jadsc information request
	 */
	public void cacheResult(JADSCInformationRequest jadscInformationRequest);

	/**
	 * Caches the jadsc information requests in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequests the jadsc information requests
	 */
	public void cacheResult(
		java.util.List<JADSCInformationRequest> jadscInformationRequests);

	/**
	 * Creates a new jadsc information request with the primary key. Does not add the jadsc information request to the database.
	 *
	 * @param jadscInfoRequestId the primary key for the new jadsc information request
	 * @return the new jadsc information request
	 */
	public JADSCInformationRequest create(long jadscInfoRequestId);

	/**
	 * Removes the jadsc information request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request that was removed
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public JADSCInformationRequest remove(long jadscInfoRequestId)
		throws NoSuchJADSCInformationRequestException;

	public JADSCInformationRequest updateImpl(
		JADSCInformationRequest jadscInformationRequest);

	/**
	 * Returns the jadsc information request with the primary key or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public JADSCInformationRequest findByPrimaryKey(long jadscInfoRequestId)
		throws NoSuchJADSCInformationRequestException;

	/**
	 * Returns the jadsc information request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request, or <code>null</code> if a jadsc information request with the primary key could not be found
	 */
	public JADSCInformationRequest fetchByPrimaryKey(long jadscInfoRequestId);

	/**
	 * Returns all the jadsc information requests.
	 *
	 * @return the jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findAll();

	/**
	 * Returns a range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc information requests
	 */
	public java.util.List<JADSCInformationRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc information requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc information requests.
	 *
	 * @return the number of jadsc information requests
	 */
	public int countAll();

}