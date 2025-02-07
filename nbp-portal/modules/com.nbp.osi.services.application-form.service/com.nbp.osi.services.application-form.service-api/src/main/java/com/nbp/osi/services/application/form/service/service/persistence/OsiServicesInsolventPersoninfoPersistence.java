/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesInsolventPersoninfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services insolvent personinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesInsolventPersoninfoPersistence
	extends BasePersistence<OsiServicesInsolventPersoninfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesInsolventPersoninfoUtil} to access the osi services insolvent personinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services insolvent personinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services insolvent personinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @return the range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services insolvent personinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the first osi services insolvent personinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns the last osi services insolvent personinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the last osi services insolvent personinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns the osi services insolvent personinfos before and after the current osi services insolvent personinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesInsoId the primary key of the current osi services insolvent personinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public OsiServicesInsolventPersoninfo[] findByUuid_PrevAndNext(
			long osiServicesInsoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Removes all the osi services insolvent personinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services insolvent personinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services insolvent personinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services insolvent personinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesInsolventPersoninfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the osi services insolvent personinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services insolvent personinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services insolvent personinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services insolvent personinfo that was removed
	 */
	public OsiServicesInsolventPersoninfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the number of osi services insolvent personinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services insolvent personinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services insolvent personinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services insolvent personinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @return the range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services insolvent personinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the first osi services insolvent personinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns the last osi services insolvent personinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the last osi services insolvent personinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns the osi services insolvent personinfos before and after the current osi services insolvent personinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesInsoId the primary key of the current osi services insolvent personinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public OsiServicesInsolventPersoninfo[] findByUuid_C_PrevAndNext(
			long osiServicesInsoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesInsolventPersoninfo> orderByComparator)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Removes all the osi services insolvent personinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services insolvent personinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services insolvent personinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services insolvent personinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesInsolventPersoninfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the osi services insolvent personinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services insolvent personinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services insolvent personinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services insolvent personinfo that was removed
	 */
	public OsiServicesInsolventPersoninfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the number of osi services insolvent personinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services insolvent personinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services insolvent personinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 */
	public void cacheResult(
		OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo);

	/**
	 * Caches the osi services insolvent personinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesInsolventPersoninfos the osi services insolvent personinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesInsolventPersoninfo>
			osiServicesInsolventPersoninfos);

	/**
	 * Creates a new osi services insolvent personinfo with the primary key. Does not add the osi services insolvent personinfo to the database.
	 *
	 * @param osiServicesInsoId the primary key for the new osi services insolvent personinfo
	 * @return the new osi services insolvent personinfo
	 */
	public OsiServicesInsolventPersoninfo create(long osiServicesInsoId);

	/**
	 * Removes the osi services insolvent personinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was removed
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public OsiServicesInsolventPersoninfo remove(long osiServicesInsoId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	public OsiServicesInsolventPersoninfo updateImpl(
		OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo);

	/**
	 * Returns the osi services insolvent personinfo with the primary key or throws a <code>NoSuchOsiServicesInsolventPersoninfoException</code> if it could not be found.
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo
	 * @throws NoSuchOsiServicesInsolventPersoninfoException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public OsiServicesInsolventPersoninfo findByPrimaryKey(
			long osiServicesInsoId)
		throws NoSuchOsiServicesInsolventPersoninfoException;

	/**
	 * Returns the osi services insolvent personinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo, or <code>null</code> if a osi services insolvent personinfo with the primary key could not be found
	 */
	public OsiServicesInsolventPersoninfo fetchByPrimaryKey(
		long osiServicesInsoId);

	/**
	 * Returns all the osi services insolvent personinfos.
	 *
	 * @return the osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findAll();

	/**
	 * Returns a range of all the osi services insolvent personinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @return the range of osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services insolvent personinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services insolvent personinfos
	 */
	public java.util.List<OsiServicesInsolventPersoninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesInsolventPersoninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services insolvent personinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services insolvent personinfos.
	 *
	 * @return the number of osi services insolvent personinfos
	 */
	public int countAll();

}