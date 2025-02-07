/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusLicenseIssuanceException;
import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status license issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuanceUtil
 * @generated
 */
@ProviderType
public interface SezStatusLicenseIssuancePersistence
	extends BasePersistence<SezStatusLicenseIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusLicenseIssuanceUtil} to access the sez status license issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid(String uuid);

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public SezStatusLicenseIssuance[] findByUuid_PrevAndNext(
			long sezStatusLicIssuedId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Removes all the sez status license issuances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status license issuances
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status license issuance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status license issuance that was removed
	 */
	public SezStatusLicenseIssuance removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status license issuances
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public SezStatusLicenseIssuance[] findByUuid_C_PrevAndNext(
			long sezStatusLicIssuedId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Removes all the sez status license issuances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status license issuances
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status license issuance where caseId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance findBygetSezStatus_License_Issuance_By_CI(
			String caseId)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchBygetSezStatus_License_Issuance_By_CI(
		String caseId);

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public SezStatusLicenseIssuance fetchBygetSezStatus_License_Issuance_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status license issuance that was removed
	 */
	public SezStatusLicenseIssuance removeBygetSezStatus_License_Issuance_By_CI(
			String caseId)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the number of sez status license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status license issuances
	 */
	public int countBygetSezStatus_License_Issuance_By_CI(String caseId);

	/**
	 * Caches the sez status license issuance in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 */
	public void cacheResult(SezStatusLicenseIssuance sezStatusLicenseIssuance);

	/**
	 * Caches the sez status license issuances in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuances the sez status license issuances
	 */
	public void cacheResult(
		java.util.List<SezStatusLicenseIssuance> sezStatusLicenseIssuances);

	/**
	 * Creates a new sez status license issuance with the primary key. Does not add the sez status license issuance to the database.
	 *
	 * @param sezStatusLicIssuedId the primary key for the new sez status license issuance
	 * @return the new sez status license issuance
	 */
	public SezStatusLicenseIssuance create(long sezStatusLicIssuedId);

	/**
	 * Removes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public SezStatusLicenseIssuance remove(long sezStatusLicIssuedId)
		throws NoSuchSezStatusLicenseIssuanceException;

	public SezStatusLicenseIssuance updateImpl(
		SezStatusLicenseIssuance sezStatusLicenseIssuance);

	/**
	 * Returns the sez status license issuance with the primary key or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public SezStatusLicenseIssuance findByPrimaryKey(long sezStatusLicIssuedId)
		throws NoSuchSezStatusLicenseIssuanceException;

	/**
	 * Returns the sez status license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance, or <code>null</code> if a sez status license issuance with the primary key could not be found
	 */
	public SezStatusLicenseIssuance fetchByPrimaryKey(
		long sezStatusLicIssuedId);

	/**
	 * Returns all the sez status license issuances.
	 *
	 * @return the sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findAll();

	/**
	 * Returns a range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status license issuances
	 */
	public java.util.List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status license issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status license issuances.
	 *
	 * @return the number of sez status license issuances
	 */
	public int countAll();

}