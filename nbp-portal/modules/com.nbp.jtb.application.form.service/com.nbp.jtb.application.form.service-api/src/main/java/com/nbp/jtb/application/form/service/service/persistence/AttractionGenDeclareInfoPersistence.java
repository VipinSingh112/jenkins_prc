/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionGenDeclareInfoException;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction gen declare info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoUtil
 * @generated
 */
@ProviderType
public interface AttractionGenDeclareInfoPersistence
	extends BasePersistence<AttractionGenDeclareInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionGenDeclareInfoUtil} to access the attraction gen declare info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a matching attraction gen declare info could not be found
	 */
	public AttractionGenDeclareInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionGenDeclareInfoException;

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	public AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	public AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction gen declare info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction gen declare info that was removed
	 */
	public AttractionGenDeclareInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionGenDeclareInfoException;

	/**
	 * Returns the number of attraction gen declare infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction gen declare infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction gen declare info in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 */
	public void cacheResult(AttractionGenDeclareInfo attractionGenDeclareInfo);

	/**
	 * Caches the attraction gen declare infos in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfos the attraction gen declare infos
	 */
	public void cacheResult(
		java.util.List<AttractionGenDeclareInfo> attractionGenDeclareInfos);

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	public AttractionGenDeclareInfo create(long attractionGenDeclareInfoId);

	/**
	 * Removes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	public AttractionGenDeclareInfo remove(long attractionGenDeclareInfoId)
		throws NoSuchAttractionGenDeclareInfoException;

	public AttractionGenDeclareInfo updateImpl(
		AttractionGenDeclareInfo attractionGenDeclareInfo);

	/**
	 * Returns the attraction gen declare info with the primary key or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	public AttractionGenDeclareInfo findByPrimaryKey(
			long attractionGenDeclareInfoId)
		throws NoSuchAttractionGenDeclareInfoException;

	/**
	 * Returns the attraction gen declare info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info, or <code>null</code> if a attraction gen declare info with the primary key could not be found
	 */
	public AttractionGenDeclareInfo fetchByPrimaryKey(
		long attractionGenDeclareInfoId);

	/**
	 * Returns all the attraction gen declare infos.
	 *
	 * @return the attraction gen declare infos
	 */
	public java.util.List<AttractionGenDeclareInfo> findAll();

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	public java.util.List<AttractionGenDeclareInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction gen declare infos
	 */
	public java.util.List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionGenDeclareInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction gen declare infos
	 */
	public java.util.List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionGenDeclareInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction gen declare infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
	 */
	public int countAll();

}