/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchPurposeOfPropLicenceException;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the purpose of prop licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicenceUtil
 * @generated
 */
@ProviderType
public interface PurposeOfPropLicencePersistence
	extends BasePersistence<PurposeOfPropLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PurposeOfPropLicenceUtil} to access the purpose of prop licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a matching purpose of prop licence could not be found
	 */
	public PurposeOfPropLicence findBygetHsraById(long hsraApplicationId)
		throws NoSuchPurposeOfPropLicenceException;

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	public PurposeOfPropLicence fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	public PurposeOfPropLicence fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the purpose of prop licence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the purpose of prop licence that was removed
	 */
	public PurposeOfPropLicence removeBygetHsraById(long hsraApplicationId)
		throws NoSuchPurposeOfPropLicenceException;

	/**
	 * Returns the number of purpose of prop licences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching purpose of prop licences
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the purpose of prop licence in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 */
	public void cacheResult(PurposeOfPropLicence purposeOfPropLicence);

	/**
	 * Caches the purpose of prop licences in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicences the purpose of prop licences
	 */
	public void cacheResult(
		java.util.List<PurposeOfPropLicence> purposeOfPropLicences);

	/**
	 * Creates a new purpose of prop licence with the primary key. Does not add the purpose of prop licence to the database.
	 *
	 * @param purposeOfPropLicenceId the primary key for the new purpose of prop licence
	 * @return the new purpose of prop licence
	 */
	public PurposeOfPropLicence create(long purposeOfPropLicenceId);

	/**
	 * Removes the purpose of prop licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	public PurposeOfPropLicence remove(long purposeOfPropLicenceId)
		throws NoSuchPurposeOfPropLicenceException;

	public PurposeOfPropLicence updateImpl(
		PurposeOfPropLicence purposeOfPropLicence);

	/**
	 * Returns the purpose of prop licence with the primary key or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	public PurposeOfPropLicence findByPrimaryKey(long purposeOfPropLicenceId)
		throws NoSuchPurposeOfPropLicenceException;

	/**
	 * Returns the purpose of prop licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence, or <code>null</code> if a purpose of prop licence with the primary key could not be found
	 */
	public PurposeOfPropLicence fetchByPrimaryKey(long purposeOfPropLicenceId);

	/**
	 * Returns all the purpose of prop licences.
	 *
	 * @return the purpose of prop licences
	 */
	public java.util.List<PurposeOfPropLicence> findAll();

	/**
	 * Returns a range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @return the range of purpose of prop licences
	 */
	public java.util.List<PurposeOfPropLicence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of purpose of prop licences
	 */
	public java.util.List<PurposeOfPropLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PurposeOfPropLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of purpose of prop licences
	 */
	public java.util.List<PurposeOfPropLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PurposeOfPropLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the purpose of prop licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of purpose of prop licences.
	 *
	 * @return the number of purpose of prop licences
	 */
	public int countAll();

}