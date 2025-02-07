/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualEconomicEffectException;
import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffect;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative individual economic effect service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffectUtil
 * @generated
 */
@ProviderType
public interface CreativeIndividualEconomicEffectPersistence
	extends BasePersistence<CreativeIndividualEconomicEffect> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeIndividualEconomicEffectUtil} to access the creative individual economic effect persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a matching creative individual economic effect could not be found
	 */
	public CreativeIndividualEconomicEffect findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualEconomicEffectException;

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	public CreativeIndividualEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	public CreativeIndividualEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative individual economic effect where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual economic effect that was removed
	 */
	public CreativeIndividualEconomicEffect removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualEconomicEffectException;

	/**
	 * Returns the number of creative individual economic effects where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual economic effects
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative individual economic effect in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 */
	public void cacheResult(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect);

	/**
	 * Caches the creative individual economic effects in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffects the creative individual economic effects
	 */
	public void cacheResult(
		java.util.List<CreativeIndividualEconomicEffect>
			creativeIndividualEconomicEffects);

	/**
	 * Creates a new creative individual economic effect with the primary key. Does not add the creative individual economic effect to the database.
	 *
	 * @param creativeIndiEcoEffectId the primary key for the new creative individual economic effect
	 * @return the new creative individual economic effect
	 */
	public CreativeIndividualEconomicEffect create(
		long creativeIndiEcoEffectId);

	/**
	 * Removes the creative individual economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	public CreativeIndividualEconomicEffect remove(long creativeIndiEcoEffectId)
		throws NoSuchCreativeIndividualEconomicEffectException;

	public CreativeIndividualEconomicEffect updateImpl(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect);

	/**
	 * Returns the creative individual economic effect with the primary key or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	public CreativeIndividualEconomicEffect findByPrimaryKey(
			long creativeIndiEcoEffectId)
		throws NoSuchCreativeIndividualEconomicEffectException;

	/**
	 * Returns the creative individual economic effect with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect, or <code>null</code> if a creative individual economic effect with the primary key could not be found
	 */
	public CreativeIndividualEconomicEffect fetchByPrimaryKey(
		long creativeIndiEcoEffectId);

	/**
	 * Returns all the creative individual economic effects.
	 *
	 * @return the creative individual economic effects
	 */
	public java.util.List<CreativeIndividualEconomicEffect> findAll();

	/**
	 * Returns a range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @return the range of creative individual economic effects
	 */
	public java.util.List<CreativeIndividualEconomicEffect> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual economic effects
	 */
	public java.util.List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualEconomicEffect> orderByComparator);

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual economic effects
	 */
	public java.util.List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualEconomicEffect> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative individual economic effects from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative individual economic effects.
	 *
	 * @return the number of creative individual economic effects
	 */
	public int countAll();

}