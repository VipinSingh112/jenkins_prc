/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabTestStructuralException;
import com.nbp.janaac.application.form.service.model.AccMediLabTestStructural;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab test structural service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestStructuralUtil
 * @generated
 */
@ProviderType
public interface AccMediLabTestStructuralPersistence
	extends BasePersistence<AccMediLabTestStructural> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabTestStructuralUtil} to access the acc medi lab test structural persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns the acc medi lab test structurals before and after the current acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabTestStructuralId the primary key of the current acc medi lab test structural
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	public AccMediLabTestStructural[] findByUuid_PrevAndNext(
			long accMediLabTestStructuralId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Removes all the acc medi lab test structurals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab test structurals
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test structural where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab test structural that was removed
	 */
	public AccMediLabTestStructural removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab test structurals
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns the acc medi lab test structurals before and after the current acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabTestStructuralId the primary key of the current acc medi lab test structural
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	public AccMediLabTestStructural[] findByUuid_C_PrevAndNext(
			long accMediLabTestStructuralId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Removes all the acc medi lab test structurals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab test structurals
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	public AccMediLabTestStructural fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test structural where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab test structural that was removed
	 */
	public AccMediLabTestStructural removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the number of acc medi lab test structurals where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab test structurals
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab test structural in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestStructural the acc medi lab test structural
	 */
	public void cacheResult(AccMediLabTestStructural accMediLabTestStructural);

	/**
	 * Caches the acc medi lab test structurals in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestStructurals the acc medi lab test structurals
	 */
	public void cacheResult(
		java.util.List<AccMediLabTestStructural> accMediLabTestStructurals);

	/**
	 * Creates a new acc medi lab test structural with the primary key. Does not add the acc medi lab test structural to the database.
	 *
	 * @param accMediLabTestStructuralId the primary key for the new acc medi lab test structural
	 * @return the new acc medi lab test structural
	 */
	public AccMediLabTestStructural create(long accMediLabTestStructuralId);

	/**
	 * Removes the acc medi lab test structural with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural that was removed
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	public AccMediLabTestStructural remove(long accMediLabTestStructuralId)
		throws NoSuchAccMediLabTestStructuralException;

	public AccMediLabTestStructural updateImpl(
		AccMediLabTestStructural accMediLabTestStructural);

	/**
	 * Returns the acc medi lab test structural with the primary key or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	public AccMediLabTestStructural findByPrimaryKey(
			long accMediLabTestStructuralId)
		throws NoSuchAccMediLabTestStructuralException;

	/**
	 * Returns the acc medi lab test structural with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural, or <code>null</code> if a acc medi lab test structural with the primary key could not be found
	 */
	public AccMediLabTestStructural fetchByPrimaryKey(
		long accMediLabTestStructuralId);

	/**
	 * Returns all the acc medi lab test structurals.
	 *
	 * @return the acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findAll();

	/**
	 * Returns a range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab test structurals
	 */
	public java.util.List<AccMediLabTestStructural> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestStructural> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab test structurals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab test structurals.
	 *
	 * @return the number of acc medi lab test structurals
	 */
	public int countAll();

}