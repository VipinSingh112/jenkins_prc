/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee decleration and signatureinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeDeclerationAndSignatureinfoPersistence
	extends BasePersistence<OsiServicesTrusteeDeclerationAndSignatureinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeDeclerationAndSignatureinfoUtil} to access the osi services trustee decleration and signatureinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee decleration and signatureinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid(String uuid);

	/**
	 * Returns a range of all the osi services trustee decleration and signatureinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @return the range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid(
			String uuid, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid(
			String uuid, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the first osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeDeclerationAndSignatureinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the last osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeDeclerationAndSignatureinfo> orderByComparator);

	/**
	 * Returns the osi services trustee decleration and signatureinfos before and after the current osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiDeclerationId the primary key of the current osi services trustee decleration and signatureinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo[]
			findByUuid_PrevAndNext(
				long osiDeclerationId, String uuid,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeDeclerationAndSignatureinfo>
						orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Removes all the osi services trustee decleration and signatureinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee decleration and signatureinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee decleration and signatureinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the osi services trustee decleration and signatureinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee decleration and signatureinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee decleration and signatureinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee decleration and signatureinfo that was removed
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee decleration and signatureinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @return the range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid_C(String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the first osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeDeclerationAndSignatureinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the last osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeDeclerationAndSignatureinfo> orderByComparator);

	/**
	 * Returns the osi services trustee decleration and signatureinfos before and after the current osi services trustee decleration and signatureinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiDeclerationId the primary key of the current osi services trustee decleration and signatureinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo[]
			findByUuid_C_PrevAndNext(
				long osiDeclerationId, String uuid, long companyId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiServicesTrusteeDeclerationAndSignatureinfo>
						orderByComparator)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Removes all the osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee decleration and signatureinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee decleration and signatureinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo
			findBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the osi services trustee decleration and signatureinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo
		fetchBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee decleration and signatureinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo
		fetchBygetOsiServicesById(
			long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee decleration and signatureinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee decleration and signatureinfo that was removed
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo
			removeBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee decleration and signatureinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee decleration and signatureinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeDeclerationAndSignatureinfo the osi services trustee decleration and signatureinfo
	 */
	public void cacheResult(
		OsiServicesTrusteeDeclerationAndSignatureinfo
			osiServicesTrusteeDeclerationAndSignatureinfo);

	/**
	 * Caches the osi services trustee decleration and signatureinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeDeclerationAndSignatureinfos the osi services trustee decleration and signatureinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
			osiServicesTrusteeDeclerationAndSignatureinfos);

	/**
	 * Creates a new osi services trustee decleration and signatureinfo with the primary key. Does not add the osi services trustee decleration and signatureinfo to the database.
	 *
	 * @param osiDeclerationId the primary key for the new osi services trustee decleration and signatureinfo
	 * @return the new osi services trustee decleration and signatureinfo
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo create(
		long osiDeclerationId);

	/**
	 * Removes the osi services trustee decleration and signatureinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiDeclerationId the primary key of the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo remove(
			long osiDeclerationId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	public OsiServicesTrusteeDeclerationAndSignatureinfo updateImpl(
		OsiServicesTrusteeDeclerationAndSignatureinfo
			osiServicesTrusteeDeclerationAndSignatureinfo);

	/**
	 * Returns the osi services trustee decleration and signatureinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException</code> if it could not be found.
	 *
	 * @param osiDeclerationId the primary key of the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo
	 * @throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo findByPrimaryKey(
			long osiDeclerationId)
		throws NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;

	/**
	 * Returns the osi services trustee decleration and signatureinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiDeclerationId the primary key of the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo, or <code>null</code> if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeDeclerationAndSignatureinfo fetchByPrimaryKey(
		long osiDeclerationId);

	/**
	 * Returns all the osi services trustee decleration and signatureinfos.
	 *
	 * @return the osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findAll();

	/**
	 * Returns a range of all the osi services trustee decleration and signatureinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @return the range of osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee decleration and signatureinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee decleration and signatureinfos
	 */
	public java.util.List<OsiServicesTrusteeDeclerationAndSignatureinfo>
		findAll(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeDeclerationAndSignatureinfo>
					orderByComparator,
			boolean useFinderCache);

	/**
	 * Removes all the osi services trustee decleration and signatureinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos.
	 *
	 * @return the number of osi services trustee decleration and signatureinfos
	 */
	public int countAll();

}