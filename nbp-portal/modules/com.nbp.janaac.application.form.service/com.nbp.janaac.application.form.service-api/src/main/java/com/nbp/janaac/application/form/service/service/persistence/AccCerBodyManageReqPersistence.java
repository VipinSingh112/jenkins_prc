/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyManageReqException;
import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body manage req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReqUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyManageReqPersistence
	extends BasePersistence<AccCerBodyManageReq> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyManageReqUtil} to access the acc cer body manage req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public AccCerBodyManageReq[] findByUuid_PrevAndNext(
			long accCerBodyManageReqId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body manage reqs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body manage req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body manage req that was removed
	 */
	public AccCerBodyManageReq removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public AccCerBodyManageReq[] findByUuid_C_PrevAndNext(
			long accCerBodyManageReqId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body manage req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body manage req that was removed
	 */
	public AccCerBodyManageReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the number of acc cer body manage reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body manage req in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 */
	public void cacheResult(AccCerBodyManageReq accCerBodyManageReq);

	/**
	 * Caches the acc cer body manage reqs in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReqs the acc cer body manage reqs
	 */
	public void cacheResult(
		java.util.List<AccCerBodyManageReq> accCerBodyManageReqs);

	/**
	 * Creates a new acc cer body manage req with the primary key. Does not add the acc cer body manage req to the database.
	 *
	 * @param accCerBodyManageReqId the primary key for the new acc cer body manage req
	 * @return the new acc cer body manage req
	 */
	public AccCerBodyManageReq create(long accCerBodyManageReqId);

	/**
	 * Removes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public AccCerBodyManageReq remove(long accCerBodyManageReqId)
		throws NoSuchAccCerBodyManageReqException;

	public AccCerBodyManageReq updateImpl(
		AccCerBodyManageReq accCerBodyManageReq);

	/**
	 * Returns the acc cer body manage req with the primary key or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public AccCerBodyManageReq findByPrimaryKey(long accCerBodyManageReqId)
		throws NoSuchAccCerBodyManageReqException;

	/**
	 * Returns the acc cer body manage req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req, or <code>null</code> if a acc cer body manage req with the primary key could not be found
	 */
	public AccCerBodyManageReq fetchByPrimaryKey(long accCerBodyManageReqId);

	/**
	 * Returns all the acc cer body manage reqs.
	 *
	 * @return the acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findAll();

	/**
	 * Returns a range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body manage reqs
	 */
	public java.util.List<AccCerBodyManageReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyManageReq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body manage reqs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body manage reqs.
	 *
	 * @return the number of acc cer body manage reqs
	 */
	public int countAll();

}