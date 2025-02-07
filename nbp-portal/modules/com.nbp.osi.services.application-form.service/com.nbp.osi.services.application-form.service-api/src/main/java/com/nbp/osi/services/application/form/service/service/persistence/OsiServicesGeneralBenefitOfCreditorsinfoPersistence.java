/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services general benefit of creditorsinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesGeneralBenefitOfCreditorsinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesGeneralBenefitOfCreditorsinfoPersistence
	extends BasePersistence<OsiServicesGeneralBenefitOfCreditorsinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesGeneralBenefitOfCreditorsinfoUtil} to access the osi services general benefit of creditorsinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns the osi services general benefit of creditorsinfos before and after the current osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiBOCInsoId the primary key of the current osi services general benefit of creditorsinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo[] findByUuid_PrevAndNext(
			long osiBOCInsoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Removes all the osi services general benefit of creditorsinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo>
		findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo>
		findByUuid_C(String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns the osi services general benefit of creditorsinfos before and after the current osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiBOCInsoId the primary key of the current osi services general benefit of creditorsinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo[] findByUuid_C_PrevAndNext(
			long osiBOCInsoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Removes all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services general benefit of creditorsinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 */
	public void cacheResult(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo);

	/**
	 * Caches the osi services general benefit of creditorsinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfos the osi services general benefit of creditorsinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo>
			osiServicesGeneralBenefitOfCreditorsinfos);

	/**
	 * Creates a new osi services general benefit of creditorsinfo with the primary key. Does not add the osi services general benefit of creditorsinfo to the database.
	 *
	 * @param osiBOCInsoId the primary key for the new osi services general benefit of creditorsinfo
	 * @return the new osi services general benefit of creditorsinfo
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo create(long osiBOCInsoId);

	/**
	 * Removes the osi services general benefit of creditorsinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo remove(long osiBOCInsoId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	public OsiServicesGeneralBenefitOfCreditorsinfo updateImpl(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo);

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo findByPrimaryKey(
			long osiBOCInsoId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo, or <code>null</code> if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByPrimaryKey(
		long osiBOCInsoId);

	/**
	 * Returns all the osi services general benefit of creditorsinfos.
	 *
	 * @return the osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll();

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services general benefit of creditorsinfos
	 */
	public java.util.List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesGeneralBenefitOfCreditorsinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services general benefit of creditorsinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services general benefit of creditorsinfos.
	 *
	 * @return the number of osi services general benefit of creditorsinfos
	 */
	public int countAll();

}