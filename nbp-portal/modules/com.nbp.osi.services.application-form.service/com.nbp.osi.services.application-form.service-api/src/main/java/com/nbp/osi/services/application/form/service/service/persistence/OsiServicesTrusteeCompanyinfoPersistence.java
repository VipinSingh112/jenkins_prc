/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeCompanyinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee companyinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeCompanyinfoPersistence
	extends BasePersistence<OsiServicesTrusteeCompanyinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeCompanyinfoUtil} to access the osi services trustee companyinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns the osi services trustee companyinfos before and after the current osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee companyinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeCompanyinfo[] findByUuid_PrevAndNext(
			long osiTrusId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Removes all the osi services trustee companyinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee companyinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee companyinfo that was removed
	 */
	public OsiServicesTrusteeCompanyinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns the osi services trustee companyinfos before and after the current osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee companyinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeCompanyinfo[] findByUuid_C_PrevAndNext(
			long osiTrusId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Removes all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee companyinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee companyinfo that was removed
	 */
	public OsiServicesTrusteeCompanyinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the number of osi services trustee companyinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee companyinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 */
	public void cacheResult(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo);

	/**
	 * Caches the osi services trustee companyinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeCompanyinfos the osi services trustee companyinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeCompanyinfo>
			osiServicesTrusteeCompanyinfos);

	/**
	 * Creates a new osi services trustee companyinfo with the primary key. Does not add the osi services trustee companyinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee companyinfo
	 * @return the new osi services trustee companyinfo
	 */
	public OsiServicesTrusteeCompanyinfo create(long osiTrusId);

	/**
	 * Removes the osi services trustee companyinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeCompanyinfo remove(long osiTrusId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	public OsiServicesTrusteeCompanyinfo updateImpl(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo);

	/**
	 * Returns the osi services trustee companyinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeCompanyinfo findByPrimaryKey(long osiTrusId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException;

	/**
	 * Returns the osi services trustee companyinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo, or <code>null</code> if a osi services trustee companyinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeCompanyinfo fetchByPrimaryKey(long osiTrusId);

	/**
	 * Returns all the osi services trustee companyinfos.
	 *
	 * @return the osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findAll();

	/**
	 * Returns a range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee companyinfos
	 */
	public java.util.List<OsiServicesTrusteeCompanyinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeCompanyinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services trustee companyinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee companyinfos.
	 *
	 * @return the number of osi services trustee companyinfos
	 */
	public int countAll();

}