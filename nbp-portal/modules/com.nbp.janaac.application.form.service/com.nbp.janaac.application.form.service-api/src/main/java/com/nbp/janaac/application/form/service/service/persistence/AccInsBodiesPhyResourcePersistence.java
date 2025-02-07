/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccInsBodiesPhyResourceException;
import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc ins bodies phy resource service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResourceUtil
 * @generated
 */
@ProviderType
public interface AccInsBodiesPhyResourcePersistence
	extends BasePersistence<AccInsBodiesPhyResource> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccInsBodiesPhyResourceUtil} to access the acc ins bodies phy resource persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns the acc ins bodies phy resources before and after the current acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the current acc ins bodies phy resource
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public AccInsBodiesPhyResource[] findByUuid_PrevAndNext(
			long accInsBodiesPhyResourceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Removes all the acc ins bodies phy resources where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies phy resources
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies phy resource that was removed
	 */
	public AccInsBodiesPhyResource removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns the acc ins bodies phy resources before and after the current acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the current acc ins bodies phy resource
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public AccInsBodiesPhyResource[] findByUuid_C_PrevAndNext(
			long accInsBodiesPhyResourceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesPhyResource> orderByComparator)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Removes all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public AccInsBodiesPhyResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies phy resource where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies phy resource that was removed
	 */
	public AccInsBodiesPhyResource removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the number of acc ins bodies phy resources where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc ins bodies phy resource in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 */
	public void cacheResult(AccInsBodiesPhyResource accInsBodiesPhyResource);

	/**
	 * Caches the acc ins bodies phy resources in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesPhyResources the acc ins bodies phy resources
	 */
	public void cacheResult(
		java.util.List<AccInsBodiesPhyResource> accInsBodiesPhyResources);

	/**
	 * Creates a new acc ins bodies phy resource with the primary key. Does not add the acc ins bodies phy resource to the database.
	 *
	 * @param accInsBodiesPhyResourceId the primary key for the new acc ins bodies phy resource
	 * @return the new acc ins bodies phy resource
	 */
	public AccInsBodiesPhyResource create(long accInsBodiesPhyResourceId);

	/**
	 * Removes the acc ins bodies phy resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public AccInsBodiesPhyResource remove(long accInsBodiesPhyResourceId)
		throws NoSuchAccInsBodiesPhyResourceException;

	public AccInsBodiesPhyResource updateImpl(
		AccInsBodiesPhyResource accInsBodiesPhyResource);

	/**
	 * Returns the acc ins bodies phy resource with the primary key or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public AccInsBodiesPhyResource findByPrimaryKey(
			long accInsBodiesPhyResourceId)
		throws NoSuchAccInsBodiesPhyResourceException;

	/**
	 * Returns the acc ins bodies phy resource with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource, or <code>null</code> if a acc ins bodies phy resource with the primary key could not be found
	 */
	public AccInsBodiesPhyResource fetchByPrimaryKey(
		long accInsBodiesPhyResourceId);

	/**
	 * Returns all the acc ins bodies phy resources.
	 *
	 * @return the acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findAll();

	/**
	 * Returns a range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies phy resources
	 */
	public java.util.List<AccInsBodiesPhyResource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc ins bodies phy resources from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc ins bodies phy resources.
	 *
	 * @return the number of acc ins bodies phy resources
	 */
	public int countAll();

}