/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesAssignmentDetailinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services assignment detailinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesAssignmentDetailinfoPersistence
	extends BasePersistence<OsiServicesAssignmentDetailinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesAssignmentDetailinfoUtil} to access the osi services assignment detailinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services assignment detailinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services assignment detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @return the range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services assignment detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the first osi services assignment detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns the last osi services assignment detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the last osi services assignment detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns the osi services assignment detailinfos before and after the current osi services assignment detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiADId the primary key of the current osi services assignment detailinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public OsiServicesAssignmentDetailinfo[] findByUuid_PrevAndNext(
			long osiADId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Removes all the osi services assignment detailinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services assignment detailinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services assignment detailinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services assignment detailinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesAssignmentDetailinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the osi services assignment detailinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services assignment detailinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services assignment detailinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services assignment detailinfo that was removed
	 */
	public OsiServicesAssignmentDetailinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the number of osi services assignment detailinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services assignment detailinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services assignment detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services assignment detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @return the range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services assignment detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the first osi services assignment detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns the last osi services assignment detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the last osi services assignment detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns the osi services assignment detailinfos before and after the current osi services assignment detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiADId the primary key of the current osi services assignment detailinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public OsiServicesAssignmentDetailinfo[] findByUuid_C_PrevAndNext(
			long osiADId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesAssignmentDetailinfo> orderByComparator)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Removes all the osi services assignment detailinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services assignment detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services assignment detailinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services assignment detailinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesAssignmentDetailinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the osi services assignment detailinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services assignment detailinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services assignment detailinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services assignment detailinfo that was removed
	 */
	public OsiServicesAssignmentDetailinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the number of osi services assignment detailinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services assignment detailinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services assignment detailinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 */
	public void cacheResult(
		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo);

	/**
	 * Caches the osi services assignment detailinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesAssignmentDetailinfos the osi services assignment detailinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesAssignmentDetailinfo>
			osiServicesAssignmentDetailinfos);

	/**
	 * Creates a new osi services assignment detailinfo with the primary key. Does not add the osi services assignment detailinfo to the database.
	 *
	 * @param osiADId the primary key for the new osi services assignment detailinfo
	 * @return the new osi services assignment detailinfo
	 */
	public OsiServicesAssignmentDetailinfo create(long osiADId);

	/**
	 * Removes the osi services assignment detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was removed
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public OsiServicesAssignmentDetailinfo remove(long osiADId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	public OsiServicesAssignmentDetailinfo updateImpl(
		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo);

	/**
	 * Returns the osi services assignment detailinfo with the primary key or throws a <code>NoSuchOsiServicesAssignmentDetailinfoException</code> if it could not be found.
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo
	 * @throws NoSuchOsiServicesAssignmentDetailinfoException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public OsiServicesAssignmentDetailinfo findByPrimaryKey(long osiADId)
		throws NoSuchOsiServicesAssignmentDetailinfoException;

	/**
	 * Returns the osi services assignment detailinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo, or <code>null</code> if a osi services assignment detailinfo with the primary key could not be found
	 */
	public OsiServicesAssignmentDetailinfo fetchByPrimaryKey(long osiADId);

	/**
	 * Returns all the osi services assignment detailinfos.
	 *
	 * @return the osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findAll();

	/**
	 * Returns a range of all the osi services assignment detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @return the range of osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services assignment detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services assignment detailinfos
	 */
	public java.util.List<OsiServicesAssignmentDetailinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesAssignmentDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services assignment detailinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services assignment detailinfos.
	 *
	 * @return the number of osi services assignment detailinfos
	 */
	public int countAll();

}