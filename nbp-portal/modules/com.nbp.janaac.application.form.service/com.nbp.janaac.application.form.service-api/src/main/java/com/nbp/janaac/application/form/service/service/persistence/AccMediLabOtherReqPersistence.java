/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabOtherReqException;
import com.nbp.janaac.application.form.service.model.AccMediLabOtherReq;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc medi lab other req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOtherReqUtil
 * @generated
 */
@ProviderType
public interface AccMediLabOtherReqPersistence
	extends BasePersistence<AccMediLabOtherReq> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccMediLabOtherReqUtil} to access the acc medi lab other req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc medi lab other reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc medi lab other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @return the range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the first acc medi lab other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns the last acc medi lab other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the last acc medi lab other req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns the acc medi lab other reqs before and after the current acc medi lab other req in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabOtherReqId the primary key of the current acc medi lab other req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a acc medi lab other req with the primary key could not be found
	 */
	public AccMediLabOtherReq[] findByUuid_PrevAndNext(
			long accMediLabOtherReqId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Removes all the acc medi lab other reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc medi lab other reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab other reqs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc medi lab other req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabOtherReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the acc medi lab other req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc medi lab other req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab other req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab other req that was removed
	 */
	public AccMediLabOtherReq removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the number of acc medi lab other reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab other reqs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc medi lab other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc medi lab other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @return the range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc medi lab other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the first acc medi lab other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns the last acc medi lab other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the last acc medi lab other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns the acc medi lab other reqs before and after the current acc medi lab other req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabOtherReqId the primary key of the current acc medi lab other req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a acc medi lab other req with the primary key could not be found
	 */
	public AccMediLabOtherReq[] findByUuid_C_PrevAndNext(
			long accMediLabOtherReqId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
				orderByComparator)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Removes all the acc medi lab other reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc medi lab other reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab other reqs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc medi lab other req where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabOtherReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the acc medi lab other req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc medi lab other req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	public AccMediLabOtherReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc medi lab other req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab other req that was removed
	 */
	public AccMediLabOtherReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the number of acc medi lab other reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab other reqs
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc medi lab other req in the entity cache if it is enabled.
	 *
	 * @param accMediLabOtherReq the acc medi lab other req
	 */
	public void cacheResult(AccMediLabOtherReq accMediLabOtherReq);

	/**
	 * Caches the acc medi lab other reqs in the entity cache if it is enabled.
	 *
	 * @param accMediLabOtherReqs the acc medi lab other reqs
	 */
	public void cacheResult(
		java.util.List<AccMediLabOtherReq> accMediLabOtherReqs);

	/**
	 * Creates a new acc medi lab other req with the primary key. Does not add the acc medi lab other req to the database.
	 *
	 * @param accMediLabOtherReqId the primary key for the new acc medi lab other req
	 * @return the new acc medi lab other req
	 */
	public AccMediLabOtherReq create(long accMediLabOtherReqId);

	/**
	 * Removes the acc medi lab other req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabOtherReqId the primary key of the acc medi lab other req
	 * @return the acc medi lab other req that was removed
	 * @throws NoSuchAccMediLabOtherReqException if a acc medi lab other req with the primary key could not be found
	 */
	public AccMediLabOtherReq remove(long accMediLabOtherReqId)
		throws NoSuchAccMediLabOtherReqException;

	public AccMediLabOtherReq updateImpl(AccMediLabOtherReq accMediLabOtherReq);

	/**
	 * Returns the acc medi lab other req with the primary key or throws a <code>NoSuchAccMediLabOtherReqException</code> if it could not be found.
	 *
	 * @param accMediLabOtherReqId the primary key of the acc medi lab other req
	 * @return the acc medi lab other req
	 * @throws NoSuchAccMediLabOtherReqException if a acc medi lab other req with the primary key could not be found
	 */
	public AccMediLabOtherReq findByPrimaryKey(long accMediLabOtherReqId)
		throws NoSuchAccMediLabOtherReqException;

	/**
	 * Returns the acc medi lab other req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabOtherReqId the primary key of the acc medi lab other req
	 * @return the acc medi lab other req, or <code>null</code> if a acc medi lab other req with the primary key could not be found
	 */
	public AccMediLabOtherReq fetchByPrimaryKey(long accMediLabOtherReqId);

	/**
	 * Returns all the acc medi lab other reqs.
	 *
	 * @return the acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findAll();

	/**
	 * Returns a range of all the acc medi lab other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @return the range of acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc medi lab other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab other reqs
	 */
	public java.util.List<AccMediLabOtherReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccMediLabOtherReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc medi lab other reqs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc medi lab other reqs.
	 *
	 * @return the number of acc medi lab other reqs
	 */
	public int countAll();

}