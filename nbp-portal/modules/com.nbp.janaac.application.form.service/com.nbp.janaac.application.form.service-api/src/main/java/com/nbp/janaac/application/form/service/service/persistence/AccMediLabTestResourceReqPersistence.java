/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabTestResourceReqException;
import com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab test resource req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReqUtil
 * @generated
 */
@ProviderType
public interface AccMediLabTestResourceReqPersistence
	extends BasePersistence<AccMediLabTestResourceReq> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabTestResourceReqUtil} to access the acc medi lab test resource req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns the acc medi lab test resource reqs before and after the current acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the current acc medi lab test resource req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public AccMediLabTestResourceReq[] findByUuid_PrevAndNext(
			long accMediLabTestResourceReqId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Removes all the acc medi lab test resource reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test resource req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab test resource req that was removed
	 */
	public AccMediLabTestResourceReq removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns the acc medi lab test resource reqs before and after the current acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the current acc medi lab test resource req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public AccMediLabTestResourceReq[] findByUuid_C_PrevAndNext(
			long accMediLabTestResourceReqId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccMediLabTestResourceReq> orderByComparator)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Removes all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public AccMediLabTestResourceReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab test resource req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab test resource req that was removed
	 */
	public AccMediLabTestResourceReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the number of acc medi lab test resource reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab test resource req in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestResourceReq the acc medi lab test resource req
	 */
	public void cacheResult(
		AccMediLabTestResourceReq accMediLabTestResourceReq);

	/**
	 * Caches the acc medi lab test resource reqs in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestResourceReqs the acc medi lab test resource reqs
	 */
	public void cacheResult(
		java.util.List<AccMediLabTestResourceReq> accMediLabTestResourceReqs);

	/**
	 * Creates a new acc medi lab test resource req with the primary key. Does not add the acc medi lab test resource req to the database.
	 *
	 * @param accMediLabTestResourceReqId the primary key for the new acc medi lab test resource req
	 * @return the new acc medi lab test resource req
	 */
	public AccMediLabTestResourceReq create(long accMediLabTestResourceReqId);

	/**
	 * Removes the acc medi lab test resource req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was removed
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public AccMediLabTestResourceReq remove(long accMediLabTestResourceReqId)
		throws NoSuchAccMediLabTestResourceReqException;

	public AccMediLabTestResourceReq updateImpl(
		AccMediLabTestResourceReq accMediLabTestResourceReq);

	/**
	 * Returns the acc medi lab test resource req with the primary key or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public AccMediLabTestResourceReq findByPrimaryKey(
			long accMediLabTestResourceReqId)
		throws NoSuchAccMediLabTestResourceReqException;

	/**
	 * Returns the acc medi lab test resource req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req, or <code>null</code> if a acc medi lab test resource req with the primary key could not be found
	 */
	public AccMediLabTestResourceReq fetchByPrimaryKey(
		long accMediLabTestResourceReqId);

	/**
	 * Returns all the acc medi lab test resource reqs.
	 *
	 * @return the acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findAll();

	/**
	 * Returns a range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab test resource reqs
	 */
	public java.util.List<AccMediLabTestResourceReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab test resource reqs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab test resource reqs.
	 *
	 * @return the number of acc medi lab test resource reqs
	 */
	public int countAll();

}