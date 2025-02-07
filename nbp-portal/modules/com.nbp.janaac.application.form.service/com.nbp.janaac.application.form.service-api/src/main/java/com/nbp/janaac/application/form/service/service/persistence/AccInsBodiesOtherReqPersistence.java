/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccInsBodiesOtherReqException;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc ins bodies other req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReqUtil
 * @generated
 */
@ProviderType
public interface AccInsBodiesOtherReqPersistence
	extends BasePersistence<AccInsBodiesOtherReq> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccInsBodiesOtherReqUtil} to access the acc ins bodies other req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc ins bodies other reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc ins bodies other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @return the range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the first acc ins bodies other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns the last acc ins bodies other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the last acc ins bodies other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns the acc ins bodies other reqs before and after the current acc ins bodies other req in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the current acc ins bodies other req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a acc ins bodies other req with the primary key could not be found
	 */
	public AccInsBodiesOtherReq[] findByUuid_PrevAndNext(
			long accInsBodiesOtherReqId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Removes all the acc ins bodies other reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc ins bodies other reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies other reqs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc ins bodies other req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesOtherReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the acc ins bodies other req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc ins bodies other req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies other req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies other req that was removed
	 */
	public AccInsBodiesOtherReq removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the number of acc ins bodies other reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies other reqs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc ins bodies other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc ins bodies other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @return the range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc ins bodies other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the first acc ins bodies other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns the last acc ins bodies other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the last acc ins bodies other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns the acc ins bodies other reqs before and after the current acc ins bodies other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the current acc ins bodies other req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a acc ins bodies other req with the primary key could not be found
	 */
	public AccInsBodiesOtherReq[] findByUuid_C_PrevAndNext(
			long accInsBodiesOtherReqId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccInsBodiesOtherReq> orderByComparator)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Removes all the acc ins bodies other reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc ins bodies other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies other reqs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc ins bodies other req where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesOtherReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the acc ins bodies other req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc ins bodies other req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	public AccInsBodiesOtherReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc ins bodies other req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies other req that was removed
	 */
	public AccInsBodiesOtherReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the number of acc ins bodies other reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies other reqs
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc ins bodies other req in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 */
	public void cacheResult(AccInsBodiesOtherReq accInsBodiesOtherReq);

	/**
	 * Caches the acc ins bodies other reqs in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOtherReqs the acc ins bodies other reqs
	 */
	public void cacheResult(
		java.util.List<AccInsBodiesOtherReq> accInsBodiesOtherReqs);

	/**
	 * Creates a new acc ins bodies other req with the primary key. Does not add the acc ins bodies other req to the database.
	 *
	 * @param accInsBodiesOtherReqId the primary key for the new acc ins bodies other req
	 * @return the new acc ins bodies other req
	 */
	public AccInsBodiesOtherReq create(long accInsBodiesOtherReqId);

	/**
	 * Removes the acc ins bodies other req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req that was removed
	 * @throws NoSuchAccInsBodiesOtherReqException if a acc ins bodies other req with the primary key could not be found
	 */
	public AccInsBodiesOtherReq remove(long accInsBodiesOtherReqId)
		throws NoSuchAccInsBodiesOtherReqException;

	public AccInsBodiesOtherReq updateImpl(
		AccInsBodiesOtherReq accInsBodiesOtherReq);

	/**
	 * Returns the acc ins bodies other req with the primary key or throws a <code>NoSuchAccInsBodiesOtherReqException</code> if it could not be found.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req
	 * @throws NoSuchAccInsBodiesOtherReqException if a acc ins bodies other req with the primary key could not be found
	 */
	public AccInsBodiesOtherReq findByPrimaryKey(long accInsBodiesOtherReqId)
		throws NoSuchAccInsBodiesOtherReqException;

	/**
	 * Returns the acc ins bodies other req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req, or <code>null</code> if a acc ins bodies other req with the primary key could not be found
	 */
	public AccInsBodiesOtherReq fetchByPrimaryKey(long accInsBodiesOtherReqId);

	/**
	 * Returns all the acc ins bodies other reqs.
	 *
	 * @return the acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findAll();

	/**
	 * Returns a range of all the acc ins bodies other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @return the range of acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc ins bodies other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies other reqs
	 */
	public java.util.List<AccInsBodiesOtherReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccInsBodiesOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc ins bodies other reqs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc ins bodies other reqs.
	 *
	 * @return the number of acc ins bodies other reqs
	 */
	public int countAll();

}