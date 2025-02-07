/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeBreadDownAddinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee bread down addinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeBreadDownAddinfoPersistence
	extends BasePersistence<OsiServicesTrusteeBreadDownAddinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeBreadDownAddinfoUtil} to access the osi services trustee bread down addinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo[] findByUuid_PrevAndNext(
			long osiTrusId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	public OsiServicesTrusteeBreadDownAddinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo[] findByUuid_C_PrevAndNext(
			long osiTrusId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	public OsiServicesTrusteeBreadDownAddinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Returns all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(long osiServicesApplicationId);

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_First(
				long osiServicesApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_First(
			long osiServicesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_Last(
				long osiServicesApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_Last(
			long osiServicesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo[]
			findBygetOsiServices_Data_By_Id_PrevAndNext(
				long osiTrusId, long osiServicesApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeBreadDownAddinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Removes all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	public void removeBygetOsiServices_Data_By_Id(
		long osiServicesApplicationId);

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public int countBygetOsiServices_Data_By_Id(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee bread down addinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 */
	public void cacheResult(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo);

	/**
	 * Caches the osi services trustee bread down addinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfos the osi services trustee bread down addinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeBreadDownAddinfo>
			osiServicesTrusteeBreadDownAddinfos);

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	public OsiServicesTrusteeBreadDownAddinfo create(long osiTrusId);

	/**
	 * Removes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo remove(long osiTrusId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	public OsiServicesTrusteeBreadDownAddinfo updateImpl(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo);

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo findByPrimaryKey(long osiTrusId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException;

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo, or <code>null</code> if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeBreadDownAddinfo fetchByPrimaryKey(long osiTrusId);

	/**
	 * Returns all the osi services trustee bread down addinfos.
	 *
	 * @return the osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findAll();

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	public java.util.List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services trustee bread down addinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	public int countAll();

}