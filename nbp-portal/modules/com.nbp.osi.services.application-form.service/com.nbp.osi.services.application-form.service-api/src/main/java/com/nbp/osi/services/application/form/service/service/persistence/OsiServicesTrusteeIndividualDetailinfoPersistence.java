/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeIndividualDetailinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services trustee individual detailinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeIndividualDetailinfoPersistence
	extends BasePersistence<OsiServicesTrusteeIndividualDetailinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesTrusteeIndividualDetailinfoUtil} to access the osi services trustee individual detailinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services trustee individual detailinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services trustee individual detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @return the range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee individual detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the first osi services trustee individual detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee individual detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the last osi services trustee individual detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns the osi services trustee individual detailinfos before and after the current osi services trustee individual detailinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osTIId the primary key of the current osi services trustee individual detailinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo[] findByUuid_PrevAndNext(
			long osTIId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Removes all the osi services trustee individual detailinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services trustee individual detailinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee individual detailinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services trustee individual detailinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualDetailinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the osi services trustee individual detailinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services trustee individual detailinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee individual detailinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee individual detailinfo that was removed
	 */
	public OsiServicesTrusteeIndividualDetailinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the number of osi services trustee individual detailinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee individual detailinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @return the range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services trustee individual detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the first osi services trustee individual detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns the last osi services trustee individual detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the last osi services trustee individual detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns the osi services trustee individual detailinfos before and after the current osi services trustee individual detailinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osTIId the primary key of the current osi services trustee individual detailinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo[] findByUuid_C_PrevAndNext(
			long osTIId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesTrusteeIndividualDetailinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Removes all the osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services trustee individual detailinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee individual detailinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services trustee individual detailinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualDetailinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the osi services trustee individual detailinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services trustee individual detailinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services trustee individual detailinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee individual detailinfo that was removed
	 */
	public OsiServicesTrusteeIndividualDetailinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the number of osi services trustee individual detailinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee individual detailinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services trustee individual detailinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 */
	public void cacheResult(
		OsiServicesTrusteeIndividualDetailinfo
			osiServicesTrusteeIndividualDetailinfo);

	/**
	 * Caches the osi services trustee individual detailinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualDetailinfos the osi services trustee individual detailinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesTrusteeIndividualDetailinfo>
			osiServicesTrusteeIndividualDetailinfos);

	/**
	 * Creates a new osi services trustee individual detailinfo with the primary key. Does not add the osi services trustee individual detailinfo to the database.
	 *
	 * @param osTIId the primary key for the new osi services trustee individual detailinfo
	 * @return the new osi services trustee individual detailinfo
	 */
	public OsiServicesTrusteeIndividualDetailinfo create(long osTIId);

	/**
	 * Removes the osi services trustee individual detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo remove(long osTIId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	public OsiServicesTrusteeIndividualDetailinfo updateImpl(
		OsiServicesTrusteeIndividualDetailinfo
			osiServicesTrusteeIndividualDetailinfo);

	/**
	 * Returns the osi services trustee individual detailinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeIndividualDetailinfoException</code> if it could not be found.
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualDetailinfoException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo findByPrimaryKey(long osTIId)
		throws NoSuchOsiServicesTrusteeIndividualDetailinfoException;

	/**
	 * Returns the osi services trustee individual detailinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo, or <code>null</code> if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public OsiServicesTrusteeIndividualDetailinfo fetchByPrimaryKey(
		long osTIId);

	/**
	 * Returns all the osi services trustee individual detailinfos.
	 *
	 * @return the osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findAll();

	/**
	 * Returns a range of all the osi services trustee individual detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @return the range of osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services trustee individual detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee individual detailinfos
	 */
	public java.util.List<OsiServicesTrusteeIndividualDetailinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesTrusteeIndividualDetailinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services trustee individual detailinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services trustee individual detailinfos.
	 *
	 * @return the number of osi services trustee individual detailinfos
	 */
	public int countAll();

}