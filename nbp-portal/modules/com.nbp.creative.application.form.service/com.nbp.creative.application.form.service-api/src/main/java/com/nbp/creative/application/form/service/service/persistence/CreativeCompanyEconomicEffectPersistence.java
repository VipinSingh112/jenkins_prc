/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyEconomicEffectException;
import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffect;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company economic effect service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyEconomicEffectUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyEconomicEffectPersistence
	extends BasePersistence<CreativeCompanyEconomicEffect> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyEconomicEffectUtil} to access the creative company economic effect persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyEconomicEffectException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company economic effect
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a matching creative company economic effect could not be found
	 */
	public CreativeCompanyEconomicEffect findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyEconomicEffectException;

	/**
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company economic effect, or <code>null</code> if a matching creative company economic effect could not be found
	 */
	public CreativeCompanyEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company economic effect, or <code>null</code> if a matching creative company economic effect could not be found
	 */
	public CreativeCompanyEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company economic effect where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company economic effect that was removed
	 */
	public CreativeCompanyEconomicEffect removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyEconomicEffectException;

	/**
	 * Returns the number of creative company economic effects where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company economic effects
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company economic effect in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyEconomicEffect the creative company economic effect
	 */
	public void cacheResult(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect);

	/**
	 * Caches the creative company economic effects in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyEconomicEffects the creative company economic effects
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyEconomicEffect>
			creativeCompanyEconomicEffects);

	/**
	 * Creates a new creative company economic effect with the primary key. Does not add the creative company economic effect to the database.
	 *
	 * @param creativeComEconomicEffectId the primary key for the new creative company economic effect
	 * @return the new creative company economic effect
	 */
	public CreativeCompanyEconomicEffect create(
		long creativeComEconomicEffectId);

	/**
	 * Removes the creative company economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect that was removed
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	public CreativeCompanyEconomicEffect remove(
			long creativeComEconomicEffectId)
		throws NoSuchCreativeCompanyEconomicEffectException;

	public CreativeCompanyEconomicEffect updateImpl(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect);

	/**
	 * Returns the creative company economic effect with the primary key or throws a <code>NoSuchCreativeCompanyEconomicEffectException</code> if it could not be found.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	public CreativeCompanyEconomicEffect findByPrimaryKey(
			long creativeComEconomicEffectId)
		throws NoSuchCreativeCompanyEconomicEffectException;

	/**
	 * Returns the creative company economic effect with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect, or <code>null</code> if a creative company economic effect with the primary key could not be found
	 */
	public CreativeCompanyEconomicEffect fetchByPrimaryKey(
		long creativeComEconomicEffectId);

	/**
	 * Returns all the creative company economic effects.
	 *
	 * @return the creative company economic effects
	 */
	public java.util.List<CreativeCompanyEconomicEffect> findAll();

	/**
	 * Returns a range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @return the range of creative company economic effects
	 */
	public java.util.List<CreativeCompanyEconomicEffect> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company economic effects
	 */
	public java.util.List<CreativeCompanyEconomicEffect> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyEconomicEffect> orderByComparator);

	/**
	 * Returns an ordered range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company economic effects
	 */
	public java.util.List<CreativeCompanyEconomicEffect> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyEconomicEffect> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company economic effects from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company economic effects.
	 *
	 * @return the number of creative company economic effects
	 */
	public int countAll();

}