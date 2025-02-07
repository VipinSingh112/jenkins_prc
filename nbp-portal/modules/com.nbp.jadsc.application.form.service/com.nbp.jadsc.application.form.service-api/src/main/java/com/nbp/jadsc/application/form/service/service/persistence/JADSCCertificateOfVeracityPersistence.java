/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfVeracityException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc certificate of veracity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracityUtil
 * @generated
 */
@ProviderType
public interface JADSCCertificateOfVeracityPersistence
	extends BasePersistence<JADSCCertificateOfVeracity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCCertificateOfVeracityUtil} to access the jadsc certificate of veracity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public JADSCCertificateOfVeracity[] findByUuid_PrevAndNext(
			long jadscCOVId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of veracities
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	public JADSCCertificateOfVeracity removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public JADSCCertificateOfVeracity[] findByUuid_C_PrevAndNext(
			long jadscCOVId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity findBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchBygetJADSCById(
		long jadscApplicationId);

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public JADSCCertificateOfVeracity fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc certificate of veracity where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	public JADSCCertificateOfVeracity removeBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the number of jadsc certificate of veracities where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc certificate of veracity in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 */
	public void cacheResult(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity);

	/**
	 * Caches the jadsc certificate of veracities in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracities the jadsc certificate of veracities
	 */
	public void cacheResult(
		java.util.List<JADSCCertificateOfVeracity>
			jadscCertificateOfVeracities);

	/**
	 * Creates a new jadsc certificate of veracity with the primary key. Does not add the jadsc certificate of veracity to the database.
	 *
	 * @param jadscCOVId the primary key for the new jadsc certificate of veracity
	 * @return the new jadsc certificate of veracity
	 */
	public JADSCCertificateOfVeracity create(long jadscCOVId);

	/**
	 * Removes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public JADSCCertificateOfVeracity remove(long jadscCOVId)
		throws NoSuchJADSCCertificateOfVeracityException;

	public JADSCCertificateOfVeracity updateImpl(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity);

	/**
	 * Returns the jadsc certificate of veracity with the primary key or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public JADSCCertificateOfVeracity findByPrimaryKey(long jadscCOVId)
		throws NoSuchJADSCCertificateOfVeracityException;

	/**
	 * Returns the jadsc certificate of veracity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity, or <code>null</code> if a jadsc certificate of veracity with the primary key could not be found
	 */
	public JADSCCertificateOfVeracity fetchByPrimaryKey(long jadscCOVId);

	/**
	 * Returns all the jadsc certificate of veracities.
	 *
	 * @return the jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findAll();

	/**
	 * Returns a range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of veracities
	 */
	public java.util.List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc certificate of veracities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc certificate of veracities.
	 *
	 * @return the number of jadsc certificate of veracities
	 */
	public int countAll();

}