/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryInformaationException;
import com.nbp.quary.application.form.service.model.QuarryInformaation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry informaation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaationUtil
 * @generated
 */
@ProviderType
public interface QuarryInformaationPersistence
	extends BasePersistence<QuarryInformaation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryInformaationUtil} to access the quarry informaation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation
	 * @throws NoSuchQuarryInformaationException if a matching quarry informaation could not be found
	 */
	public QuarryInformaation findBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryInformaationException;

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	public QuarryInformaation fetchBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	public QuarryInformaation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry informaation where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry informaation that was removed
	 */
	public QuarryInformaation removeBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryInformaationException;

	/**
	 * Returns the number of quarry informaations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry informaations
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the quarry informaation in the entity cache if it is enabled.
	 *
	 * @param quarryInformaation the quarry informaation
	 */
	public void cacheResult(QuarryInformaation quarryInformaation);

	/**
	 * Caches the quarry informaations in the entity cache if it is enabled.
	 *
	 * @param quarryInformaations the quarry informaations
	 */
	public void cacheResult(
		java.util.List<QuarryInformaation> quarryInformaations);

	/**
	 * Creates a new quarry informaation with the primary key. Does not add the quarry informaation to the database.
	 *
	 * @param auarryInfoId the primary key for the new quarry informaation
	 * @return the new quarry informaation
	 */
	public QuarryInformaation create(long auarryInfoId);

	/**
	 * Removes the quarry informaation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation that was removed
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	public QuarryInformaation remove(long auarryInfoId)
		throws NoSuchQuarryInformaationException;

	public QuarryInformaation updateImpl(QuarryInformaation quarryInformaation);

	/**
	 * Returns the quarry informaation with the primary key or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	public QuarryInformaation findByPrimaryKey(long auarryInfoId)
		throws NoSuchQuarryInformaationException;

	/**
	 * Returns the quarry informaation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation, or <code>null</code> if a quarry informaation with the primary key could not be found
	 */
	public QuarryInformaation fetchByPrimaryKey(long auarryInfoId);

	/**
	 * Returns all the quarry informaations.
	 *
	 * @return the quarry informaations
	 */
	public java.util.List<QuarryInformaation> findAll();

	/**
	 * Returns a range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @return the range of quarry informaations
	 */
	public java.util.List<QuarryInformaation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry informaations
	 */
	public java.util.List<QuarryInformaation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInformaation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry informaations
	 */
	public java.util.List<QuarryInformaation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInformaation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry informaations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry informaations.
	 *
	 * @return the number of quarry informaations
	 */
	public int countAll();

}