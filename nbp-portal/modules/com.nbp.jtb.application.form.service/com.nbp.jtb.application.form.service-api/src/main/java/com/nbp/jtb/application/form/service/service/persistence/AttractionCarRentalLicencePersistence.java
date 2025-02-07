/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentalLicenceException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction car rental licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicenceUtil
 * @generated
 */
@ProviderType
public interface AttractionCarRentalLicencePersistence
	extends BasePersistence<AttractionCarRentalLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionCarRentalLicenceUtil} to access the attraction car rental licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a matching attraction car rental licence could not be found
	 */
	public AttractionCarRentalLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentalLicenceException;

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	public AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	public AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction car rental licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rental licence that was removed
	 */
	public AttractionCarRentalLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentalLicenceException;

	/**
	 * Returns the number of attraction car rental licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rental licences
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction car rental licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 */
	public void cacheResult(
		AttractionCarRentalLicence attractionCarRentalLicence);

	/**
	 * Caches the attraction car rental licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicences the attraction car rental licences
	 */
	public void cacheResult(
		java.util.List<AttractionCarRentalLicence> attractionCarRentalLicences);

	/**
	 * Creates a new attraction car rental licence with the primary key. Does not add the attraction car rental licence to the database.
	 *
	 * @param attractionCarRentalLicId the primary key for the new attraction car rental licence
	 * @return the new attraction car rental licence
	 */
	public AttractionCarRentalLicence create(long attractionCarRentalLicId);

	/**
	 * Removes the attraction car rental licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	public AttractionCarRentalLicence remove(long attractionCarRentalLicId)
		throws NoSuchAttractionCarRentalLicenceException;

	public AttractionCarRentalLicence updateImpl(
		AttractionCarRentalLicence attractionCarRentalLicence);

	/**
	 * Returns the attraction car rental licence with the primary key or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	public AttractionCarRentalLicence findByPrimaryKey(
			long attractionCarRentalLicId)
		throws NoSuchAttractionCarRentalLicenceException;

	/**
	 * Returns the attraction car rental licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence, or <code>null</code> if a attraction car rental licence with the primary key could not be found
	 */
	public AttractionCarRentalLicence fetchByPrimaryKey(
		long attractionCarRentalLicId);

	/**
	 * Returns all the attraction car rental licences.
	 *
	 * @return the attraction car rental licences
	 */
	public java.util.List<AttractionCarRentalLicence> findAll();

	/**
	 * Returns a range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @return the range of attraction car rental licences
	 */
	public java.util.List<AttractionCarRentalLicence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rental licences
	 */
	public java.util.List<AttractionCarRentalLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentalLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rental licences
	 */
	public java.util.List<AttractionCarRentalLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentalLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction car rental licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction car rental licences.
	 *
	 * @return the number of attraction car rental licences
	 */
	public int countAll();

}