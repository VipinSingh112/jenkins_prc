/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDeveloperDetailsException;
import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez developer details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsUtil
 * @generated
 */
@ProviderType
public interface SezDeveloperDetailsPersistence
	extends BasePersistence<SezDeveloperDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDeveloperDetailsUtil} to access the sez developer details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a matching sez developer details could not be found
	 */
	public SezDeveloperDetails findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDeveloperDetailsException;

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	public SezDeveloperDetails fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	public SezDeveloperDetails fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez developer details where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer details that was removed
	 */
	public SezDeveloperDetails removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDeveloperDetailsException;

	/**
	 * Returns the number of sez developer detailses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer detailses
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez developer details in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetails the sez developer details
	 */
	public void cacheResult(SezDeveloperDetails sezDeveloperDetails);

	/**
	 * Caches the sez developer detailses in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetailses the sez developer detailses
	 */
	public void cacheResult(
		java.util.List<SezDeveloperDetails> sezDeveloperDetailses);

	/**
	 * Creates a new sez developer details with the primary key. Does not add the sez developer details to the database.
	 *
	 * @param sezDeveloperDetailsId the primary key for the new sez developer details
	 * @return the new sez developer details
	 */
	public SezDeveloperDetails create(long sezDeveloperDetailsId);

	/**
	 * Removes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	public SezDeveloperDetails remove(long sezDeveloperDetailsId)
		throws NoSuchSezDeveloperDetailsException;

	public SezDeveloperDetails updateImpl(
		SezDeveloperDetails sezDeveloperDetails);

	/**
	 * Returns the sez developer details with the primary key or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	public SezDeveloperDetails findByPrimaryKey(long sezDeveloperDetailsId)
		throws NoSuchSezDeveloperDetailsException;

	/**
	 * Returns the sez developer details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details, or <code>null</code> if a sez developer details with the primary key could not be found
	 */
	public SezDeveloperDetails fetchByPrimaryKey(long sezDeveloperDetailsId);

	/**
	 * Returns all the sez developer detailses.
	 *
	 * @return the sez developer detailses
	 */
	public java.util.List<SezDeveloperDetails> findAll();

	/**
	 * Returns a range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @return the range of sez developer detailses
	 */
	public java.util.List<SezDeveloperDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer detailses
	 */
	public java.util.List<SezDeveloperDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDeveloperDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer detailses
	 */
	public java.util.List<SezDeveloperDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDeveloperDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez developer detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez developer detailses.
	 *
	 * @return the number of sez developer detailses
	 */
	public int countAll();

}