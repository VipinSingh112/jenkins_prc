/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterGenDeclareException;
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction water gen declare service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclareUtil
 * @generated
 */
@ProviderType
public interface AttractionWaterGenDeclarePersistence
	extends BasePersistence<AttractionWaterGenDeclare> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionWaterGenDeclareUtil} to access the attraction water gen declare persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a matching attraction water gen declare could not be found
	 */
	public AttractionWaterGenDeclare findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterGenDeclareException;

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	public AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	public AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction water gen declare where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water gen declare that was removed
	 */
	public AttractionWaterGenDeclare removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterGenDeclareException;

	/**
	 * Returns the number of attraction water gen declares where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water gen declares
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction water gen declare in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 */
	public void cacheResult(
		AttractionWaterGenDeclare attractionWaterGenDeclare);

	/**
	 * Caches the attraction water gen declares in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclares the attraction water gen declares
	 */
	public void cacheResult(
		java.util.List<AttractionWaterGenDeclare> attractionWaterGenDeclares);

	/**
	 * Creates a new attraction water gen declare with the primary key. Does not add the attraction water gen declare to the database.
	 *
	 * @param attractionWaterGenDeclareId the primary key for the new attraction water gen declare
	 * @return the new attraction water gen declare
	 */
	public AttractionWaterGenDeclare create(long attractionWaterGenDeclareId);

	/**
	 * Removes the attraction water gen declare with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	public AttractionWaterGenDeclare remove(long attractionWaterGenDeclareId)
		throws NoSuchAttractionWaterGenDeclareException;

	public AttractionWaterGenDeclare updateImpl(
		AttractionWaterGenDeclare attractionWaterGenDeclare);

	/**
	 * Returns the attraction water gen declare with the primary key or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	public AttractionWaterGenDeclare findByPrimaryKey(
			long attractionWaterGenDeclareId)
		throws NoSuchAttractionWaterGenDeclareException;

	/**
	 * Returns the attraction water gen declare with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare, or <code>null</code> if a attraction water gen declare with the primary key could not be found
	 */
	public AttractionWaterGenDeclare fetchByPrimaryKey(
		long attractionWaterGenDeclareId);

	/**
	 * Returns all the attraction water gen declares.
	 *
	 * @return the attraction water gen declares
	 */
	public java.util.List<AttractionWaterGenDeclare> findAll();

	/**
	 * Returns a range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @return the range of attraction water gen declares
	 */
	public java.util.List<AttractionWaterGenDeclare> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water gen declares
	 */
	public java.util.List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterGenDeclare> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water gen declares
	 */
	public java.util.List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterGenDeclare> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction water gen declares from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction water gen declares.
	 *
	 * @return the number of attraction water gen declares
	 */
	public int countAll();

}