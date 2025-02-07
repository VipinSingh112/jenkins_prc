/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccInsBodiesOrganizationException;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc ins bodies organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationUtil
 * @generated
 */
@ProviderType
public interface AccInsBodiesOrganizationPersistence
	extends BasePersistence<AccInsBodiesOrganization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccInsBodiesOrganizationUtil} to access the acc ins bodies organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns the acc ins bodies organizations before and after the current acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the current acc ins bodies organization
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public AccInsBodiesOrganization[] findByUuid_PrevAndNext(
			long accInsBodiesOrganizationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Removes all the acc ins bodies organizations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies organizations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies organization where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies organization that was removed
	 */
	public AccInsBodiesOrganization removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns the acc ins bodies organizations before and after the current acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the current acc ins bodies organization
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public AccInsBodiesOrganization[] findByUuid_C_PrevAndNext(
			long accInsBodiesOrganizationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOrganization> orderByComparator)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Removes all the acc ins bodies organizations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public AccInsBodiesOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies organization where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies organization that was removed
	 */
	public AccInsBodiesOrganization removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the number of acc ins bodies organizations where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc ins bodies organization in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 */
	public void cacheResult(AccInsBodiesOrganization accInsBodiesOrganization);

	/**
	 * Caches the acc ins bodies organizations in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOrganizations the acc ins bodies organizations
	 */
	public void cacheResult(
		java.util.List<AccInsBodiesOrganization> accInsBodiesOrganizations);

	/**
	 * Creates a new acc ins bodies organization with the primary key. Does not add the acc ins bodies organization to the database.
	 *
	 * @param accInsBodiesOrganizationId the primary key for the new acc ins bodies organization
	 * @return the new acc ins bodies organization
	 */
	public AccInsBodiesOrganization create(long accInsBodiesOrganizationId);

	/**
	 * Removes the acc ins bodies organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public AccInsBodiesOrganization remove(long accInsBodiesOrganizationId)
		throws NoSuchAccInsBodiesOrganizationException;

	public AccInsBodiesOrganization updateImpl(
		AccInsBodiesOrganization accInsBodiesOrganization);

	/**
	 * Returns the acc ins bodies organization with the primary key or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public AccInsBodiesOrganization findByPrimaryKey(
			long accInsBodiesOrganizationId)
		throws NoSuchAccInsBodiesOrganizationException;

	/**
	 * Returns the acc ins bodies organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization, or <code>null</code> if a acc ins bodies organization with the primary key could not be found
	 */
	public AccInsBodiesOrganization fetchByPrimaryKey(
		long accInsBodiesOrganizationId);

	/**
	 * Returns all the acc ins bodies organizations.
	 *
	 * @return the acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findAll();

	/**
	 * Returns a range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies organizations
	 */
	public java.util.List<AccInsBodiesOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc ins bodies organizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc ins bodies organizations.
	 *
	 * @return the number of acc ins bodies organizations
	 */
	public int countAll();

}