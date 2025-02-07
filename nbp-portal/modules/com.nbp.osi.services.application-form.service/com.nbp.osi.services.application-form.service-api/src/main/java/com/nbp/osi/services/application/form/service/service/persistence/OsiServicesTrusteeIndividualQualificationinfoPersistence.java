/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeIndividualQualificationinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee individual qualificationinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeIndividualQualificationinfoPersistence
	extends BasePersistence<OsiServicesTrusteeIndividualQualificationinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeIndividualQualificationinfoUtil} to access the osi services trustee individual qualificationinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(String uuid);

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(
			String uuid, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(
			String uuid, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualQualificationinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualQualificationinfo> orderByComparator);

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_PrevAndNext(
				long osQualificationId, String uuid,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeIndividualQualificationinfo>
						orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	public OsiServicesTrusteeIndividualQualificationinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualQualificationinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualQualificationinfo> orderByComparator);

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_C_PrevAndNext(
				long osQualificationId, String uuid, long companyId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeIndividualQualificationinfo>
						orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo
			findBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(
			long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	public OsiServicesTrusteeIndividualQualificationinfo
			removeBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee individual qualificationinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 */
	public void cacheResult(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo);

	/**
	 * Caches the osi services trustee individual qualificationinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfos the osi services trustee individual qualificationinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
			osiServicesTrusteeIndividualQualificationinfos);

	/**
	 * Creates a new osi services trustee individual qualificationinfo with the primary key. Does not add the osi services trustee individual qualificationinfo to the database.
	 *
	 * @param osQualificationId the primary key for the new osi services trustee individual qualificationinfo
	 * @return the new osi services trustee individual qualificationinfo
	 */
	public OsiServicesTrusteeIndividualQualificationinfo create(
		long osQualificationId);

	/**
	 * Removes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo remove(
			long osQualificationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	public OsiServicesTrusteeIndividualQualificationinfo updateImpl(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo);

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo findByPrimaryKey(
			long osQualificationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException;

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo, or <code>null</code> if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualQualificationinfo fetchByPrimaryKey(
		long osQualificationId);

	/**
	 * Returns all the osi services trustee individual qualificationinfos.
	 *
	 * @return the osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findAll();

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualQualificationinfo>
		findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Removes all the osi services trustee individual qualificationinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee individual qualificationinfos.
	 *
	 * @return the number of osi services trustee individual qualificationinfos
	 */
	public int countAll();

}