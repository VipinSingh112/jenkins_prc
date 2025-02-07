/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadiationDeclarationException;
import com.nbp.hsra.application.service.model.RadiationDeclaration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radiation declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclarationUtil
 * @generated
 */
@ProviderType
public interface RadiationDeclarationPersistence
	extends BasePersistence<RadiationDeclaration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadiationDeclarationUtil} to access the radiation declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a matching radiation declaration could not be found
	 */
	public RadiationDeclaration findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationDeclarationException;

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	public RadiationDeclaration fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	public RadiationDeclaration fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the radiation declaration where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation declaration that was removed
	 */
	public RadiationDeclaration removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationDeclarationException;

	/**
	 * Returns the number of radiation declarations where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation declarations
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radiation declaration in the entity cache if it is enabled.
	 *
	 * @param radiationDeclaration the radiation declaration
	 */
	public void cacheResult(RadiationDeclaration radiationDeclaration);

	/**
	 * Caches the radiation declarations in the entity cache if it is enabled.
	 *
	 * @param radiationDeclarations the radiation declarations
	 */
	public void cacheResult(
		java.util.List<RadiationDeclaration> radiationDeclarations);

	/**
	 * Creates a new radiation declaration with the primary key. Does not add the radiation declaration to the database.
	 *
	 * @param radiationDeclarationId the primary key for the new radiation declaration
	 * @return the new radiation declaration
	 */
	public RadiationDeclaration create(long radiationDeclarationId);

	/**
	 * Removes the radiation declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration that was removed
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	public RadiationDeclaration remove(long radiationDeclarationId)
		throws NoSuchRadiationDeclarationException;

	public RadiationDeclaration updateImpl(
		RadiationDeclaration radiationDeclaration);

	/**
	 * Returns the radiation declaration with the primary key or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	public RadiationDeclaration findByPrimaryKey(long radiationDeclarationId)
		throws NoSuchRadiationDeclarationException;

	/**
	 * Returns the radiation declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration, or <code>null</code> if a radiation declaration with the primary key could not be found
	 */
	public RadiationDeclaration fetchByPrimaryKey(long radiationDeclarationId);

	/**
	 * Returns all the radiation declarations.
	 *
	 * @return the radiation declarations
	 */
	public java.util.List<RadiationDeclaration> findAll();

	/**
	 * Returns a range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @return the range of radiation declarations
	 */
	public java.util.List<RadiationDeclaration> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation declarations
	 */
	public java.util.List<RadiationDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDeclaration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation declarations
	 */
	public java.util.List<RadiationDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDeclaration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radiation declarations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radiation declarations.
	 *
	 * @return the number of radiation declarations
	 */
	public int countAll();

}