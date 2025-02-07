/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabActivitiesDescException;
import com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab activities desc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDescUtil
 * @generated
 */
@ProviderType
public interface AccMediLabActivitiesDescPersistence
	extends BasePersistence<AccMediLabActivitiesDesc> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabActivitiesDescUtil} to access the acc medi lab activities desc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab activities descs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab activities descs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @return the range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab activities desc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the first acc medi lab activities desc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns the last acc medi lab activities desc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the last acc medi lab activities desc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns the acc medi lab activities descs before and after the current acc medi lab activities desc in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the current acc medi lab activities desc
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a acc medi lab activities desc with the primary key could not be found
	 */
	public AccMediLabActivitiesDesc[] findByUuid_PrevAndNext(
			long accMediLabActivitiesDescId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Removes all the acc medi lab activities descs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab activities descs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab activities descs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab activities desc where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabActivitiesDescException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the acc medi lab activities desc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab activities desc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab activities desc where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab activities desc that was removed
	 */
	public AccMediLabActivitiesDesc removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the number of acc medi lab activities descs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab activities descs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab activities descs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab activities descs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @return the range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab activities desc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the first acc medi lab activities desc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns the last acc medi lab activities desc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the last acc medi lab activities desc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns the acc medi lab activities descs before and after the current acc medi lab activities desc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the current acc medi lab activities desc
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a acc medi lab activities desc with the primary key could not be found
	 */
	public AccMediLabActivitiesDesc[] findByUuid_C_PrevAndNext(
			long accMediLabActivitiesDescId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabActivitiesDesc> orderByComparator)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Removes all the acc medi lab activities descs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab activities descs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab activities descs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab activities desc where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabActivitiesDescException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the acc medi lab activities desc where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab activities desc where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	public AccMediLabActivitiesDesc fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab activities desc where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab activities desc that was removed
	 */
	public AccMediLabActivitiesDesc removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the number of acc medi lab activities descs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab activities descs
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab activities desc in the entity cache if it is enabled.
	 *
	 * @param accMediLabActivitiesDesc the acc medi lab activities desc
	 */
	public void cacheResult(AccMediLabActivitiesDesc accMediLabActivitiesDesc);

	/**
	 * Caches the acc medi lab activities descs in the entity cache if it is enabled.
	 *
	 * @param accMediLabActivitiesDescs the acc medi lab activities descs
	 */
	public void cacheResult(
		java.util.List<AccMediLabActivitiesDesc> accMediLabActivitiesDescs);

	/**
	 * Creates a new acc medi lab activities desc with the primary key. Does not add the acc medi lab activities desc to the database.
	 *
	 * @param accMediLabActivitiesDescId the primary key for the new acc medi lab activities desc
	 * @return the new acc medi lab activities desc
	 */
	public AccMediLabActivitiesDesc create(long accMediLabActivitiesDescId);

	/**
	 * Removes the acc medi lab activities desc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the acc medi lab activities desc
	 * @return the acc medi lab activities desc that was removed
	 * @throws NoSuchAccMediLabActivitiesDescException if a acc medi lab activities desc with the primary key could not be found
	 */
	public AccMediLabActivitiesDesc remove(long accMediLabActivitiesDescId)
		throws NoSuchAccMediLabActivitiesDescException;

	public AccMediLabActivitiesDesc updateImpl(
		AccMediLabActivitiesDesc accMediLabActivitiesDesc);

	/**
	 * Returns the acc medi lab activities desc with the primary key or throws a <code>NoSuchAccMediLabActivitiesDescException</code> if it could not be found.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the acc medi lab activities desc
	 * @return the acc medi lab activities desc
	 * @throws NoSuchAccMediLabActivitiesDescException if a acc medi lab activities desc with the primary key could not be found
	 */
	public AccMediLabActivitiesDesc findByPrimaryKey(
			long accMediLabActivitiesDescId)
		throws NoSuchAccMediLabActivitiesDescException;

	/**
	 * Returns the acc medi lab activities desc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the acc medi lab activities desc
	 * @return the acc medi lab activities desc, or <code>null</code> if a acc medi lab activities desc with the primary key could not be found
	 */
	public AccMediLabActivitiesDesc fetchByPrimaryKey(
		long accMediLabActivitiesDescId);

	/**
	 * Returns all the acc medi lab activities descs.
	 *
	 * @return the acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findAll();

	/**
	 * Returns a range of all the acc medi lab activities descs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @return the range of acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab activities descs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab activities descs
	 */
	public java.util.List<AccMediLabActivitiesDesc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabActivitiesDesc> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab activities descs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab activities descs.
	 *
	 * @return the number of acc medi lab activities descs
	 */
	public int countAll();

}