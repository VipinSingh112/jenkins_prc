/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabPhysicalResourceException;
import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab physical resource service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourceUtil
 * @generated
 */
@ProviderType
public interface AccMediLabPhysicalResourcePersistence
	extends BasePersistence<AccMediLabPhysicalResource> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabPhysicalResourceUtil} to access the acc medi lab physical resource persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns the acc medi lab physical resources before and after the current acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the current acc medi lab physical resource
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public AccMediLabPhysicalResource[] findByUuid_PrevAndNext(
			long accMediLabPhysicalResourceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Removes all the acc medi lab physical resources where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab physical resources
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab physical resource where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab physical resource that was removed
	 */
	public AccMediLabPhysicalResource removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns the acc medi lab physical resources before and after the current acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the current acc medi lab physical resource
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public AccMediLabPhysicalResource[] findByUuid_C_PrevAndNext(
			long accMediLabPhysicalResourceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabPhysicalResource> orderByComparator)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Removes all the acc medi lab physical resources where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public AccMediLabPhysicalResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab physical resource where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab physical resource that was removed
	 */
	public AccMediLabPhysicalResource removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the number of acc medi lab physical resources where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab physical resource in the entity cache if it is enabled.
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 */
	public void cacheResult(
		AccMediLabPhysicalResource accMediLabPhysicalResource);

	/**
	 * Caches the acc medi lab physical resources in the entity cache if it is enabled.
	 *
	 * @param accMediLabPhysicalResources the acc medi lab physical resources
	 */
	public void cacheResult(
		java.util.List<AccMediLabPhysicalResource> accMediLabPhysicalResources);

	/**
	 * Creates a new acc medi lab physical resource with the primary key. Does not add the acc medi lab physical resource to the database.
	 *
	 * @param accMediLabPhysicalResourceId the primary key for the new acc medi lab physical resource
	 * @return the new acc medi lab physical resource
	 */
	public AccMediLabPhysicalResource create(long accMediLabPhysicalResourceId);

	/**
	 * Removes the acc medi lab physical resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public AccMediLabPhysicalResource remove(long accMediLabPhysicalResourceId)
		throws NoSuchAccMediLabPhysicalResourceException;

	public AccMediLabPhysicalResource updateImpl(
		AccMediLabPhysicalResource accMediLabPhysicalResource);

	/**
	 * Returns the acc medi lab physical resource with the primary key or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public AccMediLabPhysicalResource findByPrimaryKey(
			long accMediLabPhysicalResourceId)
		throws NoSuchAccMediLabPhysicalResourceException;

	/**
	 * Returns the acc medi lab physical resource with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource, or <code>null</code> if a acc medi lab physical resource with the primary key could not be found
	 */
	public AccMediLabPhysicalResource fetchByPrimaryKey(
		long accMediLabPhysicalResourceId);

	/**
	 * Returns all the acc medi lab physical resources.
	 *
	 * @return the acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findAll();

	/**
	 * Returns a range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab physical resources
	 */
	public java.util.List<AccMediLabPhysicalResource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab physical resources from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab physical resources.
	 *
	 * @return the number of acc medi lab physical resources
	 */
	public int countAll();

}