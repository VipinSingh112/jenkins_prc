/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevDisasterManagementException;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev disaster management service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementUtil
 * @generated
 */
@ProviderType
public interface SezDevDisasterManagementPersistence
	extends BasePersistence<SezDevDisasterManagement> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevDisasterManagementUtil} to access the sez dev disaster management persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a matching sez dev disaster management could not be found
	 */
	public SezDevDisasterManagement findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevDisasterManagementException;

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	public SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	public SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev disaster management where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev disaster management that was removed
	 */
	public SezDevDisasterManagement removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevDisasterManagementException;

	/**
	 * Returns the number of sez dev disaster managements where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev disaster managements
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev disaster management in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 */
	public void cacheResult(SezDevDisasterManagement sezDevDisasterManagement);

	/**
	 * Caches the sez dev disaster managements in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagements the sez dev disaster managements
	 */
	public void cacheResult(
		java.util.List<SezDevDisasterManagement> sezDevDisasterManagements);

	/**
	 * Creates a new sez dev disaster management with the primary key. Does not add the sez dev disaster management to the database.
	 *
	 * @param sezDevDisasterManagementId the primary key for the new sez dev disaster management
	 * @return the new sez dev disaster management
	 */
	public SezDevDisasterManagement create(long sezDevDisasterManagementId);

	/**
	 * Removes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	public SezDevDisasterManagement remove(long sezDevDisasterManagementId)
		throws NoSuchSezDevDisasterManagementException;

	public SezDevDisasterManagement updateImpl(
		SezDevDisasterManagement sezDevDisasterManagement);

	/**
	 * Returns the sez dev disaster management with the primary key or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	public SezDevDisasterManagement findByPrimaryKey(
			long sezDevDisasterManagementId)
		throws NoSuchSezDevDisasterManagementException;

	/**
	 * Returns the sez dev disaster management with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management, or <code>null</code> if a sez dev disaster management with the primary key could not be found
	 */
	public SezDevDisasterManagement fetchByPrimaryKey(
		long sezDevDisasterManagementId);

	/**
	 * Returns all the sez dev disaster managements.
	 *
	 * @return the sez dev disaster managements
	 */
	public java.util.List<SezDevDisasterManagement> findAll();

	/**
	 * Returns a range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @return the range of sez dev disaster managements
	 */
	public java.util.List<SezDevDisasterManagement> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev disaster managements
	 */
	public java.util.List<SezDevDisasterManagement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagement> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev disaster managements
	 */
	public java.util.List<SezDevDisasterManagement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagement> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev disaster managements from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev disaster managements.
	 *
	 * @return the number of sez dev disaster managements
	 */
	public int countAll();

}