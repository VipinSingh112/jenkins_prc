/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterRequiredException;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction water required service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequiredUtil
 * @generated
 */
@ProviderType
public interface AttractionWaterRequiredPersistence
	extends BasePersistence<AttractionWaterRequired> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionWaterRequiredUtil} to access the attraction water required persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a matching attraction water required could not be found
	 */
	public AttractionWaterRequired findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterRequiredException;

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	public AttractionWaterRequired fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	public AttractionWaterRequired fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction water required where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water required that was removed
	 */
	public AttractionWaterRequired removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterRequiredException;

	/**
	 * Returns the number of attraction water requireds where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water requireds
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction water required in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequired the attraction water required
	 */
	public void cacheResult(AttractionWaterRequired attractionWaterRequired);

	/**
	 * Caches the attraction water requireds in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequireds the attraction water requireds
	 */
	public void cacheResult(
		java.util.List<AttractionWaterRequired> attractionWaterRequireds);

	/**
	 * Creates a new attraction water required with the primary key. Does not add the attraction water required to the database.
	 *
	 * @param attractionWaterRequiredId the primary key for the new attraction water required
	 * @return the new attraction water required
	 */
	public AttractionWaterRequired create(long attractionWaterRequiredId);

	/**
	 * Removes the attraction water required with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required that was removed
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	public AttractionWaterRequired remove(long attractionWaterRequiredId)
		throws NoSuchAttractionWaterRequiredException;

	public AttractionWaterRequired updateImpl(
		AttractionWaterRequired attractionWaterRequired);

	/**
	 * Returns the attraction water required with the primary key or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	public AttractionWaterRequired findByPrimaryKey(
			long attractionWaterRequiredId)
		throws NoSuchAttractionWaterRequiredException;

	/**
	 * Returns the attraction water required with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required, or <code>null</code> if a attraction water required with the primary key could not be found
	 */
	public AttractionWaterRequired fetchByPrimaryKey(
		long attractionWaterRequiredId);

	/**
	 * Returns all the attraction water requireds.
	 *
	 * @return the attraction water requireds
	 */
	public java.util.List<AttractionWaterRequired> findAll();

	/**
	 * Returns a range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @return the range of attraction water requireds
	 */
	public java.util.List<AttractionWaterRequired> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water requireds
	 */
	public java.util.List<AttractionWaterRequired> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterRequired> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water requireds
	 */
	public java.util.List<AttractionWaterRequired> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterRequired> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction water requireds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction water requireds.
	 *
	 * @return the number of attraction water requireds
	 */
	public int countAll();

}