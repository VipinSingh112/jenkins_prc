/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchsezDeveloperUndertakingException;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez developer undertaking service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertakingUtil
 * @generated
 */
@ProviderType
public interface sezDeveloperUndertakingPersistence
	extends BasePersistence<sezDeveloperUndertaking> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sezDeveloperUndertakingUtil} to access the sez developer undertaking persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a matching sez developer undertaking could not be found
	 */
	public sezDeveloperUndertaking findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezDeveloperUndertakingException;

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	public sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	public sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez developer undertaking where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer undertaking that was removed
	 */
	public sezDeveloperUndertaking removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezDeveloperUndertakingException;

	/**
	 * Returns the number of sez developer undertakings where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer undertakings
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez developer undertaking in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 */
	public void cacheResult(sezDeveloperUndertaking sezDeveloperUndertaking);

	/**
	 * Caches the sez developer undertakings in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertakings the sez developer undertakings
	 */
	public void cacheResult(
		java.util.List<sezDeveloperUndertaking> sezDeveloperUndertakings);

	/**
	 * Creates a new sez developer undertaking with the primary key. Does not add the sez developer undertaking to the database.
	 *
	 * @param sezDeveloperUndertakingId the primary key for the new sez developer undertaking
	 * @return the new sez developer undertaking
	 */
	public sezDeveloperUndertaking create(long sezDeveloperUndertakingId);

	/**
	 * Removes the sez developer undertaking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	public sezDeveloperUndertaking remove(long sezDeveloperUndertakingId)
		throws NoSuchsezDeveloperUndertakingException;

	public sezDeveloperUndertaking updateImpl(
		sezDeveloperUndertaking sezDeveloperUndertaking);

	/**
	 * Returns the sez developer undertaking with the primary key or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	public sezDeveloperUndertaking findByPrimaryKey(
			long sezDeveloperUndertakingId)
		throws NoSuchsezDeveloperUndertakingException;

	/**
	 * Returns the sez developer undertaking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking, or <code>null</code> if a sez developer undertaking with the primary key could not be found
	 */
	public sezDeveloperUndertaking fetchByPrimaryKey(
		long sezDeveloperUndertakingId);

	/**
	 * Returns all the sez developer undertakings.
	 *
	 * @return the sez developer undertakings
	 */
	public java.util.List<sezDeveloperUndertaking> findAll();

	/**
	 * Returns a range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @return the range of sez developer undertakings
	 */
	public java.util.List<sezDeveloperUndertaking> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer undertakings
	 */
	public java.util.List<sezDeveloperUndertaking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<sezDeveloperUndertaking> orderByComparator);

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer undertakings
	 */
	public java.util.List<sezDeveloperUndertaking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<sezDeveloperUndertaking> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez developer undertakings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez developer undertakings.
	 *
	 * @return the number of sez developer undertakings
	 */
	public int countAll();

}