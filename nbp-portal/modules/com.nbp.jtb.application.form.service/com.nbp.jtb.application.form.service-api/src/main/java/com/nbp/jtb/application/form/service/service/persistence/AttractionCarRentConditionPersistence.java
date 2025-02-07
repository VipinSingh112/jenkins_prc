/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentConditionException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction car rent condition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentConditionUtil
 * @generated
 */
@ProviderType
public interface AttractionCarRentConditionPersistence
	extends BasePersistence<AttractionCarRentCondition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionCarRentConditionUtil} to access the attraction car rent condition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentConditionException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent condition
	 * @throws NoSuchAttractionCarRentConditionException if a matching attraction car rent condition could not be found
	 */
	public AttractionCarRentCondition findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentConditionException;

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent condition, or <code>null</code> if a matching attraction car rent condition could not be found
	 */
	public AttractionCarRentCondition fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rent condition, or <code>null</code> if a matching attraction car rent condition could not be found
	 */
	public AttractionCarRentCondition fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction car rent condition where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rent condition that was removed
	 */
	public AttractionCarRentCondition removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentConditionException;

	/**
	 * Returns the number of attraction car rent conditions where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rent conditions
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction car rent condition in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 */
	public void cacheResult(
		AttractionCarRentCondition attractionCarRentCondition);

	/**
	 * Caches the attraction car rent conditions in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentConditions the attraction car rent conditions
	 */
	public void cacheResult(
		java.util.List<AttractionCarRentCondition> attractionCarRentConditions);

	/**
	 * Creates a new attraction car rent condition with the primary key. Does not add the attraction car rent condition to the database.
	 *
	 * @param attractionCarRenConditId the primary key for the new attraction car rent condition
	 * @return the new attraction car rent condition
	 */
	public AttractionCarRentCondition create(long attractionCarRenConditId);

	/**
	 * Removes the attraction car rent condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	public AttractionCarRentCondition remove(long attractionCarRenConditId)
		throws NoSuchAttractionCarRentConditionException;

	public AttractionCarRentCondition updateImpl(
		AttractionCarRentCondition attractionCarRentCondition);

	/**
	 * Returns the attraction car rent condition with the primary key or throws a <code>NoSuchAttractionCarRentConditionException</code> if it could not be found.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	public AttractionCarRentCondition findByPrimaryKey(
			long attractionCarRenConditId)
		throws NoSuchAttractionCarRentConditionException;

	/**
	 * Returns the attraction car rent condition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition, or <code>null</code> if a attraction car rent condition with the primary key could not be found
	 */
	public AttractionCarRentCondition fetchByPrimaryKey(
		long attractionCarRenConditId);

	/**
	 * Returns all the attraction car rent conditions.
	 *
	 * @return the attraction car rent conditions
	 */
	public java.util.List<AttractionCarRentCondition> findAll();

	/**
	 * Returns a range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @return the range of attraction car rent conditions
	 */
	public java.util.List<AttractionCarRentCondition> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rent conditions
	 */
	public java.util.List<AttractionCarRentCondition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentCondition> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rent conditions
	 */
	public java.util.List<AttractionCarRentCondition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentCondition> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction car rent conditions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction car rent conditions.
	 *
	 * @return the number of attraction car rent conditions
	 */
	public int countAll();

}