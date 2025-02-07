/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabOrganizationException;
import com.nbp.janaac.application.form.service.model.AccMediLabOrganization;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganizationUtil
 * @generated
 */
@ProviderType
public interface AccMediLabOrganizationPersistence
	extends BasePersistence<AccMediLabOrganization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabOrganizationUtil} to access the acc medi lab organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @return the range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the first acc medi lab organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns the last acc medi lab organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the last acc medi lab organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns the acc medi lab organizations before and after the current acc medi lab organization in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabOrganizationId the primary key of the current acc medi lab organization
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a acc medi lab organization with the primary key could not be found
	 */
	public AccMediLabOrganization[] findByUuid_PrevAndNext(
			long accMediLabOrganizationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Removes all the acc medi lab organizations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab organizations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab organization where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabOrganizationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the acc medi lab organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab organization where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab organization that was removed
	 */
	public AccMediLabOrganization removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the number of acc medi lab organizations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab organizations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @return the range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the first acc medi lab organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns the last acc medi lab organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the last acc medi lab organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns the acc medi lab organizations before and after the current acc medi lab organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabOrganizationId the primary key of the current acc medi lab organization
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a acc medi lab organization with the primary key could not be found
	 */
	public AccMediLabOrganization[] findByUuid_C_PrevAndNext(
			long accMediLabOrganizationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabOrganization> orderByComparator)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Removes all the acc medi lab organizations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab organizations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab organization where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabOrganizationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the acc medi lab organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public AccMediLabOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab organization where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab organization that was removed
	 */
	public AccMediLabOrganization removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the number of acc medi lab organizations where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab organizations
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab organization in the entity cache if it is enabled.
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 */
	public void cacheResult(AccMediLabOrganization accMediLabOrganization);

	/**
	 * Caches the acc medi lab organizations in the entity cache if it is enabled.
	 *
	 * @param accMediLabOrganizations the acc medi lab organizations
	 */
	public void cacheResult(
		java.util.List<AccMediLabOrganization> accMediLabOrganizations);

	/**
	 * Creates a new acc medi lab organization with the primary key. Does not add the acc medi lab organization to the database.
	 *
	 * @param accMediLabOrganizationId the primary key for the new acc medi lab organization
	 * @return the new acc medi lab organization
	 */
	public AccMediLabOrganization create(long accMediLabOrganizationId);

	/**
	 * Removes the acc medi lab organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization that was removed
	 * @throws NoSuchAccMediLabOrganizationException if a acc medi lab organization with the primary key could not be found
	 */
	public AccMediLabOrganization remove(long accMediLabOrganizationId)
		throws NoSuchAccMediLabOrganizationException;

	public AccMediLabOrganization updateImpl(
		AccMediLabOrganization accMediLabOrganization);

	/**
	 * Returns the acc medi lab organization with the primary key or throws a <code>NoSuchAccMediLabOrganizationException</code> if it could not be found.
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization
	 * @throws NoSuchAccMediLabOrganizationException if a acc medi lab organization with the primary key could not be found
	 */
	public AccMediLabOrganization findByPrimaryKey(
			long accMediLabOrganizationId)
		throws NoSuchAccMediLabOrganizationException;

	/**
	 * Returns the acc medi lab organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization, or <code>null</code> if a acc medi lab organization with the primary key could not be found
	 */
	public AccMediLabOrganization fetchByPrimaryKey(
		long accMediLabOrganizationId);

	/**
	 * Returns all the acc medi lab organizations.
	 *
	 * @return the acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findAll();

	/**
	 * Returns a range of all the acc medi lab organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @return the range of acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab organizations
	 */
	public java.util.List<AccMediLabOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOrganization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab organizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab organizations.
	 *
	 * @return the number of acc medi lab organizations
	 */
	public int countAll();

}