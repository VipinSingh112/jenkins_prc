/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWelcomePackageException;
import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status welcome package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackageUtil
 * @generated
 */
@ProviderType
public interface SezStatusWelcomePackagePersistence
	extends BasePersistence<SezStatusWelcomePackage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusWelcomePackageUtil} to access the sez status welcome package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid(String uuid);

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public SezStatusWelcomePackage[] findByUuid_PrevAndNext(
			long sezStatusWelcomeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status welcome packages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status welcome package where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status welcome package that was removed
	 */
	public SezStatusWelcomePackage removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status welcome packages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public SezStatusWelcomePackage[] findByUuid_C_PrevAndNext(
			long sezStatusWelcomeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status welcome packages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status welcome package where caseId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage findBygetSezStatus_Welcome_Package_By_CI(
			String caseId)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchBygetSezStatus_Welcome_Package_By_CI(
		String caseId);

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public SezStatusWelcomePackage fetchBygetSezStatus_Welcome_Package_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status welcome package where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status welcome package that was removed
	 */
	public SezStatusWelcomePackage removeBygetSezStatus_Welcome_Package_By_CI(
			String caseId)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the number of sez status welcome packages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status welcome packages
	 */
	public int countBygetSezStatus_Welcome_Package_By_CI(String caseId);

	/**
	 * Caches the sez status welcome package in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 */
	public void cacheResult(SezStatusWelcomePackage sezStatusWelcomePackage);

	/**
	 * Caches the sez status welcome packages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackages the sez status welcome packages
	 */
	public void cacheResult(
		java.util.List<SezStatusWelcomePackage> sezStatusWelcomePackages);

	/**
	 * Creates a new sez status welcome package with the primary key. Does not add the sez status welcome package to the database.
	 *
	 * @param sezStatusWelcomeId the primary key for the new sez status welcome package
	 * @return the new sez status welcome package
	 */
	public SezStatusWelcomePackage create(long sezStatusWelcomeId);

	/**
	 * Removes the sez status welcome package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package that was removed
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public SezStatusWelcomePackage remove(long sezStatusWelcomeId)
		throws NoSuchSezStatusWelcomePackageException;

	public SezStatusWelcomePackage updateImpl(
		SezStatusWelcomePackage sezStatusWelcomePackage);

	/**
	 * Returns the sez status welcome package with the primary key or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public SezStatusWelcomePackage findByPrimaryKey(long sezStatusWelcomeId)
		throws NoSuchSezStatusWelcomePackageException;

	/**
	 * Returns the sez status welcome package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package, or <code>null</code> if a sez status welcome package with the primary key could not be found
	 */
	public SezStatusWelcomePackage fetchByPrimaryKey(long sezStatusWelcomeId);

	/**
	 * Returns all the sez status welcome packages.
	 *
	 * @return the sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findAll();

	/**
	 * Returns a range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status welcome packages
	 */
	public java.util.List<SezStatusWelcomePackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status welcome packages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status welcome packages.
	 *
	 * @return the number of sez status welcome packages
	 */
	public int countAll();

}