/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelRequiredLicException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco non hotel required lic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLicUtil
 * @generated
 */
@ProviderType
public interface AccoNonHotelRequiredLicPersistence
	extends BasePersistence<AccoNonHotelRequiredLic> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoNonHotelRequiredLicUtil} to access the acco non hotel required lic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a matching acco non hotel required lic could not be found
	 */
	public AccoNonHotelRequiredLic findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelRequiredLicException;

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	public AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	public AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco non hotel required lic where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel required lic that was removed
	 */
	public AccoNonHotelRequiredLic removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelRequiredLicException;

	/**
	 * Returns the number of acco non hotel required lics where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel required lics
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco non hotel required lic in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 */
	public void cacheResult(AccoNonHotelRequiredLic accoNonHotelRequiredLic);

	/**
	 * Caches the acco non hotel required lics in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLics the acco non hotel required lics
	 */
	public void cacheResult(
		java.util.List<AccoNonHotelRequiredLic> accoNonHotelRequiredLics);

	/**
	 * Creates a new acco non hotel required lic with the primary key. Does not add the acco non hotel required lic to the database.
	 *
	 * @param accoNonHotelRequiredLicId the primary key for the new acco non hotel required lic
	 * @return the new acco non hotel required lic
	 */
	public AccoNonHotelRequiredLic create(long accoNonHotelRequiredLicId);

	/**
	 * Removes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	public AccoNonHotelRequiredLic remove(long accoNonHotelRequiredLicId)
		throws NoSuchAccoNonHotelRequiredLicException;

	public AccoNonHotelRequiredLic updateImpl(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic);

	/**
	 * Returns the acco non hotel required lic with the primary key or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	public AccoNonHotelRequiredLic findByPrimaryKey(
			long accoNonHotelRequiredLicId)
		throws NoSuchAccoNonHotelRequiredLicException;

	/**
	 * Returns the acco non hotel required lic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic, or <code>null</code> if a acco non hotel required lic with the primary key could not be found
	 */
	public AccoNonHotelRequiredLic fetchByPrimaryKey(
		long accoNonHotelRequiredLicId);

	/**
	 * Returns all the acco non hotel required lics.
	 *
	 * @return the acco non hotel required lics
	 */
	public java.util.List<AccoNonHotelRequiredLic> findAll();

	/**
	 * Returns a range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @return the range of acco non hotel required lics
	 */
	public java.util.List<AccoNonHotelRequiredLic> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel required lics
	 */
	public java.util.List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccoNonHotelRequiredLic> orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel required lics
	 */
	public java.util.List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AccoNonHotelRequiredLic> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco non hotel required lics from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco non hotel required lics.
	 *
	 * @return the number of acco non hotel required lics
	 */
	public int countAll();

}