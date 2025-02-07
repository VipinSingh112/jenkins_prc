/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionConCarriageInfoException;
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction con carriage info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfoUtil
 * @generated
 */
@ProviderType
public interface AttractionConCarriageInfoPersistence
	extends BasePersistence<AttractionConCarriageInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionConCarriageInfoUtil} to access the attraction con carriage info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionConCarriageInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction con carriage info
	 * @throws NoSuchAttractionConCarriageInfoException if a matching attraction con carriage info could not be found
	 */
	public AttractionConCarriageInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionConCarriageInfoException;

	/**
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction con carriage info, or <code>null</code> if a matching attraction con carriage info could not be found
	 */
	public AttractionConCarriageInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction con carriage info, or <code>null</code> if a matching attraction con carriage info could not be found
	 */
	public AttractionConCarriageInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction con carriage info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction con carriage info that was removed
	 */
	public AttractionConCarriageInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionConCarriageInfoException;

	/**
	 * Returns the number of attraction con carriage infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction con carriage infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction con carriage info in the entity cache if it is enabled.
	 *
	 * @param attractionConCarriageInfo the attraction con carriage info
	 */
	public void cacheResult(
		AttractionConCarriageInfo attractionConCarriageInfo);

	/**
	 * Caches the attraction con carriage infos in the entity cache if it is enabled.
	 *
	 * @param attractionConCarriageInfos the attraction con carriage infos
	 */
	public void cacheResult(
		java.util.List<AttractionConCarriageInfo> attractionConCarriageInfos);

	/**
	 * Creates a new attraction con carriage info with the primary key. Does not add the attraction con carriage info to the database.
	 *
	 * @param attractionConCarriageInfoId the primary key for the new attraction con carriage info
	 * @return the new attraction con carriage info
	 */
	public AttractionConCarriageInfo create(long attractionConCarriageInfoId);

	/**
	 * Removes the attraction con carriage info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info that was removed
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	public AttractionConCarriageInfo remove(long attractionConCarriageInfoId)
		throws NoSuchAttractionConCarriageInfoException;

	public AttractionConCarriageInfo updateImpl(
		AttractionConCarriageInfo attractionConCarriageInfo);

	/**
	 * Returns the attraction con carriage info with the primary key or throws a <code>NoSuchAttractionConCarriageInfoException</code> if it could not be found.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	public AttractionConCarriageInfo findByPrimaryKey(
			long attractionConCarriageInfoId)
		throws NoSuchAttractionConCarriageInfoException;

	/**
	 * Returns the attraction con carriage info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info, or <code>null</code> if a attraction con carriage info with the primary key could not be found
	 */
	public AttractionConCarriageInfo fetchByPrimaryKey(
		long attractionConCarriageInfoId);

	/**
	 * Returns all the attraction con carriage infos.
	 *
	 * @return the attraction con carriage infos
	 */
	public java.util.List<AttractionConCarriageInfo> findAll();

	/**
	 * Returns a range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @return the range of attraction con carriage infos
	 */
	public java.util.List<AttractionConCarriageInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction con carriage infos
	 */
	public java.util.List<AttractionConCarriageInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionConCarriageInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction con carriage infos
	 */
	public java.util.List<AttractionConCarriageInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionConCarriageInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction con carriage infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction con carriage infos.
	 *
	 * @return the number of attraction con carriage infos
	 */
	public int countAll();

}