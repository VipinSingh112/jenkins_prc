/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicantinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services applicantinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoUtil
 * @generated
 */
@ProviderType
public interface OsiServicesApplicantinfoPersistence
	extends BasePersistence<OsiServicesApplicantinfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesApplicantinfoUtil} to access the osi services applicantinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services applicantinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns the osi services applicantinfos before and after the current osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesApplicanId the primary key of the current osi services applicantinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	public OsiServicesApplicantinfo[] findByUuid_PrevAndNext(
			long osiServicesApplicanId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Removes all the osi services applicantinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services applicantinfos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services applicantinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services applicantinfo that was removed
	 */
	public OsiServicesApplicantinfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services applicantinfos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns the osi services applicantinfos before and after the current osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesApplicanId the primary key of the current osi services applicantinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	public OsiServicesApplicantinfo[] findByUuid_C_PrevAndNext(
			long osiServicesApplicanId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Removes all the osi services applicantinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services applicantinfos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	public OsiServicesApplicantinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services applicantinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services applicantinfo that was removed
	 */
	public OsiServicesApplicantinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the number of osi services applicantinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services applicantinfos
	 */
	public int countBygetOsiServicesById(long osiServicesApplicationId);

	/**
	 * Caches the osi services applicantinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 */
	public void cacheResult(OsiServicesApplicantinfo osiServicesApplicantinfo);

	/**
	 * Caches the osi services applicantinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplicantinfos the osi services applicantinfos
	 */
	public void cacheResult(
		java.util.List<OsiServicesApplicantinfo> osiServicesApplicantinfos);

	/**
	 * Creates a new osi services applicantinfo with the primary key. Does not add the osi services applicantinfo to the database.
	 *
	 * @param osiServicesApplicanId the primary key for the new osi services applicantinfo
	 * @return the new osi services applicantinfo
	 */
	public OsiServicesApplicantinfo create(long osiServicesApplicanId);

	/**
	 * Removes the osi services applicantinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	public OsiServicesApplicantinfo remove(long osiServicesApplicanId)
		throws NoSuchOsiServicesApplicantinfoException;

	public OsiServicesApplicantinfo updateImpl(
		OsiServicesApplicantinfo osiServicesApplicantinfo);

	/**
	 * Returns the osi services applicantinfo with the primary key or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	public OsiServicesApplicantinfo findByPrimaryKey(long osiServicesApplicanId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the osi services applicantinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo, or <code>null</code> if a osi services applicantinfo with the primary key could not be found
	 */
	public OsiServicesApplicantinfo fetchByPrimaryKey(
		long osiServicesApplicanId);

	/**
	 * Returns all the osi services applicantinfos.
	 *
	 * @return the osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findAll();

	/**
	 * Returns a range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services applicantinfos
	 */
	public java.util.List<OsiServicesApplicantinfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServicesApplicantinfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services applicantinfos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services applicantinfos.
	 *
	 * @return the number of osi services applicantinfos
	 */
	public int countAll();

}