/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabTestDescriptionException;
import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab test description service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionUtil
 * @generated
 */
@ProviderType
public interface AccMediLabTestDescriptionPersistence
	extends BasePersistence<AccMediLabTestDescription> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabTestDescriptionUtil} to access the acc medi lab test description persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab test descriptions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab test descriptions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @return the range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test description in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the first acc medi lab test description in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns the last acc medi lab test description in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the last acc medi lab test description in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns the acc medi lab test descriptions before and after the current acc medi lab test description in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the current acc medi lab test description
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a acc medi lab test description with the primary key could not be found
	 */
	public AccMediLabTestDescription[] findByUuid_PrevAndNext(
			long accMediLabTestDescriptionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Removes all the acc medi lab test descriptions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab test descriptions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab test descriptions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab test description where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabTestDescriptionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the acc medi lab test description where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab test description where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test description where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab test description that was removed
	 */
	public AccMediLabTestDescription removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the number of acc medi lab test descriptions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab test descriptions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab test descriptions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab test descriptions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @return the range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test description in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the first acc medi lab test description in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns the last acc medi lab test description in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the last acc medi lab test description in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns the acc medi lab test descriptions before and after the current acc medi lab test description in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the current acc medi lab test description
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a acc medi lab test description with the primary key could not be found
	 */
	public AccMediLabTestDescription[] findByUuid_C_PrevAndNext(
			long accMediLabTestDescriptionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestDescription> orderByComparator)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Removes all the acc medi lab test descriptions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab test descriptions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab test descriptions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab test description where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabTestDescriptionException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the acc medi lab test description where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab test description where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	public AccMediLabTestDescription fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test description where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab test description that was removed
	 */
	public AccMediLabTestDescription removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the number of acc medi lab test descriptions where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab test descriptions
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab test description in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 */
	public void cacheResult(
		AccMediLabTestDescription accMediLabTestDescription);

	/**
	 * Caches the acc medi lab test descriptions in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestDescriptions the acc medi lab test descriptions
	 */
	public void cacheResult(
		java.util.List<AccMediLabTestDescription> accMediLabTestDescriptions);

	/**
	 * Creates a new acc medi lab test description with the primary key. Does not add the acc medi lab test description to the database.
	 *
	 * @param accMediLabTestDescriptionId the primary key for the new acc medi lab test description
	 * @return the new acc medi lab test description
	 */
	public AccMediLabTestDescription create(long accMediLabTestDescriptionId);

	/**
	 * Removes the acc medi lab test description with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description that was removed
	 * @throws NoSuchAccMediLabTestDescriptionException if a acc medi lab test description with the primary key could not be found
	 */
	public AccMediLabTestDescription remove(long accMediLabTestDescriptionId)
		throws NoSuchAccMediLabTestDescriptionException;

	public AccMediLabTestDescription updateImpl(
		AccMediLabTestDescription accMediLabTestDescription);

	/**
	 * Returns the acc medi lab test description with the primary key or throws a <code>NoSuchAccMediLabTestDescriptionException</code> if it could not be found.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description
	 * @throws NoSuchAccMediLabTestDescriptionException if a acc medi lab test description with the primary key could not be found
	 */
	public AccMediLabTestDescription findByPrimaryKey(
			long accMediLabTestDescriptionId)
		throws NoSuchAccMediLabTestDescriptionException;

	/**
	 * Returns the acc medi lab test description with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description, or <code>null</code> if a acc medi lab test description with the primary key could not be found
	 */
	public AccMediLabTestDescription fetchByPrimaryKey(
		long accMediLabTestDescriptionId);

	/**
	 * Returns all the acc medi lab test descriptions.
	 *
	 * @return the acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findAll();

	/**
	 * Returns a range of all the acc medi lab test descriptions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @return the range of acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test descriptions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab test descriptions
	 */
	public java.util.List<AccMediLabTestDescription> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestDescription> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab test descriptions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab test descriptions.
	 *
	 * @return the number of acc medi lab test descriptions
	 */
	public int countAll();

}