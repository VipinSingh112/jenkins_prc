/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionTravelAgencyException;
import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction travel agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyUtil
 * @generated
 */
@ProviderType
public interface AttractionTravelAgencyPersistence
	extends BasePersistence<AttractionTravelAgency> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionTravelAgencyUtil} to access the attraction travel agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a matching attraction travel agency could not be found
	 */
	public AttractionTravelAgency findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelAgencyException;

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	public AttractionTravelAgency fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	public AttractionTravelAgency fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction travel agency where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel agency that was removed
	 */
	public AttractionTravelAgency removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelAgencyException;

	/**
	 * Returns the number of attraction travel agencies where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel agencies
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction travel agency in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 */
	public void cacheResult(AttractionTravelAgency attractionTravelAgency);

	/**
	 * Caches the attraction travel agencies in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgencies the attraction travel agencies
	 */
	public void cacheResult(
		java.util.List<AttractionTravelAgency> attractionTravelAgencies);

	/**
	 * Creates a new attraction travel agency with the primary key. Does not add the attraction travel agency to the database.
	 *
	 * @param attractionTravelAgencyId the primary key for the new attraction travel agency
	 * @return the new attraction travel agency
	 */
	public AttractionTravelAgency create(long attractionTravelAgencyId);

	/**
	 * Removes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	public AttractionTravelAgency remove(long attractionTravelAgencyId)
		throws NoSuchAttractionTravelAgencyException;

	public AttractionTravelAgency updateImpl(
		AttractionTravelAgency attractionTravelAgency);

	/**
	 * Returns the attraction travel agency with the primary key or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	public AttractionTravelAgency findByPrimaryKey(
			long attractionTravelAgencyId)
		throws NoSuchAttractionTravelAgencyException;

	/**
	 * Returns the attraction travel agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency, or <code>null</code> if a attraction travel agency with the primary key could not be found
	 */
	public AttractionTravelAgency fetchByPrimaryKey(
		long attractionTravelAgencyId);

	/**
	 * Returns all the attraction travel agencies.
	 *
	 * @return the attraction travel agencies
	 */
	public java.util.List<AttractionTravelAgency> findAll();

	/**
	 * Returns a range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @return the range of attraction travel agencies
	 */
	public java.util.List<AttractionTravelAgency> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel agencies
	 */
	public java.util.List<AttractionTravelAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionTravelAgency>
			orderByComparator);

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel agencies
	 */
	public java.util.List<AttractionTravelAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionTravelAgency>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction travel agencies from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction travel agencies.
	 *
	 * @return the number of attraction travel agencies
	 */
	public int countAll();

}