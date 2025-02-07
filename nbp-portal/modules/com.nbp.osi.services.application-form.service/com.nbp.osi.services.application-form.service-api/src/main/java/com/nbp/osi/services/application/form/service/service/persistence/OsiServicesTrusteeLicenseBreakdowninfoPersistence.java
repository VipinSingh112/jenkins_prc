/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee license breakdowninfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeLicenseBreakdowninfoPersistence
	extends BasePersistence<OsiServicesTrusteeLicenseBreakdowninfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeLicenseBreakdowninfoUtil} to access the osi services trustee license breakdowninfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo[] findByUuid_PrevAndNext(
			long osiLicBreakId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo[] findByUuid_C_PrevAndNext(
			long osiLicBreakId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the number of osi services trustee license breakdowninfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee license breakdowninfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 */
	public void cacheResult(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo);

	/**
	 * Caches the osi services trustee license breakdowninfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfos the osi services trustee license breakdowninfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeLicenseBreakdowninfo>
			osiServicesTrusteeLicenseBreakdowninfos);

	/**
	 * Creates a new osi services trustee license breakdowninfo with the primary key. Does not add the osi services trustee license breakdowninfo to the database.
	 *
	 * @param osiLicBreakId the primary key for the new osi services trustee license breakdowninfo
	 * @return the new osi services trustee license breakdowninfo
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo create(long osiLicBreakId);

	/**
	 * Removes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo remove(long osiLicBreakId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	public OsiServicesTrusteeLicenseBreakdowninfo updateImpl(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo);

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo findByPrimaryKey(
			long osiLicBreakId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo, or <code>null</code> if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByPrimaryKey(
		long osiLicBreakId);

	/**
	 * Returns all the osi services trustee license breakdowninfos.
	 *
	 * @return the osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findAll();

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	public java.util.List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeLicenseBreakdowninfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services trustee license breakdowninfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee license breakdowninfos.
	 *
	 * @return the number of osi services trustee license breakdowninfos
	 */
	public int countAll();

}