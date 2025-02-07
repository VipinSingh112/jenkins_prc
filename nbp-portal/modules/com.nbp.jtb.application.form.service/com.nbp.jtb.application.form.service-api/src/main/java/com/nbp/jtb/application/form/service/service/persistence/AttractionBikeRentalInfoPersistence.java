/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionBikeRentalInfoException;
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction bike rental info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionBikeRentalInfoUtil
 * @generated
 */
@ProviderType
public interface AttractionBikeRentalInfoPersistence
	extends BasePersistence<AttractionBikeRentalInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionBikeRentalInfoUtil} to access the attraction bike rental info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a matching attraction bike rental info could not be found
	 */
	public AttractionBikeRentalInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionBikeRentalInfoException;

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	public AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	public AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction bike rental info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction bike rental info that was removed
	 */
	public AttractionBikeRentalInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionBikeRentalInfoException;

	/**
	 * Returns the number of attraction bike rental infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction bike rental infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction bike rental info in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfo the attraction bike rental info
	 */
	public void cacheResult(AttractionBikeRentalInfo attractionBikeRentalInfo);

	/**
	 * Caches the attraction bike rental infos in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfos the attraction bike rental infos
	 */
	public void cacheResult(
		java.util.List<AttractionBikeRentalInfo> attractionBikeRentalInfos);

	/**
	 * Creates a new attraction bike rental info with the primary key. Does not add the attraction bike rental info to the database.
	 *
	 * @param attractionBikeRentalInfoId the primary key for the new attraction bike rental info
	 * @return the new attraction bike rental info
	 */
	public AttractionBikeRentalInfo create(long attractionBikeRentalInfoId);

	/**
	 * Removes the attraction bike rental info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info that was removed
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	public AttractionBikeRentalInfo remove(long attractionBikeRentalInfoId)
		throws NoSuchAttractionBikeRentalInfoException;

	public AttractionBikeRentalInfo updateImpl(
		AttractionBikeRentalInfo attractionBikeRentalInfo);

	/**
	 * Returns the attraction bike rental info with the primary key or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	public AttractionBikeRentalInfo findByPrimaryKey(
			long attractionBikeRentalInfoId)
		throws NoSuchAttractionBikeRentalInfoException;

	/**
	 * Returns the attraction bike rental info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info, or <code>null</code> if a attraction bike rental info with the primary key could not be found
	 */
	public AttractionBikeRentalInfo fetchByPrimaryKey(
		long attractionBikeRentalInfoId);

	/**
	 * Returns all the attraction bike rental infos.
	 *
	 * @return the attraction bike rental infos
	 */
	public java.util.List<AttractionBikeRentalInfo> findAll();

	/**
	 * Returns a range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @return the range of attraction bike rental infos
	 */
	public java.util.List<AttractionBikeRentalInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction bike rental infos
	 */
	public java.util.List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionBikeRentalInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction bike rental infos
	 */
	public java.util.List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionBikeRentalInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction bike rental infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction bike rental infos.
	 *
	 * @return the number of attraction bike rental infos
	 */
	public int countAll();

}