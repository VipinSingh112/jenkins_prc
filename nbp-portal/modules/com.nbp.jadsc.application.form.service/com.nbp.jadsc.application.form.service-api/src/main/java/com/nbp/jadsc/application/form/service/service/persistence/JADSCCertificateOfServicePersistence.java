/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfServiceException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc certificate of service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceUtil
 * @generated
 */
@ProviderType
public interface JADSCCertificateOfServicePersistence
	extends BasePersistence<JADSCCertificateOfService> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCCertificateOfServiceUtil} to access the jadsc certificate of service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public JADSCCertificateOfService[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of services
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc certificate of service where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service that was removed
	 */
	public JADSCCertificateOfService removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of services
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public JADSCCertificateOfService[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of services
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchBygetJADSCById(
		long jadscApplicationId);

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public JADSCCertificateOfService fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc certificate of service where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of service that was removed
	 */
	public JADSCCertificateOfService removeBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the number of jadsc certificate of services where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of services
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc certificate of service in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 */
	public void cacheResult(
		JADSCCertificateOfService jadscCertificateOfService);

	/**
	 * Caches the jadsc certificate of services in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServices the jadsc certificate of services
	 */
	public void cacheResult(
		java.util.List<JADSCCertificateOfService> jadscCertificateOfServices);

	/**
	 * Creates a new jadsc certificate of service with the primary key. Does not add the jadsc certificate of service to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service
	 * @return the new jadsc certificate of service
	 */
	public JADSCCertificateOfService create(long jadscCOSId);

	/**
	 * Removes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public JADSCCertificateOfService remove(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceException;

	public JADSCCertificateOfService updateImpl(
		JADSCCertificateOfService jadscCertificateOfService);

	/**
	 * Returns the jadsc certificate of service with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public JADSCCertificateOfService findByPrimaryKey(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the jadsc certificate of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service, or <code>null</code> if a jadsc certificate of service with the primary key could not be found
	 */
	public JADSCCertificateOfService fetchByPrimaryKey(long jadscCOSId);

	/**
	 * Returns all the jadsc certificate of services.
	 *
	 * @return the jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findAll();

	/**
	 * Returns a range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of services
	 */
	public java.util.List<JADSCCertificateOfService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc certificate of services from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc certificate of services.
	 *
	 * @return the number of jadsc certificate of services
	 */
	public int countAll();

}